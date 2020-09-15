package nexos.intellij.reqif.dom

import com.intellij.util.xml.ui.BasicDomElementComponent
import nexos.intellij.reqif.model.REQIF
import javax.swing.JComponent
import javax.swing.JLabel

@Deprecated("attempt on using XML DOM API failed")
class RootComponent(root:REQIF): BasicDomElementComponent<REQIF>(root) {
    override fun getComponent(): JComponent {
        return JLabel("ROOT")
    }
}