// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericDomValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:REQ-IF-HEADER interface.
 */
public interface REQIFHEADER extends DomElement {

	/**
	 * Returns the value of the COMMENT child.
	 * @return the value of the COMMENT child.
	 */
	@NotNull
	GenericDomValue<String> getCOMMENT();


	/**
	 * Returns the value of the CREATION-TIME child.
	 * @return the value of the CREATION-TIME child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCREATIONTIME();


	/**
	 * Returns the value of the REPOSITORY-ID child.
	 * @return the value of the REPOSITORY-ID child.
	 */
	@NotNull
	GenericDomValue<String> getREPOSITORYID();


	/**
	 * Returns the value of the REQ-IF-TOOL-ID child.
	 * @return the value of the REQ-IF-TOOL-ID child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getREQIFTOOLID();


	/**
	 * Returns the value of the SOURCE-TOOL-ID child.
	 * @return the value of the SOURCE-TOOL-ID child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getSOURCETOOLID();


	/**
	 * Returns the value of the TITLE child.
	 * @return the value of the TITLE child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTITLE();


}