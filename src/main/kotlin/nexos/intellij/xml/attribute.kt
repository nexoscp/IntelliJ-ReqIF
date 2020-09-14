package nexos.intellij.xml

import com.intellij.psi.xml.XmlTag
import nexos.intellij.xml.MissingTagBehaviour.CREATE
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Attribute(val name:String, val default:String = "", val onMissingTag:MissingTagBehaviour = CREATE)

class AttributeProperty(private val path:List<String> = listOf(), val attribute: Attribute): ReadWriteProperty<XMLModel, String> {
    override fun getValue(thisRef: XMLModel, property: KProperty<*>): String {
        var value = attribute.default
        val xml = thisRef.node()
        if(xml != null) {
            var sub: XmlTag? = xml
            for (element in path) {
                if (sub == null) {
                    break
                } else {
                    sub = sub.findFirstSubTag(element)
                }
            }
            if (sub != null)  {
                val text = sub.getAttribute(attribute.name)?.value
                if (text != null && text.isNotEmpty()) {
                    value = text
                }
            }
        }
        return value
    }

    override fun setValue(thisRef: XMLModel, property: KProperty<*>, value: String) {
        val xml = thisRef.node()
        if(xml != null) {
            var tag: XmlTag = xml
            for (element in path) {
                val sub = tag.findFirstSubTag(element)
                if(sub == null) {
                    if (attribute.onMissingTag == CREATE) {
                        //TODO use a lambda from class Text to create the missing tag
                        tag = tag.createChildTag(element, tag.namespace, "", true)
                    } else {
                        //TODO how to propagate error to Editor validation?
                        //FIXME PANIC!
                    }
                } else {
                    tag = sub
                }
            }
            tag.setAttribute(attribute.name, tag.namespace, value)
        }
    }
}
