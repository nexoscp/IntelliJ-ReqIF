package nexos.intellij.reqif.ui

import java.awt.GridBagConstraints.HORIZONTAL
import java.awt.GridBagConstraints.LINE_START
import java.awt.GridBagLayout
import javax.swing.JPanel
import javax.swing.JTextField

class HeaderPanel(model: Header): JPanel(GridBagLayout()) {
    init {
        add(JTextField(model.title), constraints(gridx = 0, gridy = 0, gridwidth = 4, weightx = 1.0, fill = HORIZONTAL, anchor = LINE_START))
        add(JTextField(model.identifier), constraints(gridx = 0, gridy = 1, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, anchor = LINE_START))
        add(JTextField(model.creationTime), constraints(gridx = 1, gridy = 1, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, anchor = LINE_START))
        add(JTextField(model.version), constraints(gridx = 3, gridy = 1, gridwidth = 1, weightx = 1.0, fill = HORIZONTAL, anchor = LINE_START))
    }
}
