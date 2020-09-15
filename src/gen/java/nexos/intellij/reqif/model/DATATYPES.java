// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:DATATYPESElemType interface.
 */
public interface DATATYPES extends DomElement {

	/**
	 * Returns the list of DATATYPE-DEFINITION-BOOLEAN children.
	 * @return the list of DATATYPE-DEFINITION-BOOLEAN children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONBOOLEAN> getDATATYPEDEFINITIONBOOLEANs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-BOOLEAN children.
	 * @return created child
	 */
	DATATYPEDEFINITIONBOOLEAN addDATATYPEDEFINITIONBOOLEAN();


	/**
	 * Returns the list of DATATYPE-DEFINITION-DATE children.
	 * @return the list of DATATYPE-DEFINITION-DATE children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONDATE> getDATATYPEDEFINITIONDATEs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-DATE children.
	 * @return created child
	 */
	DATATYPEDEFINITIONDATE addDATATYPEDEFINITIONDATE();


	/**
	 * Returns the list of DATATYPE-DEFINITION-ENUMERATION children.
	 * @return the list of DATATYPE-DEFINITION-ENUMERATION children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONENUMERATION> getDATATYPEDEFINITIONENUMERATIONs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-ENUMERATION children.
	 * @return created child
	 */
	DATATYPEDEFINITIONENUMERATION addDATATYPEDEFINITIONENUMERATION();


	/**
	 * Returns the list of DATATYPE-DEFINITION-INTEGER children.
	 * @return the list of DATATYPE-DEFINITION-INTEGER children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONINTEGER> getDATATYPEDEFINITIONINTEGERs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-INTEGER children.
	 * @return created child
	 */
	DATATYPEDEFINITIONINTEGER addDATATYPEDEFINITIONINTEGER();


	/**
	 * Returns the list of DATATYPE-DEFINITION-REAL children.
	 * @return the list of DATATYPE-DEFINITION-REAL children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONREAL> getDATATYPEDEFINITIONREALs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-REAL children.
	 * @return created child
	 */
	DATATYPEDEFINITIONREAL addDATATYPEDEFINITIONREAL();


	/**
	 * Returns the list of DATATYPE-DEFINITION-STRING children.
	 * @return the list of DATATYPE-DEFINITION-STRING children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONSTRING> getDATATYPEDEFINITIONSTRINGs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-STRING children.
	 * @return created child
	 */
	DATATYPEDEFINITIONSTRING addDATATYPEDEFINITIONSTRING();


	/**
	 * Returns the list of DATATYPE-DEFINITION-XHTML children.
	 * @return the list of DATATYPE-DEFINITION-XHTML children.
	 */
	@NotNull
	java.util.List<DATATYPEDEFINITIONXHTML> getDATATYPEDEFINITIONXHTMLs();
	/**
	 * Adds new child to the list of DATATYPE-DEFINITION-XHTML children.
	 * @return created child
	 */
	DATATYPEDEFINITIONXHTML addDATATYPEDEFINITIONXHTML();


}
