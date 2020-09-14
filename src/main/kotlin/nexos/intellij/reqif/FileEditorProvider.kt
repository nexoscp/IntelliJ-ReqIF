package nexos.intellij.reqif

import com.intellij.openapi.fileEditor.FileEditorPolicy.PLACE_BEFORE_DEFAULT_EDITOR
import com.intellij.openapi.fileEditor.FileEditorProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiManager
import com.intellij.psi.xml.XmlFile
import nexos.intellij.reqif.ReqIF.ID
import java.lang.RuntimeException

class FileEditorProvider : FileEditorProvider {
    override fun accept(project: Project, file: VirtualFile): Boolean {
        return file.fileType is FileType
    }

    override fun createEditor(project: Project, file: VirtualFile): RFileEditor {
        val psiFile = PsiManager.getInstance(project).findFile(file)
        if (psiFile is XmlFile) {
            return RFileEditor(psiFile)
        }
        throw RuntimeException("could not create editor: not a xml file $file")
    }

    override fun getEditorTypeId() = ID

    override fun getPolicy() = PLACE_BEFORE_DEFAULT_EDITOR
}