package nexos.intellij.reqif.ui

import java.awt.BorderLayout
import java.awt.BorderLayout.NORTH
import javax.swing.JPanel
import javax.swing.JScrollPane

class EditorPanel(model:Model):JPanel(BorderLayout()) {
    init {
        add(HeaderPanel(model.header), NORTH)
        add(JScrollPane(SpecificationPanel(model)))
    }
}