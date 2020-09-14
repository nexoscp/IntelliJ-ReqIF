package nexos.intellij.xml

import com.intellij.psi.xml.XmlTag
import nexos.intellij.xml.MissingTagBehaviour.CREATE
import nexos.intellij.xml.collection.CollectionProperty
import nexos.intellij.xml.collection.XMLCollection
import nexos.intellij.xml.text.Text
import nexos.intellij.xml.text.TextProperty

interface XMLModel {
    fun node(): XmlTag?
}

enum class MissingTagBehaviour {
    CREATE,
    ERROR
}

open class Path(private val path:List<String>) {
    operator fun div(element: String) = Path(path + element)
    /**
     * TODO should be an extension Method, but seams not to work
     */
    operator fun div(element: Text) = TextProperty(path, element)
    /**
     * TODO should be an extension Method, but seams not to work
     */
    operator fun get(name:String, default:String = "", onMissingTag:MissingTagBehaviour = CREATE) = AttributeProperty(path, Attribute(name, default, onMissingTag))
    operator fun <C:XMLModel, P:XMLModel>div(element: (node: XmlTag) -> C) : ChildProperty<C, P> = ChildProperty(element, path)
    operator fun <C:XMLModel, P:XMLModel>div(element: XMLCollection<C>) : CollectionProperty<C, P> = CollectionProperty(element, path)
}

object XML: Path(listOf())

internal fun findChild(xml: XmlTag, path: List<String>): XmlTag {
    var tag: XmlTag = xml
    for (element in path) {
        val sub = tag.findFirstSubTag(element)
        if (sub == null) {
            throw RuntimeException("missing tag '$element'")
        } else {
            tag = sub
        }
    }
    return tag
}