// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:ALTERNATIVE-IDElemType interface.
 */
public interface ALTERNATIVEID extends DomElement {

	/**
	 * Returns the value of the ALTERNATIVE-ID child.
	 * @return the value of the ALTERNATIVE-ID child.
	 */
	@NotNull
	@Required
	ALTERNATIVEID getALTERNATIVEID();


	/**
	 * Returns the value of the IDENTIFIER child.
	 * @return the value of the IDENTIFIER child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getIDENTIFIER();


}
