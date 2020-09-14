package nexos.intellij.xml

import com.intellij.psi.xml.XmlTag
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * @param path the XML path from document root to this child
 */
class ChildProperty<CHILD: XMLModel, PARENT: XMLModel>(
                val factory: (root: XmlTag) -> CHILD,
        private val path:    List<String>)
    : ReadOnlyProperty<PARENT, CHILD> {
    override fun getValue(thisRef: PARENT, property: KProperty<*>): CHILD {
        val xml = thisRef.node()
        if (xml != null) {
            val tag = findChild(xml, path)
            return factory(tag)
        }
        throw RuntimeException("missing root")
    }
}
