// Generated from br\u005Cunilins\es\compiladores\lexanalyzer\LexGrammar.g4 by ANTLR 4.8
package br.unilins.es.compiladores.lexanalyzer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Palavra_Chave=1, Num_Int=2, Num_Float=3, Var=4, String=5, Ope_Rel=6, Ope_Arit=7, 
		Ope_Mod=8, Abre_Par=9, Fecha_Par=10, Abre_Chave=11, Fecha_Chave=12, Fim_de_Linha=13, 
		Delim=14, Espaço=15, Comment=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Palavra_Chave", "Num_Int", "Num_Float", "Var", "String", "ESC_SEQ", 
			"Ope_Rel", "Ope_Arit", "Ope_Mod", "Abre_Par", "Fecha_Par", "Abre_Chave", 
			"Fecha_Chave", "Fim_de_Linha", "Delim", "Espaço", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'%'", "'('", "')'", 
			"'{'", "'}'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Palavra_Chave", "Num_Int", "Num_Float", "Var", "String", "Ope_Rel", 
			"Ope_Arit", "Ope_Mod", "Abre_Par", "Fecha_Par", "Abre_Chave", "Fecha_Chave", 
			"Fim_de_Linha", "Delim", "Espa\u0004o", "Comment"
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


	public LexGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2o\n\2\3\3\5\3r\n\3\3\3\6\3u\n\3\r\3\16\3v\3\4\5"+
		"\4z\n\4\3\4\6\4}\n\4\r\4\16\4~\3\4\3\4\6\4\u0083\n\4\r\4\16\4\u0084\3"+
		"\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\6\3\6\3\6\7\6\u0091\n\6\f\6"+
		"\16\6\u0094\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00a3\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00bb\n\22\f\22\16"+
		"\22\u00be\13\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23"+
		"\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22\3\2\n\4\2--//\4\2C\\c|\5"+
		"\2\62;C\\c|\4\2))^^\4\2>>@@\5\2,-//\61\61\5\2\13\f\17\17\"\"\3\2\f\f\2"+
		"\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"n\3\2\2\2\5q\3\2\2\2\7y\3\2\2\2\t\u0086\3\2\2\2\13\u008d\3\2\2\2\r\u0097"+
		"\3\2\2\2\17\u00a2\3\2\2\2\21\u00a4\3\2\2\2\23\u00a6\3\2\2\2\25\u00a8\3"+
		"\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3\2\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2"+
		"\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b8\3\2\2\2%&\7K\2\2&o\7H\2\2"+
		"\'(\7Q\2\2(o\7T\2\2)*\7F\2\2*o\7Q\2\2+,\7V\2\2,o\7Q\2\2-.\7G\2\2./\7P"+
		"\2\2/o\7F\2\2\60\61\7C\2\2\61\62\7P\2\2\62o\7F\2\2\63\64\7K\2\2\64\65"+
		"\7P\2\2\65\66\7V\2\2\66\67\7G\2\2\678\7I\2\289\7G\2\29o\7T\2\2:;\7H\2"+
		"\2;<\7N\2\2<=\7Q\2\2=>\7C\2\2>o\7V\2\2?@\7D\2\2@A\7G\2\2AB\7I\2\2BC\7"+
		"K\2\2Co\7P\2\2DE\7T\2\2EF\7G\2\2FG\7C\2\2Go\7F\2\2HI\7V\2\2IJ\7J\2\2J"+
		"K\7G\2\2Ko\7P\2\2LM\7G\2\2MN\7N\2\2NO\7U\2\2Oo\7G\2\2PQ\7G\2\2QR\7N\2"+
		"\2RS\7U\2\2ST\7K\2\2To\7H\2\2UV\7Y\2\2VW\7J\2\2WX\7K\2\2XY\7N\2\2Yo\7"+
		"G\2\2Z[\7R\2\2[\\\7T\2\2\\]\7K\2\2]^\7P\2\2^o\7V\2\2_`\7C\2\2`a\7U\2\2"+
		"ab\7U\2\2bc\7K\2\2cd\7I\2\2do\7P\2\2ef\7X\2\2fg\7C\2\2gh\7T\2\2hi\7K\2"+
		"\2ij\7C\2\2jk\7D\2\2kl\7N\2\2lm\7G\2\2mo\7U\2\2n%\3\2\2\2n\'\3\2\2\2n"+
		")\3\2\2\2n+\3\2\2\2n-\3\2\2\2n\60\3\2\2\2n\63\3\2\2\2n:\3\2\2\2n?\3\2"+
		"\2\2nD\3\2\2\2nH\3\2\2\2nL\3\2\2\2nP\3\2\2\2nU\3\2\2\2nZ\3\2\2\2n_\3\2"+
		"\2\2ne\3\2\2\2o\4\3\2\2\2pr\t\2\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\4"+
		"\62;\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\6\3\2\2\2xz\t\2\2\2yx"+
		"\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\4\62;\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\4\62;"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\b\3\2\2\2\u0086\u008a\t\3\2\2\u0087\u0089\t\4\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\n\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0092\7)\2\2\u008e\u0091"+
		"\5\r\7\2\u008f\u0091\n\5\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7)\2\2\u0096\f\3\2\2\2\u0097\u0098"+
		"\7^\2\2\u0098\u0099\7)\2\2\u0099\16\3\2\2\2\u009a\u00a3\t\6\2\2\u009b"+
		"\u009c\7@\2\2\u009c\u00a3\7?\2\2\u009d\u009e\7>\2\2\u009e\u00a3\7?\2\2"+
		"\u009f\u00a0\7>\2\2\u00a0\u00a3\7@\2\2\u00a1\u00a3\7?\2\2\u00a2\u009a"+
		"\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\t\7\2\2\u00a5\22\3\2\2\2\u00a6"+
		"\u00a7\7\'\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\26\3\2\2\2\u00aa"+
		"\u00ab\7+\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad\32\3\2\2\2\u00ae"+
		"\u00af\7\177\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7=\2\2\u00b1\36\3\2\2\2"+
		"\u00b2\u00b3\7<\2\2\u00b3 \3\2\2\2\u00b4\u00b5\t\b\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\b\21\2\2\u00b7\"\3\2\2\2\u00b8\u00bc\7%\2\2\u00b9\u00bb"+
		"\n\t\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\22"+
		"\2\2\u00c0$\3\2\2\2\16\2nqvy~\u0084\u008a\u0090\u0092\u00a2\u00bc\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}