package mapper.methods.cypher;

import implementation_listeners.CypherListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parsers_and_listeners.cypher.CypherLexer;
import parsers_and_listeners.cypher.CypherParser;
import property_graph.*;

import java.util.*;

public class cypher {

    String generalpattern;
    vertex nodePattern;
    ArrayList<PatternElementChain> pec;
    YARS property_graph;
    HashSet<element> results;



    public cypher(String generalpattern){
       this.generalpattern=generalpattern;
        pec=new ArrayList<PatternElementChain>();
        results=new HashSet<>();
    }

    public void setProperty_graph(YARS property_graph) {
        this.property_graph = property_graph;
    }

    public vertex getNodePattern() {
        return nodePattern;
    }

    public void setNodePattern(vertex nodePattern) {
        this.nodePattern = nodePattern;
    }

    @Override
    public String toString() {
        return "cypher{" +
                "nodePattern=" + nodePattern +
                ", pec=" + pec +
                ", property_graph=" + property_graph +
                '}';
    }

    public void addPatternElementChain(PatternElementChain p){
        pec.add(p);
    }


    public HashSet <element> traverse(){


        CypherLexer lexer2 = new CypherLexer(CharStreams.fromString(generalpattern));


        CypherParser parser2 = new CypherParser(new CommonTokenStream(lexer2));
        ParseTree tree2 = parser2.oC_Pattern();
        CypherListener cypher = new CypherListener(this);
        ParseTreeWalker walker2 = new ParseTreeWalker();
        walker2.walk(cypher, tree2);






        cypher_pattern_result cpr;


        HashSet<vertex> new_vertexes=new HashSet<>();
        HashSet<vertex> temp=new HashSet<>();





        for(Map.Entry<String, vertex> vertexes : property_graph.vertexMap.entrySet()) {
            vertex vertex = vertexes.getValue();

             if ((cmp(this.nodePattern, vertex))) {

                if (this.nodePattern.getId() != null) {

                    results.add(vertex);
                }

                new_vertexes.add(vertex);

            }
        }

//

               for (PatternElementChain pec_one: this.pec){



                   for(int i=0;i<pec_one.getMaxHops();i++){
                       temp=new HashSet<>();



                       for(vertex v:new_vertexes){



                           cpr=traverseVertexToVertexes(v,pec_one);
                           temp.addAll(cpr.vertexesToNextTraverse);
                           if(i+1>=pec_one.getMinHops()){
                               results.addAll(cpr.vertexes);
                               results.addAll(cpr.edges);
                           }
                       }

                       new_vertexes=temp;


                   }




                }




return results;
    }




    cypher_pattern_result traverseVertexToVertexes (vertex vertex, PatternElementChain pec_one){
        ArrayList<vertex> vertexesToNextTraverse=new ArrayList<>();
        ArrayList<element> edges=new ArrayList<>();
        ArrayList<element> vertexes=new ArrayList<>();

        ArrayList<edge> list_edges=new ArrayList<>();





            if(pec_one.isLeftArrow()){
                list_edges=vertex.getIN();
            }
            else if(pec_one.isRightArrow()){
                list_edges=vertex.getOUT();
            }
            else if(!pec_one.isLeftArrow()&&!pec_one.isRightArrow()){
                list_edges=vertex.getIN();
                list_edges.addAll(vertex.getOUT());
            }


            for(edge e: list_edges){


                if(cmp(pec_one.RelationshipPattern,e)){
                    if((cmp(pec_one.NodePattern,e.getSecondVertex(vertex)))){
                        if(pec_one.RelationshipPattern.getId()!=null){
                            edges.add(e);
                        }
                        if(pec_one.NodePattern.getId()!=null){
                            vertexes.add(e.getSecondVertex(vertex));
                        }


                        vertexesToNextTraverse.add(e.getSecondVertex(vertex));

                    }
                }

            }


            cypher_pattern_result cpr= new cypher_pattern_result(vertexes,edges,vertexesToNextTraverse);

        return cpr;
    }







    Boolean cmp(element fromCypher, element fromYARS) {
        if(!fromCypher.getLabels().isEmpty()){
            boolean hasLabel=false;
        for (String label : fromCypher.getLabels()) {


            if (fromYARS.getLabels().contains(label)) {
                hasLabel=true;
            }
        }
        if(!hasLabel){
            return false;
        }
        }

        for (Map.Entry<String, Object> entry2 : fromCypher.getProperties().entrySet()) {
            String prop_key_cypher = entry2.getKey();
            String prop_value_cypher = entry2.getValue().toString();

            if(!fromYARS.getProperties().containsKey(prop_key_cypher)){
                return false;
            }
            String prop_value_yars = fromYARS.getProperties().get(prop_key_cypher).toString();

            if (!prop_value_cypher.equals(prop_value_yars)) {
                return false;
            }


        }




        return true;


    }

}