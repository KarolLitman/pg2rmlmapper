package mapper;

import implementation_listeners.YARSpgListener;
import implementation_listeners.CypherListener;
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
import vocabularies.PR;
import vocabularies.RML;
import vocabularies.RR;
import parsers_and_listeners.cypher.yarspg.YARSpgLexer;
import parsers_and_listeners.cypher.yarspg.YARSpgParser;
import parsers_and_listeners.cypher.CypherLexer;
import parsers_and_listeners.cypher.CypherParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class mapper {

    public static void main(String[] args) throws Exception {




        YARSpgLexer lexer = new YARSpgLexer(CharStreams.fromFileName("example.yarspg"));
        YARSpgParser parser = new YARSpgParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.yarspg();
        YARSpgListener yars2 = new YARSpgListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk((ParseTreeListener) yars2, tree);



        System.out.println(yars2.y);


        Model model = ModelFactory.createDefaultModel() ;
        model.read("example.rml", "TURTLE") ;



        StmtIterator iter = model.listStatements();

        NodeIterator z = model.listObjects();

//        while(z.hasNext()){
//           RDFNode a=z.next();
//
//
//           if(a.isResource()){
//               System.out.println(a.toString());
//           }
////            System.out.println();
//        }


        RML_map rml=new RML_map();

        subjectMap sm=new subjectMap();


        int i=0;



        while (iter.hasNext()) {
            Statement stmt      = iter.nextStatement();  // get next statement
            Resource  subject   = stmt.getSubject();     // get the subject
            Property  predicate = stmt.getPredicate();   // get the predicate
            RDFNode   object    = stmt.getObject();      // get the object


//            System.out.print(subject.toString());
//            System.out.print(" " + predicate.toString() + " ");
//            if (object instanceof Resource) {
//                System.out.print(object.toString());
//            } else {
                // object is a literal
//                System.out.print(" \"" + object.toString() + "\"");
//            }


//            System.out.println(" .");


            List<String> array=new ArrayList<>();
//
//            predicate.equals()
//                    stmt.



            if(predicate.equals(RML.source)){
                rml.source=object.toString();
            }
            else if(predicate.equals(RR.classs)){
                sm.classs.add(object.toString());
            }

            else if(predicate.equals(RML.referenceFormulation)) {

                rml.referenceFormulation=object.toString();

            }
            else if(predicate.equals(PR.selector)){



                Resource blank_node = object.asResource();

 //               blank_node.getProperty(PR.selector).getObject().toString();


                StmtIterator iter2 = blank_node.listProperties();
                Statement stmt2      = iter2.nextStatement();


                rml.method=new selectors(yars2.y,stmt2.getPredicate().toString(),stmt2.getObject().toString());

               // rml.method=new cypher(yars2.y);


            }
//            else if(predicate.equals(RML.referenceFormulation)){
//                rml.method=object.toString();
//            }
            else if(predicate.equals(RML.iterator)){

                //rml.iterator=object.toString();

                CypherLexer lexer2 = new CypherLexer(CharStreams.fromString(object.toString()));
                //--(:Person)
                //CypherLexer lexer2 = new CypherLexer(CharStreams.fromString("(z:Person)-[:ACTED]-(a:Movie)"));


                CypherParser parser2 = new CypherParser(new CommonTokenStream(lexer2));
                ParseTree tree2 = parser2.oC_Pattern();
                CypherListener cypher = new CypherListener(yars2.y);
                ParseTreeWalker walker2 = new ParseTreeWalker();
                walker2.walk(cypher, tree2);



                rml.method=cypher.c;





            }
            else if(predicate.equals(PR.path)){


                System.out.println("testttttttte");

                Resource blank_node = object.asResource();


                StmtIterator iter2 = blank_node.listProperties();
                Statement stmt2      = iter2.nextStatement();

                System.out.println("predykat"+stmt2.getPredicate().toString());
                System.out.println("obiekt"+stmt2.getObject());


                path p=new path(yars2.y);


                pathPredicateSupport(p,stmt2);



//tutaj dodac pathpredicatesupport

//                Resource blank_node2 = stmt2.getObject().asResource();
//                StmtIterator iter3 = blank_node2.listProperties();
//                Statement stmt3      = iter3.nextStatement();
//
//                System.out.println("predykat"+stmt3.getPredicate().toString());
//                System.out.println("obiekt"+stmt3.getObject().asResource());
//
//

//                Resource list = stmt2.getObject().asResource();
//                RDFList rdfList = list.as( RDFList.class );
//                ExtendedIterator<RDFNode> items = rdfList.iterator();
//                while ( items.hasNext() ) {
//                  //  Resource item = items.next().asResource();
//
//                    System.out.println(items.next());
////                    RDFNode value1 = item.getRequiredProperty( myitemvalue1 ).getObject();
////                    RDFNode value2 = item.getRequiredProperty( myitemvalue2 ).getObject();
//                   // System.out.println( item );
//                }

                // rml.method=


                rml.method=p;


            }
            else if(predicate.equals(RR.predicateObjectMap)){

                predicateObjectMap pom=new predicateObjectMap();



                Resource blank_node = object.asResource();
                if(blank_node.hasProperty(RR.predicate)){
                    pom.predicate=blank_node.getProperty(RR.predicate).getObject().toString();

                }
                if(blank_node.hasProperty(RR.objectMap)){
                    Resource blank_node2 = blank_node.getProperty(RR.objectMap).getObject().asResource();
                if(blank_node2.hasProperty(RR.template)){

                        pom.setObject(blank_node2.getProperty(RR.template).getObject().toString());
                    }
                    else{
                        literal literal=new literal();
                    if(blank_node2.hasProperty(RML.reference)) {
                        literal.reference= blank_node2.getProperty(RML.reference).getObject().toString();
                    }
                    if(blank_node2.hasProperty(RR.datatype)) {
                        literal.datatype = blank_node2.getProperty(RR.datatype).getObject().toString();
                    }
                    if(blank_node2.hasProperty(RR.language)) {

                        literal.language = blank_node2.getProperty(RR.language).getObject().toString();
                    }
                    pom.setObject(literal);
                }
                }

                rml.list_predicateObjectMap.add(pom);

            }

            else if(predicate.equals(RR.subjectMap)){





                Resource blank_node = object.asResource();

                if(blank_node.hasProperty(RR.template)){
                    sm.template=blank_node.getProperty(RR.template).getObject().toString();
                }
//                pom.datatype=blank_node2.getProperty(RR.datatype).toString();
//                pom.langtag=blank_node2.getProperty(RR.language).toString();

                rml.subjectMap=sm;

            }




//            Model M_MODEL = ModelFactory.createDefaultModel();



//            if(predicate.toString().compareTo("http://semweb.mmlab.be/ns/rml#source")==0){
//            }
//            else if(predicate.toString().compareTo("http://www.w3.org/ns/r2rml#predicateObjectMap")==0){
//                System.out.println("\ntest"+object);
//            }

           // model.listSubjectsWithProperty();

        }




      //  rml.build_RDF();






//        TURTLELexer lexer2 = new TURTLELexer(CharStreams.fromFileName("example.rml"));
//        TURTLEParser parser2 = new TURTLEParser(new CommonTokenStream(lexer2));
//        ParseTree tree2 = parser2.turtleDoc();
//        TURTLEListener turtle = new TURTLEListener();
//        ParseTreeWalker walker2 = new ParseTreeWalker();
//        walker2.walk(turtle, tree2);


//        if(turtle.getKey_value().get("rml:referenceFormulation").equals("pr:PG2RMLSelector")){
//            String typeAndValue = turtle.getKey_value().get("pr:selector");
//            typeAndValue=typeAndValue.substring(1,typeAndValue.length()-1);
//            String parts[] = typeAndValue.split("\"", 2);
//            parts[1]=parts[1].substring(0,parts[1].length()-1);
//            System.out.println(turtle.getKey_value().get("rml:source")+" "+ parts[0]+" "+parts[1]);
//            s.whichSelector(parts[0],parts[1]);
//            System.out.println(parts[0]+" "+parts[1]);
//        }
//        else if(turtle.getKey_value().get("rml:referenceFormulation").equals("pr:CypherMatch")){
//            String typeAndValue = turtle.getKey_value().get("rml:iterator");
//            String parts[] = typeAndValue.split("\"", 2);
//            parts[1]=parts[1].substring(0,parts[1].length()-1);
//            System.out.println(turtle.getKey_value().get("rml:source")+" "+ parts[0]+" "+parts[1]);
//            s.whichSelector("pr:idEdgeSelector","edge01");
//
//
//
//        }


        //s.whichSelector("pr:idEdgeSelector","edge01");


//        getEdgebyIDSelector("\""+value

         rml.build_RDFStatements();





//-[l:LIKES{ imie: 'Karol'}]-(t:Person2)
//        CypherLexer lexer2 = new CypherLexer(CharStreams.fromString("(p:Person { name: 'Oliver Stone' })-[y]-(z:Person)"));
        //--(:Person)
        //CypherLexer lexer2 = new CypherLexer(CharStreams.fromString("(z:Person)-[:ACTED]-(a:Movie)"));


//        CypherParser parser2 = new CypherParser(new CommonTokenStream(lexer2));
//        ParseTree tree2 = parser2.oC_Pattern();
//        CypherListener cypher = new CypherListener(ya);
//        ParseTreeWalker walker2 = new ParseTreeWalker();
//        walker2.walk(cypher, tree2);


//        System.out.println("tescik");
//        System.out.println(cypher.c.cmp(cypher.c.nodePattern,yars2.y.vertexMap.get("Author01")));


        //System.out.println(cypher.c.traverse(yars2.y));




    }




static void pathPredicateSupport(path p, Statement stmt2){
    switch(stmt2.getPredicate().toString()) {
        case "http://x/alternativePath":


            Resource list = stmt2.getObject().asResource();
            RDFList rdfList = list.as( RDFList.class );
            ExtendedIterator<RDFNode> items = rdfList.iterator();
            while ( items.hasNext() ) {

                RDFNode rdfn=items.next();
                if (rdfn.canAs(Literal.class)) {

                    String item=rdfn.asLiteral().getString();
                    System.out.println("testttttttttttttt");


                    HashSet<String> hsSimple=new HashSet<>();
                    hsSimple.add(item);

                    p.getEdgePathsSequence().add(new minMaxQuantifier(hsSimple,"http://x/edgePath"));

                }
                else{

                }


//                    System.out.println(items.next());
//                    RDFNode value1 = item.getRequiredProperty( myitemvalue1 ).getObject();
//                    RDFNode value2 = item.getRequiredProperty( myitemvalue2 ).getObject();
                // System.out.println( item );
            }


            break;
        case "http://x/sequencePath":


            Resource list2 = stmt2.getObject().asResource();
            RDFList rdfList2 = list2.as( RDFList.class );
            ExtendedIterator<RDFNode> items2 = rdfList2.iterator();
            while ( items2.hasNext() ) {

                RDFNode rdfn2=items2.next();



                if (rdfn2.canAs(Literal.class)) {

                    String item=rdfn2.asLiteral().getString();
                    System.out.println(item);

                    HashSet<String> hsSimple=new HashSet<>();
                    hsSimple.add(item);

                    p.getEdgePathsSequence().add(new minMaxQuantifier(hsSimple,"http://x/edgePath"));


                }
                else{

                    StmtIterator iter4 = rdfn2.asResource().listProperties();
                    System.out.println("test"+rdfn2.asResource().toString());
                    Statement stmt4      = iter4.nextStatement();

                    pathPredicateSupport(p,stmt4);
                }

                }

            break;
        case "http://x/minMaxPath":
            int min=0,max=0;
            String pathname="";
            Resource blank_node2=stmt2.getObject().asResource();
            StmtIterator iter3 = blank_node2.listProperties();
            for(int j=0;j<3;j++){
                Statement stmtMinMax      = iter3.nextStatement();
                if(stmtMinMax.getPredicate().toString().equals("http://x/min")){
                    min = stmtMinMax.getObject().asLiteral().getInt();
                }
                else if(stmtMinMax.getPredicate().toString().equals("http://x/max")) {
                    max = stmtMinMax.getObject().asLiteral().getInt();
                }
                else if(stmtMinMax.getPredicate().toString().equals("http://x/pathName")) {
                    pathname = stmtMinMax.getObject().asLiteral().getString();
                    System.out.println("test3"+pathname);

                }
            }

            System.out.println("min"+min);
            System.out.println("max"+max);
            System.out.println("pathname"+pathname);

            HashSet<String> hs_minmax=new HashSet<>();
            hs_minmax.add(pathname);

            p.getEdgePathsSequence().add(new minMaxQuantifier(hs_minmax,min,max));

            break;
        default:

            HashSet<String> hs=new HashSet<>();
            hs.add(stmt2.getObject().toString());

            p.getEdgePathsSequence().add(new minMaxQuantifier(hs,stmt2.getPredicate().toString()));



            System.out.println("test3"+p.getEdgePathsSequence());
    }
}





    }


