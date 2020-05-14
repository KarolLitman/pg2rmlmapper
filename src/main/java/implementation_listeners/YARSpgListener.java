package implementation_listeners;// Generated from YARS.g4 by ANTLR 4.7.1
import com.github.jsonldjava.utils.Obj;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.datatypes.xsd.XSDDateTime;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.ResourceFactory;
import property_graph.YARS;
import property_graph.edge;
import property_graph.vertex;
import parsers_and_listeners.cypher.yarspg.YARSpgBaseListener;
import parsers_and_listeners.cypher.yarspg.YARSpgParser;

import java.text.SimpleDateFormat;
import java.util.*;

public class YARSpgListener extends YARSpgBaseListener {
	public YARS y = new YARS();

	edge edge;
	vertex vertex;
	boolean isVertex;
	Map<String, Object> properties;
	String key;


	Stack<ArrayList<Object>> stack=new Stack<>();
	Stack<Set<Object>> stackSet=new Stack<>();

	//String keymap;


	Set<Object> nestSet;
	Map<String,Object> nestMap;
	ArrayList<Object> nestArray;


	int i=0;
	int flag=0;

	Object current;


	public Object setValidType(YARSpgParser.Primitive_valueContext ctx){


		//System.out.println(ctx.STRING());

		if(ctx.STRING()!=null){
			String primivite_value=ctx.getText();

			Character c= ctx.getText().charAt(0);
			if(c.equals('"')){
				primivite_value=primivite_value.substring(1,primivite_value.length()-1);
				return primivite_value;
			}


		}
		else if(ctx.NUMBER()!=null){

			String number=ctx.getText();

			if (isInteger(number)) {
				return Integer.parseInt(number);
			}
			else if (isLong(number)) {
				return Long.parseLong(number);
			}
			else if (isFloat(number)){
				return Float.parseFloat(number);
			}
			else{
//				if (isDouble(number))
				return Double.parseDouble(number);
			}

//			return null;


		}
		else if(ctx.DATETYPE()!=null){



			if(ctx.getText().contains("T")){
				return ResourceFactory.createTypedLiteral(ctx.getText(), XSDDatatype.XSDdateTimeStamp);
			}
			else if(ctx.getText().contains(":")){
				return ResourceFactory.createTypedLiteral(ctx.getText(), XSDDatatype.XSDtime );
			}
			else{
				return ResourceFactory.createTypedLiteral(ctx.getText(), XSDDatatype.XSDdate);
			}


			//System.out.println(ctx.getText());

			//System.out.println(ctx.DATETYPE());

			//System.out.println(ctx.getChild(0).getChild(0));

//			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//			Date date = sdf.parse(ctx.getText());
//			Calendar cal = Calendar.getInstance();
//			cal.setTime(date);


		}
		else if(ctx.BOOL()!=null){
			boolean primitive_value=Boolean.parseBoolean(ctx.getText());
			//System.out.println("test "+primitive_value);
			return primitive_value;
		}


		return null;
	}


	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean isFloat(String s) {
		try {
			Float.parseFloat(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean isLong(String s) {
		try {
			Long.parseLong(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

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



			String primivite_value=ctx.getText();
			Character c= ctx.getText().charAt(0);
			if(c.equals('"')){
				primivite_value=primivite_value.substring(1,primivite_value.length()-1);
			}

//		if(ctx.STRING()!=null){
//			String primivite_value=ctx.getText();
//

//
//		}
//		else if(ctx.NUMBER()!=null){
//
//			String number=ctx.getText();
//
//			if (isInteger(number)) {
//				//parse Int
//			}
//			else if (isLong(number)) {
//				//parse Int
//			}
//			else if (isFloat(number)){
//				//parse Double
//			}
//			else if (isDouble(number)){
//				//parse Double
//			}
//
//
//			double primitive_value=Double.parseDouble(ctx.getText());
//			System.out.println("test "+primitive_value);
//
//
//		}
//		else if(ctx.DATETYPE()!=null){
//
//			ctx.DATETYPE();
//		}
//		else if(ctx.BOOL()!=null){
//			boolean primitive_value=Boolean.parseBoolean(ctx.getText());
//			System.out.println("test "+primitive_value);
//		}





		if(flag==0){
			properties.put(key,setValidType(ctx));
		}
		else if(flag==1){
			stackSet.lastElement().add(setValidType(ctx));
			//nestSet.add(primivite_value);
		}
		else if(flag==2){


		//System.out.println(stack.firstElement());
			System.out.println(stack.firstElement());
			System.out.println(setValidType(ctx));
			stack.lastElement().add(setValidType(ctx));


//			nestArray.add(primivite_value);
		}
		else if(flag==3){
			nestMap.put(key,setValidType(ctx));

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
		else{
			stackSet.lastElement().add(nestSet);
		}
		stackSet.push(nestSet);

		flag=1;
		current=nestSet;
		i++;



	};
	public void exitSet(YARSpgParser.SetContext ctx){
		stackSet.pop();

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


		if (current instanceof HashMap){
			((HashMap) current).put(key,nestArray);
		}
		else{
			stack.lastElement().add(nestArray);
		}
		stack.push(nestArray);

		flag=2;
		current=nestArray;
		i++;

	};
	public void exitList(YARSpgParser.ListContext ctx){
		i--;
		stack.pop();
		if(i==0){
			flag=0;
			current=properties;
			//System.out.println(properties);
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