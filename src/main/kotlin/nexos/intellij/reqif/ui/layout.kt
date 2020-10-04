package nexos.intellij.reqif.ui

import java.awt.*
import java.awt.GridBagConstraints.*
import java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.util.*
import java.util.Collections.emptySet
import javax.swing.JComponent
import javax.swing.JTextField

interface ThinAir<T> {
    fun create(): T
}

/**
 * Defines a type projection from [LayoutManager] to its constraints and acts as an Factory for the [LayoutManager]
 *
 * Idea is to create an 'object' for each [LayoutManager]
 */
interface LayoutType<LAYOUTMANAGER: LayoutManager, CONSTRAINTS>: ThinAir<LAYOUTMANAGER>

object GridBagLayouts: LayoutType<GridBagLayout, GridBagConstraints> {
    override fun create() = GridBagLayout()
}

object BorderLayouts: LayoutType<BorderLayout, String> {
    override fun create() = BorderLayout()
}

fun constraints(
        gridx: Int = RELATIVE,
        gridy: Int = RELATIVE,
        gridwidth: Int = 1,
        gridheight: Int = 1,
        weightx: Double = 0.0,
        weighty: Double = 0.0,
        anchor: Int = CENTER,
        fill: Int = NONE,
        insets: Insets = Insets(0, 0, 0, 0),
        ipadx: Int = 0,
        ipady: Int = 0) = GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, insets, ipadx, ipady)

fun insets(top:Int = 0, left:Int = 0, bottom:Int = 0, right:Int = 0) = Insets(top, left, bottom, right)

fun decorateComponent(component: JComponent) {
    component.setFocusTraversalKeys(FORWARD_TRAVERSAL_KEYS, emptySet());
    component.addKeyListener(object : KeyAdapter() {
        override fun keyPressed(e: KeyEvent) {
            if (e.keyCode == KeyEvent.VK_TAB) {
                if (e.modifiersEx > 0) {
                    component.transferFocusBackward()
                } else {
                    component.transferFocus()
                }
                e.consume()
            }
        }
    })
}