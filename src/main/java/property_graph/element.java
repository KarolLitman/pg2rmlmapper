package property_graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public abstract class element {



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





}
