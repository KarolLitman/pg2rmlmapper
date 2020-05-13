// Generated from Cypher.g4 by ANTLR 4.7.2
package implementation_listeners;
import mapper.PatternElementChain;
import mapper.cypher;
import parsers_and_listeners.cypher.CypherBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parsers_and_listeners.cypher.CypherParser;
import property_graph.*;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides an empty implementation of {@link CypherListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CypherListener extends CypherBaseListener {

	public CypherListener(YARS y){
		c = new cypher(y);
	}

	edge edge;
	vertex vertex;
	Map<String, Object> properties;
	String key;
	int iterator=0;
	public cypher c;
	Boolean isVertex;
	PatternElementChain pec;
	boolean isRangeLiteral=false;

	@Override public void enterOC_Cypher(CypherParser.OC_CypherContext ctx) { }
	
	@Override public void exitOC_Cypher(CypherParser.OC_CypherContext ctx) { }
	
	@Override public void enterOC_Statement(CypherParser.OC_StatementContext ctx) { }
	
	@Override public void exitOC_Statement(CypherParser.OC_StatementContext ctx) { }
	
	@Override public void enterOC_Query(CypherParser.OC_QueryContext ctx) { }
	
	@Override public void exitOC_Query(CypherParser.OC_QueryContext ctx) { }
	
	@Override public void enterOC_RegularQuery(CypherParser.OC_RegularQueryContext ctx) { }
	
	@Override public void exitOC_RegularQuery(CypherParser.OC_RegularQueryContext ctx) { }
	
	@Override public void enterOC_Union(CypherParser.OC_UnionContext ctx) { }
	
	@Override public void exitOC_Union(CypherParser.OC_UnionContext ctx) { }
	
	@Override public void enterOC_SingleQuery(CypherParser.OC_SingleQueryContext ctx) { }
	
	@Override public void exitOC_SingleQuery(CypherParser.OC_SingleQueryContext ctx) { }
	
	@Override public void enterOC_SinglePartQuery(CypherParser.OC_SinglePartQueryContext ctx) { }
	
	@Override public void exitOC_SinglePartQuery(CypherParser.OC_SinglePartQueryContext ctx) { }
	
	@Override public void enterOC_MultiPartQuery(CypherParser.OC_MultiPartQueryContext ctx) { }
	
	@Override public void exitOC_MultiPartQuery(CypherParser.OC_MultiPartQueryContext ctx) { }
	
	@Override public void enterOC_UpdatingClause(CypherParser.OC_UpdatingClauseContext ctx) { }
	
	@Override public void exitOC_UpdatingClause(CypherParser.OC_UpdatingClauseContext ctx) { }
	
	@Override public void enterOC_ReadingClause(CypherParser.OC_ReadingClauseContext ctx) { }
	
	@Override public void exitOC_ReadingClause(CypherParser.OC_ReadingClauseContext ctx) { }
	
	@Override public void enterOC_Match(CypherParser.OC_MatchContext ctx) { }
	
	@Override public void exitOC_Match(CypherParser.OC_MatchContext ctx) { }
	
	@Override public void enterOC_Unwind(CypherParser.OC_UnwindContext ctx) { }
	
	@Override public void exitOC_Unwind(CypherParser.OC_UnwindContext ctx) { }
	
	@Override public void enterOC_Merge(CypherParser.OC_MergeContext ctx) { }
	
	@Override public void exitOC_Merge(CypherParser.OC_MergeContext ctx) { }
	
	@Override public void enterOC_MergeAction(CypherParser.OC_MergeActionContext ctx) { }
	
	@Override public void exitOC_MergeAction(CypherParser.OC_MergeActionContext ctx) { }
	
	@Override public void enterOC_Create(CypherParser.OC_CreateContext ctx) { }
	
	@Override public void exitOC_Create(CypherParser.OC_CreateContext ctx) { }
	
	@Override public void enterOC_Set(CypherParser.OC_SetContext ctx) { }
	
	@Override public void exitOC_Set(CypherParser.OC_SetContext ctx) { }
	
	@Override public void enterOC_SetItem(CypherParser.OC_SetItemContext ctx) { }
	
	@Override public void exitOC_SetItem(CypherParser.OC_SetItemContext ctx) { }
	
	@Override public void enterOC_Delete(CypherParser.OC_DeleteContext ctx) { }
	
	@Override public void exitOC_Delete(CypherParser.OC_DeleteContext ctx) { }
	
	@Override public void enterOC_Remove(CypherParser.OC_RemoveContext ctx) { }
	
	@Override public void exitOC_Remove(CypherParser.OC_RemoveContext ctx) { }
	
	@Override public void enterOC_RemoveItem(CypherParser.OC_RemoveItemContext ctx) { }
	
	@Override public void exitOC_RemoveItem(CypherParser.OC_RemoveItemContext ctx) { }
	
	@Override public void enterOC_InQueryCall(CypherParser.OC_InQueryCallContext ctx) { }
	
	@Override public void exitOC_InQueryCall(CypherParser.OC_InQueryCallContext ctx) { }
	
	@Override public void enterOC_StandaloneCall(CypherParser.OC_StandaloneCallContext ctx) { }
	
	@Override public void exitOC_StandaloneCall(CypherParser.OC_StandaloneCallContext ctx) { }
	
	@Override public void enterOC_YieldItems(CypherParser.OC_YieldItemsContext ctx) { }
	
	@Override public void exitOC_YieldItems(CypherParser.OC_YieldItemsContext ctx) { }
	
	@Override public void enterOC_YieldItem(CypherParser.OC_YieldItemContext ctx) { }
	
	@Override public void exitOC_YieldItem(CypherParser.OC_YieldItemContext ctx) { }
	
	@Override public void enterOC_With(CypherParser.OC_WithContext ctx) { }
	
	@Override public void exitOC_With(CypherParser.OC_WithContext ctx) { }
	
	@Override public void enterOC_Return(CypherParser.OC_ReturnContext ctx) { }
	
	@Override public void exitOC_Return(CypherParser.OC_ReturnContext ctx) { }
	
	@Override public void enterOC_ProjectionBody(CypherParser.OC_ProjectionBodyContext ctx) { }
	
	@Override public void exitOC_ProjectionBody(CypherParser.OC_ProjectionBodyContext ctx) { }
	
	@Override public void enterOC_ProjectionItems(CypherParser.OC_ProjectionItemsContext ctx) { }
	
	@Override public void exitOC_ProjectionItems(CypherParser.OC_ProjectionItemsContext ctx) { }
	
	@Override public void enterOC_ProjectionItem(CypherParser.OC_ProjectionItemContext ctx) { }
	
	@Override public void exitOC_ProjectionItem(CypherParser.OC_ProjectionItemContext ctx) { }
	
	@Override public void enterOC_Order(CypherParser.OC_OrderContext ctx) { }
	
	@Override public void exitOC_Order(CypherParser.OC_OrderContext ctx) { }
	
	@Override public void enterOC_Skip(CypherParser.OC_SkipContext ctx) { }
	
	@Override public void exitOC_Skip(CypherParser.OC_SkipContext ctx) { }
	
	@Override public void enterOC_Limit(CypherParser.OC_LimitContext ctx) { }
	
	@Override public void exitOC_Limit(CypherParser.OC_LimitContext ctx) { }
	
	@Override public void enterOC_SortItem(CypherParser.OC_SortItemContext ctx) { }
	
	@Override public void exitOC_SortItem(CypherParser.OC_SortItemContext ctx) { }
	
	@Override public void enterOC_Where(CypherParser.OC_WhereContext ctx) { }
	
	@Override public void exitOC_Where(CypherParser.OC_WhereContext ctx) { }
	
	@Override public void enterOC_Pattern(CypherParser.OC_PatternContext ctx) {
//		System.out.println(ctx.getText());
	}
	
	@Override public void exitOC_Pattern(CypherParser.OC_PatternContext ctx) { }
	
	@Override public void enterOC_PatternPart(CypherParser.OC_PatternPartContext ctx) { }
	
	@Override public void exitOC_PatternPart(CypherParser.OC_PatternPartContext ctx) { }
	
	@Override public void enterOC_AnonymousPatternPart(CypherParser.OC_AnonymousPatternPartContext ctx) { }
	
	@Override public void exitOC_AnonymousPatternPart(CypherParser.OC_AnonymousPatternPartContext ctx) { }
	
	@Override public void enterOC_PatternElement(CypherParser.OC_PatternElementContext ctx) { }
	
	@Override public void exitOC_PatternElement(CypherParser.OC_PatternElementContext ctx) { }
	
	@Override public void enterOC_NodePattern(CypherParser.OC_NodePatternContext ctx) {
		properties = new HashMap<String, Object>();
		iterator++;
			vertex=new vertex();
			isVertex=true;
//		System.out.println(ctx.getText());
	}
	
	@Override public void exitOC_NodePattern(CypherParser.OC_NodePatternContext ctx) {
		vertex.setProperties(properties);
		if(iterator==1){
		c.setNodePattern(vertex);
				}
		isVertex=false;

	}
	
	@Override public void enterOC_PatternElementChain(CypherParser.OC_PatternElementChainContext ctx) {
		pec=new PatternElementChain();
	}
	
	@Override public void exitOC_PatternElementChain(CypherParser.OC_PatternElementChainContext ctx) {

		edge.setProperties(properties);
		pec.setNodePattern(vertex);
		pec.setRelationshipPattern(edge);
		c.addPatternElementChain(pec);
		edge.setProperties(properties);

	}
	
	@Override public void enterOC_RelationshipPattern(CypherParser.OC_RelationshipPatternContext ctx) {
		edge=new edge();
		properties = new HashMap<String, Object>();

		//System.out.println(ctx.getText());
	}
	
	@Override public void exitOC_RelationshipPattern(CypherParser.OC_RelationshipPatternContext ctx) {


		//System.out.println("b"+pec);

//		System.out.println("test1");
//		System.out.println(edge);
//		System.out.println("test2");
//		System.out.println(vertex);
//		System.out.println("test3");
//		System.out.println(pec);


	}
	
	@Override public void enterOC_RelationshipDetail(CypherParser.OC_RelationshipDetailContext ctx) {
		//System.out.println(ctx.getText());

	}
	
	@Override public void exitOC_RelationshipDetail(CypherParser.OC_RelationshipDetailContext ctx) {
	}
	
	@Override public void enterOC_Properties(CypherParser.OC_PropertiesContext ctx) { }
	
	@Override public void exitOC_Properties(CypherParser.OC_PropertiesContext ctx) { }
	
	@Override public void enterOC_RelationshipTypes(CypherParser.OC_RelationshipTypesContext ctx) { }
	
	@Override public void exitOC_RelationshipTypes(CypherParser.OC_RelationshipTypesContext ctx) { }
	
	@Override public void enterOC_NodeLabels(CypherParser.OC_NodeLabelsContext ctx) {
	}
	
	@Override public void exitOC_NodeLabels(CypherParser.OC_NodeLabelsContext ctx) { }
	
	@Override public void enterOC_NodeLabel(CypherParser.OC_NodeLabelContext ctx) {
	}
	
	@Override public void exitOC_NodeLabel(CypherParser.OC_NodeLabelContext ctx) { }
	
	@Override public void enterOC_RangeLiteral(CypherParser.OC_RangeLiteralContext ctx) {

		isRangeLiteral=true;
		String range=ctx.getText().substring(1,ctx.getText().length());
		if(range.contains("..")){



			String minHops=range.substring(0,range.lastIndexOf(".."));
			String maxHops=range.substring(range.lastIndexOf("..")+2,range.length());

			if(!minHops.isEmpty()&&!maxHops.isEmpty()){
				pec.setMinHops(Integer.parseInt(minHops));
				pec.setMaxHops(Integer.parseInt(maxHops));

			}
			else if(minHops.isEmpty()&&!maxHops.isEmpty()){
				pec.setMinHops(1);
				pec.setMaxHops(Integer.parseInt(maxHops));
			}
			else if(!minHops.isEmpty()&&maxHops.isEmpty()){
				pec.setMinHops(Integer.parseInt(minHops));
				pec.setMaxHops(Integer.MAX_VALUE);
			}
		}
		else{
			pec.setMinHops(Integer.parseInt(range));
			pec.setMaxHops(Integer.parseInt(range));
		}
	}
	
	@Override public void exitOC_RangeLiteral(CypherParser.OC_RangeLiteralContext ctx) {
		isRangeLiteral=false;
	}
	
	@Override public void enterOC_LabelName(CypherParser.OC_LabelNameContext ctx) {
			vertex.getLabels().add(ctx.getText());

	}
	
	@Override public void exitOC_LabelName(CypherParser.OC_LabelNameContext ctx) { }
	
	@Override public void enterOC_RelTypeName(CypherParser.OC_RelTypeNameContext ctx) {
			edge.getLabels().add(ctx.getText());

	}
	
	@Override public void exitOC_RelTypeName(CypherParser.OC_RelTypeNameContext ctx) { }
	
	@Override public void enterOC_Expression(CypherParser.OC_ExpressionContext ctx) { }
	
	@Override public void exitOC_Expression(CypherParser.OC_ExpressionContext ctx) { }
	
	@Override public void enterOC_OrExpression(CypherParser.OC_OrExpressionContext ctx) { }
	
	@Override public void exitOC_OrExpression(CypherParser.OC_OrExpressionContext ctx) { }
	
	@Override public void enterOC_XorExpression(CypherParser.OC_XorExpressionContext ctx) { }
	
	@Override public void exitOC_XorExpression(CypherParser.OC_XorExpressionContext ctx) { }
	
	@Override public void enterOC_AndExpression(CypherParser.OC_AndExpressionContext ctx) { }
	
	@Override public void exitOC_AndExpression(CypherParser.OC_AndExpressionContext ctx) { }
	
	@Override public void enterOC_NotExpression(CypherParser.OC_NotExpressionContext ctx) { }
	
	@Override public void exitOC_NotExpression(CypherParser.OC_NotExpressionContext ctx) { }
	
	@Override public void enterOC_ComparisonExpression(CypherParser.OC_ComparisonExpressionContext ctx) { }
	
	@Override public void exitOC_ComparisonExpression(CypherParser.OC_ComparisonExpressionContext ctx) { }
	
	@Override public void enterOC_AddOrSubtractExpression(CypherParser.OC_AddOrSubtractExpressionContext ctx) { }
	
	@Override public void exitOC_AddOrSubtractExpression(CypherParser.OC_AddOrSubtractExpressionContext ctx) { }
	
	@Override public void enterOC_MultiplyDivideModuloExpression(CypherParser.OC_MultiplyDivideModuloExpressionContext ctx) { }
	
	@Override public void exitOC_MultiplyDivideModuloExpression(CypherParser.OC_MultiplyDivideModuloExpressionContext ctx) { }
	
	@Override public void enterOC_PowerOfExpression(CypherParser.OC_PowerOfExpressionContext ctx) { }
	
	@Override public void exitOC_PowerOfExpression(CypherParser.OC_PowerOfExpressionContext ctx) { }
	
	@Override public void enterOC_UnaryAddOrSubtractExpression(CypherParser.OC_UnaryAddOrSubtractExpressionContext ctx) { }
	
	@Override public void exitOC_UnaryAddOrSubtractExpression(CypherParser.OC_UnaryAddOrSubtractExpressionContext ctx) { }
	
	@Override public void enterOC_StringListNullOperatorExpression(CypherParser.OC_StringListNullOperatorExpressionContext ctx) { }
	
	@Override public void exitOC_StringListNullOperatorExpression(CypherParser.OC_StringListNullOperatorExpressionContext ctx) { }
	
	@Override public void enterOC_ListOperatorExpression(CypherParser.OC_ListOperatorExpressionContext ctx) { }
	
	@Override public void exitOC_ListOperatorExpression(CypherParser.OC_ListOperatorExpressionContext ctx) { }
	
	@Override public void enterOC_StringOperatorExpression(CypherParser.OC_StringOperatorExpressionContext ctx) { }
	
	@Override public void exitOC_StringOperatorExpression(CypherParser.OC_StringOperatorExpressionContext ctx) { }
	
	@Override public void enterOC_NullOperatorExpression(CypherParser.OC_NullOperatorExpressionContext ctx) { }
	
	@Override public void exitOC_NullOperatorExpression(CypherParser.OC_NullOperatorExpressionContext ctx) { }
	
	@Override public void enterOC_PropertyOrLabelsExpression(CypherParser.OC_PropertyOrLabelsExpressionContext ctx) { }
	
	@Override public void exitOC_PropertyOrLabelsExpression(CypherParser.OC_PropertyOrLabelsExpressionContext ctx) { }
	
	@Override public void enterOC_Atom(CypherParser.OC_AtomContext ctx) { }
	
	@Override public void exitOC_Atom(CypherParser.OC_AtomContext ctx) { }
	
	@Override public void enterOC_Literal(CypherParser.OC_LiteralContext ctx) {
		//System.out.println(key);
		//System.out.println(ctx.getText());

		Character c= ctx.getText().charAt(0);
		String primivite_value=ctx.getText();
		if(c.equals('\'')){
			primivite_value=primivite_value.substring(1,primivite_value.length()-1);
		}

		properties.put(key,primivite_value);
	}
	
	@Override public void exitOC_Literal(CypherParser.OC_LiteralContext ctx) { }
	
	@Override public void enterOC_BooleanLiteral(CypherParser.OC_BooleanLiteralContext ctx) { }
	
	@Override public void exitOC_BooleanLiteral(CypherParser.OC_BooleanLiteralContext ctx) { }
	
	@Override public void enterOC_ListLiteral(CypherParser.OC_ListLiteralContext ctx) { }
	
	@Override public void exitOC_ListLiteral(CypherParser.OC_ListLiteralContext ctx) { }
	
	@Override public void enterOC_PartialComparisonExpression(CypherParser.OC_PartialComparisonExpressionContext ctx) { }
	
	@Override public void exitOC_PartialComparisonExpression(CypherParser.OC_PartialComparisonExpressionContext ctx) { }
	
	@Override public void enterOC_ParenthesizedExpression(CypherParser.OC_ParenthesizedExpressionContext ctx) { }
	
	@Override public void exitOC_ParenthesizedExpression(CypherParser.OC_ParenthesizedExpressionContext ctx) { }
	
	@Override public void enterOC_RelationshipsPattern(CypherParser.OC_RelationshipsPatternContext ctx) { }
	
	@Override public void exitOC_RelationshipsPattern(CypherParser.OC_RelationshipsPatternContext ctx) { }
	
	@Override public void enterOC_FilterExpression(CypherParser.OC_FilterExpressionContext ctx) { }
	
	@Override public void exitOC_FilterExpression(CypherParser.OC_FilterExpressionContext ctx) { }
	
	@Override public void enterOC_IdInColl(CypherParser.OC_IdInCollContext ctx) { }
	
	@Override public void exitOC_IdInColl(CypherParser.OC_IdInCollContext ctx) { }
	
	@Override public void enterOC_FunctionInvocation(CypherParser.OC_FunctionInvocationContext ctx) { }
	
	@Override public void exitOC_FunctionInvocation(CypherParser.OC_FunctionInvocationContext ctx) { }
	
	@Override public void enterOC_FunctionName(CypherParser.OC_FunctionNameContext ctx) { }
	
	@Override public void exitOC_FunctionName(CypherParser.OC_FunctionNameContext ctx) { }
	
	@Override public void enterOC_ExplicitProcedureInvocation(CypherParser.OC_ExplicitProcedureInvocationContext ctx) { }
	
	@Override public void exitOC_ExplicitProcedureInvocation(CypherParser.OC_ExplicitProcedureInvocationContext ctx) { }
	
	@Override public void enterOC_ImplicitProcedureInvocation(CypherParser.OC_ImplicitProcedureInvocationContext ctx) { }
	
	@Override public void exitOC_ImplicitProcedureInvocation(CypherParser.OC_ImplicitProcedureInvocationContext ctx) { }
	
	@Override public void enterOC_ProcedureResultField(CypherParser.OC_ProcedureResultFieldContext ctx) { }
	
	@Override public void exitOC_ProcedureResultField(CypherParser.OC_ProcedureResultFieldContext ctx) { }
	
	@Override public void enterOC_ProcedureName(CypherParser.OC_ProcedureNameContext ctx) { }
	
	@Override public void exitOC_ProcedureName(CypherParser.OC_ProcedureNameContext ctx) { }
	
	@Override public void enterOC_Namespace(CypherParser.OC_NamespaceContext ctx) { }
	
	@Override public void exitOC_Namespace(CypherParser.OC_NamespaceContext ctx) { }
	
	@Override public void enterOC_ListComprehension(CypherParser.OC_ListComprehensionContext ctx) { }
	
	@Override public void exitOC_ListComprehension(CypherParser.OC_ListComprehensionContext ctx) { }
	
	@Override public void enterOC_PatternComprehension(CypherParser.OC_PatternComprehensionContext ctx) { }
	
	@Override public void exitOC_PatternComprehension(CypherParser.OC_PatternComprehensionContext ctx) { }
	
	@Override public void enterOC_PropertyLookup(CypherParser.OC_PropertyLookupContext ctx) { }
	
	@Override public void exitOC_PropertyLookup(CypherParser.OC_PropertyLookupContext ctx) { }
	
	@Override public void enterOC_CaseExpression(CypherParser.OC_CaseExpressionContext ctx) { }
	
	@Override public void exitOC_CaseExpression(CypherParser.OC_CaseExpressionContext ctx) { }
	
	@Override public void enterOC_CaseAlternatives(CypherParser.OC_CaseAlternativesContext ctx) { }
	
	@Override public void exitOC_CaseAlternatives(CypherParser.OC_CaseAlternativesContext ctx) { }
	
	@Override public void enterOC_Variable(CypherParser.OC_VariableContext ctx) {
		if(isVertex){
			vertex.setId(ctx.getText());
		}
		else{
			edge.setId(ctx.getText());
		}
		//System.out.println(ctx.getText());
	}
	
	@Override public void exitOC_Variable(CypherParser.OC_VariableContext ctx) { }
	
	@Override public void enterOC_NumberLiteral(CypherParser.OC_NumberLiteralContext ctx) { }
	
	@Override public void exitOC_NumberLiteral(CypherParser.OC_NumberLiteralContext ctx) { }
	
	@Override public void enterOC_MapLiteral(CypherParser.OC_MapLiteralContext ctx) { }
	
	@Override public void exitOC_MapLiteral(CypherParser.OC_MapLiteralContext ctx) { }
	
	@Override public void enterOC_Parameter(CypherParser.OC_ParameterContext ctx) { }
	
	@Override public void exitOC_Parameter(CypherParser.OC_ParameterContext ctx) { }
	
	@Override public void enterOC_PropertyExpression(CypherParser.OC_PropertyExpressionContext ctx) { }
	
	@Override public void exitOC_PropertyExpression(CypherParser.OC_PropertyExpressionContext ctx) { }
	
	@Override public void enterOC_PropertyKeyName(CypherParser.OC_PropertyKeyNameContext ctx) {
		key=ctx.getText();
	}
	
	@Override public void exitOC_PropertyKeyName(CypherParser.OC_PropertyKeyNameContext ctx) {
	}
	
	@Override public void enterOC_IntegerLiteral(CypherParser.OC_IntegerLiteralContext ctx) {

//		if(isRangeLiteral){
//
//			if(pec.getMinHops()==-1){
//				pec.setMinHops(Integer.parseInt(ctx.getText()));
//			}
//			else{
//				pec.setMaxHops(Integer.parseInt(ctx.getText()));
//			}
//
//			}
		}
//		else{
//			pec.setMaxHops(Integer.parseInt(ctx.getText());
//		}


	
	@Override public void exitOC_IntegerLiteral(CypherParser.OC_IntegerLiteralContext ctx) { }
	
	@Override public void enterOC_DoubleLiteral(CypherParser.OC_DoubleLiteralContext ctx) { }
	
	@Override public void exitOC_DoubleLiteral(CypherParser.OC_DoubleLiteralContext ctx) { }
	
	@Override public void enterOC_SchemaName(CypherParser.OC_SchemaNameContext ctx) { }
	
	@Override public void exitOC_SchemaName(CypherParser.OC_SchemaNameContext ctx) { }
	
	@Override public void enterOC_ReservedWord(CypherParser.OC_ReservedWordContext ctx) { }
	
	@Override public void exitOC_ReservedWord(CypherParser.OC_ReservedWordContext ctx) { }
	
	@Override public void enterOC_SymbolicName(CypherParser.OC_SymbolicNameContext ctx) { }
	
	@Override public void exitOC_SymbolicName(CypherParser.OC_SymbolicNameContext ctx) { }
	
	@Override public void enterOC_LeftArrowHead(CypherParser.OC_LeftArrowHeadContext ctx) {
		pec.setLeftArrow(true);
	}
	
	@Override public void exitOC_LeftArrowHead(CypherParser.OC_LeftArrowHeadContext ctx) { }
	
	@Override public void enterOC_RightArrowHead(CypherParser.OC_RightArrowHeadContext ctx) {
		pec.setRightArrow(true);
	}
	
	@Override public void exitOC_RightArrowHead(CypherParser.OC_RightArrowHeadContext ctx) { }
	
	@Override public void enterOC_Dash(CypherParser.OC_DashContext ctx) { }
	
	@Override public void exitOC_Dash(CypherParser.OC_DashContext ctx) { }

	
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	
	@Override public void visitTerminal(TerminalNode node) { }
	
	@Override public void visitErrorNode(ErrorNode node) { }
}