package mapper.methods.path;

import java.util.ArrayList;

class sequencePath {
    ArrayList<minMaxQuantifier> collection;

    public sequencePath(String method) {
        collection=new ArrayList<>();

    }

    void addEdge(minMaxQuantifier ep){
        collection.add(ep);
    }

}
