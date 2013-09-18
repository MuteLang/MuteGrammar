// Generated from Mute.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuteLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, COMMENT=13, STRING=14, MODULE=15, ID=16, RANGE=17, 
		INT=18, COMP_OPERATOR=19, OPERATION_BEGIN=20, CONDITION_BEGIN=21, ASSIGNMENT_BEGIN=22, 
		IGNORED_EOL=23, EOL=24, WHITESPACE=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'&'", "'.'", "')'", "','", "'+'", "'*'", "'-'", "':'", "'/'", 
		"'}'", "'|'", "COMMENT", "STRING", "MODULE", "ID", "RANGE", "INT", "COMP_OPERATOR", 
		"'{'", "'('", "'['", "IGNORED_EOL", "EOL", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "COMMENT", "STRING", "MODULE", "ID", "RANGE", 
		"INT", "COMP_OPERATOR", "OPERATION_BEGIN", "CONDITION_BEGIN", "ASSIGNMENT_BEGIN", 
		"CHARACTER", "ID_LETTER", "DIGIT", "IGNORED_EOL", "EOL", "WHITESPACE"
	};


		boolean inStatement = false;


	public MuteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mute.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 14: MODULE_action((RuleContext)_localctx, actionIndex); break;

		case 15: ID_action((RuleContext)_localctx, actionIndex); break;

		case 19: OPERATION_BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 20: CONDITION_BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 21: ASSIGNMENT_BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 25: IGNORED_EOL_action((RuleContext)_localctx, actionIndex); break;

		case 26: EOL_action((RuleContext)_localctx, actionIndex); break;

		case 27: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: skip();  break;
		}
	}
	private void OPERATION_BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: inStatement = true; break;
		}
	}
	private void EOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: inStatement = false; break;
		}
	}
	private void CONDITION_BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: inStatement = true; break;
		}
	}
	private void ASSIGNMENT_BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: inStatement = true; break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: inStatement = true; break;
		}
	}
	private void MODULE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: inStatement = true; break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: skip();  break;
		}
	}
	private void IGNORED_EOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25: return IGNORED_EOL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IGNORED_EOL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !inStatement;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\7\16V\n\16\f\16\16\16Y\13\16\3\16\3\16\3\17\3\17\7\17_"+
		"\n\17\f\17\16\17b\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\7\21n\n\21\f\21\16\21q\13\21\3\21\5\21t\n\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\6\23}\n\23\r\23\16\23~\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0087\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\5\33\u0099\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\5\34\u00a2\n\34\3\34\3\34\3\34\3\34\3\35\6\35\u00a9\n\35\r\35\16\35\u00aa"+
		"\3\35\3\35\3`\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\b\35\20\1\37\21\2!\22\3#\23\1%\24\1"+
		"\'\25\1)\26\4+\27\5-\30\6/\2\1\61\2\1\63\2\1\65\31\t\67\32\79\33\n\3\2"+
		"\6\4\2\f\f\17\17\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\u00b6\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2"+
		"\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2"+
		"\2\31Q\3\2\2\2\33S\3\2\2\2\35\\\3\2\2\2\37e\3\2\2\2!s\3\2\2\2#w\3\2\2"+
		"\2%|\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008b\3\2\2\2-\u008e\3\2"+
		"\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u0098\3\2\2\2"+
		"\67\u00a1\3\2\2\29\u00a8\3\2\2\2;<\7_\2\2<\4\3\2\2\2=>\7(\2\2>\6\3\2\2"+
		"\2?@\7\60\2\2@\b\3\2\2\2AB\7+\2\2B\n\3\2\2\2CD\7.\2\2D\f\3\2\2\2EF\7-"+
		"\2\2F\16\3\2\2\2GH\7,\2\2H\20\3\2\2\2IJ\7/\2\2J\22\3\2\2\2KL\7<\2\2L\24"+
		"\3\2\2\2MN\7\61\2\2N\26\3\2\2\2OP\7\177\2\2P\30\3\2\2\2QR\7~\2\2R\32\3"+
		"\2\2\2SW\7%\2\2TV\n\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3"+
		"\2\2\2YW\3\2\2\2Z[\b\16\b\2[\34\3\2\2\2\\`\7$\2\2]_\5/\30\2^]\3\2\2\2"+
		"_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7$\2\2d\36\3\2\2"+
		"\2ef\7>\2\2fg\5!\21\2gh\7@\2\2hi\b\20\2\2i \3\2\2\2jo\5\61\31\2kn\5\61"+
		"\31\2ln\5\63\32\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pt"+
		"\3\2\2\2qo\3\2\2\2rt\7&\2\2sj\3\2\2\2sr\3\2\2\2tu\3\2\2\2uv\b\21\3\2v"+
		"\"\3\2\2\2wx\5%\23\2xy\7\u0080\2\2yz\5%\23\2z$\3\2\2\2{}\5\63\32\2|{\3"+
		"\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177&\3\2\2\2\u0080\u0081\7@\2"+
		"\2\u0081\u0087\7?\2\2\u0082\u0087\7@\2\2\u0083\u0084\7>\2\2\u0084\u0087"+
		"\7?\2\2\u0085\u0087\4>?\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0086\u0085\3\2\2\2\u0087(\3\2\2\2\u0088\u0089\7}\2\2\u0089"+
		"\u008a\b\25\4\2\u008a*\3\2\2\2\u008b\u008c\7*\2\2\u008c\u008d\b\26\5\2"+
		"\u008d,\3\2\2\2\u008e\u008f\7]\2\2\u008f\u0090\b\27\6\2\u0090.\3\2\2\2"+
		"\u0091\u0092\n\2\2\2\u0092\60\3\2\2\2\u0093\u0094\t\3\2\2\u0094\62\3\2"+
		"\2\2\u0095\u0096\t\4\2\2\u0096\64\3\2\2\2\u0097\u0099\7\17\2\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\f\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\6\33\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b"+
		"\33\t\2\u009f\66\3\2\2\2\u00a0\u00a2\7\17\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\b\34\7\2\u00a68\3\2\2\2\u00a7\u00a9\t\5\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\b\35\n\2\u00ad:\3\2\2\2\r\2W`mos~\u0086\u0098"+
		"\u00a1\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}