package mapper;

import implementation_listeners.YARSpgListener;
import mapper.methods.cypher.cypher;
import mapper.methods.path.alternativePath;
import mapper.methods.path.minMaxQuantifier;
import mapper.methods.path.path;
import mapper.methods.selector.selectors;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.jena.rdf.model.*;
import org.apache.jena.util.iterator.ExtendedIterator;
import org.apache.jena.vocabulary.RDF;
import property_graph.element;
import vocabularies.PR;
import vocabularies.RML;
import vocabularies.RR;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RML_map {
    String source;
    String iterator;
    String referenceFormulation;
    List<predicateObjectMap> list_predicateObjectMap;
    subjectMap subjectMap;
    Object method;
    String method_string;


    Object find_elements() {


        if (referenceFormulation.equals(PR.PG2RMLSelector.toString())) {
            if (method instanceof selectors) {
                return ((selectors) method).find();
            } else {

            }
        } else if (referenceFormulation.equals(PR.CypherMatch.toString())) {
            if (method instanceof cypher) {
                return ((cypher) method).traverse();
            } else {


            }

        } else if (referenceFormulation.equals(PR.PG2RMLPath.toString())) {

            if (method instanceof path) {
                return ((path) method).traverse();
            } else {


            }

        }


        return null;
    }

    Resource buildResource(Object o, String template) {

        Model model = ModelFactory.createDefaultModel();
        Resource resource = null;

        Pattern p = Pattern.compile("\\{([^}]*)\\}");
        Matcher m = p.matcher(template);

        String curly_brackets;


        while (m.find()) {

            curly_brackets = m.group(1);


            if (curly_brackets.equals("id")) {
//
//
                resource = model.createResource(template.replace("{id}", ((element) o).getId()));
            } else if (curly_brackets.equals("label")) {


                //TODO
                //resource=model.createResource(subjectMap.template.replace("{label}",((element) o).getLabels()));
            } else {

                resource = model.createResource(template.replace("{" + curly_brackets + "}", ((element) o).getProperties().get(curly_brackets).toString()));
            }
        }


        return resource;
    }

    Model build_RDFStatements() {


        Object obj = find_elements();

        ArrayList<element> list = null;


        if (obj instanceof element) {
            list = new ArrayList<>();
            list.add((element) obj);
        }
        if (obj instanceof ArrayList) {
            list = (ArrayList<element>) obj;
        }


        Model model = ModelFactory.createDefaultModel();
        Resource resource = null;


        if (list != null)
            for (Object o : (ArrayList) list)
                if (o instanceof element) {


                    resource = buildResource(o, subjectMap.template);


                    for (String one_class : subjectMap.classs) {
                        model.add(resource, RDF.type, one_class);
                    }


                    for (predicateObjectMap pom : list_predicateObjectMap) {

                        if (pom.object instanceof literal) {

                            Object object = ((element) o).getElement(((literal) pom.object).reference);
                            if (object != null) {
                                if (((literal) pom.object).language == null) {
                                    //TODO moze pozniej zmienic lepiej
                                    if (object instanceof HashSet && ((literal) pom.object).reference.equals("label")) {

                                        for (String element : (HashSet<String>) object) {
                                            model.add(resource, model.createProperty(pom.predicate), element);
                                        }


                                    } else if (object instanceof HashSet) {


                                        Resource blank_node = model.createResource();
                                        blank_node = nestSet(blank_node, model, pom, (HashSet<Object>) object);
                                        model.add(resource, model.createProperty(pom.predicate), blank_node);


                                    } else if (object instanceof ArrayList) {

                                        Resource blank_node = model.createResource();
                                        blank_node = nestArrayList4(blank_node, model, pom, (ArrayList<Object>) object);
                                        model.add(resource, model.createProperty(pom.predicate), blank_node);

                                    } else if (object instanceof HashMap) {

                                        Resource blank_node = model.createResource();
                                        blank_node = nestStruct(blank_node, model, pom, (HashMap<String, Object>) object);


                                        model.add(resource, model.createProperty(pom.predicate), blank_node);


                                    } else {


                                        model.addLiteral(resource, model.createProperty(pom.predicate), object);


                                    }
                                } else {


                                    model.add(resource, model.createProperty(pom.predicate), object.toString(), ((literal) pom.object).language);

                                }


                            }

                        } else if (pom.object instanceof String) {

                            model.add(model.add(resource, model.createProperty(pom.predicate), buildResource(o, (String) pom.object)));
                        }
                    }

                }

        System.out.println("test");
 //       model.write(System.out, "TTL");


        return model;
    }


    Resource nestArrayList4(Resource r, Model model, predicateObjectMap pom, ArrayList<Object> object) {


        r.addProperty(RDF.type, "http://www.w3.org/1999/02/22-rdf-syntax-ns#Seq");

        int i = 1;


        for (Object element : object) {
            if (element instanceof ArrayList) {

                Resource res = model.createResource();
                Resource res2 = nestArrayList4(res, model, pom, (ArrayList<Object>) element);
                r.addProperty(model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#_" + i), (RDFNode) (res2));


            } else {
                r.addLiteral(model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#_" + i), element);

            }
            i++;
        }
        return r;

    }


    Seq nestArrayList3(Seq s, Model model, predicateObjectMap pom, ArrayList<Object> object) {
        for (Object element : object) {
            if (element instanceof ArrayList) {

                Seq res = model.createSeq();
                Seq s2 = nestArrayList3(res, model, pom, (ArrayList<Object>) element);
                s.add(s2);


            } else {


                s.add(element);


            }
        }
        return s;

    }


    Resource nestStruct(Resource r, Model model, predicateObjectMap pom, HashMap<String, Object> object) {

        for (Map.Entry<String, Object> element : object.entrySet()) {


            if (element.getValue() instanceof HashMap) {


                Resource res = model.createResource();
                Resource res2 = nestStruct(res, model, pom, (HashMap<String, Object>) element.getValue());
                r.addProperty(model.createProperty("http://www.example.org/" + element.getKey()), (RDFNode) (res2));

            } else {

                r.addLiteral(model.createProperty("http://www.example.org/" + element.getKey()), element.getValue());

            }
        }
        return r;

    }


    Resource nestSet(Resource r, Model model, predicateObjectMap pom, HashSet<Object> object) {


        r.addProperty(RDF.type, "http://www.ontologydesignpatterns.org/cp/owl/set.owl#Set");


        for (Object element : object) {
            if (element instanceof HashSet) {

                Resource res = model.createResource();
                Resource res2 = nestSet(res, model, pom, (HashSet<Object>) element);
                // r.addLiteral("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember",res2.as);
                r.addProperty(model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"), (RDFNode) (res2));


            } else {
                r.addLiteral(model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"), element);


            }
        }
        return r;

    }


    RML_map() {
        list_predicateObjectMap = new ArrayList<>();
        subjectMap = new subjectMap();
    }


    @Override
    public String toString() {
        return "RML_map{" +
                "source='" + source + '\'' +
                ", iterator='" + iterator + '\'' +
                ", referenceFormulation='" + referenceFormulation + '\'' +
                ", list_predicateObjectMap=" + list_predicateObjectMap +
                ", subjectMap=" + subjectMap +
                ", method=" + method +
                ", method_string='" + method_string + '\'' +
                '}';
    }

    public void rdfDFS(RDFNode node, Set<RDFNode> visited) {
        if (visited.contains(node)) {
            return;
        } else {
            visited.add(node);
            //System.out.println( prefix + node );
            if (node.isResource()) {
                StmtIterator stmts = node.asResource().listProperties();
                while (stmts.hasNext()) {
                    Statement stmt = stmts.next();

                    Resource subject = stmt.getSubject();     // get the subject
                    Property predicate = stmt.getPredicate();   // get the predicate
                    RDFNode object = stmt.getObject();      // get the object


                    List<String> array = new ArrayList<>();


                    if (predicate.equals(RML.source)) {
                        source = object.toString();

//                System.out.println("weszlo do source");


//                System.out.println("za walkerem");


                    } else if (predicate.equals(RR.classs)) {
                        subjectMap.classs.add(object.toString());
                    } else if (predicate.equals(RML.referenceFormulation)) {

                        referenceFormulation = object.toString();

                    } else if (predicate.equals(PR.selector)) {


                        Resource blank_node = object.asResource();


                        StmtIterator iter2 = blank_node.listProperties();
                        Statement stmt2 = iter2.nextStatement();


                        method = new selectors(stmt2.getPredicate().toString(), stmt2.getObject().toString());


                    } else if (predicate.equals(RML.iterator)) {


                        method = new cypher(object.toString());


                    } else if (predicate.equals(PR.path)) {


                        Resource blank_node = object.asResource();


                        StmtIterator iter2 = blank_node.listProperties();
                        Statement stmt2 = iter2.nextStatement();


                        path p = new path();


                        pathPredicateSupport(p.getEdgePathsSequence(), stmt2);


                        method = p;


                    } else if (predicate.equals(RR.predicateObjectMap)) {

                        predicateObjectMap pom = new predicateObjectMap();


                        Resource blank_node = object.asResource();
                        if (blank_node.hasProperty(RR.predicate)) {
                            pom.predicate = blank_node.getProperty(RR.predicate).getObject().toString();

                        }
                        if (blank_node.hasProperty(RR.objectMap)) {
                            Resource blank_node2 = blank_node.getProperty(RR.objectMap).getObject().asResource();
                            if (blank_node2.hasProperty(RR.template)) {

                                pom.setObject(blank_node2.getProperty(RR.template).getObject().toString());
                            } else {
                                literal literal = new literal();
                                if (blank_node2.hasProperty(RML.reference)) {
                                    literal.reference = blank_node2.getProperty(RML.reference).getObject().toString();
                                }
                                if (blank_node2.hasProperty(RR.datatype)) {
                                    literal.datatype = blank_node2.getProperty(RR.datatype).getObject().toString();
                                }
                                if (blank_node2.hasProperty(RR.language)) {

                                    literal.language = blank_node2.getProperty(RR.language).getObject().toString();
                                }
                                pom.setObject(literal);
                            }
                        }

                        list_predicateObjectMap.add(pom);

                    } else if (predicate.equals(RR.subjectMap)) {


                        Resource blank_node = object.asResource();

                        if (blank_node.hasProperty(RR.template)) {
                            subjectMap.template = blank_node.getProperty(RR.template).getObject().toString();
                        }


                    }


                    //System.out.println(stmt.getPredicate());
                    //System.out.println(stmt.getObject());
                    rdfDFS(stmt.getObject(), visited);
                }
            }
        }
    }


     minMaxQuantifier pathPredicateSupport(ArrayList<Object> p, Statement stmt2) {

        minMaxQuantifier mnq = new minMaxQuantifier();


        switch (stmt2.getPredicate().toString()) {
            case "http://ii.uwb.edu.pl/pr#alternativePath":


                Resource list = stmt2.getObject().asResource();
                RDFList rdfList = list.as(RDFList.class);
                ExtendedIterator<RDFNode> items = rdfList.iterator();
                HashSet<minMaxQuantifier> alternativePaths = new HashSet<>();


                alternativePath aP = new alternativePath();


                while (items.hasNext()) {

                    RDFNode rdfn = items.next();
                    if (rdfn.canAs(Literal.class)) {

                        String item = rdfn.asLiteral().getString();



                        alternativePaths.add(new minMaxQuantifier(item, 1, 1));

                    } else {

                        StmtIterator iter5 = rdfn.asResource().listProperties();

                        Statement stmt5 = iter5.nextStatement();

                        alternativePaths.add(getPrimitive(stmt5));

                    }

                    aP.setAlternativePath(alternativePaths);


                }

                p.add(aP);


                break;
            case "http://ii.uwb.edu.pl/pr#sequencePath":


                Resource list2 = stmt2.getObject().asResource();
                RDFList rdfList2 = list2.as(RDFList.class);
                ExtendedIterator<RDFNode> items2 = rdfList2.iterator();
                while (items2.hasNext()) {

                    RDFNode rdfn2 = items2.next();


                    if (rdfn2.canAs(Literal.class)) {

                        String item = rdfn2.asLiteral().getString();



                        p.add(new minMaxQuantifier(item, 1, 1));


                    } else {

                        StmtIterator iter4 = rdfn2.asResource().listProperties();

                        Statement stmt4 = iter4.nextStatement();

                        p.add(getPrimitive(stmt4));
                    }

                }
                break;
            default:
                p.add(getPrimitive(stmt2));

        }


        return null;
    }


    static minMaxQuantifier getPrimitive(Statement stmt2) {

        switch (stmt2.getPredicate().toString()) {
            case "http://ii.uwb.edu.pl/pr#minMaxPath":
                int min = 0, max = 0;
                String pathname = "";
                Resource blank_node2 = stmt2.getObject().asResource();
                StmtIterator iter3 = blank_node2.listProperties();
                for (int j = 0; j < 3; j++) {
                    Statement stmtMinMax = iter3.nextStatement();
                    if (stmtMinMax.getPredicate().toString().equals("http://ii.uwb.edu.pl/pr#min")) {
                        min = stmtMinMax.getObject().asLiteral().getInt();
                    } else if (stmtMinMax.getPredicate().toString().equals("http://ii.uwb.edu.pl/pr#max")) {
                        max = stmtMinMax.getObject().asLiteral().getInt();
                    } else if (stmtMinMax.getPredicate().toString().equals("http://ii.uwb.edu.pl/pr#pathName")) {
                        pathname = stmtMinMax.getObject().asLiteral().getString();


                    }
                }

                return new minMaxQuantifier(pathname, min, max);


            case "http://ii.uwb.edu.pl/pr#edgePath":
                return new minMaxQuantifier(stmt2.getObject().toString(), 1, 1);
            case "http://ii.uwb.edu.pl/pr#zeroOrMorePath":
                return new minMaxQuantifier(stmt2.getObject().toString(), 0, Integer.MAX_VALUE);
            case "http://ii.uwb.edu.pl/pr#oneOrMorePath":
                return new minMaxQuantifier(stmt2.getObject().toString(), 1, Integer.MAX_VALUE);

            case "http://ii.uwb.edu.pl/pr#optionalPath":
                return new minMaxQuantifier(stmt2.getObject().toString(), 0, 1);

            case "http://ii.uwb.edu.pl/pr#inversePath":
                return new minMaxQuantifier(stmt2.getObject().toString(), 0, Integer.MAX_VALUE, true);


        }
        return null;
    }


}
