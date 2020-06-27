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
import parsers_and_listeners.cypher.yarspg.YARSpgLexer;
import parsers_and_listeners.cypher.yarspg.YARSpgParser;


import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;



public class mapper {

    public static void main(String[] args) throws Exception {






        Model model = ModelFactory.createDefaultModel();
        model.read(new File(args[0]).toURL().toString(), "TURTLE");


        ArrayList <RML_map> rml_list=new ArrayList<>();




        StmtIterator stmts = model.listStatements(null,model.createProperty("http://semweb.mmlab.be/ns/rml#logicalSource"), (RDFNode) null);
        while ( stmts.hasNext() ) {
            RML_map rml=new RML_map();
            rml.rdfDFS( stmts.next().getSubject(), new HashSet<RDFNode>());
            rml_list.add(rml);
        }



        StmtIterator iter = model.listStatements();





        Model model_output = ModelFactory.createDefaultModel();

        for(RML_map rml:rml_list){
            YARSpgLexer lexer = new YARSpgLexer(CharStreams.fromFileName(rml.source));
            YARSpgParser parser = new YARSpgParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.yarspg();
            YARSpgListener yars2 = new YARSpgListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk((ParseTreeListener) yars2, tree);

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










