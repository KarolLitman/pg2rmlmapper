package property_graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class vertex extends element{
    ArrayList<edge> IN;
    ArrayList <edge> OUT;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof element)) return false;
        element element = (element) o;
        return Objects.equals(id, element.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }



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

    public Object getElement(String key){
        if(key.equals("id")){
            return id;
        }
        else if(key.equals("label")){
            return labels;
        }
        else if(key.contains("prop.")){

            return properties.get(key.replace("prop.",""));
        }
        return null;
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
