package vocabularies;

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

    public static final Property PG2RMLPath;
    public static final Property path;
    public static final Property edgePath;
    public static final Property inversePath;
    public static final Property sequencePath;
    public static final Property alternativePath;
    public static final Property zeroOrMorePath;
    public static final Property oneOrMorePath;
    public static final Property optionalPath;
    public static final Property minMaxPath;



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

        PG2RMLPath = M_MODEL.createProperty("http://x/PG2RMLPath");
        path = M_MODEL.createProperty("http://x/path");
        edgePath = M_MODEL.createProperty("http://x/edgePath");
        inversePath = M_MODEL.createProperty("http://x/inversePath");
        sequencePath = M_MODEL.createProperty("http://x/sequencePath");
        alternativePath = M_MODEL.createProperty("http://x/alternativePath");
        zeroOrMorePath = M_MODEL.createProperty("http://x/zeroOrMorePath");
        oneOrMorePath = M_MODEL.createProperty("http://x/oneOrMorePath");
        optionalPath = M_MODEL.createProperty("http://x/optionalPath");
        minMaxPath = M_MODEL.createProperty("http://x/minMaxPath");










    }
}