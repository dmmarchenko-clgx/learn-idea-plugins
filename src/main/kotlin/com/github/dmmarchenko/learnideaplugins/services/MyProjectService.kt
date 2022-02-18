package com.github.dmmarchenko.learnideaplugins.services

import com.intellij.openapi.project.Project
import com.github.dmmarchenko.learnideaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
