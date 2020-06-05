package mapper.methods.path;

import property_graph.vertex;

class pair {
    public vertex getVertex_start() {
        return vertex_start;
    }

    public pair(vertex vertex) {
        this.vertex_start = vertex;
        this.vertex_end = vertex;
    }

    @Override
    public String toString() {
        return "pair{" +
                "vertex_start=" + vertex_start +
                ", vertex_end=" + vertex_end +
                '}';
    }

    public pair(vertex vertex_start, vertex vertex_end) {
        this.vertex_start = vertex_start;
        this.vertex_end = vertex_end;
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

    vertex vertex_start;
    vertex vertex_end;
}
