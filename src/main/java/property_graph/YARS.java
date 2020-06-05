package property_graph;



import java.util.*;



public class YARS {

    public HashMap<String, vertex> vertexMap = new HashMap();
    public List<edge> edgeList = new ArrayList<edge>();

    @Override
    public String toString() {
        return "YARS{" +
                "vertexMap=" + vertexMap +
                ", edgeList=" + edgeList +
                '}';
    }
}



