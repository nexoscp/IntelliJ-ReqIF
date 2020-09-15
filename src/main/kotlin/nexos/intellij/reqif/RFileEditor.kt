package nexos.intellij.reqif

import com.intellij.diff.util.FileEditorBase
import com.intellij.openapi.ui.DialogPanel
import com.intellij.psi.xml.XmlFile
import com.intellij.ui.layout.panel
import nexos.intellij.reqif.ui.EditorPanel
import nexos.intellij.reqif.ui.Model
import javax.swing.JComponent

// TODO implement com.intellij.util.xml.ui.CommittablePanel
class RFileEditor(private val file: XmlFile): FileEditorBase() {
    private val model by lazy { Model(file) }
    private val panel by lazy { createPanel() }

    private fun createPanel(): EditorPanel {
  /*      return panel {

            row {
                label(model.header.title)
                label(model.header.identifier)
                label(model.header.creationTime)
                label(model.header.toolID)
                label(model.header.sourceToolID)
                label(model.header.version)
            }

        } */
        return EditorPanel(model)
    }

    override fun getComponent(): JComponent {
        return panel
    }

    override fun getName(): String {
        val title = model.header.title
        return if (title.isEmpty()) {
            file.virtualFile.name
        } else {
            title
        }
    }

    override fun getPreferredFocusedComponent(): JComponent? {
        return null
    }
}