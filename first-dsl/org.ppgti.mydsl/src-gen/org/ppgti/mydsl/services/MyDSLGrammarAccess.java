/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class PessoasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.ppgti.mydsl.MyDSL.Pessoas");
		private final Assignment cBaseDadosAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cBaseDadosPessoaParserRuleCall_0 = (RuleCall)cBaseDadosAssignment.eContents().get(0);
		
		//Pessoas:
		//    baseDados += Pessoa*;
		@Override public ParserRule getRule() { return rule; }
		
		//baseDados += Pessoa*
		public Assignment getBaseDadosAssignment() { return cBaseDadosAssignment; }
		
		//Pessoa
		public RuleCall getBaseDadosPessoaParserRuleCall_0() { return cBaseDadosPessoaParserRuleCall_0; }
	}
	public class PessoaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.ppgti.mydsl.MyDSL.Pessoa");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPessoaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNomeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNomeIDTerminalRuleCall_1_0 = (RuleCall)cNomeAssignment_1.eContents().get(0);
		private final Assignment cSobrenomeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSobrenomeIDTerminalRuleCall_2_0 = (RuleCall)cSobrenomeAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Pessoa:
		//    'Pessoa' nome=ID sobrenome=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'Pessoa' nome=ID sobrenome=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'Pessoa'
		public Keyword getPessoaKeyword_0() { return cPessoaKeyword_0; }
		
		//nome=ID
		public Assignment getNomeAssignment_1() { return cNomeAssignment_1; }
		
		//ID
		public RuleCall getNomeIDTerminalRuleCall_1_0() { return cNomeIDTerminalRuleCall_1_0; }
		
		//sobrenome=ID
		public Assignment getSobrenomeAssignment_2() { return cSobrenomeAssignment_2; }
		
		//ID
		public RuleCall getSobrenomeIDTerminalRuleCall_2_0() { return cSobrenomeIDTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private final PessoasElements pPessoas;
	private final PessoaElements pPessoa;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPessoas = new PessoasElements();
		this.pPessoa = new PessoaElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.ppgti.mydsl.MyDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Pessoas:
	//    baseDados += Pessoa*;
	public PessoasElements getPessoasAccess() {
		return pPessoas;
	}
	
	public ParserRule getPessoasRule() {
		return getPessoasAccess().getRule();
	}
	
	//Pessoa:
	//    'Pessoa' nome=ID sobrenome=ID ';';
	public PessoaElements getPessoaAccess() {
		return pPessoa;
	}
	
	public ParserRule getPessoaRule() {
		return getPessoaAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}