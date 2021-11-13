package me.reezy.demo.jsbridge.jsmodule

import me.reezy.jetpack.jsbridge.JSBridgeMethod
import me.reezy.jetpack.jsbridge.JSBridgeModule

class StatusBarModule : JSBridgeModule {
    override val name: String = "statusbar"

    @JSBridgeMethod
    fun setColor(color: String) {
//        logE("color = $color")
    }

    @JSBridgeMethod
    fun setLight(value: Boolean) {
//        logE("light = $value")
    }
}