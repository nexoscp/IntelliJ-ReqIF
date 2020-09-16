package nexos.intellij.reqif

import com.intellij.icons.AllIcons
import com.intellij.ide.highlighter.XmlLikeFileType
import com.intellij.lang.xml.XMLLanguage

class FileType: XmlLikeFileType(XMLLanguage.INSTANCE) {
    companion object {
        val INSTANCE = FileType()
    }
    override fun getName() = ReqIF.NAME
    override fun getDescription() = ReqIF.description
    override fun getDefaultExtension() = ReqIF.DefaultExtension
    override fun getIcon() = AllIcons.FileTypes.Custom
}