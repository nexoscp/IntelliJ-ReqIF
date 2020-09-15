package nexos.intellij.reqif.dom

import com.intellij.util.xml.DomFileDescription
import nexos.intellij.reqif.ReqIF
import nexos.intellij.reqif.model.REQIF

@Deprecated("attempt on using XML DOM API failed")
class FileMetaData(): DomFileDescription<REQIF>(REQIF::class.java, "REQIF", ReqIF.SCHEMA) {
    override fun acceptsOtherRootTagNames() = true
}