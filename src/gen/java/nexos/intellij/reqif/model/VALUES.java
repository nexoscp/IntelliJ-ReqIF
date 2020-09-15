// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:VALUESElemType interface.
 */
public interface VALUES extends DomElement {

	/**
	 * Returns the list of ATTRIBUTE-VALUE-BOOLEAN children.
	 * @return the list of ATTRIBUTE-VALUE-BOOLEAN children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUEBOOLEAN> getATTRIBUTEVALUEBOOLEANs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-BOOLEAN children.
	 * @return created child
	 */
	ATTRIBUTEVALUEBOOLEAN addATTRIBUTEVALUEBOOLEAN();


	/**
	 * Returns the list of ATTRIBUTE-VALUE-DATE children.
	 * @return the list of ATTRIBUTE-VALUE-DATE children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUEDATE> getATTRIBUTEVALUEDATEs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-DATE children.
	 * @return created child
	 */
	ATTRIBUTEVALUEDATE addATTRIBUTEVALUEDATE();


	/**
	 * Returns the list of ATTRIBUTE-VALUE-ENUMERATION children.
	 * @return the list of ATTRIBUTE-VALUE-ENUMERATION children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATIONs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-ENUMERATION children.
	 * @return created child
	 */
	ATTRIBUTEVALUEENUMERATION addATTRIBUTEVALUEENUMERATION();


	/**
	 * Returns the list of ATTRIBUTE-VALUE-INTEGER children.
	 * @return the list of ATTRIBUTE-VALUE-INTEGER children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUEINTEGER> getATTRIBUTEVALUEINTEGERs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-INTEGER children.
	 * @return created child
	 */
	ATTRIBUTEVALUEINTEGER addATTRIBUTEVALUEINTEGER();


	/**
	 * Returns the list of ATTRIBUTE-VALUE-REAL children.
	 * @return the list of ATTRIBUTE-VALUE-REAL children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUEREAL> getATTRIBUTEVALUEREALs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-REAL children.
	 * @return created child
	 */
	ATTRIBUTEVALUEREAL addATTRIBUTEVALUEREAL();


	/**
	 * Returns the list of ATTRIBUTE-VALUE-STRING children.
	 * @return the list of ATTRIBUTE-VALUE-STRING children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUESTRING> getATTRIBUTEVALUESTRINGs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-STRING children.
	 * @return created child
	 */
	ATTRIBUTEVALUESTRING addATTRIBUTEVALUESTRING();


	/**
	 * Returns the list of ATTRIBUTE-VALUE-XHTML children.
	 * @return the list of ATTRIBUTE-VALUE-XHTML children.
	 */
	@NotNull
	java.util.List<ATTRIBUTEVALUEXHTML> getATTRIBUTEVALUEXHTMLs();
	/**
	 * Adds new child to the list of ATTRIBUTE-VALUE-XHTML children.
	 * @return created child
	 */
	ATTRIBUTEVALUEXHTML addATTRIBUTEVALUEXHTML();


}
