package me.reezy.demo.jsbridge.jsmodule

import me.reezy.jetpack.jsbridge.JSBridgeMethod
import me.reezy.jetpack.jsbridge.JSBridgeModule

class BrowserModule() : JSBridgeModule {
    override val name: String = "browser"

    @JSBridgeMethod
    fun back() {
    }

    @JSBridgeMethod
    fun close() {
    }

    @JSBridgeMethod
    fun open(uri: String) {
    }

}