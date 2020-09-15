// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPECIFICATIONSElemType interface.
 */
public interface SPECIFICATIONS extends DomElement {

	/**
	 * Returns the list of SPECIFICATION children.
	 * @return the list of SPECIFICATION children.
	 */
	@NotNull
	java.util.List<SPECIFICATION> getSPECIFICATIONs();
	/**
	 * Adds new child to the list of SPECIFICATION children.
	 * @return created child
	 */
	SPECIFICATION addSPECIFICATION();


}
