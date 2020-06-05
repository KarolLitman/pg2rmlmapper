package property_graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class vertex extends element{
    ArrayList<edge> IN;
    ArrayList <edge> OUT;






    public vertex() {
        labels=new HashSet<String>();
        IN=new ArrayList<>();
        OUT=new ArrayList<>();
    }

    public void addInEdge(edge e){
        IN.add(e);
    }
    public void addOutEdge(edge e){
        OUT.add(e);
    }


    public ArrayList<edge> getIN() {
        return IN;
    }
    public ArrayList<edge> getOUT() {
        return OUT;
    }


    @Override
    public String toString() {
        return "vertex{" +
                "id=" + id +
                ", labels=" + labels +
                ", properties=" + properties +
                ", IN=" + IN +
                ", OUT=" + OUT +
                "}\n";
    }
}
