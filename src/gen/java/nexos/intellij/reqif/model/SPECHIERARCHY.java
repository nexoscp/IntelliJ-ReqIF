// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPEC-HIERARCHY interface.
 */
public interface SPECHIERARCHY extends DomElement {

	/**
	 * Returns the value of the DESC child.
	 * @return the value of the DESC child.
	 */
	@NotNull
	GenericAttributeValue<String> getDESC();


	/**
	 * Returns the value of the IS-EDITABLE child.
	 * @return the value of the IS-EDITABLE child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getISEDITABLE();


	/**
	 * Returns the value of the IS-TABLE-INTERNAL child.
	 * @return the value of the IS-TABLE-INTERNAL child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getISTABLEINTERNAL();


	/**
	 * Returns the value of the LAST-CHANGE child.
	 * @return the value of the LAST-CHANGE child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getLASTCHANGE();


	/**
	 * Returns the value of the LONG-NAME child.
	 * @return the value of the LONG-NAME child.
	 */
	@NotNull
	GenericAttributeValue<String> getLONGNAME();


	/**
	 * Returns the value of the ALTERNATIVE-ID child.
	 * @return the value of the ALTERNATIVE-ID child.
	 */
	@NotNull
	ALTERNATIVEID getALTERNATIVEID();


	/**
	 * Returns the value of the CHILDREN child.
	 * @return the value of the CHILDREN child.
	 */
	@NotNull
	CHILDREN getCHILDREN();


	/**
	 * Returns the value of the EDITABLE-ATTS child.
	 * @return the value of the EDITABLE-ATTS child.
	 */
	@NotNull
	EDITABLEATTS getEDITABLEATTS();


	/**
	 * Returns the value of the OBJECT child.
	 * @return the value of the OBJECT child.
	 */
	@NotNull
	@Required
	OBJECT getOBJECT();


}
