package mapper;

import property_graph.element;

import java.util.ArrayList;

public class sequencePath {
    ArrayList<edgePaths> collection;

    public sequencePath(String method) {
        collection=new ArrayList<>();

    }

    void addEdge(edgePaths ep){
        collection.add(ep);
    }

}
