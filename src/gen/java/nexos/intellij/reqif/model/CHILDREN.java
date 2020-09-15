// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:CHILDRENElemType interface.
 */
public interface CHILDREN extends DomElement {

	/**
	 * Returns the list of SPEC-HIERARCHY children.
	 * @return the list of SPEC-HIERARCHY children.
	 */
	@NotNull
	java.util.List<SPECHIERARCHY> getSPECHIERARCHYs();
	/**
	 * Adds new child to the list of SPEC-HIERARCHY children.
	 * @return created child
	 */
	SPECHIERARCHY addSPECHIERARCHY();


}
