package property_graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public abstract class element {
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


    String id;
    HashSet<String> labels;
    public Map<String, Object> properties;

    public String getId() {
        return id;
    }

    public HashSet<String> getLabels() {
        return labels;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setLabels(HashSet<String> labels) {
        this.labels = labels;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Object getElement(String key){
     if(key.equals("id")){
         return id;
     }
     else if(key.equals("label")){
         return labels;
     }
     else {
         return properties.get(key);
     }
     }



}
