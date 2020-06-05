package property_graph;

import property_graph.vertex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class edge extends element{

    boolean isDirected;
    vertex vertex_start;
    vertex vertex_end;

    @Override
    public String toString() {
        return "edge{" +
                "isDirected=" + isDirected +
                ", id='" + id + '\'' +
                ", labels=" + labels +
                ", properties=" + properties +
                '}';
    }

    public vertex getVertex_start() {
        return vertex_start;
    }

    public void setVertex_start(vertex vertex_start) {
        this.vertex_start = vertex_start;
    }

    public vertex getVertex_end() {
        return vertex_end;
    }

    public void setVertex_end(vertex vertex_end) {
        this.vertex_end = vertex_end;
    }



    public void setDirected(boolean directed) {
        isDirected = directed;
    }


    public vertex getSecondVertex(vertex v) {
        if (v.equals(vertex_start)) {
            return vertex_end;
        } else {
            return vertex_start;

        }
    }

    public boolean isDirected() {
        return isDirected;
    }



    public edge() {
        labels=new HashSet<String>();
    }


}
