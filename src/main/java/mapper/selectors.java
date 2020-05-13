package mapper;

import property_graph.YARS;
import property_graph.edge;
import property_graph.vertex;
import vocabulary.PR;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class selectors {

    String methodSelector;
    String value;
    YARS y;


    public selectors(YARS y,String methodSelector, String value) {
        this.methodSelector = methodSelector;
        this.value = value;
        this.y = y;
    }

    @Override
    public String toString() {
        return "selectors{" +
                "methodSelector='" + methodSelector + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
// public selectors(YARS y) {
//        this.y = y;
//    }

    vertex getVertexbyIDSelector(String id){
       return y.vertexMap.get(id);
    }
    edge getEdgebyIDSelector(String id){
        for (edge e: y.edgeList) {
            if(e.getId().equals(id)){
        return e;
            }
        }
        return null;
    }
    Object getAllIDSelector(String id){
        if(getVertexbyIDSelector(id)!=null){
            return getVertexbyIDSelector(id);
        }
        else{
            return getEdgebyIDSelector(id);
        }
    }
    List<vertex> getVertexbyLabelSelector(String label){
        List<vertex> vertexList = new ArrayList<>();


        for(Map.Entry<String, vertex> entry : y.vertexMap.entrySet()) {
            //String key = entry.getKey();
            vertex v = entry.getValue();

            for(String s:v.getLabels()){
                if(s.equals(label)){
                   vertexList.add(v);
                }
            }
            // do what you have to do here
            // In your case, another loop.
        }


return vertexList;
    }
    List<edge> getEdgebyLabelSelector(String label){
        List<edge> edgeList = new ArrayList<>();


        for (edge e: y.edgeList) {
            //String key = entry.getKey();

            for(String s:e.getLabels()){
                if(s.equals(label)){
                    edgeList.add(e);
                }
            }
            // do what you have to do here
            // In your case, another loop.
        }


        return edgeList;
    }
    List<Object> getAllbyLabelSelector(String label){
        List<Object> ObjectList = new ArrayList<>();

        ObjectList.addAll(getVertexbyLabelSelector(label));
        ObjectList.addAll(getEdgebyLabelSelector(label));
        return ObjectList;
    }
    List<vertex> getVertexbyPropSelector(String prop){
        List<vertex> vertexList = new ArrayList<>();


        for(Map.Entry<String, vertex> entry : y.vertexMap.entrySet()) {
            vertex v = entry.getValue();

            for(Map.Entry<String, Object> entry2 : v.getProperties().entrySet()) {
                String prop_key = entry2.getKey();

                if (prop_key.equals(prop)) {
                    vertexList.add(v);

                }
            }

        }


        return vertexList;
    }
    List<edge> getEdgebyPropSelector(String prop){
        List<edge> edgeList = new ArrayList<>();


        for (edge e: y.edgeList) {
            //String key = entry.getKey();

            for(Map.Entry<String, Object> entry2 : e.getProperties().entrySet()) {
                //String key = entry2.getKey();
                String prop_key = entry2.getKey();

                if (prop_key.equals(prop)) {
                    edgeList.add(e);

                }
            }
            // do what you have to do here
            // In your case, another loop.
        }


        return edgeList;
    }
    List<Object> getAllbyPropSelector(String prop){
        List<Object> ObjectList = new ArrayList<>();

        ObjectList.addAll(getVertexbyPropSelector(prop));
        ObjectList.addAll(getEdgebyPropSelector(prop));
        return ObjectList;
    }
    Object find(){

     //   System.out.println(methodSelector);

        switch(methodSelector){
            case "http://x/idSelector":
                return getAllIDSelector(value);
            case "http://x/idNodeSelector":
                return getVertexbyIDSelector(value);
            case "http://x/idEdgeSelector":
                return getEdgebyIDSelector(value);


            case "http://x/labelSelector":
                return getAllbyLabelSelector(value);
            case "http://x/labelNodeSelector":
                return getVertexbyLabelSelector(value);
            case "http://x/labelEdgeSelector":
                return getEdgebyLabelSelector(value);

            case "http://x/propSelector":
                return getAllbyPropSelector(value);
            case "http://x/propNodeSelector":
                return getVertexbyPropSelector(value);
            case "http://x/propEdgeSelector":
                return getEdgebyPropSelector(value);
                default:
                    return null;
        }
    }


}
