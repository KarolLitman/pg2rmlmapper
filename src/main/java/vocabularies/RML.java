package vocabularies;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;

public class RML {
    private static final Model M_MODEL = ModelFactory.createDefaultModel();
    public static final Property source;
    public static final Property logicalSource;
    public static final Property iterator;
    public static final Property referenceFormulation;
    public static final Property reference;


    public RML() {
    }

    public static String getURI() {
        return "http://semweb.mmlab.be/ns/rml#";
    }

    static {
        source = M_MODEL.createProperty("http://semweb.mmlab.be/ns/rml#source");
        logicalSource = M_MODEL.createProperty("http://semweb.mmlab.be/ns/rml#logicalSource");
        iterator = M_MODEL.createProperty("http://semweb.mmlab.be/ns/rml#iterator");
        referenceFormulation = M_MODEL.createProperty("http://semweb.mmlab.be/ns/rml#referenceFormulation");
        reference = M_MODEL.createProperty("http://semweb.mmlab.be/ns/rml#reference");

    }
}
