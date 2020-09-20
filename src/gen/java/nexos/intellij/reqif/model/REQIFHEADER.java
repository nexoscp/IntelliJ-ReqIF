// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.*;
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
	@SubTag("CREATION-TIME")
	GenericDomValue<String> getCREATIONTIME();


	/**
	 * Returns the value of the REPOSITORY-ID child.
	 * @return the value of the REPOSITORY-ID child.
	 */
	@NotNull
	@SubTag("REPOSITORY-ID")
	GenericDomValue<String> getREPOSITORYID();


	/**
	 * Returns the value of the REQ-IF-TOOL-ID child.
	 * @return the value of the REQ-IF-TOOL-ID child.
	 */
	@NotNull
	@Required
	@SubTag("REQ-IF-TOOL-ID")
	GenericDomValue<String> getREQIFTOOLID();


	/**
	 * Returns the value of the SOURCE-TOOL-ID child.
	 * @return the value of the SOURCE-TOOL-ID child.
	 */
	@NotNull
	@Required
	@SubTag("SOURCE-TOOL-ID")
	GenericDomValue<String> getSOURCETOOLID();


	/**
	 * Returns the value of the TITLE child.
	 * @return the value of the TITLE child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTITLE();

	/**
	 * type: xsd:ID
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getIDENTIFIER();
}
