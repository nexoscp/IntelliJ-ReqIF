// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.w3.org/1999/xhtml

package nexos.intellij.reqif.model;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.w3.org/1999/xhtml:xhtml.var.type interface.
 */
public interface Type extends DomElement, Content, Class {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue();
	/**
	 * Sets the value of the simple content.
	 * @param value the new value to set
	 */
	void setValue(@NotNull String value);


	/**
	 * Returns the value of the space child.
	 * <pre>
	 * <h3>Attribute http://www.w3.org/XML/1998/namespace:space documentation</h3>
	 * <div>
	 *      
	 *       <h3>space (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose
	 *        value is a keyword indicating what whitespace processing
	 *        discipline is intended for the content of the element; its
	 *        value is inherited.  This name is reserved by virtue of its
	 *        definition in the XML specification.</p>
	 *      
	 *     </div>
	 * </pre>
	 * @return the value of the space child.
	 */
	@NotNull
	GenericAttributeValue<Space> getSpace();


	/**
	 * Returns the value of the class child.
	 * @return the value of the class child.
	 */
	@NotNull
	@Attribute("class")
	GenericAttributeValue<String> getClazz();


	/**
	 * Returns the value of the title child.
	 * @return the value of the title child.
	 */
	@NotNull
	GenericAttributeValue<String> getTitle();


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
	 * Returns the value of the style child.
	 * @return the value of the style child.
	 */
	@NotNull
	GenericAttributeValue<String> getStyle();


	/**
	 * Returns the value of the br child.
	 * @return the value of the br child.
	 */
	@NotNull
	@Required
	Type getBr();


	/**
	 * Returns the value of the span child.
	 * @return the value of the span child.
	 */
	@NotNull
	@Required
	Type getSpan();


	/**
	 * Returns the value of the em child.
	 * @return the value of the em child.
	 */
	@NotNull
	@Required
	Type getEm();


	/**
	 * Returns the value of the strong child.
	 * @return the value of the strong child.
	 */
	@NotNull
	@Required
	Type getStrong();


	/**
	 * Returns the value of the dfn child.
	 * @return the value of the dfn child.
	 */
	@NotNull
	@Required
	Type getDfn();


	/**
	 * Returns the value of the code child.
	 * @return the value of the code child.
	 */
	@NotNull
	@Required
	Type getCode();


	/**
	 * Returns the value of the samp child.
	 * @return the value of the samp child.
	 */
	@NotNull
	@Required
	Type getSamp();


	/**
	 * Returns the value of the kbd child.
	 * @return the value of the kbd child.
	 */
	@NotNull
	@Required
	Type getKbd();


	/**
	 * Returns the value of the var child.
	 * @return the value of the var child.
	 */
	@NotNull
	@Required
	Type getVar();


	/**
	 * Returns the value of the cite child.
	 * @return the value of the cite child.
	 */
	@NotNull
	@Required
	Type getCite();


	/**
	 * Returns the value of the abbr child.
	 * @return the value of the abbr child.
	 */
	@NotNull
	@Required
	Type getAbbr();


	/**
	 * Returns the value of the acronym child.
	 * @return the value of the acronym child.
	 */
	@NotNull
	@Required
	Type getAcronym();


	/**
	 * Returns the value of the q child.
	 * @return the value of the q child.
	 */
	@NotNull
	@Required
	Type getQ();


	/**
	 * Returns the value of the tt child.
	 * @return the value of the tt child.
	 */
	@NotNull
	@Required
	Type getTt();


	/**
	 * Returns the value of the i child.
	 * @return the value of the i child.
	 */
	@NotNull
	@Required
	Type getI();


	/**
	 * Returns the value of the b child.
	 * @return the value of the b child.
	 */
	@NotNull
	@Required
	Type getB();


	/**
	 * Returns the value of the big child.
	 * @return the value of the big child.
	 */
	@NotNull
	@Required
	Type getBig();


	/**
	 * Returns the value of the small child.
	 * @return the value of the small child.
	 */
	@NotNull
	@Required
	Type getSmall();


	/**
	 * Returns the value of the sub child.
	 * @return the value of the sub child.
	 */
	@NotNull
	@Required
	Type getSub();


	/**
	 * Returns the value of the sup child.
	 * @return the value of the sup child.
	 */
	@NotNull
	@Required
	Type getSup();


	/**
	 * Returns the value of the a child.
	 * @return the value of the a child.
	 */
	@NotNull
	@Required
	Type getA();


	/**
	 * Returns the value of the object child.
	 * @return the value of the object child.
	 */
	@NotNull
	@Required
	Type getObject();


	/**
	 * Returns the value of the ins child.
	 * @return the value of the ins child.
	 */
	@NotNull
	@Required
	Type getIns();


	/**
	 * Returns the value of the del child.
	 * @return the value of the del child.
	 */
	@NotNull
	@Required
	Type getDel();


}
