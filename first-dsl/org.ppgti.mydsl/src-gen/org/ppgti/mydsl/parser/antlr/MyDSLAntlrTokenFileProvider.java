/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/ppgti/mydsl/parser/antlr/internal/InternalMyDSL.tokens");
	}
}
