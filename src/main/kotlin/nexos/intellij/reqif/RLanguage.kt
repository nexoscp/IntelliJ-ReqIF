package nexos.intellij.reqif

import com.intellij.lang.Language
import com.intellij.lang.xml.XMLLanguage
import nexos.intellij.reqif.ReqIF.ID
import nexos.intellij.reqif.ReqIF.MIME_TYPE

class RLanguage: Language(XMLLanguage.INSTANCE, ID, MIME_TYPE) {
    companion object {
        var INSTANCE = RLanguage()
    }
}