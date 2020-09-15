// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:ATTRIBUTE-VALUE-STRING interface.
 */
public interface ATTRIBUTEVALUESTRING extends DomElement {

	/**
	 * Returns the value of the THE-VALUE child.
	 * @return the value of the THE-VALUE child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getTHEVALUE();


	/**
	 * Returns the value of the DEFINITION child.
	 * @return the value of the DEFINITION child.
	 */
	@NotNull
	@Required
	DEFINITION getDEFINITION();


}
