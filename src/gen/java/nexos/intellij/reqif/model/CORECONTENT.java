// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:CORE-CONTENTElemType interface.
 */
public interface CORECONTENT extends DomElement {

	/**
	 * Returns the value of the REQ-IF-CONTENT child.
	 * @return the value of the REQ-IF-CONTENT child.
	 */
	@NotNull
	@Required
	REQIFCONTENT getREQIFCONTENT();


}
