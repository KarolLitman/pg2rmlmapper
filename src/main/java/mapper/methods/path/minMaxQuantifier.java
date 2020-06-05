package mapper.methods.path;

import mapper.mapper;
import property_graph.edge;
import property_graph.element;
import property_graph.vertex;

import java.util.HashSet;

import static vocabularies.PR.*;

public class minMaxQuantifier{
    String labels;
    int min;
    int max;
    boolean isInversePath;


    public minMaxQuantifier() {
    }

    public minMaxQuantifier(String labels, int min, int max) {
        this.labels=labels;
        this.min = min;
        this.max = max;
        this.isInversePath=false;
    }

    public minMaxQuantifier(String labels,int min, int max,boolean isInversePath) {
        this.labels=labels;
        this.min = min;
        this.max = max;
        this.isInversePath=isInversePath;
    }


    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "minMaxQuantifier{" +
                "labels=" + labels +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
