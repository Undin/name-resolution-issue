package com.github.undin.nameresolutionissue.services

import com.github.undin.nameresolutionissue.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
