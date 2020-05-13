package parsers_and_listeners.cypher.yarspg;// Generated from YARS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSpgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, SECTION_NAME=34, COMMENT=35, STRING=36, NUMBER=37, 
		BOOL=38, DATETYPE=39, DATE=40, TIME=41, TIMEZONE=42, SIGN=43, TIMESTAMP=44, 
		STRING_LITERAL_QUOTE=45, ALNUM_PLUS=46, IRI=47, PN_CHARS=48, PN_CHARS_U=49, 
		UCHAR=50, PN_CHARS_BASE=51, HEX=52, WS=53;
	public static final int
		RULE_yarspg = 0, RULE_statement = 1, RULE_prefix_directive = 2, RULE_pname = 3, 
		RULE_pn_local = 4, RULE_metadata = 5, RULE_graph_name = 6, RULE_annotation = 7, 
		RULE_string_annotation = 8, RULE_rdf_annotation = 9, RULE_annotations_list = 10, 
		RULE_props_list = 11, RULE_graphs_list = 12, RULE_node = 13, RULE_edge = 14, 
		RULE_section = 15, RULE_directed = 16, RULE_undirected = 17, RULE_node_id = 18, 
		RULE_node_label = 19, RULE_prop = 20, RULE_edge_id = 21, RULE_edge_label = 22, 
		RULE_key = 23, RULE_value = 24, RULE_primitive_value = 25, RULE_complex_value = 26, 
		RULE_set = 27, RULE_list = 28, RULE_struct = 29, RULE_node_schema = 30, 
		RULE_prop_list_schema = 31, RULE_prop_schema = 32, RULE_value_schema = 33, 
		RULE_primitive_value_schema = 34, RULE_complex_value_schema = 35, RULE_set_schema = 36, 
		RULE_list_schema = 37, RULE_struct_schema = 38, RULE_edge_schema = 39, 
		RULE_directed_schema = 40, RULE_undirected_schema = 41;
	private static String[] makeRuleNames() {
		return new String[] {
                "parsers_and_listeners/cypher/yarspg", "statement", "prefix_directive", "pname", "pn_local", "metadata",
			"graph_name", "annotation", "string_annotation", "rdf_annotation", "annotations_list", 
			"props_list", "graphs_list", "node", "edge", "section", "directed", "undirected", 
			"node_id", "node_label", "prop", "edge_id", "edge_label", "key", "value", 
			"primitive_value", "complex_value", "set", "list", "struct", "node_schema", 
			"prop_list_schema", "prop_schema", "value_schema", "primitive_value_schema", 
			"complex_value_schema", "set_schema", "list_schema", "struct_schema", 
			"edge_schema", "directed_schema", "undirected_schema"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "'+'", "','", "'['", "']'", "'/'", "'<'", "'>'", 
			"'{'", "'}'", "'%'", "'('", "')'", "'->'", "'null'", "'S'", "'Decimal'", 
			"'SmallInt'", "'Integer'", "'BigInt'", "'Float'", "'Real'", "'Double'", 
			"'Bool'", "'Null'", "'String'", "'Date'", "'Time'", "'Timestamp'", "'Set'", 
			"'List'", "'Struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "SECTION_NAME", 
			"COMMENT", "STRING", "NUMBER", "BOOL", "DATETYPE", "DATE", "TIME", "TIMEZONE", 
			"SIGN", "TIMESTAMP", "STRING_LITERAL_QUOTE", "ALNUM_PLUS", "IRI", "PN_CHARS", 
			"PN_CHARS_U", "UCHAR", "PN_CHARS_BASE", "HEX", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YARSpg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YARSpgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class YarspgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YARSpgParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public YarspgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yarspg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterYarspg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitYarspg(this);
		}
	}

	public final YarspgContext yarspg() throws RecognitionException {
		YarspgContext _localctx = new YarspgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_yarspg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__16))) != 0) );
			setState(89);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public Prefix_directiveContext prefix_directive() {
			return getRuleContext(Prefix_directiveContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public Node_schemaContext node_schema() {
			return getRuleContext(Node_schemaContext.class,0);
		}
		public Edge_schemaContext edge_schema() {
			return getRuleContext(Edge_schemaContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				node();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				edge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				prefix_directive();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				metadata();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				node_schema();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				edge_schema();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				section();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_directiveContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public TerminalNode IRI() { return getToken(YARSpgParser.IRI, 0); }
		public Prefix_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPrefix_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPrefix_directive(this);
		}
	}

	public final Prefix_directiveContext prefix_directive() throws RecognitionException {
		Prefix_directiveContext _localctx = new Prefix_directiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prefix_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			pname();
			setState(101);
			match(IRI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PnameContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSpgParser.ALNUM_PLUS, 0); }
		public PnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPname(this);
		}
	}

	public final PnameContext pname() throws RecognitionException {
		PnameContext _localctx = new PnameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			match(ALNUM_PLUS);
			setState(105);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pn_localContext extends ParserRuleContext {
		public TerminalNode ALNUM_PLUS() { return getToken(YARSpgParser.ALNUM_PLUS, 0); }
		public Pn_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pn_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPn_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPn_local(this);
		}
	}

	public final Pn_localContext pn_local() throws RecognitionException {
		Pn_localContext _localctx = new Pn_localContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pn_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ALNUM_PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataContext extends ParserRuleContext {
		public Pn_localContext pn_local() {
			return getRuleContext(Pn_localContext.class,0);
		}
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public List<TerminalNode> IRI() { return getTokens(YARSpgParser.IRI); }
		public TerminalNode IRI(int i) {
			return getToken(YARSpgParser.IRI, i);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMetadata(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_metadata);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__1);
				setState(110);
				pn_local();
				setState(111);
				pname();
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IRI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__1);
				setState(115);
				match(IRI);
				setState(116);
				match(T__0);
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IRI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graph_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Graph_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraph_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraph_name(this);
		}
	}

	public final Graph_nameContext graph_name() throws RecognitionException {
		Graph_nameContext _localctx = new Graph_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_graph_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public String_annotationContext string_annotation() {
			return getRuleContext(String_annotationContext.class,0);
		}
		public Rdf_annotationContext rdf_annotation() {
			return getRuleContext(Rdf_annotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_annotation);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				string_annotation();
				}
				break;
			case ALNUM_PLUS:
			case IRI:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				rdf_annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_annotationContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(YARSpgParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(YARSpgParser.STRING, i);
		}
		public String_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterString_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitString_annotation(this);
		}
	}

	public final String_annotationContext string_annotation() throws RecognitionException {
		String_annotationContext _localctx = new String_annotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(STRING);
			setState(127);
			match(T__0);
			setState(128);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rdf_annotationContext extends ParserRuleContext {
		public Pn_localContext pn_local() {
			return getRuleContext(Pn_localContext.class,0);
		}
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public List<TerminalNode> IRI() { return getTokens(YARSpgParser.IRI); }
		public TerminalNode IRI(int i) {
			return getToken(YARSpgParser.IRI, i);
		}
		public Rdf_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdf_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterRdf_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitRdf_annotation(this);
		}
	}

	public final Rdf_annotationContext rdf_annotation() throws RecognitionException {
		Rdf_annotationContext _localctx = new Rdf_annotationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rdf_annotation);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALNUM_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				pn_local();
				setState(131);
				pname();
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IRI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(IRI);
				setState(135);
				match(T__0);
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IRI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotations_listContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Annotations_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterAnnotations_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitAnnotations_list(this);
		}
	}

	public final Annotations_listContext annotations_list() throws RecognitionException {
		Annotations_listContext _localctx = new Annotations_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotations_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__2);
			setState(140);
			annotation();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(141);
				match(T__3);
				setState(142);
				annotation();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Props_listContext extends ParserRuleContext {
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public Props_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProps_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProps_list(this);
		}
	}

	public final Props_listContext props_list() throws RecognitionException {
		Props_listContext _localctx = new Props_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_props_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__4);
			setState(149);
			prop();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(150);
				match(T__3);
				setState(151);
				prop();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graphs_listContext extends ParserRuleContext {
		public List<Graph_nameContext> graph_name() {
			return getRuleContexts(Graph_nameContext.class);
		}
		public Graph_nameContext graph_name(int i) {
			return getRuleContext(Graph_nameContext.class,i);
		}
		public Graphs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraphs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraphs_list(this);
		}
	}

	public final Graphs_listContext graphs_list() throws RecognitionException {
		Graphs_listContext _localctx = new Graphs_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_graphs_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__6);
			setState(160);
			graph_name();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(161);
				match(T__3);
				setState(162);
				graph_name();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Props_listContext props_list() {
			return getRuleContext(Props_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Annotations_listContext annotations_list() {
			return getRuleContext(Annotations_listContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__7);
			setState(171);
			node_id();
			setState(172);
			match(T__8);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(173);
				match(T__9);
				setState(174);
				node_label();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(175);
					match(T__3);
					setState(176);
					node_label();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(T__10);
				}
			}

			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(186);
				props_list();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(189);
				graphs_list();
				}
			}

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(192);
				annotations_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeContext extends ParserRuleContext {
		public DirectedContext directed() {
			return getRuleContext(DirectedContext.class,0);
		}
		public UndirectedContext undirected() {
			return getRuleContext(UndirectedContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_edge);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				directed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				undirected();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION_NAME() { return getToken(YARSpgParser.SECTION_NAME, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__11);
			setState(200);
			match(SECTION_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectedContext extends ParserRuleContext {
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public Edge_labelContext edge_label() {
			return getRuleContext(Edge_labelContext.class,0);
		}
		public Edge_idContext edge_id() {
			return getRuleContext(Edge_idContext.class,0);
		}
		public Props_listContext props_list() {
			return getRuleContext(Props_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Annotations_listContext annotations_list() {
			return getRuleContext(Annotations_listContext.class,0);
		}
		public DirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDirected(this);
		}
	}

	public final DirectedContext directed() throws RecognitionException {
		DirectedContext _localctx = new DirectedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_directed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__12);
			setState(203);
			node_id();
			setState(204);
			match(T__13);
			setState(205);
			match(T__1);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(206);
				match(T__7);
				setState(207);
				edge_id();
				setState(208);
				match(T__8);
				}
			}

			setState(212);
			match(T__9);
			setState(213);
			edge_label();
			setState(214);
			match(T__10);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(215);
				props_list();
				}
			}

			setState(218);
			match(T__14);
			setState(219);
			match(T__12);
			setState(220);
			node_id();
			setState(221);
			match(T__13);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(222);
				graphs_list();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(225);
				annotations_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UndirectedContext extends ParserRuleContext {
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public Edge_labelContext edge_label() {
			return getRuleContext(Edge_labelContext.class,0);
		}
		public Edge_idContext edge_id() {
			return getRuleContext(Edge_idContext.class,0);
		}
		public Props_listContext props_list() {
			return getRuleContext(Props_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Annotations_listContext annotations_list() {
			return getRuleContext(Annotations_listContext.class,0);
		}
		public UndirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterUndirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitUndirected(this);
		}
	}

	public final UndirectedContext undirected() throws RecognitionException {
		UndirectedContext _localctx = new UndirectedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_undirected);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__12);
			setState(229);
			node_id();
			setState(230);
			match(T__13);
			setState(231);
			match(T__1);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(232);
				match(T__7);
				setState(233);
				edge_id();
				setState(234);
				match(T__8);
				}
			}

			setState(238);
			match(T__9);
			setState(239);
			edge_label();
			setState(240);
			match(T__10);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(241);
				props_list();
				}
			}

			setState(244);
			match(T__1);
			setState(245);
			match(T__12);
			setState(246);
			node_id();
			setState(247);
			match(T__13);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(248);
				graphs_list();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(251);
				annotations_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_idContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_id(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_node_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_labelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Node_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_label(this);
		}
	}

	public final Node_labelContext node_label() throws RecognitionException {
		Node_labelContext _localctx = new Node_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_node_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			key();
			setState(259);
			match(T__0);
			setState(260);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_idContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Edge_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge_id(this);
		}
	}

	public final Edge_idContext edge_id() throws RecognitionException {
		Edge_idContext _localctx = new Edge_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_edge_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_labelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Edge_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge_label(this);
		}
	}

	public final Edge_labelContext edge_label() throws RecognitionException {
		Edge_labelContext _localctx = new Edge_labelContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_edge_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Primitive_valueContext primitive_value() {
			return getRuleContext(Primitive_valueContext.class,0);
		}
		public Complex_valueContext complex_value() {
			return getRuleContext(Complex_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case STRING:
			case NUMBER:
			case BOOL:
			case DATETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				primitive_value();
				}
				break;
			case T__4:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				complex_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(YARSpgParser.NUMBER, 0); }
		public TerminalNode DATETYPE() { return getToken(YARSpgParser.DATETYPE, 0); }
		public TerminalNode BOOL() { return getToken(YARSpgParser.BOOL, 0); }
		public Primitive_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPrimitive_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPrimitive_value(this);
		}
	}

	public final Primitive_valueContext primitive_value() throws RecognitionException {
		Primitive_valueContext _localctx = new Primitive_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primitive_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << STRING) | (1L << NUMBER) | (1L << BOOL) | (1L << DATETYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_valueContext extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public Complex_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterComplex_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitComplex_value(this);
		}
	}

	public final Complex_valueContext complex_value() throws RecognitionException {
		Complex_valueContext _localctx = new Complex_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_complex_value);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				set();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				struct();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<SetContext> set() {
			return getRuleContexts(SetContext.class);
		}
		public SetContext set(int i) {
			return getRuleContext(SetContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__9);
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case STRING:
			case NUMBER:
			case BOOL:
			case DATETYPE:
				{
				setState(280);
				primitive_value();
				}
				break;
			case T__9:
				{
				setState(281);
				set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(284);
				match(T__3);
				setState(287);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
				case STRING:
				case NUMBER:
				case BOOL:
				case DATETYPE:
					{
					setState(285);
					primitive_value();
					}
					break;
				case T__9:
					{
					setState(286);
					set();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__4);
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case STRING:
			case NUMBER:
			case BOOL:
			case DATETYPE:
				{
				setState(297);
				primitive_value();
				}
				break;
			case T__4:
				{
				setState(298);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(301);
				match(T__3);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
				case STRING:
				case NUMBER:
				case BOOL:
				case DATETYPE:
					{
					setState(302);
					primitive_value();
					}
					break;
				case T__4:
					{
					setState(303);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__9);
			setState(314);
			key();
			setState(315);
			match(T__0);
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case STRING:
			case NUMBER:
			case BOOL:
			case DATETYPE:
				{
				setState(316);
				primitive_value();
				}
				break;
			case T__9:
				{
				setState(317);
				struct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(320);
				match(T__3);
				setState(321);
				key();
				setState(322);
				match(T__0);
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
				case STRING:
				case NUMBER:
				case BOOL:
				case DATETYPE:
					{
					setState(323);
					primitive_value();
					}
					break;
				case T__9:
					{
					setState(324);
					struct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_schemaContext extends ParserRuleContext {
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Annotations_listContext annotations_list() {
			return getRuleContext(Annotations_listContext.class,0);
		}
		public Node_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_schema(this);
		}
	}

	public final Node_schemaContext node_schema() throws RecognitionException {
		Node_schemaContext _localctx = new Node_schemaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_node_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__16);
			setState(335);
			match(T__9);
			setState(336);
			node_label();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(337);
				match(T__3);
				setState(338);
				node_label();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(T__10);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(345);
				prop_list_schema();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(348);
				graphs_list();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(351);
				annotations_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prop_list_schemaContext extends ParserRuleContext {
		public List<Prop_schemaContext> prop_schema() {
			return getRuleContexts(Prop_schemaContext.class);
		}
		public Prop_schemaContext prop_schema(int i) {
			return getRuleContext(Prop_schemaContext.class,i);
		}
		public Prop_list_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_list_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp_list_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp_list_schema(this);
		}
	}

	public final Prop_list_schemaContext prop_list_schema() throws RecognitionException {
		Prop_list_schemaContext _localctx = new Prop_list_schemaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_prop_list_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__4);
			setState(355);
			prop_schema();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(356);
				match(T__3);
				setState(357);
				prop_schema();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prop_schemaContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Value_schemaContext value_schema() {
			return getRuleContext(Value_schemaContext.class,0);
		}
		public Prop_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp_schema(this);
		}
	}

	public final Prop_schemaContext prop_schema() throws RecognitionException {
		Prop_schemaContext _localctx = new Prop_schemaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prop_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			key();
			setState(366);
			match(T__0);
			setState(367);
			value_schema();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Complex_value_schemaContext complex_value_schema() {
			return getRuleContext(Complex_value_schemaContext.class,0);
		}
		public Value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterValue_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitValue_schema(this);
		}
	}

	public final Value_schemaContext value_schema() throws RecognitionException {
		Value_schemaContext _localctx = new Value_schemaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value_schema);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				primitive_value_schema();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				complex_value_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_value_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPrimitive_value_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPrimitive_value_schema(this);
		}
	}

	public final Primitive_value_schemaContext primitive_value_schema() throws RecognitionException {
		Primitive_value_schemaContext _localctx = new Primitive_value_schemaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primitive_value_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_value_schemaContext extends ParserRuleContext {
		public Set_schemaContext set_schema() {
			return getRuleContext(Set_schemaContext.class,0);
		}
		public List_schemaContext list_schema() {
			return getRuleContext(List_schemaContext.class,0);
		}
		public Struct_schemaContext struct_schema() {
			return getRuleContext(Struct_schemaContext.class,0);
		}
		public Complex_value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterComplex_value_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitComplex_value_schema(this);
		}
	}

	public final Complex_value_schemaContext complex_value_schema() throws RecognitionException {
		Complex_value_schemaContext _localctx = new Complex_value_schemaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_complex_value_schema);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				set_schema();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				list_schema();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				struct_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Set_schemaContext set_schema() {
			return getRuleContext(Set_schemaContext.class,0);
		}
		public Set_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterSet_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitSet_schema(this);
		}
	}

	public final Set_schemaContext set_schema() throws RecognitionException {
		Set_schemaContext _localctx = new Set_schemaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_set_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__30);
			setState(381);
			match(T__12);
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				{
				setState(382);
				primitive_value_schema();
				}
				break;
			case T__30:
				{
				setState(383);
				set_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public List_schemaContext list_schema() {
			return getRuleContext(List_schemaContext.class,0);
		}
		public List_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterList_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitList_schema(this);
		}
	}

	public final List_schemaContext list_schema() throws RecognitionException {
		List_schemaContext _localctx = new List_schemaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__31);
			setState(389);
			match(T__12);
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				{
				setState(390);
				primitive_value_schema();
				}
				break;
			case T__31:
				{
				setState(391);
				list_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(394);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Struct_schemaContext struct_schema() {
			return getRuleContext(Struct_schemaContext.class,0);
		}
		public Struct_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStruct_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStruct_schema(this);
		}
	}

	public final Struct_schemaContext struct_schema() throws RecognitionException {
		Struct_schemaContext _localctx = new Struct_schemaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_struct_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__32);
			setState(397);
			match(T__12);
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				{
				setState(398);
				primitive_value_schema();
				}
				break;
			case T__32:
				{
				setState(399);
				struct_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_schemaContext extends ParserRuleContext {
		public Directed_schemaContext directed_schema() {
			return getRuleContext(Directed_schemaContext.class,0);
		}
		public Undirected_schemaContext undirected_schema() {
			return getRuleContext(Undirected_schemaContext.class,0);
		}
		public Edge_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge_schema(this);
		}
	}

	public final Edge_schemaContext edge_schema() throws RecognitionException {
		Edge_schemaContext _localctx = new Edge_schemaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_edge_schema);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				directed_schema();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				undirected_schema();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directed_schemaContext extends ParserRuleContext {
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Edge_labelContext edge_label() {
			return getRuleContext(Edge_labelContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Directed_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDirected_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDirected_schema(this);
		}
	}

	public final Directed_schemaContext directed_schema() throws RecognitionException {
		Directed_schemaContext _localctx = new Directed_schemaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_directed_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__16);
			setState(409);
			match(T__12);
			setState(410);
			node_label();
			setState(411);
			match(T__13);
			setState(412);
			match(T__1);
			setState(413);
			match(T__9);
			setState(414);
			edge_label();
			setState(415);
			match(T__10);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(416);
				prop_list_schema();
				}
			}

			setState(419);
			match(T__14);
			setState(420);
			match(T__12);
			setState(421);
			node_label();
			setState(422);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Undirected_schemaContext extends ParserRuleContext {
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Edge_labelContext edge_label() {
			return getRuleContext(Edge_labelContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Undirected_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterUndirected_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitUndirected_schema(this);
		}
	}

	public final Undirected_schemaContext undirected_schema() throws RecognitionException {
		Undirected_schemaContext _localctx = new Undirected_schemaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_undirected_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__16);
			setState(425);
			match(T__12);
			setState(426);
			node_label();
			setState(427);
			match(T__13);
			setState(428);
			match(T__1);
			setState(429);
			match(T__9);
			setState(430);
			edge_label();
			setState(431);
			match(T__10);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(432);
				prop_list_schema();
				}
			}

			setState(435);
			match(T__1);
			setState(436);
			match(T__12);
			setState(437);
			node_label();
			setState(438);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u01bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3e\n\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7y\n\7\3\b\3\b\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\7\f\u0092\n\f\f\f\16\f"+
		"\u0095\13\f\3\r\3\r\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u00a6\n\16\f\16\16\16\u00a9\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13"+
		"\17\3\17\3\17\5\17\u00bb\n\17\3\17\5\17\u00be\n\17\3\17\5\17\u00c1\n\17"+
		"\3\17\5\17\u00c4\n\17\3\20\3\20\5\20\u00c8\n\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d5\n\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00db\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e2\n\22\3\22\5\22\u00e5"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ef\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00f5\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fc\n\23\3"+
		"\23\5\23\u00ff\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u0111\n\32\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u0118\n\34\3\35\3\35\3\35\5\35\u011d\n\35\3\35\3\35\3\35\5\35\u0122"+
		"\n\35\7\35\u0124\n\35\f\35\16\35\u0127\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\5\36\u012e\n\36\3\36\3\36\3\36\5\36\u0133\n\36\7\36\u0135\n\36\f\36\16"+
		"\36\u0138\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0141\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0148\n\37\7\37\u014a\n\37\f\37\16\37\u014d"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0156\n \f \16 \u0159\13 \3 \3 \5 "+
		"\u015d\n \3 \5 \u0160\n \3 \5 \u0163\n \3!\3!\3!\3!\7!\u0169\n!\f!\16"+
		"!\u016c\13!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\5#\u0176\n#\3$\3$\3%\3%\3%\5%"+
		"\u017d\n%\3&\3&\3&\3&\5&\u0183\n&\3&\3&\3\'\3\'\3\'\3\'\5\'\u018b\n\'"+
		"\3\'\3\'\3(\3(\3(\3(\5(\u0193\n(\3(\3(\3)\3)\5)\u0199\n)\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u01a4\n*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5"+
		"+\u01b4\n+\3+\3+\3+\3+\3+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\5\4\2&&\61\61\4\2\22\22&)\3"+
		"\2\24 \2\u01c5\2W\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\bi\3\2\2\2\nm\3\2\2\2"+
		"\fx\3\2\2\2\16z\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u008b\3\2\2\2"+
		"\26\u008d\3\2\2\2\30\u0096\3\2\2\2\32\u00a1\3\2\2\2\34\u00ac\3\2\2\2\36"+
		"\u00c7\3\2\2\2 \u00c9\3\2\2\2\"\u00cc\3\2\2\2$\u00e6\3\2\2\2&\u0100\3"+
		"\2\2\2(\u0102\3\2\2\2*\u0104\3\2\2\2,\u0108\3\2\2\2.\u010a\3\2\2\2\60"+
		"\u010c\3\2\2\2\62\u0110\3\2\2\2\64\u0112\3\2\2\2\66\u0117\3\2\2\28\u0119"+
		"\3\2\2\2:\u012a\3\2\2\2<\u013b\3\2\2\2>\u0150\3\2\2\2@\u0164\3\2\2\2B"+
		"\u016f\3\2\2\2D\u0175\3\2\2\2F\u0177\3\2\2\2H\u017c\3\2\2\2J\u017e\3\2"+
		"\2\2L\u0186\3\2\2\2N\u018e\3\2\2\2P\u0198\3\2\2\2R\u019a\3\2\2\2T\u01aa"+
		"\3\2\2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2["+
		"\\\7\2\2\3\\\3\3\2\2\2]e\5\34\17\2^e\5\36\20\2_e\5\6\4\2`e\5\f\7\2ae\5"+
		"> \2be\5P)\2ce\5 \21\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2"+
		"\2db\3\2\2\2dc\3\2\2\2e\5\3\2\2\2fg\5\b\5\2gh\7\61\2\2h\7\3\2\2\2ij\7"+
		"\3\2\2jk\7\60\2\2kl\7\3\2\2l\t\3\2\2\2mn\7\60\2\2n\13\3\2\2\2op\7\4\2"+
		"\2pq\5\n\6\2qr\5\b\5\2rs\t\2\2\2sy\3\2\2\2tu\7\4\2\2uv\7\61\2\2vw\7\3"+
		"\2\2wy\t\2\2\2xo\3\2\2\2xt\3\2\2\2y\r\3\2\2\2z{\7&\2\2{\17\3\2\2\2|\177"+
		"\5\22\n\2}\177\5\24\13\2~|\3\2\2\2~}\3\2\2\2\177\21\3\2\2\2\u0080\u0081"+
		"\7&\2\2\u0081\u0082\7\3\2\2\u0082\u0083\7&\2\2\u0083\23\3\2\2\2\u0084"+
		"\u0085\5\n\6\2\u0085\u0086\5\b\5\2\u0086\u0087\t\2\2\2\u0087\u008c\3\2"+
		"\2\2\u0088\u0089\7\61\2\2\u0089\u008a\7\3\2\2\u008a\u008c\t\2\2\2\u008b"+
		"\u0084\3\2\2\2\u008b\u0088\3\2\2\2\u008c\25\3\2\2\2\u008d\u008e\7\5\2"+
		"\2\u008e\u0093\5\20\t\2\u008f\u0090\7\6\2\2\u0090\u0092\5\20\t\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\27\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\7\2\2\u0097\u009c"+
		"\5*\26\2\u0098\u0099\7\6\2\2\u0099\u009b\5*\26\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\31\3\2\2\2\u00a1\u00a2"+
		"\7\t\2\2\u00a2\u00a7\5\16\b\2\u00a3\u00a4\7\6\2\2\u00a4\u00a6\5\16\b\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\t\2\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\5&\24\2\u00ae\u00ba\7\13\2"+
		"\2\u00af\u00b0\7\f\2\2\u00b0\u00b5\5(\25\2\u00b1\u00b2\7\6\2\2\u00b2\u00b4"+
		"\5(\25\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\r"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00be\5\30\r\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\5\32\16\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\5\26\f\2\u00c3\u00c2\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\35\3\2\2\2\u00c5\u00c8\5\"\22\2\u00c6"+
		"\u00c8\5$\23\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\37\3\2\2"+
		"\2\u00c9\u00ca\7\16\2\2\u00ca\u00cb\7$\2\2\u00cb!\3\2\2\2\u00cc\u00cd"+
		"\7\17\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7\20\2\2\u00cf\u00d4\7\4\2\2"+
		"\u00d0\u00d1\7\n\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\7\13\2\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\7\f\2\2\u00d7\u00d8\5.\30\2\u00d8\u00da\7\r\2\2\u00d9\u00db\5\30"+
		"\r\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\7\21\2\2\u00dd\u00de\7\17\2\2\u00de\u00df\5&\24\2\u00df\u00e1\7"+
		"\20\2\2\u00e0\u00e2\5\32\16\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5\26\f\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\5&\24\2\u00e8"+
		"\u00e9\7\20\2\2\u00e9\u00ee\7\4\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5"+
		",\27\2\u00ec\u00ed\7\13\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\f\2\2\u00f1\u00f2\5."+
		"\30\2\u00f2\u00f4\7\r\2\2\u00f3\u00f5\5\30\r\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\7\17"+
		"\2\2\u00f8\u00f9\5&\24\2\u00f9\u00fb\7\20\2\2\u00fa\u00fc\5\32\16\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\5\26"+
		"\f\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff%\3\2\2\2\u0100\u0101"+
		"\7&\2\2\u0101\'\3\2\2\2\u0102\u0103\7&\2\2\u0103)\3\2\2\2\u0104\u0105"+
		"\5\60\31\2\u0105\u0106\7\3\2\2\u0106\u0107\5\62\32\2\u0107+\3\2\2\2\u0108"+
		"\u0109\7&\2\2\u0109-\3\2\2\2\u010a\u010b\7&\2\2\u010b/\3\2\2\2\u010c\u010d"+
		"\7&\2\2\u010d\61\3\2\2\2\u010e\u0111\5\64\33\2\u010f\u0111\5\66\34\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\63\3\2\2\2\u0112\u0113\t\3\2"+
		"\2\u0113\65\3\2\2\2\u0114\u0118\58\35\2\u0115\u0118\5:\36\2\u0116\u0118"+
		"\5<\37\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\67\3\2\2\2\u0119\u011c\7\f\2\2\u011a\u011d\5\64\33\2\u011b\u011d\58\35"+
		"\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0125\3\2\2\2\u011e\u0121"+
		"\7\6\2\2\u011f\u0122\5\64\33\2\u0120\u0122\58\35\2\u0121\u011f\3\2\2\2"+
		"\u0121\u0120\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u011e\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0129\7\r\2\2\u01299\3\2\2\2\u012a\u012d\7\7\2\2"+
		"\u012b\u012e\5\64\33\2\u012c\u012e\5:\36\2\u012d\u012b\3\2\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u0136\3\2\2\2\u012f\u0132\7\6\2\2\u0130\u0133\5\64\33\2"+
		"\u0131\u0133\5:\36\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0135"+
		"\3\2\2\2\u0134\u012f\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\b"+
		"\2\2\u013a;\3\2\2\2\u013b\u013c\7\f\2\2\u013c\u013d\5\60\31\2\u013d\u0140"+
		"\7\3\2\2\u013e\u0141\5\64\33\2\u013f\u0141\5<\37\2\u0140\u013e\3\2\2\2"+
		"\u0140\u013f\3\2\2\2\u0141\u014b\3\2\2\2\u0142\u0143\7\6\2\2\u0143\u0144"+
		"\5\60\31\2\u0144\u0147\7\3\2\2\u0145\u0148\5\64\33\2\u0146\u0148\5<\37"+
		"\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0142"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\r\2\2\u014f=\3\2\2\2"+
		"\u0150\u0151\7\23\2\2\u0151\u0152\7\f\2\2\u0152\u0157\5(\25\2\u0153\u0154"+
		"\7\6\2\2\u0154\u0156\5(\25\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\7\r\2\2\u015b\u015d\5@!\2\u015c\u015b\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\5\32\16\2\u015f\u015e\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5\26\f\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163?\3\2\2\2\u0164\u0165\7\7\2\2\u0165"+
		"\u016a\5B\"\2\u0166\u0167\7\6\2\2\u0167\u0169\5B\"\2\u0168\u0166\3\2\2"+
		"\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\b\2\2\u016eA\3\2\2\2\u016f"+
		"\u0170\5\60\31\2\u0170\u0171\7\3\2\2\u0171\u0172\5D#\2\u0172C\3\2\2\2"+
		"\u0173\u0176\5F$\2\u0174\u0176\5H%\2\u0175\u0173\3\2\2\2\u0175\u0174\3"+
		"\2\2\2\u0176E\3\2\2\2\u0177\u0178\t\4\2\2\u0178G\3\2\2\2\u0179\u017d\5"+
		"J&\2\u017a\u017d\5L\'\2\u017b\u017d\5N(\2\u017c\u0179\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017b\3\2\2\2\u017dI\3\2\2\2\u017e\u017f\7!\2\2\u017f\u0182"+
		"\7\17\2\2\u0180\u0183\5F$\2\u0181\u0183\5J&\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\20\2\2\u0185K\3\2\2\2"+
		"\u0186\u0187\7\"\2\2\u0187\u018a\7\17\2\2\u0188\u018b\5F$\2\u0189\u018b"+
		"\5L\'\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\7\20\2\2\u018dM\3\2\2\2\u018e\u018f\7#\2\2\u018f\u0192\7\17\2\2"+
		"\u0190\u0193\5F$\2\u0191\u0193\5N(\2\u0192\u0190\3\2\2\2\u0192\u0191\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\20\2\2\u0195O\3\2\2\2\u0196\u0199"+
		"\5R*\2\u0197\u0199\5T+\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"Q\3\2\2\2\u019a\u019b\7\23\2\2\u019b\u019c\7\17\2\2\u019c\u019d\5(\25"+
		"\2\u019d\u019e\7\20\2\2\u019e\u019f\7\4\2\2\u019f\u01a0\7\f\2\2\u01a0"+
		"\u01a1\5.\30\2\u01a1\u01a3\7\r\2\2\u01a2\u01a4\5@!\2\u01a3\u01a2\3\2\2"+
		"\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7\21\2\2\u01a6"+
		"\u01a7\7\17\2\2\u01a7\u01a8\5(\25\2\u01a8\u01a9\7\20\2\2\u01a9S\3\2\2"+
		"\2\u01aa\u01ab\7\23\2\2\u01ab\u01ac\7\17\2\2\u01ac\u01ad\5(\25\2\u01ad"+
		"\u01ae\7\20\2\2\u01ae\u01af\7\4\2\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\5"+
		".\30\2\u01b1\u01b3\7\r\2\2\u01b2\u01b4\5@!\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\4\2\2\u01b6\u01b7\7\17"+
		"\2\2\u01b7\u01b8\5(\25\2\u01b8\u01b9\7\20\2\2\u01b9U\3\2\2\2\60Ydx~\u008b"+
		"\u0093\u009c\u00a7\u00b5\u00ba\u00bd\u00c0\u00c3\u00c7\u00d4\u00da\u00e1"+
		"\u00e4\u00ee\u00f4\u00fb\u00fe\u0110\u0117\u011c\u0121\u0125\u012d\u0132"+
		"\u0136\u0140\u0147\u014b\u0157\u015c\u015f\u0162\u016a\u0175\u017c\u0182"+
		"\u018a\u0192\u0198\u01a3\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}