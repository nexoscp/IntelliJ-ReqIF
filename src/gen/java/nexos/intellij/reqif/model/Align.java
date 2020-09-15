// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/1999/xhtml:alignAttrType enumeration.
 */
public enum Align implements com.intellij.util.xml.NamedEnum {
	CENTER ("center"),
	CHAR ("char"),
	JUSTIFY ("justify"),
	LEFT ("left"),
	RIGHT ("right");

	private final String value;
	private Align(String value) { this.value = value; }
	public String getValue() { return value; }

}
