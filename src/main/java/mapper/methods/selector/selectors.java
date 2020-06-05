package mapper.methods.selector;

import property_graph.YARS;
import property_graph.edge;
import property_graph.vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class selectors {

    String methodSelector;
    String value;
    YARS y;


    public selectors(String methodSelector, String value) {
        this.methodSelector = methodSelector;
        this.value = value;
    }

    public void setProperty_graph(YARS property_graph) {
        this.y = property_graph;
    }

    @Override
    public String toString() {
        return "selectors{" +
                "methodSelector='" + methodSelector + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


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
            vertex v = entry.getValue();

            for(String s:v.getLabels()){
                if(s.equals(label)){
                   vertexList.add(v);
                }
            }
        }


return vertexList;
    }
    List<edge> getEdgebyLabelSelector(String label){
        List<edge> edgeList = new ArrayList<>();


        for (edge e: y.edgeList) {

            for(String s:e.getLabels()){
                if(s.equals(label)){
                    edgeList.add(e);
                }
            }
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

            for(Map.Entry<String, Object> entry2 : e.getProperties().entrySet()) {
                String prop_key = entry2.getKey();

                if (prop_key.equals(prop)) {
                    edgeList.add(e);

                }
            }
        }


        return edgeList;
    }
    List<Object> getAllbyPropSelector(String prop){
        List<Object> ObjectList = new ArrayList<>();

        ObjectList.addAll(getVertexbyPropSelector(prop));
        ObjectList.addAll(getEdgebyPropSelector(prop));
        return ObjectList;
    }
    public Object find(){


        switch(methodSelector){
            case "http://ii.uwb.edu.pl/pr#idSelector":
                return getAllIDSelector(value);
            case "http://ii.uwb.edu.pl/pr#idNodeSelector":
                return getVertexbyIDSelector(value);
            case "http://ii.uwb.edu.pl/pr#idEdgeSelector":
                return getEdgebyIDSelector(value);


            case "http://ii.uwb.edu.pl/pr#labelSelector":
                return getAllbyLabelSelector(value);
            case "http://ii.uwb.edu.pl/pr#labelNodeSelector":
                return getVertexbyLabelSelector(value);
            case "http://ii.uwb.edu.pl/pr#labelEdgeSelector":
                return getEdgebyLabelSelector(value);

            case "http://ii.uwb.edu.pl/pr#propSelector":
                return getAllbyPropSelector(value);
            case "http://ii.uwb.edu.pl/pr#propNodeSelector":
                return getVertexbyPropSelector(value);
            case "http://ii.uwb.edu.pl/pr#propEdgeSelector":
                return getEdgebyPropSelector(value);
                default:
                    return null;
        }
    }


}
