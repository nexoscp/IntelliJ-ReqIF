package nexos.intellij.xml

import com.intellij.psi.impl.source.xml.XmlTagImpl
import com.intellij.psi.impl.source.xml.XmlTagValueImpl
import com.intellij.psi.xml.XmlTag
import com.intellij.psi.xml.XmlTagValue
import nexos.intellij.xml.text.Text
import org.junit.Test
import kotlin.test.assertEquals

class XmlTagValueMock(parent:XmlTag): XmlTagValueImpl(arrayOf(), parent) {
    var content: String? = ""
    override fun setText(value: String?) {
        this.content = value
    }

    override fun getText(): String {
        return content ?: ""
    }

    override fun getTrimmedText(): String {
        return super.getTrimmedText()
    }
}

class XmlTagMock: XmlTagImpl() {
    var children = mutableListOf<XmlTag>()
    override fun getSubTags(): Array<XmlTag> = getSubTags(false)
    override fun getSubTags(processIncludes: Boolean): Array<XmlTag> {
        return children.toTypedArray()
    }

    override fun createXmlTagValue(): XmlTagValue? {
        return XmlTagValueMock(this)
    }

    override fun getNamespace(): String {
        return "http://fuuckup"
    }

    override fun getNamespaceByPrefix(prefix: String?): String {
        return namespace
    }

    override fun getPrefixByNamespace(namespace: String?): String? {
        return "prefix"
    }

    override fun createChildTag(localName: String?, namespace: String?, bodyText: String?, enforceNamespacesDeep: Boolean): XmlTag {
        val mock = XmlTagMock()
        children.add(mock)
        return mock
    }
}

class Test(private val root: XmlTag) : XMLModel {
    override fun node() = root
    var foo by XML / "foo" / Text()
    var car by XML / Text()
    var bar by XML ["bar"]
    var tar by (XML / "foo") ["tar"]
}

class Foo {
    @Test
    fun foo() {
        val tag = XmlTagMock()
        val subject = Test(tag)
        assertEquals("", subject.foo)
        subject.foo = "haha"
        assertEquals("haha", subject.foo)
    }

    @Test
    fun bar() {
        val tag = XmlTagMock()
        val subject = Test(tag)
        assertEquals("", subject.bar)
        subject.bar = "haha"
        assertEquals("haha", subject.bar)
    }

    @Test
    fun tar() {
        val tag = XmlTagMock()
        val subject = Test(tag)
        assertEquals("", subject.tar)
        subject.tar = "haha"
        assertEquals("haha", subject.tar)
    }

    @Test
    fun car() {
        val tag = XmlTagMock()
        val subject = Test(tag)
        assertEquals("", subject.car)
        subject.car = "haha"
        assertEquals("haha", subject.car)
    }
}