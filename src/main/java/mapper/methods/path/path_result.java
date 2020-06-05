package mapper.methods.path;

import property_graph.element;
import property_graph.vertex;

import java.util.ArrayList;

class path_result {

    ArrayList<element> vertexes; //vertexes to print with variable
    ArrayList<vertex> vertexesToNextTraverse;

    public path_result(ArrayList<element> vertexes, ArrayList<element> edges, ArrayList<vertex> vertexesToNextTraverse) {
        this.vertexes = vertexes;
        this.vertexesToNextTraverse = vertexesToNextTraverse;
    }
}