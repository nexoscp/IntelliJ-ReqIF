// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:EMBEDDED-VALUE interface.
 */
public interface EMBEDDEDVALUE extends DomElement {

	/**
	 * Returns the value of the KEY child.
	 * @return the value of the KEY child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getKEY();


	/**
	 * Returns the value of the OTHER-CONTENT child.
	 * @return the value of the OTHER-CONTENT child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getOTHERCONTENT();


}
