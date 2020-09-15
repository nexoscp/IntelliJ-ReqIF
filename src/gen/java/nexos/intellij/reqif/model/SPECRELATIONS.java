// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericDomValue;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPEC-RELATIONSElemType interface.
 */
public interface SPECRELATIONS extends DomElement {

	/**
	 * Returns the list of SPEC-RELATION-REF children.
	 * @return the list of SPEC-RELATION-REF children.
	 */
	@NotNull
	java.util.List<GenericDomValue<String>> getSPECRELATIONREFs();
	/**
	 * Adds new child to the list of SPEC-RELATION-REF children.
	 * @return created child
	 */
	GenericDomValue<String> addSPECRELATIONREF();


}
