package mapper.methods.cypher;

import property_graph.*;

import java.util.*;

public class cypher {

    String generalpattern;
    vertex nodePattern;
    ArrayList<PatternElementChain> pec;
    YARS property_graph;
    ArrayList<element> results;

    public cypher(YARS property_graph){
       this.generalpattern=generalpattern;
        pec=new ArrayList<PatternElementChain>();
        this.property_graph=property_graph;
        results=new ArrayList<>();
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


    public ArrayList <element> traverse(){


        cypher_pattern_result cpr;


//        ArrayList<element_cypher> list_elements=new ArrayList<>();
        ArrayList<vertex> new_vertexes=new ArrayList<>();
        ArrayList<vertex> temp=new ArrayList<>();


       // HashSet<element_cypher>list_elements=new HashSet<element_cypher>();



        for(Map.Entry<String, vertex> vertexes : property_graph.vertexMap.entrySet()) {
            vertex vertex = vertexes.getValue();

System.out.println("yars"+vertex);

            if (cmp(this.nodePattern, vertex)) {

                if (this.nodePattern.getId() != null) {
                    // list_elements.add(new element_cypher(nodePattern.getId(),vertex));
                    results.add(vertex);
                }

                new_vertexes.add(vertex);

            }
        }

//System.out.println(new_vertexes);

               for (PatternElementChain pec_one: this.pec){
                   //System.out.println("ilerazy");



                   for(int i=0;i<pec_one.getMaxHops();i++){
                       temp=new ArrayList<>();

                       System.out.println(i);

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


//dodana petla


//tu zakonczona petla

                }



System.out.println(results);
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
            else{
                System.out.println("It is not possible to use two arrow operators");
            }


            for(edge e: list_edges){

                System.out.println("testowy"+pec_one.RelationshipPattern);

                if(cmp(pec_one.RelationshipPattern,e)){
                    if(cmp(pec_one.NodePattern,e.getSecondVertex(vertex))){
                        if(pec_one.RelationshipPattern.getId()!=null){
                            //    list_elements.add(new element_cypher(pec_one.RelationshipPattern.getId(),e));
                            edges.add(e);
                        }
                        if(pec_one.NodePattern.getId()!=null){
                            //  list_elements.add(new element_cypher(pec_one.NodePattern.getId(),e.getSecondVertex(vertex)));
                            vertexes.add(e.getSecondVertex(vertex));
                        }
                        //  System.out.println("przed"+vertex);

                        //   System.out.println("po"+vertex);


                        vertexesToNextTraverse.add(e.getSecondVertex(vertex));

                    }
                }

            }


            cypher_pattern_result cpr= new cypher_pattern_result(vertexes,edges,vertexesToNextTraverse);

        return cpr;
    }







    Boolean cmp(element fromCypher, element fromYARS) {
        boolean hasLabel=false;
        for (String label : fromCypher.getLabels()) {

           // System.out.println("testttttt");
            //System.out.println(fromYARS.getLabels());
            if (fromYARS.getLabels().contains(label)) {
//                System.out.println(fromCypher);
//                System.out.println(fromYARS);
//                System.out.println("false1");
                hasLabel=true;
            }
        }
        if(!hasLabel){
            return false;
        }

        for (Map.Entry<String, Object> entry2 : fromCypher.getProperties().entrySet()) {
            String prop_key_cypher = entry2.getKey();
            String prop_value_cypher = entry2.getValue().toString();

            if(!fromYARS.getProperties().containsKey(prop_key_cypher)){
                return false;
            }
            String prop_value_yars = fromYARS.getProperties().get(prop_key_cypher).toString();

            if (!prop_value_cypher.equals(prop_value_yars)) {
//                System.out.println("false2");
                return false;
            }


        }
//        System.out.println("trueeeeee");
//        System.out.println(fromCypher);
     //  System.out.println(fromYARS);



        return true;


    }

}