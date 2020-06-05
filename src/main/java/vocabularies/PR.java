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
        return "http://ii.uwb.edu.pl/pr#";
    }

    static {
        PG2RMLSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#PG2RMLSelector");
        CypherMatch = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#CypherMatch");
        selector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#selector");
        idSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#idSelector");
        idNodeSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#idNodeSelector");
        idEdgeSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#idEdgeSelector");
        labelSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#labelSelektor");
        labelNodeSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#labelNodeSelector");
        labelEdgeSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#labelEdgeSelector");
        propSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#propSelector");
        propNodeSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#propNodeSelector");
        propEdgeSelector = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#propEdgeSelector");

        PG2RMLPath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#PG2RMLPath");
        path = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#path");
        edgePath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#edgePath");
        inversePath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#inversePath");
        sequencePath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#sequencePath");
        alternativePath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#alternativePath");
        zeroOrMorePath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#zeroOrMorePath");
        oneOrMorePath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#oneOrMorePath");
        optionalPath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#optionalPath");
        minMaxPath = M_MODEL.createProperty("http://ii.uwb.edu.pl/pr#minMaxPath");










    }
}