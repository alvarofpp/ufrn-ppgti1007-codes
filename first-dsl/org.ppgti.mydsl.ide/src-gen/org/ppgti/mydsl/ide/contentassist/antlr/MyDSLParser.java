/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.ppgti.mydsl.ide.contentassist.antlr.internal.InternalMyDSLParser;
import org.ppgti.mydsl.services.MyDSLGrammarAccess;

public class MyDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPessoaAccess().getGroup(), "rule__Pessoa__Group__0");
			builder.put(grammarAccess.getPessoasAccess().getBaseDadosAssignment(), "rule__Pessoas__BaseDadosAssignment");
			builder.put(grammarAccess.getPessoaAccess().getNomeAssignment_1(), "rule__Pessoa__NomeAssignment_1");
			builder.put(grammarAccess.getPessoaAccess().getSobrenomeAssignment_2(), "rule__Pessoa__SobrenomeAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDSLGrammarAccess grammarAccess;

	@Override
	protected InternalMyDSLParser createParser() {
		InternalMyDSLParser result = new InternalMyDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
