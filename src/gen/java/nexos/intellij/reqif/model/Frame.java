// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/1999/xhtml:frameAttrType enumeration.
 */
public enum Frame implements com.intellij.util.xml.NamedEnum {
	ABOVE ("above"),
	BELOW ("below"),
	BORDER ("border"),
	BOX ("box"),
	HSIDES ("hsides"),
	LHS ("lhs"),
	RHS ("rhs"),
	VOID ("void"),
	VSIDES ("vsides");

	private final String value;
	private Frame(String value) { this.value = value; }
	public String getValue() { return value; }

}
