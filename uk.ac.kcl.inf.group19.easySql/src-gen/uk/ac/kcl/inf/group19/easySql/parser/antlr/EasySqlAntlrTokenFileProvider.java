/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EasySqlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/group19/easySql/parser/antlr/internal/InternalEasySql.tokens");
	}
}
