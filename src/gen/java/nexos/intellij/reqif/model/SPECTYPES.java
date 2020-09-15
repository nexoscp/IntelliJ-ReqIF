// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPEC-TYPESElemType interface.
 */
public interface SPECTYPES extends DomElement {

	/**
	 * Returns the list of RELATION-GROUP-TYPE children.
	 * @return the list of RELATION-GROUP-TYPE children.
	 */
	@NotNull
	java.util.List<RELATIONGROUPTYPE> getRELATIONGROUPTYPEs();
	/**
	 * Adds new child to the list of RELATION-GROUP-TYPE children.
	 * @return created child
	 */
	RELATIONGROUPTYPE addRELATIONGROUPTYPE();


	/**
	 * Returns the list of SPEC-OBJECT-TYPE children.
	 * @return the list of SPEC-OBJECT-TYPE children.
	 */
	@NotNull
	java.util.List<SPECOBJECTTYPE> getSPECOBJECTTYPEs();
	/**
	 * Adds new child to the list of SPEC-OBJECT-TYPE children.
	 * @return created child
	 */
	SPECOBJECTTYPE addSPECOBJECTTYPE();


	/**
	 * Returns the list of SPEC-RELATION-TYPE children.
	 * @return the list of SPEC-RELATION-TYPE children.
	 */
	@NotNull
	java.util.List<SPECRELATIONTYPE> getSPECRELATIONTYPEs();
	/**
	 * Adds new child to the list of SPEC-RELATION-TYPE children.
	 * @return created child
	 */
	SPECRELATIONTYPE addSPECRELATIONTYPE();


	/**
	 * Returns the list of SPECIFICATION-TYPE children.
	 * @return the list of SPECIFICATION-TYPE children.
	 */
	@NotNull
	java.util.List<SPECIFICATIONTYPE> getSPECIFICATIONTYPEs();
	/**
	 * Adds new child to the list of SPECIFICATION-TYPE children.
	 * @return created child
	 */
	SPECIFICATIONTYPE addSPECIFICATIONTYPE();


}
