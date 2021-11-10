/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ppgti.mydsl.myDSL.MyDSLPackage;
import org.ppgti.mydsl.myDSL.Pessoa;
import org.ppgti.mydsl.myDSL.Pessoas;
import org.ppgti.mydsl.services.MyDSLGrammarAccess;

@SuppressWarnings("all")
public class MyDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDSLPackage.PESSOA:
				sequence_Pessoa(context, (Pessoa) semanticObject); 
				return; 
			case MyDSLPackage.PESSOAS:
				sequence_Pessoas(context, (Pessoas) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Pessoa returns Pessoa
	 *
	 * Constraint:
	 *     (nome=ID sobrenome=ID)
	 */
	protected void sequence_Pessoa(ISerializationContext context, Pessoa semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDSLPackage.Literals.PESSOA__NOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDSLPackage.Literals.PESSOA__NOME));
			if (transientValues.isValueTransient(semanticObject, MyDSLPackage.Literals.PESSOA__SOBRENOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDSLPackage.Literals.PESSOA__SOBRENOME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPessoaAccess().getNomeIDTerminalRuleCall_1_0(), semanticObject.getNome());
		feeder.accept(grammarAccess.getPessoaAccess().getSobrenomeIDTerminalRuleCall_2_0(), semanticObject.getSobrenome());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pessoas returns Pessoas
	 *
	 * Constraint:
	 *     baseDados+=Pessoa+
	 */
	protected void sequence_Pessoas(ISerializationContext context, Pessoas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}