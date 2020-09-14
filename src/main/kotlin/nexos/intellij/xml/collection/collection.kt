package nexos.intellij.xml.collection

import com.intellij.psi.xml.XmlTag
import nexos.intellij.xml.XMLModel
import nexos.intellij.xml.findChild
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

data class XMLCollection<C: XMLModel>(val name: String, val factory: (root: XmlTag) -> C)

// TODO collection of child must be a attribute to prevent unnecessary creation and in case of observable collection to safe the listeners
class CollectionProperty<C : XMLModel, P : XMLModel>(private val collection:XMLCollection<C>, private val path: List<String>): ReadOnlyProperty<P, List<C>> {
    override fun getValue(thisRef: P, property: KProperty<*>): List<C> {
        val tag = thisRef.node()
        if(tag != null) {
            return findChild(tag, path)
                    .findSubTags(collection.name)
                    .map { collection.factory(it) }
        }
        return listOf()
    }
}