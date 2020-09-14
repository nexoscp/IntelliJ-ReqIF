package nexos.intellij.xml.text

import com.intellij.psi.xml.XmlTag
import nexos.intellij.xml.MissingTagBehaviour
import nexos.intellij.xml.MissingTagBehaviour.CREATE
import nexos.intellij.xml.XMLModel
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


//operator fun Path.div(element: Text) =  TextProperty(path, element)
/**
 * TODO default as lambda
 * TODO add Converter
 * TODO add function with overloads for Converter Type safety, using Text.DEFAULT on ()
 */
data class Text(val default:String = "", val createMissingTags: MissingTagBehaviour = CREATE)

class TextProperty(private val path:List<String> = listOf(), private val text: Text): ReadWriteProperty<XMLModel, String> {
    override fun getValue(thisRef: XMLModel, property: KProperty<*>): String {
        var value = text.default
        val xml = thisRef.node()
        if(xml != null) {
            var tag: XmlTag = xml
            for (element in path) {
                val sub = tag.findFirstSubTag(element)
                if(sub == null) {
                    break
                } else {
                    tag = sub
                }
            }
            val text = tag.value.text
            if(text.isNotEmpty()) {
                value = text
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
                    if (text.createMissingTags == CREATE) {
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
            tag.value.text = value
        }
    }
}