package com.github.dseferlis.riderdelaydebug.services

import com.github.dseferlis.riderdelaydebug.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
