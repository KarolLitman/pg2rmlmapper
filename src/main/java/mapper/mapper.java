package mapper;

import implementation_listeners.YARSpgListener;
import implementation_listeners.CypherListener;
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
import org.apache.jena.util.iterator.NiceIterator;
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
import java.util.Set;


public class mapper {

    public static void main(String[] args) throws Exception {






        Model model = ModelFactory.createDefaultModel();
        model.read("example.rml", "TURTLE");


ArrayList <RML_map> rml_list=new ArrayList<>();




        StmtIterator stmts = model.listStatements(null,model.createProperty("http://semweb.mmlab.be/ns/rml#logicalSource"), (RDFNode) null);
        while ( stmts.hasNext() ) {
            RML_map rml=new RML_map();
            rml.rdfDFS( stmts.next().getSubject(), new HashSet<RDFNode>());
            rml_list.add(rml);
        }

   //     System.out.println(rml_list);

       // StmtIterator iter = model.listStatements();

      //  NodeIterator z = model.listObjects();

        StmtIterator iter = model.listStatements();



//        switch (rml.method_string){
//            case "selector":
//                break;
//            case "iterator":
//                break;
//            case "path":
//                break;
//        }

        YARSpgLexer lexer = new YARSpgLexer(CharStreams.fromFileName("example.yarspg"));
        YARSpgParser parser = new YARSpgParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.yarspg();
        YARSpgListener yars2 = new YARSpgListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk((ParseTreeListener) yars2, tree);

        Model model_output = ModelFactory.createDefaultModel();

        for(RML_map rml:rml_list){
            if(rml.method instanceof selectors){
                ((selectors)rml.method).setProperty_graph(yars2.y);
            }
            else if(rml.method instanceof cypher){
                ((cypher)rml.method).setProperty_graph(yars2.y);
            }
            else if(rml.method instanceof path){
                ((path)rml.method).setProperty_graph(yars2.y);
            }
            model_output.add(rml.build_RDFStatements());


        }
        model_output.write(System.out, "TTL") ;





    }











}










