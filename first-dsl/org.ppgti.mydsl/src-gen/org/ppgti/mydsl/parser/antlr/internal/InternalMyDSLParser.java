package org.ppgti.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ppgti.mydsl.services.MyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pessoa'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDSL.g"; }



     	private MyDSLGrammarAccess grammarAccess;

        public InternalMyDSLParser(TokenStream input, MyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pessoas";
       	}

       	@Override
       	protected MyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePessoas"
    // InternalMyDSL.g:64:1: entryRulePessoas returns [EObject current=null] : iv_rulePessoas= rulePessoas EOF ;
    public final EObject entryRulePessoas() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePessoas = null;


        try {
            // InternalMyDSL.g:64:48: (iv_rulePessoas= rulePessoas EOF )
            // InternalMyDSL.g:65:2: iv_rulePessoas= rulePessoas EOF
            {
             newCompositeNode(grammarAccess.getPessoasRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePessoas=rulePessoas();

            state._fsp--;

             current =iv_rulePessoas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePessoas"


    // $ANTLR start "rulePessoas"
    // InternalMyDSL.g:71:1: rulePessoas returns [EObject current=null] : ( (lv_baseDados_0_0= rulePessoa ) )* ;
    public final EObject rulePessoas() throws RecognitionException {
        EObject current = null;

        EObject lv_baseDados_0_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:77:2: ( ( (lv_baseDados_0_0= rulePessoa ) )* )
            // InternalMyDSL.g:78:2: ( (lv_baseDados_0_0= rulePessoa ) )*
            {
            // InternalMyDSL.g:78:2: ( (lv_baseDados_0_0= rulePessoa ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDSL.g:79:3: (lv_baseDados_0_0= rulePessoa )
            	    {
            	    // InternalMyDSL.g:79:3: (lv_baseDados_0_0= rulePessoa )
            	    // InternalMyDSL.g:80:4: lv_baseDados_0_0= rulePessoa
            	    {

            	    				newCompositeNode(grammarAccess.getPessoasAccess().getBaseDadosPessoaParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_baseDados_0_0=rulePessoa();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPessoasRule());
            	    				}
            	    				add(
            	    					current,
            	    					"baseDados",
            	    					lv_baseDados_0_0,
            	    					"org.ppgti.mydsl.MyDSL.Pessoa");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePessoas"


    // $ANTLR start "entryRulePessoa"
    // InternalMyDSL.g:100:1: entryRulePessoa returns [EObject current=null] : iv_rulePessoa= rulePessoa EOF ;
    public final EObject entryRulePessoa() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePessoa = null;


        try {
            // InternalMyDSL.g:100:47: (iv_rulePessoa= rulePessoa EOF )
            // InternalMyDSL.g:101:2: iv_rulePessoa= rulePessoa EOF
            {
             newCompositeNode(grammarAccess.getPessoaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePessoa=rulePessoa();

            state._fsp--;

             current =iv_rulePessoa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePessoa"


    // $ANTLR start "rulePessoa"
    // InternalMyDSL.g:107:1: rulePessoa returns [EObject current=null] : (otherlv_0= 'Pessoa' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_sobrenome_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject rulePessoa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nome_1_0=null;
        Token lv_sobrenome_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDSL.g:113:2: ( (otherlv_0= 'Pessoa' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_sobrenome_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalMyDSL.g:114:2: (otherlv_0= 'Pessoa' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_sobrenome_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalMyDSL.g:114:2: (otherlv_0= 'Pessoa' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_sobrenome_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalMyDSL.g:115:3: otherlv_0= 'Pessoa' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_sobrenome_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPessoaAccess().getPessoaKeyword_0());
            		
            // InternalMyDSL.g:119:3: ( (lv_nome_1_0= RULE_ID ) )
            // InternalMyDSL.g:120:4: (lv_nome_1_0= RULE_ID )
            {
            // InternalMyDSL.g:120:4: (lv_nome_1_0= RULE_ID )
            // InternalMyDSL.g:121:5: lv_nome_1_0= RULE_ID
            {
            lv_nome_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nome_1_0, grammarAccess.getPessoaAccess().getNomeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPessoaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDSL.g:137:3: ( (lv_sobrenome_2_0= RULE_ID ) )
            // InternalMyDSL.g:138:4: (lv_sobrenome_2_0= RULE_ID )
            {
            // InternalMyDSL.g:138:4: (lv_sobrenome_2_0= RULE_ID )
            // InternalMyDSL.g:139:5: lv_sobrenome_2_0= RULE_ID
            {
            lv_sobrenome_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_sobrenome_2_0, grammarAccess.getPessoaAccess().getSobrenomeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPessoaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sobrenome",
            						lv_sobrenome_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPessoaAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePessoa"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}