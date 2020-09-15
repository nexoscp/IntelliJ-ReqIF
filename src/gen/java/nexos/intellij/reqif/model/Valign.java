// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/1999/xhtml:valignAttrType enumeration.
 */
public enum Valign implements com.intellij.util.xml.NamedEnum {
	BASELINE ("baseline"),
	BOTTOM ("bottom"),
	MIDDLE ("middle"),
	TOP ("top");

	private final String value;
	private Valign(String value) { this.value = value; }
	public String getValue() { return value; }

}
