package nexos.intellij.reqif

import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.LanguageParserDefinitions.INSTANCE
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lang.xml.XMLLanguage
import com.intellij.lang.xml.XMLParserDefinition.canStickTokensTogetherByLexerInXml
import com.intellij.lexer.XmlLexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.TokenSet

class RParserDefinition : ParserDefinition {
    private val findXML by lazy { INSTANCE.forLanguage(Language.findInstance(XMLLanguage::class.java)) }
    override fun createLexer(project: Project) = XmlLexer()
    override fun getFileNodeType() = ELEMENT_TYPE
    override fun getWhitespaceTokens() = findXML.whitespaceTokens
    override fun getCommentTokens() = findXML.commentTokens
    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
    override fun createParser(project: Project): PsiParser = findXML.createParser(project)
    override fun createFile(viewProvider: FileViewProvider) = RFile(viewProvider)
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
        canStickTokensTogetherByLexerInXml(left, right, createLexer(left.psi.project), 0)
    override fun createElement(node: ASTNode): PsiElement = node.psi
}