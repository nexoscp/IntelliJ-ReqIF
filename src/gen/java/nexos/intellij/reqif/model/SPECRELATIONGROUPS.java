// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPEC-RELATION-GROUPSElemType interface.
 */
public interface SPECRELATIONGROUPS extends DomElement {

	/**
	 * Returns the list of RELATION-GROUP children.
	 * @return the list of RELATION-GROUP children.
	 */
	@NotNull
	java.util.List<RELATIONGROUP> getRELATIONGROUPs();
	/**
	 * Adds new child to the list of RELATION-GROUP children.
	 * @return created child
	 */
	RELATIONGROUP addRELATIONGROUP();


}
