package nexos.intellij.reqif

import com.intellij.lang.xml.XMLLanguage
import com.intellij.psi.PsiElement
import com.intellij.psi.xml.XmlTag
import com.intellij.ui.breadcrumbs.BreadcrumbsProvider
import com.intellij.util.xml.DomManager.getDomManager
import nexos.intellij.reqif.model.REQIF
import nexos.intellij.reqif.model.SPECIFICATION

class Breadcrumbs: BreadcrumbsProvider {
    override fun getLanguages() = arrayOf(XMLLanguage.INSTANCE)

    override fun acceptElement(element: PsiElement): Boolean {
        if (element is XmlTag && element.isValid) {
            val dom = getDomManager(element.project).getDomElement(element)
            return (dom is SPECIFICATION)
        }
        return false
    }

    override fun getElementInfo(element: PsiElement): String {
        if (element is XmlTag && element.isValid) {
            val dom = getDomManager(element.project).getDomElement(element)
            dom?.getParentOfType(REQIF::class.java, false)
        }
        TODO("Not yet implemented")
    }
}