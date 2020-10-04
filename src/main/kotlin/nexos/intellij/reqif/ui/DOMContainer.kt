package nexos.intellij.reqif.ui

import com.intellij.util.xml.DomElement
import com.intellij.util.xml.ui.Committable
import com.intellij.util.xml.ui.CompositeCommittable
import com.intellij.util.xml.ui.DomUIControl
import com.intellij.util.xml.ui.Highlightable
import java.awt.Component
import java.awt.LayoutManager
import javax.swing.JComponent
import javax.swing.JPanel


open class DOMContainer<L : LayoutManager, C>(layout: LayoutType<L, C>):
        JPanel(layout.create()), Committable, Highlightable {
    private val composable = CompositeCommittable()

    override fun dispose() = composable.dispose()

    override fun commit() = composable.commit()

    override fun reset() = composable.reset()

    override fun updateHighlighting() = composable.updateHighlighting()

    fun <T : DomElement> add(control: DomUIControl<T>, constraints: C, vararg decorators: (JComponent) -> Unit): DomUIControl<T> {
        composable.addComponent(control)
        val component = control.component
        decorators.forEach { it(component) }
        add(component, constraints)
        return control
    }

     fun add(comp: Component, constraints: C): Component {
        super.add(comp, constraints)
        if (comp is Committable) {
           composable.addComponent(comp)
        }
        return comp
    }

    fun <T> addComponent(comp: T, constraints: C): T where T: Component, T: Committable {
        composable.addComponent(comp)
        super.add(comp, constraints)
        return comp
    }
}