package nexos.intellij.reqif

import com.intellij.psi.FileViewProvider
import com.intellij.psi.impl.source.xml.XmlFileImpl
import com.intellij.psi.tree.IFileElementType

val ELEMENT_TYPE = IFileElementType(ReqIF.NAME, RLanguage.INSTANCE)
/**
 * @param viewProvider never null! See PsiFileImpl
 */
class RFile(viewProvider: FileViewProvider) : XmlFileImpl(viewProvider, ELEMENT_TYPE) {
    override fun toString() = "${ReqIF.NAME}:$name"
}