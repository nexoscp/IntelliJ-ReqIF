// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/1999/xhtml:valuetypeAttrType enumeration.
 */
public enum Valuetype implements com.intellij.util.xml.NamedEnum {
	DATA ("data"),
	OBJECT ("object"),
	REF ("ref");

	private final String value;
	private Valuetype(String value) { this.value = value; }
	public String getValue() { return value; }

}
