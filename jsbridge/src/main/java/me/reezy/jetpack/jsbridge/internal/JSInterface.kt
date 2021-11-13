package me.reezy.jetpack.jsbridge.internal

import android.webkit.JavascriptInterface
import me.reezy.jetpack.jsbridge.JSBridge

internal class JSInterface(private val bridge: JSBridge) {
    @JavascriptInterface
    fun call(moduleName: String, methodName: String, arguments: String): String {
        return bridge.call(moduleName, methodName, arguments)
    }
}