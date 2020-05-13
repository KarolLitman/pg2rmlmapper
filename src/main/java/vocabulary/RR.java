package vocabulary;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;

public class RR {
    private static final Model M_MODEL = ModelFactory.createDefaultModel();
    public static final Property subjectMap;
    public static final Property template;
    public static final Property classs;
    public static final Property predicateObjectMap;
    public static final Property predicate;
    public static final Property objectMap;
    public static final Property datatype;
    public static final Property language;





    public RR() {
    }

    public static String getURI() {
        return "http://www.w3.org/ns/r2rml#";
    }

    static {
        subjectMap = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#subjectMap");
        template = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#template");
        classs = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#class");
        predicateObjectMap = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#predicateObjectMap");
        predicate = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#predicate");
        objectMap = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#objectMap");
        datatype = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#datatype");
        language = M_MODEL.createProperty("http://www.w3.org/ns/r2rml#language");





    }
}
