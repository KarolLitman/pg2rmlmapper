package mapper;

import mapper.methods.cypher.cypher;
import mapper.methods.path.path;
import mapper.methods.selector.selectors;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import property_graph.element;
import vocabularies.PR;
import vocabularies.RML;

import java.util.*;
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
        else if(referenceFormulation.equals(PR.PG2RMLPath.toString())){
            System.out.println("wykonalo sie");
            if(method instanceof path){
                return ((path) method).traverse();
               // return ((path) method).find();
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
                            if(object instanceof HashSet && ((literal) pom.object).reference.equals("label")){

                                for (String element : (HashSet<String>) object) {
                                    model.add(resource, model.createProperty(pom.predicate),element);
                                }




                                //blank_node.addProperty(model.createProperty("bla"),);



                            }
                            else if(object instanceof HashSet){

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

                                Resource blank_node = model.createResource();


                                blank_node=nestArrayList4(blank_node,model,pom, (ArrayList<Object>) object);


                                model.add(resource, model.createProperty(pom.predicate),blank_node);

//                                Seq s2 = model.createSeq();
//
//System.out.println((ArrayList<Object>) object);
//
//                                Seq s=nestArrayList3(s2,model,pom, (ArrayList<Object>) object);
//
//                                model.add(resource,model.createProperty(pom.predicate),s);
                            }
                            else if(object instanceof HashMap){

                                Resource blank_node = model.createResource();


                                blank_node=nestStruct(blank_node,model,pom, (HashMap<String,Object>) object);


                                model.add(resource, model.createProperty(pom.predicate),blank_node);

//                                Seq s2 = model.createSeq();
//
//System.out.println((ArrayList<Object>) object);
//
//                                Seq s=nestArrayList3(s2,model,pom, (ArrayList<Object>) object);
//
//                                model.add(resource,model.createProperty(pom.predicate),s);
                            }
                            else{


                                model.addLiteral(resource, model.createProperty(pom.predicate),object);
                               // model.add (resource, model.createProperty(pom.predicate), ResourceFactory.createTypedLiteral("2012-03-11", XSDDatatype.XSDdate));
                               // Calendar c = Calendar.getInstance();





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


    Resource nestArrayList4(Resource r,Model model, predicateObjectMap pom, ArrayList<Object> object){



        r.addProperty(RDF.type,"http://www.w3.org/1999/02/22-rdf-syntax-ns#Seq");
        // Resource

        int i=1;

//        Resource r = model.createResource("a");


        for (Object element : object) {
            if(element instanceof ArrayList){

                Resource res=model.createResource();
                Resource res2=nestArrayList4(res,model,pom, (ArrayList<Object>) element);
                // r.addLiteral("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember",res2.as);
                r.addProperty(model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#_"+i),(RDFNode)(res2));

                //s.add(s2);

            }
            else{
                //     r.addProperty();
                r.addLiteral(model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#_"+i),element);

                //                model.add(r, model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"),element.toString());

                //s.add(element.toString());
            }
            i++;
        }
        return r;

    }


    Seq nestArrayList3(Seq s,Model model, predicateObjectMap pom, ArrayList<Object> object){
        for (Object element : object) {
            if(element instanceof ArrayList){

                Seq res=model.createSeq();
                Seq s2=nestArrayList3(res,model,pom, (ArrayList<Object>) element);
                s.add(s2);


//                model.createl

            }
            else{

               // System.out.println("test w RML"+element.getClass());


                    s.add(element);


            }
        }
        return s;

    }


    Resource nestStruct(Resource r,Model model, predicateObjectMap pom, HashMap<String, Object> object){



      //  r.addProperty(RDF.type,"http://www.ontologydesignpatterns.org/cp/owl/set.owl#Set");
        // Resource

//        Resource r = model.createResource("a");


        for(Map.Entry<String, Object> element : object.entrySet()) {
         //   for (Object element : object) {


            if(element.getValue() instanceof HashMap){



                Resource res=model.createResource();
                Resource res2=nestStruct(res,model,pom, (HashMap<String, Object>) element.getValue());
                r.addProperty(model.createProperty("http://www.example.org/"+element.getKey()),(RDFNode)(res2));



                //s.add(s2);

            }
            else{
                //     r.addProperty();

                r.addLiteral(model.createProperty("http://www.example.org/"+element.getKey()),element.getValue());

                //                model.add(r, model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"),element.toString());

                //s.add(element.toString());
            }
        }
        return r;

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
           //     r.addProperty();
r.addLiteral(model.createProperty("http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl#hasMember"),element);

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

