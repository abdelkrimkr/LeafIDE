package io.github.caimucheng.leaf.ide.model

import org.json.JSONObject

data class Project(
    val projectPath: String,
    val name: String,
    val description: String,
    val plugin: Plugin,
    val workspace: JSONObject
)