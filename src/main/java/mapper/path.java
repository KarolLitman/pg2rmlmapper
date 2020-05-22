package mapper;

import org.apache.jena.tdb.store.Hash;
import property_graph.YARS;
import property_graph.edge;
import property_graph.element;
import property_graph.vertex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;


public class path {

    ArrayList<edgePaths> edgePathsSequence;
    YARS property_graph;
    ArrayList<pair> results;

    public path(YARS property_graph){
        edgePathsSequence=new ArrayList<>();


        HashSet<String> hs=new HashSet<>();
        hs.add("knows");

        HashSet<String> hs2=new HashSet<>();
        hs2.add("love");


        edgePathsSequence.add(new edgePaths(hs,3,3));
        edgePathsSequence.add(new edgePaths(hs2,1,10));

        this.property_graph=property_graph;

        results=new ArrayList<>();
    }







    ArrayList <pair> traverse(){
        ArrayList<pair> cpr;


//        ArrayList<element_cypher> list_elements=new ArrayList<>();
        ArrayList<pair> new_vertexes=new ArrayList<>();
        ArrayList<pair> temp=new ArrayList<>();


        // HashSet<element_cypher>list_elements=new HashSet<element_cypher>();



        for(Map.Entry<String, vertex> vertexes : property_graph.vertexMap.entrySet()) {
            vertex vertex = vertexes.getValue();

            System.out.println("yars"+vertex);



                new_vertexes.add(new pair(vertex));

            }


//System.out.println(new_vertexes);
int j=0;
     //   boolean beginMinEqualsZero=0;
        for (edgePaths pec_one: this.edgePathsSequence){
            System.out.println(pec_one.getLabels());

//            if(pec_one.getMin()>0){
//                minEqualsZero++;
//            }

            for(int i=0;i<pec_one.getMax();i++){
                temp=new ArrayList<>();

                System.out.println(i);

                for(pair p:new_vertexes){

                    cpr=traverseVertexToVertexes(p,pec_one);
                    temp.addAll(cpr);
                    if(i+1>=pec_one.getMin()){
                        results.addAll(cpr);
                        //results.addAll(cpr.edges);
                    }
                }

//                if(pec_one.getMax()-pec_one.getMin()>0&&(j!=0||pec_one.getMin()==0)){
//                    // results.addAll(cpr.vertexes);
//                    // results.addAll(cpr.edges);
//                    temp.addAll(new_vertexes);
//                    System.out.println("test"+(pec_one.getMax()-pec_one.getMin()));
//                }


                if(pec_one.getMin()==0){
                    // results.addAll(cpr.vertexes);
                    // results.addAll(cpr.edges);
                    temp.addAll(new_vertexes);
                    results.addAll(new_vertexes);
                   // System.out.println("test"+(pec_one.getMax()-pec_one.getMin()));
                }
                j++;

                new_vertexes=temp;
                //System.out.println(new_vertexes);


            }


//dodana petla


//tu zakonczona petla
            j++;



        }


System.out.println(results);
        return results;
    }







    ArrayList<pair> traverseVertexToVertexes (pair p, edgePaths pec_one){
        ArrayList<vertex> vertexesToNextTraverse=new ArrayList<>();
        ArrayList<element> edges=new ArrayList<>();
        ArrayList<element> vertexes=new ArrayList<>();

        ArrayList<edge> list_edges=new ArrayList<>();

        ArrayList<pair> vertexes_pair=new ArrayList<>();




            list_edges=p.vertex_end.getOUT();



        for(edge e: list_edges){

//            System.out.println("testowy"+pec_one.RelationshipPattern);

            if(cmp(pec_one,e)){

                vertexes_pair.add(new pair(p.getVertex_start(),e.getSecondVertex(p.vertex_end)));
                   // vertexesToNextTraverse.add(e.getSecondVertex(vertex));

                }
            }
        return vertexes_pair;

        }


     //   cypher_pattern_result cpr= new cypher_pattern_result(vertexes,edges,vertexesToNextTraverse);








    Boolean cmp(edgePaths fromPaths, element fromYARS) {
        boolean hasLabel=false;
        for (String label : fromPaths.getLabels()) {

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

//        System.out.println("trueeeeee");
//        System.out.println(fromCypher);
        //  System.out.println(fromYARS);



        return true;


    }

}