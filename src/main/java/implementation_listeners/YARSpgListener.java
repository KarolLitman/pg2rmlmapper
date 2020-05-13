package implementation_listeners;// Generated from YARS.g4 by ANTLR 4.7.1
import property_graph.YARS;
import property_graph.edge;
import property_graph.vertex;
import parsers_and_listeners.cypher.yarspg.YARSpgBaseListener;
import parsers_and_listeners.cypher.yarspg.YARSpgParser;

import java.util.*;

public class YARSpgListener extends YARSpgBaseListener {
	public YARS y = new YARS();

	edge edge;
	vertex vertex;
	boolean isVertex;
	Map<String, Object> properties;
	String key;

	//String keymap;


	Set<Object> nestSet;
	Map<String,Object> nestMap;
	ArrayList<Object> nestArray;
	int i=0;
	int flag=0;

	Object current;

	public void enterYarspg(YARSpgParser.YarspgContext ctx){

	};
	public void exitYarspg(YARSpgParser.YarspgContext ctx){

	};
	public void enterStatement(YARSpgParser.StatementContext ctx){

	};
	public void exitStatement(YARSpgParser.StatementContext ctx){

	};
	public void enterPrefix_directive(YARSpgParser.Prefix_directiveContext ctx){
	};
	public void exitPrefix_directive(YARSpgParser.Prefix_directiveContext ctx){};
	public void enterPname(YARSpgParser.PnameContext ctx){};
	public void exitPname(YARSpgParser.PnameContext ctx){};
	public void enterPn_local(YARSpgParser.Pn_localContext ctx){};
	public void exitPn_local(YARSpgParser.Pn_localContext ctx){};
	public void enterMetadata(YARSpgParser.MetadataContext ctx){};
	public void exitMetadata(YARSpgParser.MetadataContext ctx){};
	public void enterGraph_name(YARSpgParser.Graph_nameContext ctx){};
	public void exitGraph_name(YARSpgParser.Graph_nameContext ctx){};
	public void enterAnnotation(YARSpgParser.AnnotationContext ctx){};
	public void exitAnnotation(YARSpgParser.AnnotationContext ctx){};
	public void enterString_annotation(YARSpgParser.String_annotationContext ctx){};
	public void exitString_annotation(YARSpgParser.String_annotationContext ctx){};
	public void enterRdf_annotation(YARSpgParser.Rdf_annotationContext ctx){};
	public void exitRdf_annotation(YARSpgParser.Rdf_annotationContext ctx){};
	public void enterAnnotations_list(YARSpgParser.Annotations_listContext ctx){};
	public void exitAnnotations_list(YARSpgParser.Annotations_listContext ctx){};
	public void enterProps_list(YARSpgParser.Props_listContext ctx){};
	public void exitProps_list(YARSpgParser.Props_listContext ctx){};
	public void enterGraphs_list(YARSpgParser.Graphs_listContext ctx){};
	public void exitGraphs_list(YARSpgParser.Graphs_listContext ctx){};
	public void enterNode(YARSpgParser.NodeContext ctx){
		isVertex=true;
		vertex = new vertex();
		properties = new HashMap<String, Object>();
		current=properties;
	};
	public void exitNode(YARSpgParser.NodeContext ctx){
		vertex.setProperties(properties);
		current=properties;
		y.vertexMap.put(vertex.getId(),vertex);
		isVertex=false;
	};
	public void enterEdge(YARSpgParser.EdgeContext ctx){
		edge = new edge();
		properties = new HashMap<String, Object>();
	};
	public void exitEdge(YARSpgParser.EdgeContext ctx){
		String s=ctx.getChild(0).getChild(1).getText();
//	edge.setVertex_start(y.vertexMap.get(s.substring(1,s.length()-1)));

        y.vertexMap.get(s.substring(1,s.length()-1)).addOutEdge(edge);

       // System.out.println("tescik1"+s);

        edge.setVertex_start(y.vertexMap.get(s.substring(1,s.length()-1)));

	int second_label=ctx.getChild(0).getChildCount();
		s=ctx.getChild(0).getChild(second_label-2).getText();
  //  edge.setVertex_end(y.vertexMap.get(s.substring(1,s.length()-1)));

		//System.out.println("tescik2"+s);


    if(edge.isDirected()){
        y.vertexMap.get(s.substring(1,s.length()-1)).addInEdge(edge);

    }
    else{
        y.vertexMap.get(s.substring(1,s.length()-1)).addOutEdge(edge);

    }


		edge.setVertex_end(y.vertexMap.get(s.substring(1,s.length()-1)));


		edge.setProperties(properties);
    y.edgeList.add(edge);
	};
	public void enterSection(YARSpgParser.SectionContext ctx){};
	public void exitSection(YARSpgParser.SectionContext ctx){};
	public void enterDirected(YARSpgParser.DirectedContext ctx){
	    edge.setDirected(true);
    };
	public void exitDirected(YARSpgParser.DirectedContext ctx){};
	public void enterUndirected(YARSpgParser.UndirectedContext ctx){
		edge.setDirected(false);

    };
	public void exitUndirected(YARSpgParser.UndirectedContext ctx){};
	public void enterNode_id(YARSpgParser.Node_idContext ctx){
		if(isVertex){
			vertex.setId(ctx.getText().substring(1, ctx.getText().length() - 1));
		}
	};
	public void exitNode_id(YARSpgParser.Node_idContext ctx){};
	public void enterNode_label(YARSpgParser.Node_labelContext ctx){
		vertex.getLabels().add(ctx.getText().substring(1, ctx.getText().length() - 1));
	};
	public void exitNode_label(YARSpgParser.Node_labelContext ctx){};
	public void enterProp(YARSpgParser.PropContext ctx){
			//key=ctx.getChild(0).getText();
			current=properties;
	};

