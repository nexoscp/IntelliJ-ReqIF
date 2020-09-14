package nexos.intellij.reqif.ui

import com.intellij.psi.xml.XmlFile
import com.intellij.psi.xml.XmlTag
import nexos.intellij.xml.*
import nexos.intellij.xml.XMLModel
import nexos.intellij.xml.collection.XMLCollection
import nexos.intellij.xml.text.Text

class Model(private val file: XmlFile): XMLModel {
    override fun node() = file.rootTag
    val header by XML / "THE-HEADER" / "REQ-IF-HEADER" / ::Header
    val specifications by XML / "CORE-CONTENT" / "REQ-IF-CONTENT" / "SPECIFICATIONS" / XMLCollection("SPECIFICATION", ::Specification)
}

class Header(private val node: XmlTag): XMLModel {
    override fun node() = node
       var title by XML / "TITLE" / Text()
       var creationTime by XML / "CREATION-TIME" / Text()
       var toolID by XML / "REQ-IF-TOOL-ID" / Text()
       var version by XML / "REQ-IF-VERSION" / Text()
       var sourceToolID by XML / "SOURCE-TOOL-ID" / Text()
       var identifier by XML ["IDENTIFIER"]
}

class Specification(private val node: XmlTag): XMLModel {
    override fun node() = node
    var id by XML ["IDENTIFIER"]
    var lastChange by XML ["LAST-CHANGE"]
}