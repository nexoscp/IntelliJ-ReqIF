// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/1999/xhtml:rulesAttrType enumeration.
 */
public enum Rules implements com.intellij.util.xml.NamedEnum {
	ALL ("all"),
	COLS ("cols"),
	GROUPS ("groups"),
	NONE ("none"),
	ROWS ("rows");

	private final String value;
	private Rules(String value) { this.value = value; }
	public String getValue() { return value; }

}
