// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:REQ-IF interface.
 */
public interface REQIF extends DomElement {

	/**
	 * Returns the value of the lang child.
	 * <pre>
	 * <h3>Attribute http://www.w3.org/XML/1998/namespace:lang documentation</h3>
	 * <div>
	 *      
	 *       <h3>lang (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *      
	 *     </div>
	 *     <div>
	 *      <h4>Notes</h4>
	 *      <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *      <p>
	 *       See BCP 47 at <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *       and the IANA language subtag registry at
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *       for further information.
	 *      </p>
	 *      <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *     </div>
	 * </pre>
	 * @return the value of the lang child.
	 */
	@NotNull
	GenericAttributeValue<String> getLang();

	/**
	 * Returns the value of the THE-HEADER child.
	 * @return the value of the THE-HEADER child.
	 */
	@NotNull
	@Required
	THEHEADER getTHEHEADER();

	/**
	 * Returns the value of the CORE-CONTENT child.
	 * @return the value of the CORE-CONTENT child.
	 */
	@NotNull
	@Required
	CORECONTENT getCORECONTENT();


	/**
	 * Returns the value of the TOOL-EXTENSIONS child.
	 * @return the value of the TOOL-EXTENSIONS child.
	 */
	@NotNull
	TOOLEXTENSIONS getTOOLEXTENSIONS();
}
