// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/XML/1998/namespace

package nexos.intellij.reqif.model;

/**
 * http://www.w3.org/XML/1998/namespace:spaceAttrType enumeration.
 */
public enum Space implements com.intellij.util.xml.NamedEnum {
	DEFAULT ("default"),
	PRESERVE ("preserve");

	private final String value;
	private Space(String value) { this.value = value; }
	public String getValue() { return value; }

}
