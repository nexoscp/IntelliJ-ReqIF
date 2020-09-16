package nexos.intellij.reqif.dom

import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.layout.panel
import com.intellij.util.xml.ui.BasicDomElementComponent
import com.intellij.util.xml.ui.DomUIFactory
import nexos.intellij.reqif.model.REQIF
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel

class RootComponent(root:REQIF): BasicDomElementComponent<REQIF>(root) {
    private val component by lazy {createComponent()}

    private fun createComponent(): JPanel {

         panel {
            row {

                label("Title")
                label(domElement.theheader.reqifheader.title.value ?: "")
                label("Language")
                label(domElement.lang.value ?:"")
                label("Creation Time")
                label(domElement.theheader.reqifheader.creationtime.value ?: "")
                label("Comment")
                label(domElement.theheader.reqifheader.comment.value ?: "")
            }
        }
        val panel = JPanel()
        panel.add(JLabel("Title"))
        panel.add(DomUIFactory.createControl(domElement.theheader.reqifheader.title).component)
        return panel
    }

    override fun getComponent(): JComponent {
        return component
    }
}