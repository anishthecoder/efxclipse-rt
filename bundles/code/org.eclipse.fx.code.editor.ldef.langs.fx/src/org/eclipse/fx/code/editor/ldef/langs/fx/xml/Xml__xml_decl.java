package org.eclipse.fx.code.editor.ldef.langs.fx.xml;

public class Xml__xml_decl extends org.eclipse.jface.text.rules.RuleBasedScanner {
	public Xml__xml_decl() {
		org.eclipse.jface.text.rules.Token xml_declarationToken = new org.eclipse.jface.text.rules.Token(new org.eclipse.jface.text.TextAttribute("xml.xml_declaration"));
		setDefaultReturnToken(xml_declarationToken);
		org.eclipse.jface.text.rules.IRule[] rules = new org.eclipse.jface.text.rules.IRule[0];

		setRules(rules);
	}
}
