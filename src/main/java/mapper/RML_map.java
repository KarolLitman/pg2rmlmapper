package mapper;

import org.apache.jena.graph.BlankNodeId;
import org.apache.jena.rdf.model.*;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.RDF;
import property_graph.edge;
import property_graph.element;
import property_graph.vertex;
import vocabulary.PR;
import vocabulary.RML;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RML_map {
    String source;
//    String method;
    String iterator;
    String referenceFormulation;
    List<predicateObjectMap> list_predicateObjectMap;
    subjectMap subjectMap;
    Object method;



    Object find_elements(){

        System.out.println("find elements");

        System.out.println(method.getClass());

        if(referenceFormulation.equals(PR.PG2RMLSelector.toString())){
            if(method instanceof selectors){
                return ((selectors) method).find();
            }
            else{
                System.out.println("Not found predicate "+PR.selector);
                //return null;
            }
        }


        else if(referenceFormulation.equals(PR.CypherMatch.toString())){
                   if(method instanceof cypher){
                return ((cypher) method).traverse();
            }
            else{
                System.out.println("Not found predicate "+ RML.iterator);
                      // return null;

                   }
        }



        return null;
    }

    Resource buildResource(Object o,String template){

        Model model = ModelFactory.createDefaultModel() ;
        Resource resource=null;

        Pattern p = Pattern.compile("\\{([^}]*)\\}");
        Matcher m = p.matcher(template);

        String curly_brackets;


        while (m.find()) {

            curly_brackets = m.group(1);



            if (curly_brackets.equals("id")) {
//                System.out.println(((element) o).getId());
//                    System.out.println(subjectMap.template.replace("{id}", ((element) o).getId()));
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

    Model build_RDFStatements(){


        Object obj=find_elements();

        ArrayList<element> list=null;


        if(obj instanceof element){
            list=new ArrayList<>();
            list.add((element) obj);
        }
        if(obj instanceof ArrayList){
            list= (ArrayList<element>) obj;
        }

    //    System.out.println("tescik "+list);




        Model model = ModelFactory.createDefaultModel() ;
        Resource resource = null;




        if(list!=null)
        for(Object o: (ArrayList)list)
        if(o instanceof element) {




            resource=buildResource(o,subjectMap.template);

//            System.out.println(subjectMap.classs);
//            System.out.println(subjectMap.classs);
//            System.out.println(subjectMap.classs);

//.replace("{id}",)


            for(String one_class:subjectMap.classs){
                model.add(resource,RDF.type,one_class);
            }



            for(predicateObjectMap pom:list_predicateObjectMap){

                if(pom.object instanceof literal){

                   // System.out.println(pom);



                    Object object=((element) o).getElement(((literal) pom.object).reference);
                    if(object!=null){
                        if(((literal) pom.object).language==null){
                         //   System.out.println(object.getClass());
                            //TODO moze pozniej zmienic lepiej
                            if(object instanceof HashSet){

                                //       System.out.println("test");
                                //      System.out.println("test");
                                //       System.out.println("test");


//                                Bag b = model.createBag();
//
//                                for (Object element : (HashSet)object) {
//                                    b.add(element.toString());
//                                }

                                Resource blank_node = model.createResource();


                                blank_node=nestSet(blank_node,model,pom, (HashSet<Object>) object);


                                model.add(resource, model.createProperty(pom.predicate),blank_node);


                                //blank_node.addProperty(model.createProperty("bla"),);



                            }
                            else if(object instanceof ArrayList){

                                //       System.out.println("test");
                                //      System.out.println("test");
                                //       System.out.println("test");


//                                Seq s = model.createSeq();

//                                for (Object element : (ArrayList)object) {
//                                    if(s instanceof ArrayList){
//                                        s.add(element.toString());
//                                    }
//                                }
//                                model.add(resource, model.createProperty(pom.predicate),s);

                                //nestArrayList(model,resource,pom, (ArrayList<Object>) object);

                                Seq s2 = model.createSeq();

System.out.println((ArrayList<Object>) object);

                                Seq s=nestArrayList3(s2,model,pom, (ArrayList<Object>) object);

                                model.add(resource,model.createProperty(pom.predicate),s);
                            }
                            else{
                                model.add(resource, model.createProperty(pom.predicate),object.toString());

                            }
                        }
                        else{



//                            ((literal) pom.object).language;


                            model.add(resource, model.createProperty(pom.predicate),object.toString(),((literal) pom.object).language);

                        }


                    }

                }
                else if(pom.object instanceof String){

                    model.add(model.add(resource, model.createProperty(pom.predicate),buildResource(o, (String) pom.object)));
                }

            }



        }


        model.write(System.out, "TTL") ;


        return model;
    }


    void nestArrayList(Model model, Resource resource, predicateObjectMap pom, ArrayList<Object> object){
        Seq s = model.createSeq();
        for (Object element : object) {
            if(element instanceof ArrayList){

                Resource res=model.createSeq();
                s.add(res);
                nestArrayList(model,res,pom, (ArrayList<Object>) element);
            }
            else{
                s.add(element.toString());
            }
        }
        model.add(resource, model.createProperty(pom.predicate),s);
    }


    Seq nestArrayList2(Model model, predicateObjectMap pom, ArrayList<Object> object){
        Seq s = model.createSeq();
        for (Object element : object) {
            if(element instanceof ArrayList){

//                Resource res=model.createSeq();
                Seq s2=nestArrayList2(model,pom, (ArrayList<Object>) element);
                s.add(s2);

            }
            else{
                s.add(element.toString());
            }
        }
        return s;

    }


    Seq nestArrayList3(Seq s,Model model, predicateObjectMap pom, ArrayList<Object> object){
        for (Object element : object) {
            if(element instanceof ArrayList){

                Seq res=model.createSeq();
                Seq s2=nestArrayList3(res,model,pom, (ArrayList<Object>) element);
                s.add(s2);

            }
            else{
                s.add(element.toString());
            }
        }
        return s;

    }

    Resource nestSet(Resource r,Model model, predicateObjectMap pom, HashSet<Object> object){



        r.addProperty(RDF.type,"http://www.ontologydesignpatterns.org/cp/owl/set.owl#Set");
       // Resource

//        Resource r = model.createResource("a");


        for (Object element : object) {
            if(element instanceof HashSet){

            Resource res=model.createResource();
            Resource res2=nestSet(res,model,pom, (HashSet<Object>) element);
           // r.addLiteral("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember",res2.as);
            r.addProperty(model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"),(RDFNode)(res2));

                //s.add(s2);

            }
            else{
                r.addProperty(model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"),element.toString());
//                model.add(r, model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"),element.toString());

                //s.add(element.toString());
            }
        }
        return r;

    }


//    @Override
//    public String toString() {
//        return "RML_map{" +
//                "source='" + source + '\'' +
//                ", method='" + method + '\'' +
//                ", iterator='" + iterator + '\'' +
//                ", list_predicate_object_map=" + list_predicateObjectMap +
//                '}';
//    }

    RML_map(){
        list_predicateObjectMap=new ArrayList<>();
    }

}

class literal{
    String reference;
    String language;
    String datatype;
    literal(){}

    @Override
    public String toString() {
        return "literal{" +
                "reference='" + reference + '\'' +
                ", language='" + language + '\'' +
                ", datatype='" + datatype + '\'' +
                '}';
    }
}

class subjectMap{

    String template;
    List<String> classs;

    subjectMap(){
        classs=new ArrayList<>();
    }
}






//class objectMap{
//
//    Object object;
//
//    objectMap(literal l){
//        object=l;
//    }
//    objectMap(String template){
//        object=template;
//    }

//    @Override
//    public String toString() {
//        return "objectMap{" +
//                "reference='" + reference + '\'' +
//                ", language='" + language + '\'' +
//                ", datatype='" + datatype + '\'' +
//                ", template='" + template + '\'' +
//                '}';
//    }
//}

class predicateObjectMap{
    String predicate;
    Object object;
//    String reference;
//    String langtag;
//    String datatype;
//    String template;
//    predicateObjectMap(literal l){
//        object=l;
//    }
//    predicateObjectMap(String template){
//        object=template;
//    }
    @Override
    public String toString() {
        return "predicateObjectMap{" +
                "predicate='" + predicate + '\'' +
                ",Object=" + object +
                '}';
    }

    public void setObject(literal l) {
        this.object = l;
    }
    public void setObject(String template) {
        this.object = template;
    }
}
