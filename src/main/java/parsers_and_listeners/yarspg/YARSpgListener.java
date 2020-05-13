package parsers_and_listeners.cypher.yarspg;// Generated from YARS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YARSpgParser}.
 */
public interface YARSpgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 */
	void enterYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 */
	void exitYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prefix_directive}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_directive(YARSpgParser.Prefix_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prefix_directive}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_directive(YARSpgParser.Prefix_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#pname}.
	 * @param ctx the parse tree
	 */
	void enterPname(YARSpgParser.PnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#pname}.
	 * @param ctx the parse tree
	 */
	void exitPname(YARSpgParser.PnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#pn_local}.
	 * @param ctx the parse tree
	 */
	void enterPn_local(YARSpgParser.Pn_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#pn_local}.
	 * @param ctx the parse tree
	 */
	void exitPn_local(YARSpgParser.Pn_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(YARSpgParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(YARSpgParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graph_name}.
	 * @param ctx the parse tree
	 */
	void enterGraph_name(YARSpgParser.Graph_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graph_name}.
	 * @param ctx the parse tree
	 */
	void exitGraph_name(YARSpgParser.Graph_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(YARSpgParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(YARSpgParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#string_annotation}.
	 * @param ctx the parse tree
	 */
	void enterString_annotation(YARSpgParser.String_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#string_annotation}.
	 * @param ctx the parse tree
	 */
	void exitString_annotation(YARSpgParser.String_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#rdf_annotation}.
	 * @param ctx the parse tree
	 */
	void enterRdf_annotation(YARSpgParser.Rdf_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#rdf_annotation}.
	 * @param ctx the parse tree
	 */
	void exitRdf_annotation(YARSpgParser.Rdf_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#annotations_list}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations_list(YARSpgParser.Annotations_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#annotations_list}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations_list(YARSpgParser.Annotations_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#props_list}.
	 * @param ctx the parse tree
	 */
	void enterProps_list(YARSpgParser.Props_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#props_list}.
	 * @param ctx the parse tree
	 */
	void exitProps_list(YARSpgParser.Props_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graphs_list}.
	 * @param ctx the parse tree
	 */
	void enterGraphs_list(YARSpgParser.Graphs_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graphs_list}.
	 * @param ctx the parse tree
	 */
	void exitGraphs_list(YARSpgParser.Graphs_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(YARSpgParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(YARSpgParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(YARSpgParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(YARSpgParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(YARSpgParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(YARSpgParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 */
	void enterDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 */
	void exitDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 */
	void enterUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 */
	void exitUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNode_id(YARSpgParser.Node_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNode_id(YARSpgParser.Node_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 */
	void enterNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 */
	void exitNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(YARSpgParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(YARSpgParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge_id}.
	 * @param ctx the parse tree
	 */
	void enterEdge_id(YARSpgParser.Edge_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge_id}.
	 * @param ctx the parse tree
	 */
	void exitEdge_id(YARSpgParser.Edge_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge_label}.
	 * @param ctx the parse tree
	 */
	void enterEdge_label(YARSpgParser.Edge_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge_label}.
	 * @param ctx the parse tree
	 */
	void exitEdge_label(YARSpgParser.Edge_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(YARSpgParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(YARSpgParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(YARSpgParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(YARSpgParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_value(YARSpgParser.Primitive_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_value(YARSpgParser.Primitive_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#complex_value}.
	 * @param ctx the parse tree
	 */
	void enterComplex_value(YARSpgParser.Complex_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#complex_value}.
	 * @param ctx the parse tree
	 */
	void exitComplex_value(YARSpgParser.Complex_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(YARSpgParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(YARSpgParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(YARSpgParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(YARSpgParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(YARSpgParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(YARSpgParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_schema}.
	 * @param ctx the parse tree
	 */
	void enterNode_schema(YARSpgParser.Node_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_schema}.
	 * @param ctx the parse tree
	 */
	void exitNode_schema(YARSpgParser.Node_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop_list_schema}.
	 * @param ctx the parse tree
	 */
	void enterProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop_list_schema}.
	 * @param ctx the parse tree
	 */
	void exitProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop_schema}.
	 * @param ctx the parse tree
	 */
	void enterProp_schema(YARSpgParser.Prop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop_schema}.
	 * @param ctx the parse tree
	 */
	void exitProp_schema(YARSpgParser.Prop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#value_schema}.
	 * @param ctx the parse tree
	 */
	void enterValue_schema(YARSpgParser.Value_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#value_schema}.
	 * @param ctx the parse tree
	 */
	void exitValue_schema(YARSpgParser.Value_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#primitive_value_schema}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#primitive_value_schema}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#complex_value_schema}.
	 * @param ctx the parse tree
	 */
	void enterComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#complex_value_schema}.
	 * @param ctx the parse tree
	 */
	void exitComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema(YARSpgParser.Set_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema(YARSpgParser.Set_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#list_schema}.
	 * @param ctx the parse tree
	 */
	void enterList_schema(YARSpgParser.List_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#list_schema}.
	 * @param ctx the parse tree
	 */
	void exitList_schema(YARSpgParser.List_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#struct_schema}.
	 * @param ctx the parse tree
	 */
	void enterStruct_schema(YARSpgParser.Struct_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#struct_schema}.
	 * @param ctx the parse tree
	 */
	void exitStruct_schema(YARSpgParser.Struct_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge_schema}.
	 * @param ctx the parse tree
	 */
	void enterEdge_schema(YARSpgParser.Edge_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge_schema}.
	 * @param ctx the parse tree
	 */
	void exitEdge_schema(YARSpgParser.Edge_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#directed_schema}.
	 * @param ctx the parse tree
	 */
	void enterDirected_schema(YARSpgParser.Directed_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#directed_schema}.
	 * @param ctx the parse tree
	 */
	void exitDirected_schema(YARSpgParser.Directed_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#undirected_schema}.
	 * @param ctx the parse tree
	 */
	void enterUndirected_schema(YARSpgParser.Undirected_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#undirected_schema}.
	 * @param ctx the parse tree
	 */
	void exitUndirected_schema(YARSpgParser.Undirected_schemaContext ctx);
}