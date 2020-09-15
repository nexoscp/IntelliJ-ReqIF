// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/1999/xhtml:scopeAttrType enumeration.
 */
public enum Scope implements com.intellij.util.xml.NamedEnum {
	COL ("col"),
	COLGROUP ("colgroup"),
	ROW ("row"),
	ROWGROUP ("rowgroup");

	private final String value;
	private Scope(String value) { this.value = value; }
	public String getValue() { return value; }

}
