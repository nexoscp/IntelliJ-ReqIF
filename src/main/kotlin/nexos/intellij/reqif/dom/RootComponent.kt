package nexos.intellij.reqif.dom

import com.intellij.util.xml.ui.BasicDomElementComponent
import com.intellij.util.xml.ui.DomUIFactory.createControl
import nexos.intellij.reqif.model.REQIF
import nexos.intellij.reqif.model.REQIFHEADER
import nexos.intellij.reqif.ui.*
import java.awt.BorderLayout
import java.awt.BorderLayout.CENTER
import java.awt.BorderLayout.NORTH
import java.awt.GridBagConstraints
import java.awt.GridBagConstraints.HORIZONTAL
import java.awt.GridBagLayout
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JScrollPane

class RootComponent(root:REQIF): BasicDomElementComponent<REQIF>(root) {
    private val component = addComponent(DOMContainer(BorderLayouts))

    init {
        val header = createHeader(domElement.theheader.reqifheader)
        component.addComponent(header, NORTH)
        component.add(JScrollPane(createContentPane(domElement)), CENTER)

        bindProperties(root)
    }

    private fun createContentPane(domElement: REQIF?): JPanel {
        val panel = DOMContainer(BorderLayouts)
        
        return panel
    }

    private fun createHeader(header: REQIFHEADER): DOMContainer<GridBagLayout, GridBagConstraints> {
        val component = DOMContainer(GridBagLayouts)
        component.add(JLabel("Title"), labelConstraints(0))
        component.add(createControl(header.title), inputConstraints(0), ::decorateComponent)

        component.add(JLabel("Identifier"), labelConstraints(1))
        component.add(createControl(header.identifier), inputConstraints(1), ::decorateComponent)

        component.add(JLabel("Creation Time"), labelConstraints(2))
        component.add(createControl(header.creationtime), inputConstraints(2), ::decorateComponent)
        return component
    }

    override fun getComponent(): DOMContainer<BorderLayout, String>? = component
}

val defaultInsets = insets(4,4,4,4)
fun labelConstraints(row: Int) = constraints(gridx = 0, gridy = row, gridwidth = 1, weightx = 0.0, insets = defaultInsets)
fun inputConstraints(row: Int) =
        constraints(gridx = 1, gridy = row, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, insets = defaultInsets)
