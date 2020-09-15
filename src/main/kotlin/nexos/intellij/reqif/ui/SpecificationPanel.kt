package nexos.intellij.reqif.ui

import javax.swing.JLabel
import javax.swing.JPanel

class SpecificationPanel(model:Model):JPanel() {
    companion object {
        const val linesPerCard :Int = 1;
    }
    init {
        var cardNumber = 0
        model.specifications.forEach {
            add(JLabel("ID"), constraints(gridx = 0, gridy = cardNumber * linesPerCard + 0))
            add(JLabel(it.id), constraints(gridx = 1, gridy = cardNumber * linesPerCard + 0))
            add(JLabel("Last change"), constraints(gridx = 2, gridy = cardNumber * linesPerCard + 0))
            add(JLabel(it.lastChange), constraints(gridx = 3, gridy = cardNumber * linesPerCard + 0))
            cardNumber++
        }
    }
}