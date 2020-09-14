package nexos.intellij.reqif

import com.intellij.icons.AllIcons
import com.intellij.ide.highlighter.XmlLikeFileType

class FileType: XmlLikeFileType(RLanguage.INSTANCE) {
    companion object {
        val INSTANCE = FileType()
    }
    override fun getName() = ReqIF.NAME
    override fun getDescription() = ReqIF.description
    override fun getDefaultExtension() = ReqIF.DefaultExtension
    override fun getIcon() = AllIcons.FileTypes.Custom
}