package nexos.intellij.reqif.dom

import com.intellij.util.xml.ui.BasicDomElementComponent
import com.intellij.util.xml.ui.DomUIFactory.createControl
import nexos.intellij.reqif.model.REQIF
import nexos.intellij.reqif.ui.constraints
import nexos.intellij.reqif.ui.insets
import java.awt.GridBagConstraints.HORIZONTAL
import java.awt.GridBagLayout
import javax.swing.JLabel
import javax.swing.JPanel

class RootComponent(root:REQIF): BasicDomElementComponent<REQIF>(root) {
    private val component = JPanel(GridBagLayout())
    private val title = createControl(domElement.theheader.reqifheader.title)
    private val creationTime = createControl(domElement.theheader.reqifheader.creationtime)
    init {
        component.add(
                JLabel("Title"),
                constraints(gridx = 0, gridy = 0, gridwidth = 1, weightx = 0.0, insets = insets(4,4,4,4))
        )
        component.add(title.component,
                constraints(gridx = 1, gridy = 0, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, insets = insets(4,4,4,4))
        )

        component.add(
                JLabel("Identifier"),
                constraints(gridx = 0, gridy = 1, gridwidth = 1, weightx = 0.0, insets = insets(4,4,4,4))
        )
        component.add(
                createControl(domElement.theheader.reqifheader.identifier).component,
                constraints(gridx = 1, gridy = 1, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, insets = insets(4,4,4,4))
        )

        component.add(
                JLabel("Creation Time"),
                constraints(gridx = 0, gridy = 2, gridwidth = 1, weightx = 0.0, insets = insets(4,4,4,4))
        )
        component.add(creationTime.component,
                constraints(gridx = 1, gridy = 2, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, insets = insets(4,4,4,4))
        )

        bindProperties(root)

    }

    override fun getComponent() = component
}