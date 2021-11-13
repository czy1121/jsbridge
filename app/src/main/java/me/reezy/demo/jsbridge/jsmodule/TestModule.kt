package me.reezy.demo.jsbridge.jsmodule

import me.reezy.demo.jsbridge.logE
import me.reezy.jetpack.jsbridge.JSBridgeMethod
import me.reezy.jetpack.jsbridge.JSBridgeModule
import me.reezy.jetpack.jsbridge.argument.JSCallback

class TestModule() : JSBridgeModule {
    override val name: String = "test"

    @JSBridgeMethod
    fun getValue(a: Int, b: Float, c: String, d: Boolean): String {
        logE("this is ${javaClass.simpleName}::getValue in ${Thread.currentThread().name}")
        return "a = $a, b = $b, c = $c, d = $d"
    }

    @JSBridgeMethod
    fun hello(who:String, callback: JSCallback) {
        logE("this is ${javaClass.simpleName}::hello in ${Thread.currentThread().name}")

        callback.invoke("$who: ", mapOf("a" to 1, "b" to 2.5, "c" to true, "d" to "wahaha"))
    }
}