package nexos.intellij.reqif.dom

import com.intellij.util.xml.DomFileDescription
import nexos.intellij.reqif.ReqIF
import nexos.intellij.reqif.model.REQIF

class FileMetaData(): DomFileDescription<REQIF>(REQIF::class.java, "REQIF", ReqIF.SCHEMA) {
    override fun acceptsOtherRootTagNames() = true
}