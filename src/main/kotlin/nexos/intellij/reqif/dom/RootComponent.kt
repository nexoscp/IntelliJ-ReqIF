package nexos.intellij.reqif.dom

import com.intellij.util.xml.ui.BasicDomElementComponent
import com.intellij.util.xml.ui.DomUIFactory.createControl
import nexos.intellij.reqif.model.REQIF
import nexos.intellij.reqif.ui.DOMContainer
import nexos.intellij.reqif.ui.constraints
import nexos.intellij.reqif.ui.insets
import java.awt.GridBagConstraints.HORIZONTAL
import javax.swing.JLabel

class RootComponent(root:REQIF): BasicDomElementComponent<REQIF>(root) {
    private val component = addComponent(DOMContainer())

    init {
        component.add(JLabel("Title"), labelConstraints(0))
        component.add(createControl(domElement.theheader.reqifheader.title), inputConstraints(0))

        component.add(JLabel("Identifier"), labelConstraints(1))
        component.add(createControl(domElement.theheader.reqifheader.identifier), inputConstraints(1))

        component.add(JLabel("Creation Time"), labelConstraints(2))
        component.add(createControl(domElement.theheader.reqifheader.creationtime), inputConstraints(2))

        bindProperties(root)
    }

    override fun getComponent(): DOMContainer = component
}

val defaultInsets = insets(4,4,4,4)
fun labelConstraints(row: Int) = constraints(gridx = 0, gridy = row, gridwidth = 1, weightx = 0.0, insets = defaultInsets)
fun inputConstraints(row: Int) =
        constraints(gridx = 1, gridy = row, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, insets = defaultInsets)