	public void exitProp(YARSpgParser.PropContext ctx){};
	public void enterEdge_id(YARSpgParser.Edge_idContext ctx){
		edge.setId(ctx.getText().substring(1, ctx.getText().length() - 1));
	};

	public void exitEdge_id(YARSpgParser.Edge_idContext ctx){};
	public void enterEdge_label(YARSpgParser.Edge_labelContext ctx){

		edge.getLabels().add(ctx.getText().substring(1, ctx.getText().length() - 1));

	};
	public void exitEdge_label(YARSpgParser.Edge_labelContext ctx){};
	public void enterKey(YARSpgParser.KeyContext ctx){
		key=ctx.getText().substring(1, ctx.getText().length() - 1);

	};
	public void exitKey(YARSpgParser.KeyContext ctx){};
	public void enterValue(YARSpgParser.ValueContext ctx){};
	public void exitValue(YARSpgParser.ValueContext ctx){};
	public void enterPrimitive_value(YARSpgParser.Primitive_valueContext ctx){

		Character c= ctx.getText().charAt(0);
		String primivite_value=ctx.getText();
	if(c.equals('"')){
		primivite_value=primivite_value.substring(1,primivite_value.length()-1);
		}

		if(flag==0){
			properties.put(key,primivite_value);
		}
		else if(flag==1){
			nestSet.add(primivite_value);
		}
		else if(flag==2){
			nestArray.add(primivite_value);
		}
		else if(flag==3){
			nestMap.put(key,primivite_value);

		}

	};
	public void exitPrimitive_value(YARSpgParser.Primitive_valueContext ctx){};
	public void enterComplex_value(YARSpgParser.Complex_valueContext ctx){

	};
	public void exitComplex_value(YARSpgParser.Complex_valueContext ctx){

	};
	public void enterSet(YARSpgParser.SetContext ctx){
		nestSet = new HashSet<>();
		if (current instanceof HashMap){
			((HashMap) current).put(key,nestSet);
		}
		if (current instanceof HashSet){
			((HashSet) current).add(nestSet);
		}
		flag=1;
		current=nestSet;
		i++;



	};
	public void exitSet(YARSpgParser.SetContext ctx){
//		System.out.println();
//		System.out.println(nestSet);
//		System.out.println();
		i--;
		if(i==0){
			flag=0;
			current=properties;
		}

	};
	public void enterList(YARSpgParser.ListContext ctx){
		nestArray = new ArrayList<>();

		//System.out.println(current.getClass());
		if (current instanceof HashMap){
			((HashMap) current).put(key,nestArray);
		}
		if (current instanceof ArrayList){
			((ArrayList) current).add(nestArray);
		}
		flag=2;
		current=nestArray;
		i++;

	};
	public void exitList(YARSpgParser.ListContext ctx){
		i--;
		if(i==0){
			flag=0;
			current=properties;
		}
	};
	public void enterStruct(YARSpgParser.StructContext ctx){
		nestMap = new HashMap<>();

		//System.out.println(current.getClass());
		if (current instanceof HashMap){
			((HashMap) current).put(key,nestMap);
		}
		flag=3;
		current=nestMap;
		i++;

	};
	public void exitStruct(YARSpgParser.StructContext ctx){
		i--;
		if(i==0){
			flag=0;
			current=properties;
		}
	};






	public void enterNode_schema(YARSpgParser.Node_schemaContext ctx){};
	public void exitNode_schema(YARSpgParser.Node_schemaContext ctx){};
	public void enterProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx){};
	public void exitProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx){};
	public void enterProp_schema(YARSpgParser.Prop_schemaContext ctx){};
	public void exitProp_schema(YARSpgParser.Prop_schemaContext ctx){};
	public void enterValue_schema(YARSpgParser.Value_schemaContext ctx){};
	public void exitValue_schema(YARSpgParser.Value_schemaContext ctx){};
	public void enterPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx){};
	public void exitPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx){};
	public void enterComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx){};
	public void exitComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx){};
	public void enterSet_schema(YARSpgParser.Set_schemaContext ctx){};
	public void exitSet_schema(YARSpgParser.Set_schemaContext ctx){};
	public void enterList_schema(YARSpgParser.List_schemaContext ctx){};
	public void exitList_schema(YARSpgParser.List_schemaContext ctx){};
	public void enterStruct_schema(YARSpgParser.Struct_schemaContext ctx){};
	public void exitStruct_schema(YARSpgParser.Struct_schemaContext ctx){};
	public void enterEdge_schema(YARSpgParser.Edge_schemaContext ctx){};
	public void exitEdge_schema(YARSpgParser.Edge_schemaContext ctx){};
	public void enterDirected_schema(YARSpgParser.Directed_schemaContext ctx){};
	public void exitDirected_schema(YARSpgParser.Directed_schemaContext ctx){};
	public void enterUndirected_schema(YARSpgParser.Undirected_schemaContext ctx){};
	public void exitUndirected_schema(YARSpgParser.Undirected_schemaContext ctx){};
}