package mapper.methods.path;

import property_graph.YARS;
import property_graph.edge;
import property_graph.element;
import property_graph.vertex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;


public class path {

    ArrayList<Object> edgePathsSequence;
    YARS property_graph;
    ArrayList<pair> results;

    public ArrayList<Object> getEdgePathsSequence() {
        return edgePathsSequence;
    }

    public void setEdgePathsSequence(ArrayList<Object> edgePathsSequence) {
        this.edgePathsSequence = edgePathsSequence;
    }

    public void setProperty_graph(YARS property_graph) {
        this.property_graph = property_graph;
    }

    public path(){
        edgePathsSequence=new ArrayList<>();




        results=new ArrayList<>();
    }







    public ArrayList <vertex> traverse(){
        ArrayList<pair> cpr;


        HashSet<pair> new_vertexes=new HashSet<>();
        ArrayList<pair> temp=new ArrayList<>();





        for(Map.Entry<String, vertex> vertexes : property_graph.vertexMap.entrySet()) {
            vertex vertex = vertexes.getValue();




                new_vertexes.add(new pair(vertex));

            }


int j=0;
        for (Object pec_one: this.edgePathsSequence){






            if(pec_one instanceof minMaxQuantifier){
                new_vertexes=getPairsFromOneOperation(new_vertexes, (minMaxQuantifier) pec_one);
            }
            else if(pec_one instanceof alternativePath){




                HashSet<pair> temp_new_vertexes=new HashSet<>();

                for(minMaxQuantifier pec_one2:((alternativePath) pec_one).getAlternativePath()){
                    temp_new_vertexes.addAll(getPairsFromOneOperation(new_vertexes, (minMaxQuantifier) pec_one2));
                }
                new_vertexes=temp_new_vertexes;



            }


            j++;



        }




ArrayList<vertex> temp_array=new ArrayList();


for(pair p: new_vertexes){
    temp_array.add(p.vertex_end);
}

        return temp_array;
    }


    HashSet<pair> getPairsFromOneOperation(HashSet<pair> new_vertexes, minMaxQuantifier pec_one){

        HashSet<pair> results=new HashSet<>();
        HashSet<pair> temp=new HashSet<>();
        ArrayList<pair> cpr;
        ArrayList<path_result> path_results=new ArrayList<>();



        for(int i=0;i<pec_one.getMax();i++){
            temp=new HashSet<>();



            for(pair p:new_vertexes){

                cpr=traverseVertexToVertexes(p,pec_one);
                temp.addAll(cpr);
                if(i+1>=pec_one.getMin()){
                    results.addAll(cpr);
                }
            }




            if(i==0&&pec_one.getMin()==0){

                temp.addAll(new_vertexes);
                results.addAll(new_vertexes);
            }

            new_vertexes=temp;


        }

        return results;
    }







    ArrayList<pair> traverseVertexToVertexes (pair p, minMaxQuantifier pec_one){
        ArrayList<vertex> vertexesToNextTraverse=new ArrayList<>();
        ArrayList<element> edges=new ArrayList<>();
        ArrayList<element> vertexes=new ArrayList<>();

        ArrayList<edge> list_edges=new ArrayList<>();

        ArrayList<pair> vertexes_pair=new ArrayList<>();




            list_edges=p.vertex_end.getOUT();



        for(edge e: list_edges){



            if(pec_one.isInversePath){
                if(!cmp(pec_one,e)){

                    vertexes_pair.add(new pair(p.getVertex_start(),e.getSecondVertex(p.vertex_end)));

                }
            }
            else{
                if(cmp(pec_one,e)){

                    vertexes_pair.add(new pair(p.getVertex_start(),e.getSecondVertex(p.vertex_end)));

                }
            }

            }
        return vertexes_pair;

        }










    Boolean cmp(minMaxQuantifier fromPaths, element fromYARS) {

        return fromYARS.getLabels().contains(fromPaths.labels);




    }

}