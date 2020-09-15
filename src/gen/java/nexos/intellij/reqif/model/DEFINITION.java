// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericDomValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:DEFINITIONElemType interface.
 */
public interface DEFINITION extends DomElement {

	/**
	 * Returns the value of the ATTRIBUTE-DEFINITION-DATE-REF child.
	 * @return the value of the ATTRIBUTE-DEFINITION-DATE-REF child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getATTRIBUTEDEFINITIONDATEREF();


}
