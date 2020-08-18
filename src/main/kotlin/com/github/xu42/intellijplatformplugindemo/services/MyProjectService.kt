package com.github.xu42.intellijplatformplugindemo.services

import com.intellij.openapi.project.Project
import com.github.xu42.intellijplatformplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
