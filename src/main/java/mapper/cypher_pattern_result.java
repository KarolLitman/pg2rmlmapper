package mapper;

import property_graph.YARS;
import property_graph.edge;
import property_graph.element;
import property_graph.vertex;

import java.util.ArrayList;
import java.util.Map;

public class cypher_pattern_result {

    ArrayList<element> edges; //edges to print with variable
    ArrayList<element> vertexes; //vertexes to print with variable
    ArrayList<vertex> vertexesToNextTraverse;

    public cypher_pattern_result(ArrayList<element> vertexes,ArrayList<element> edges, ArrayList<vertex> vertexesToNextTraverse) {
        this.edges = edges;
        this.vertexes = vertexes;
        this.vertexesToNextTraverse = vertexesToNextTraverse;
    }
}