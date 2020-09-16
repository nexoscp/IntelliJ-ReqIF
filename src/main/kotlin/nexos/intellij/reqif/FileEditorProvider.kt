package nexos.intellij.reqif

import com.intellij.openapi.fileEditor.FileEditorPolicy.PLACE_BEFORE_DEFAULT_EDITOR
import com.intellij.openapi.fileEditor.FileEditorProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiManager
import com.intellij.psi.xml.XmlFile
import com.intellij.util.xml.DomManager
import nexos.intellij.reqif.ReqIF.ID
import nexos.intellij.reqif.model.REQIF

class FileEditorProvider : FileEditorProvider {
    override fun accept(project: Project, file: VirtualFile) = file.fileType is FileType

    override fun createEditor(project: Project, file: VirtualFile): FileEditor {
        val psiFile = PsiManager.getInstance(project).findFile(file)
        if (psiFile is XmlFile) {
            val root = DomManager
                    .getDomManager(project)
                    .getFileElement(psiFile, REQIF::class.java)
                    ?.rootElement
            if (root !=null) {
                return FileEditor(project, file, "ReqIF", root)
            }
        }
        throw RuntimeException("could not create editor: not a xml file $file")
    }

    override fun getEditorTypeId() = ID

    override fun getPolicy() = PLACE_BEFORE_DEFAULT_EDITOR
}