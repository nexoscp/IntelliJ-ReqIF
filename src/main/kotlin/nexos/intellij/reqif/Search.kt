package nexos.intellij.reqif

import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.SearchScope
import com.intellij.psi.search.SearchScopeProvider

class Search : SearchScopeProvider {
    override fun getDisplayName(): String? {
        return "ReqIF"
    }

    override fun getGeneralSearchScopes(project: Project, dataContext: DataContext): MutableList<SearchScope> {
        return mutableListOf(Scope())
    }
}

class Scope: SearchScope() {
    override fun getDisplayName(): String {
        return "ReqIF"
    }
    override fun intersectWith(scope2: SearchScope): SearchScope {
        TODO("Not yet implemented")
    }

    override fun union(scope: SearchScope): SearchScope {
        TODO("Not yet implemented")
    }

    override fun contains(file: VirtualFile): Boolean {
        return file.extension == "reqif"
    }
}