package nexos.intellij.reqif

import com.intellij.ide.structureView.*
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.lang.PsiStructureViewFactory
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.fileEditor.FileEditor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.psi.xml.XmlFile
import com.intellij.util.xml.DomManager
import nexos.intellij.reqif.model.REQIF
import javax.swing.Icon
import javax.swing.JComponent
import javax.swing.JLabel
import kotlin.test.assertNotNull

// @see https://jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/structure_view_factory.html?search=structure

class StructureViewFactory : PsiStructureViewFactory {
    override fun getStructureViewBuilder(psiFile: PsiFile) = Builder(psiFile)
}

class Builder(val psiFile: PsiFile): StructureViewBuilder {
    override fun createStructureView(fileEditor: FileEditor?, project: Project): StructureView {
        assertNotNull(fileEditor, "argument 'fileEditor' is null" )
        return View(psiFile, fileEditor, project)
    }
}

class View(val psiFile:PsiFile, private val editor: FileEditor, val project: Project): StructureView {
    override fun dispose() {}

    override fun getFileEditor() = editor

    override fun navigateToSelectedElement(requestFocus: Boolean): Boolean {
       return requestFocus
    }

    override fun getComponent(): JComponent {
        return JLabel("here we go")
    }

    override fun centerSelectedRow() {}

    override fun restoreState() {}

    override fun storeState() {}

    override fun getTreeModel(): Model {
        if (psiFile is XmlFile) {
            val root = DomManager
                    .getDomManager(project)
                    .getFileElement(psiFile, REQIF::class.java)
                    ?.rootElement
            if(root != null) {
                return Model(psiFile, root)
            }
        }
        throw RuntimeException("not my game")
    }
}

class Model(psiFile:PsiFile, root:REQIF): StructureViewModelBase(psiFile, Root(root)), StructureViewModel.ElementInfoProvider {
    override fun isAlwaysShowsPlus(element: StructureViewTreeElement?): Boolean {
       return false
    }

    override fun isAlwaysLeaf(element: StructureViewTreeElement?): Boolean {
       return false
    }
}

// SortableTreeElement
class Root(private val root: REQIF): StructureViewTreeElement {
    override fun getPresentation(): ItemPresentation {
        return object: ItemPresentation {
            override fun getPresentableText() = "ROOT"

            override fun getLocationString(): String? = null

            override fun getIcon(unused: Boolean): Icon? = null
        }
    }

    override fun getChildren(): Array<TreeElement> = arrayOf()

    override fun navigate(requestFocus: Boolean) {}

    override fun canNavigate() = false

    override fun canNavigateToSource() = false

    override fun getValue() = root
}