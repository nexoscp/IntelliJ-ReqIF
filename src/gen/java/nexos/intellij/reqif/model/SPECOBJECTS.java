// Generated on Wed Sep 09 18:16:01 CEST 2020
// DTD/Schema  :    http://www.omg.org/spec/ReqIF/20110401/reqif.xsd

package nexos.intellij.reqif.model;

import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.omg.org/spec/ReqIF/20110401/reqif.xsd:SPEC-OBJECTSElemType interface.
 */
public interface SPECOBJECTS extends DomElement {

	/**
	 * Returns the list of SPEC-OBJECT children.
	 * @return the list of SPEC-OBJECT children.
	 */
	@NotNull
	java.util.List<SPECOBJECT> getSPECOBJECTs();
	/**
	 * Adds new child to the list of SPEC-OBJECT children.
	 * @return created child
	 */
	SPECOBJECT addSPECOBJECT();


}
