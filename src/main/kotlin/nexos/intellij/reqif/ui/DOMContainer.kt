package nexos.intellij.reqif.ui

import com.intellij.util.xml.DomElement
import com.intellij.util.xml.ui.Committable
import com.intellij.util.xml.ui.CompositeCommittable
import com.intellij.util.xml.ui.DomUIControl
import com.intellij.util.xml.ui.Highlightable
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import javax.swing.JPanel

class DOMContainer: JPanel(GridBagLayout()), Committable, Highlightable {
    private val composable = CompositeCommittable()

    override fun dispose() = composable.dispose()

    override fun commit() = composable.commit()

    override fun reset() = composable.reset()

    override fun updateHighlighting() = composable.updateHighlighting()

    fun <T: DomElement> add(control: DomUIControl<T>, constraints: GridBagConstraints): DomUIControl<T> {
        composable.addComponent(control)
        add(control.component, constraints)
        return control
    }
}