// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:TOOL-EXTENSIONSElemType interface.
 */
public interface TOOLEXTENSIONS extends DomElement {

	/**
	 * Returns the list of REQ-IF-TOOL-EXTENSION children.
	 * @return the list of REQ-IF-TOOL-EXTENSION children.
	 */
	@NotNull
	java.util.List<REQIFTOOLEXTENSION> getREQIFTOOLEXTENSIONs();
	/**
	 * Adds new child to the list of REQ-IF-TOOL-EXTENSION children.
	 * @return created child
	 */
	REQIFTOOLEXTENSION addREQIFTOOLEXTENSION();


}
