package nexos.intellij.reqif

import com.intellij.ide.actions.CreateFileAction
import com.intellij.openapi.application.WriteAction.compute
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import java.util.*
import java.util.UUID.randomUUID
import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar

class NewFile : CreateFileAction(ReqIF.NAME, "Create ${ReqIF.NAME} File", null) {
    private val dataTypes by lazy { DatatypeFactory.newInstance() }

    override fun getDefaultExtension() = ReqIF.DefaultExtension

    override fun create(newName: String, directory: PsiDirectory?): Array<PsiElement> {
        val mkdirs = MkDirs(newName, directory!!)
        return arrayOf(compute<PsiFile, RuntimeException> {
            createFile(mkdirs.directory.createFile(getFileName(mkdirs.newName)), newName)
        })
    }

    private fun now(): XMLGregorianCalendar {
        val c = GregorianCalendar()
        c.time = Date()
        return dataTypes.newXMLGregorianCalendar(c)
    }

    private fun createFile(file: PsiFile, name: String):PsiFile {
        file.virtualFile.getOutputStream(this).use {
            it.write(
                    """
                    <REQ-IF xmlns="http://www.omg.org/spec/ReqIF/20110401/reqif.xsd">
                        <THE-HEADER>
                            <REQ-IF-HEADER IDENTIFIER="${randomUUID()}">
                                <CREATION-TIME>${now().toXMLFormat()}</CREATION-TIME>
                                <REQ-IF-TOOL-ID>IntelliJReqIF</REQ-IF-TOOL-ID>
                                <REQ-IF-VERSION></REQ-IF-VERSION>
                                <SOURCE-TOOL-ID></SOURCE-TOOL-ID>
                                <TITLE>${name}</TITLE>
                            </REQ-IF-HEADER>
                        </THE-HEADER>
                        <CORE-CONTENT>
                            <REQ-IF-CONTENT></REQ-IF-CONTENT>
                        </CORE-CONTENT>
                    </REQ-IF>
                """.trimIndent().toByteArray())
        }
        return file
    }
}