package me.reezy.demo.jsbridge.jsmodule

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import me.reezy.jetpack.jsbridge.argument.JSMap
import me.reezy.jetpack.jsbridge.JSBridgeMethod
import me.reezy.jetpack.jsbridge.JSBridgeModule
import org.json.JSONObject

class AjaxModule(val activity: AppCompatActivity) : JSBridgeModule {
    override val name: String = "ajax"

    @JSBridgeMethod
    fun request(map: JSMap) {
        Log.e("jsbridge", "ajax.request($map)")


    }


    @JSBridgeMethod
    fun get(url: String, params: JSONObject?, options: JSMap) {
        Log.e("jsbridge", "ajax.get()")


    }
    @JSBridgeMethod
    fun post(url: String, data: String?, options: JSMap) {
        Log.e("jsbridge", "ajax.request()")


    }
}


/*
*
*
*
*
*
*
* */