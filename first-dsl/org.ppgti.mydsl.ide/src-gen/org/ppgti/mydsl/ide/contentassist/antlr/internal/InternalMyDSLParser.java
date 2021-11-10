package org.ppgti.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.ppgti.mydsl.services.MyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDSLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePessoas"
    // InternalMyDSL.g:53:1: entryRulePessoas : rulePessoas EOF ;
    public final void entryRulePessoas() throws RecognitionException {
        try {
            // InternalMyDSL.g:54:1: ( rulePessoas EOF )
            // InternalMyDSL.g:55:1: rulePessoas EOF
            {
             before(grammarAccess.getPessoasRule()); 
            pushFollow(FOLLOW_1);
            rulePessoas();

            state._fsp--;

             after(grammarAccess.getPessoasRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePessoas"


    // $ANTLR start "rulePessoas"
    // InternalMyDSL.g:62:1: rulePessoas : ( ( rule__Pessoas__BaseDadosAssignment )* ) ;
    public final void rulePessoas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:66:2: ( ( ( rule__Pessoas__BaseDadosAssignment )* ) )
            // InternalMyDSL.g:67:2: ( ( rule__Pessoas__BaseDadosAssignment )* )
            {
            // InternalMyDSL.g:67:2: ( ( rule__Pessoas__BaseDadosAssignment )* )
            // InternalMyDSL.g:68:3: ( rule__Pessoas__BaseDadosAssignment )*
            {
             before(grammarAccess.getPessoasAccess().getBaseDadosAssignment()); 
            // InternalMyDSL.g:69:3: ( rule__Pessoas__BaseDadosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDSL.g:69:4: rule__Pessoas__BaseDadosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Pessoas__BaseDadosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPessoasAccess().getBaseDadosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePessoas"


    // $ANTLR start "entryRulePessoa"
    // InternalMyDSL.g:78:1: entryRulePessoa : rulePessoa EOF ;
    public final void entryRulePessoa() throws RecognitionException {
        try {
            // InternalMyDSL.g:79:1: ( rulePessoa EOF )
            // InternalMyDSL.g:80:1: rulePessoa EOF
            {
             before(grammarAccess.getPessoaRule()); 
            pushFollow(FOLLOW_1);
            rulePessoa();

            state._fsp--;

             after(grammarAccess.getPessoaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePessoa"


    // $ANTLR start "rulePessoa"
    // InternalMyDSL.g:87:1: rulePessoa : ( ( rule__Pessoa__Group__0 ) ) ;
    public final void rulePessoa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:91:2: ( ( ( rule__Pessoa__Group__0 ) ) )
            // InternalMyDSL.g:92:2: ( ( rule__Pessoa__Group__0 ) )
            {
            // InternalMyDSL.g:92:2: ( ( rule__Pessoa__Group__0 ) )
            // InternalMyDSL.g:93:3: ( rule__Pessoa__Group__0 )
            {
             before(grammarAccess.getPessoaAccess().getGroup()); 
            // InternalMyDSL.g:94:3: ( rule__Pessoa__Group__0 )
            // InternalMyDSL.g:94:4: rule__Pessoa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pessoa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPessoaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePessoa"


    // $ANTLR start "rule__Pessoa__Group__0"
    // InternalMyDSL.g:102:1: rule__Pessoa__Group__0 : rule__Pessoa__Group__0__Impl rule__Pessoa__Group__1 ;
    public final void rule__Pessoa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:106:1: ( rule__Pessoa__Group__0__Impl rule__Pessoa__Group__1 )
            // InternalMyDSL.g:107:2: rule__Pessoa__Group__0__Impl rule__Pessoa__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Pessoa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pessoa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__0"


    // $ANTLR start "rule__Pessoa__Group__0__Impl"
    // InternalMyDSL.g:114:1: rule__Pessoa__Group__0__Impl : ( 'Pessoa' ) ;
    public final void rule__Pessoa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:118:1: ( ( 'Pessoa' ) )
            // InternalMyDSL.g:119:1: ( 'Pessoa' )
            {
            // InternalMyDSL.g:119:1: ( 'Pessoa' )
            // InternalMyDSL.g:120:2: 'Pessoa'
            {
             before(grammarAccess.getPessoaAccess().getPessoaKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPessoaAccess().getPessoaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__0__Impl"


    // $ANTLR start "rule__Pessoa__Group__1"
    // InternalMyDSL.g:129:1: rule__Pessoa__Group__1 : rule__Pessoa__Group__1__Impl rule__Pessoa__Group__2 ;
    public final void rule__Pessoa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:133:1: ( rule__Pessoa__Group__1__Impl rule__Pessoa__Group__2 )
            // InternalMyDSL.g:134:2: rule__Pessoa__Group__1__Impl rule__Pessoa__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pessoa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pessoa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__1"


    // $ANTLR start "rule__Pessoa__Group__1__Impl"
    // InternalMyDSL.g:141:1: rule__Pessoa__Group__1__Impl : ( ( rule__Pessoa__NomeAssignment_1 ) ) ;
    public final void rule__Pessoa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:145:1: ( ( ( rule__Pessoa__NomeAssignment_1 ) ) )
            // InternalMyDSL.g:146:1: ( ( rule__Pessoa__NomeAssignment_1 ) )
            {
            // InternalMyDSL.g:146:1: ( ( rule__Pessoa__NomeAssignment_1 ) )
            // InternalMyDSL.g:147:2: ( rule__Pessoa__NomeAssignment_1 )
            {
             before(grammarAccess.getPessoaAccess().getNomeAssignment_1()); 
            // InternalMyDSL.g:148:2: ( rule__Pessoa__NomeAssignment_1 )
            // InternalMyDSL.g:148:3: rule__Pessoa__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pessoa__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPessoaAccess().getNomeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__1__Impl"


    // $ANTLR start "rule__Pessoa__Group__2"
    // InternalMyDSL.g:156:1: rule__Pessoa__Group__2 : rule__Pessoa__Group__2__Impl rule__Pessoa__Group__3 ;
    public final void rule__Pessoa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:160:1: ( rule__Pessoa__Group__2__Impl rule__Pessoa__Group__3 )
            // InternalMyDSL.g:161:2: rule__Pessoa__Group__2__Impl rule__Pessoa__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Pessoa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pessoa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__2"


    // $ANTLR start "rule__Pessoa__Group__2__Impl"
    // InternalMyDSL.g:168:1: rule__Pessoa__Group__2__Impl : ( ( rule__Pessoa__SobrenomeAssignment_2 ) ) ;
    public final void rule__Pessoa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:172:1: ( ( ( rule__Pessoa__SobrenomeAssignment_2 ) ) )
            // InternalMyDSL.g:173:1: ( ( rule__Pessoa__SobrenomeAssignment_2 ) )
            {
            // InternalMyDSL.g:173:1: ( ( rule__Pessoa__SobrenomeAssignment_2 ) )
            // InternalMyDSL.g:174:2: ( rule__Pessoa__SobrenomeAssignment_2 )
            {
             before(grammarAccess.getPessoaAccess().getSobrenomeAssignment_2()); 
            // InternalMyDSL.g:175:2: ( rule__Pessoa__SobrenomeAssignment_2 )
            // InternalMyDSL.g:175:3: rule__Pessoa__SobrenomeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pessoa__SobrenomeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPessoaAccess().getSobrenomeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__2__Impl"


    // $ANTLR start "rule__Pessoa__Group__3"
    // InternalMyDSL.g:183:1: rule__Pessoa__Group__3 : rule__Pessoa__Group__3__Impl ;
    public final void rule__Pessoa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:187:1: ( rule__Pessoa__Group__3__Impl )
            // InternalMyDSL.g:188:2: rule__Pessoa__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pessoa__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__3"


    // $ANTLR start "rule__Pessoa__Group__3__Impl"
    // InternalMyDSL.g:194:1: rule__Pessoa__Group__3__Impl : ( ';' ) ;
    public final void rule__Pessoa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:198:1: ( ( ';' ) )
            // InternalMyDSL.g:199:1: ( ';' )
            {
            // InternalMyDSL.g:199:1: ( ';' )
            // InternalMyDSL.g:200:2: ';'
            {
             before(grammarAccess.getPessoaAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPessoaAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__Group__3__Impl"


    // $ANTLR start "rule__Pessoas__BaseDadosAssignment"
    // InternalMyDSL.g:210:1: rule__Pessoas__BaseDadosAssignment : ( rulePessoa ) ;
    public final void rule__Pessoas__BaseDadosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:214:1: ( ( rulePessoa ) )
            // InternalMyDSL.g:215:2: ( rulePessoa )
            {
            // InternalMyDSL.g:215:2: ( rulePessoa )
            // InternalMyDSL.g:216:3: rulePessoa
            {
             before(grammarAccess.getPessoasAccess().getBaseDadosPessoaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePessoa();

            state._fsp--;

             after(grammarAccess.getPessoasAccess().getBaseDadosPessoaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoas__BaseDadosAssignment"


    // $ANTLR start "rule__Pessoa__NomeAssignment_1"
    // InternalMyDSL.g:225:1: rule__Pessoa__NomeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pessoa__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:229:1: ( ( RULE_ID ) )
            // InternalMyDSL.g:230:2: ( RULE_ID )
            {
            // InternalMyDSL.g:230:2: ( RULE_ID )
            // InternalMyDSL.g:231:3: RULE_ID
            {
             before(grammarAccess.getPessoaAccess().getNomeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPessoaAccess().getNomeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__NomeAssignment_1"


    // $ANTLR start "rule__Pessoa__SobrenomeAssignment_2"
    // InternalMyDSL.g:240:1: rule__Pessoa__SobrenomeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pessoa__SobrenomeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDSL.g:244:1: ( ( RULE_ID ) )
            // InternalMyDSL.g:245:2: ( RULE_ID )
            {
            // InternalMyDSL.g:245:2: ( RULE_ID )
            // InternalMyDSL.g:246:3: RULE_ID
            {
             before(grammarAccess.getPessoaAccess().getSobrenomeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPessoaAccess().getSobrenomeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pessoa__SobrenomeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}