// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:REQ-IF-CONTENT interface.
 */
public interface REQIFCONTENT extends DomElement {

	/**
	 * Returns the value of the DATATYPES child.
	 * @return the value of the DATATYPES child.
	 */
	@NotNull
	DATATYPES getDATATYPES();


	/**
	 * Returns the value of the SPEC-TYPES child.
	 * @return the value of the SPEC-TYPES child.
	 */
	@NotNull
	SPECTYPES getSPECTYPES();


	/**
	 * Returns the value of the SPEC-OBJECTS child.
	 * @return the value of the SPEC-OBJECTS child.
	 */
	@NotNull
	SPECOBJECTS getSPECOBJECTS();


	/**
	 * Returns the value of the SPEC-RELATIONS child.
	 * @return the value of the SPEC-RELATIONS child.
	 */
	@NotNull
	SPECRELATIONS getSPECRELATIONS();


	/**
	 * Returns the value of the SPECIFICATIONS child.
	 * @return the value of the SPECIFICATIONS child.
	 */
	@NotNull
	SPECIFICATIONS getSPECIFICATIONS();


	/**
	 * Returns the value of the SPEC-RELATION-GROUPS child.
	 * @return the value of the SPEC-RELATION-GROUPS child.
	 */
	@NotNull
	SPECRELATIONGROUPS getSPECRELATIONGROUPS();


}
