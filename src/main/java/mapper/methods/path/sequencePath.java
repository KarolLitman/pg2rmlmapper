package mapper.methods.path;

import mapper.mapper;
import property_graph.element;

import java.util.ArrayList;

public class sequencePath {
    ArrayList<minMaxQuantifier> collection;

    public sequencePath(String method) {
        collection=new ArrayList<>();

    }

    void addEdge(minMaxQuantifier ep){
        collection.add(ep);
    }

}
