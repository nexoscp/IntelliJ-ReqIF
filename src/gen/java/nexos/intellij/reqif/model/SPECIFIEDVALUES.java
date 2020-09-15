// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPECIFIED-VALUESElemType interface.
 */
public interface SPECIFIEDVALUES extends DomElement {

	/**
	 * Returns the list of ENUM-VALUE children.
	 * @return the list of ENUM-VALUE children.
	 */
	@NotNull
	java.util.List<ENUMVALUE> getENUMVALUEs();
	/**
	 * Adds new child to the list of ENUM-VALUE children.
	 * @return created child
	 */
	ENUMVALUE addENUMVALUE();


}
