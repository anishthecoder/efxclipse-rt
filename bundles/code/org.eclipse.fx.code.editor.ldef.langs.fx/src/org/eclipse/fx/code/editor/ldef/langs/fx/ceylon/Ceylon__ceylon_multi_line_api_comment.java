package org.eclipse.fx.code.editor.ldef.langs.fx.ceylon;

public class Ceylon__ceylon_multi_line_api_comment extends org.eclipse.jface.text.rules.RuleBasedScanner {
	public Ceylon__ceylon_multi_line_api_comment() {
		org.eclipse.jface.text.rules.Token ceylon_api_doc_defaultToken = new org.eclipse.jface.text.rules.Token(new org.eclipse.jface.text.TextAttribute("ceylon.ceylon_api_doc_default"));
		setDefaultReturnToken(ceylon_api_doc_defaultToken);
		org.eclipse.jface.text.rules.IRule[] rules = new org.eclipse.jface.text.rules.IRule[0];

		setRules(rules);
	}
}
