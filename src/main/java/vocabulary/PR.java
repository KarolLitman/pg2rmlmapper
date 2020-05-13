package vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;

public class PR {
    private static final Model M_MODEL = ModelFactory.createDefaultModel();
    public static final Property PG2RMLSelector;
    public static final Property selector;
    public static final Property idSelector;
    public static final Property idNodeSelector;
    public static final Property idEdgeSelector;
    public static final Property labelSelector;
    public static final Property labelNodeSelector;
    public static final Property labelEdgeSelector;
    public static final Property propSelector;
    public static final Property propNodeSelector;
    public static final Property propEdgeSelector;
    public static final Property CypherMatch;



    public PR() {
    }

    public static String getURI() {
        return "http://x/";
    }

    static {
        PG2RMLSelector = M_MODEL.createProperty("http://x/PG2RMLSelector");
        CypherMatch = M_MODEL.createProperty("http://x/CypherMatch");
        selector = M_MODEL.createProperty("http://x/selector");
        idSelector = M_MODEL.createProperty("http://x/idSelector");
        idNodeSelector = M_MODEL.createProperty("http://x/idNodeSelector");
        idEdgeSelector = M_MODEL.createProperty("http://x/idEdgeSelector");
        labelSelector = M_MODEL.createProperty("http://x/labelSelektor");
        labelNodeSelector = M_MODEL.createProperty("http://x/labelNodeSelector");
        labelEdgeSelector = M_MODEL.createProperty("http://x/labelEdgeSelector");
        propSelector = M_MODEL.createProperty("http://x/propSelector");
        propNodeSelector = M_MODEL.createProperty("http://x/propNodeSelector");
        propEdgeSelector = M_MODEL.createProperty("http://x/propEdgeSelector");











    }
}