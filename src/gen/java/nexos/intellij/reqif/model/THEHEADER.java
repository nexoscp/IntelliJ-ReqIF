// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTag;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:THE-HEADERElemType interface.
 */
public interface THEHEADER extends DomElement {

	/**
	 * Returns the value of the REQ-IF-HEADER child.
	 * @return the value of the REQ-IF-HEADER child.
	 */
	@NotNull
	@Required
	@SubTag("REQ-IF-HEADER")
	REQIFHEADER getREQIFHEADER();
}
