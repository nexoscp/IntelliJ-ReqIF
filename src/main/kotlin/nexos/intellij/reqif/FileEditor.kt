package nexos.intellij.reqif
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.xml.ui.DomFileEditor
import nexos.intellij.reqif.dom.RootComponent
import nexos.intellij.reqif.model.REQIF

@Deprecated("attempt on using XML DOM API failed")
class FileEditor(project: Project, file: VirtualFile, name: String, root:REQIF):
        DomFileEditor<RootComponent>(project, file, name, RootComponent(root))