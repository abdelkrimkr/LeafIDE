package leaf.nodejs.module

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import io.github.caimucheng.leaf.module.ModuleAPP
import io.github.caimucheng.leaf.module.path.Paths

class NodeJSModuleAPP(context: Context, paths: Paths) : ModuleAPP(context, paths) {

    companion object {

        @SuppressLint("StaticFieldLeak")
        @JvmStatic
        lateinit var currentContext: Context
            private set

        @JvmStatic
        lateinit var currentPaths: Paths
            private set

        @JvmStatic
        val MODULE_SUPPORT = "leaf.nodejs.module"
    }

    init {
        currentContext = context
        currentPaths = paths
    }

    override val moduleSupport: String
        get() = MODULE_SUPPORT
    override val versionName: String
        get() = "1.0.0.0"
    override val versionCode: Long
        get() = 1

    override fun getName(): String {
        return currentContext.getString(R.string.module_nodejs_name)
    }

    override fun getIcon(): Drawable {
        return ContextCompat.getDrawable(currentContext, R.mipmap.ic_nodejs_launcher)!!
    }

    override fun getDescription(): String {
        return currentContext.getString(R.string.module_nodejs_description)
    }

    override fun getProjectCardIcon(): Drawable {
        return ContextCompat.getDrawable(currentContext, R.drawable.nodejs_logo)!!
    }

    override fun getProjectCardSubscript(): String {
        return currentContext.getString(R.string.module_nodejs_subscript)
    }

    override fun getTemplateIcon(): Drawable {
        return ContextCompat.getDrawable(currentContext, R.mipmap.template_icon)!!
    }

    override fun getTemplateTitle(): String {
        return currentContext.getString(R.string.module_nodejs_template)
    }

}