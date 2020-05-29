package mapper.methods.path;

import mapper.mapper;
import property_graph.edge;
import property_graph.element;
import property_graph.vertex;

import java.util.HashSet;

import static vocabularies.PR.*;

public class minMaxQuantifier{
    HashSet<String> labels;
    int min;
    int max;
    String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public minMaxQuantifier(HashSet<String> labels) {
        this.labels=labels;
        this.min = 1;
        this.max = 1;
    }

    public minMaxQuantifier(HashSet<String> labels,int min, int max) {
        this.labels=labels;
        this.min = min;
        this.max = max;
        this.method="http://x/minMaxPath";
    }

    public minMaxQuantifier(HashSet<String> labels, String method) {

        this.method=method;


        switch(method){
            case "http://x/edgePath":
                min=1;
                max=1;
                break;
            case "http://x/zeroOrMorePath":
                min=0;
                max=Integer.MAX_VALUE;
                break;
            case "http://x/oneOrMorePath":
                min=1;
                max= Integer.MAX_VALUE;
                break;
            case "http://x/optionalPath":
                min=0;
                max= 1;
                break;
            case "http://x/inversePath":
                min=1;
                max= 1;
                break;
        }

        this.labels=labels;
        this.min = min;
        this.max = max;
    }

    public HashSet<String> getLabels() {
        return labels;
    }

    public void setLabels(HashSet<String> labels) {
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
                ", method='" + method + '\'' +
                '}';
    }
}
