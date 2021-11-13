# JSBridge
 
简单易用的 Android WebView 和 Javascript 交互框架。 


## 使用

```kotlin   
class MainActivity : AppCompatActivity(R.layout.layout_web) {

    private val bridge = JSBridge()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 

        // 添加模块
        bridge.addModule(TestModule()) 

        // 注入 WebView
        bridge.injectBridge(web)


        web.webViewClient = object : WebViewClient() {

            override fun onPageStarted(view: WebView, url: String?, favicon: Bitmap?) {
                logE("onPageStarted => $url")
                // 注入模块
                bridge.injectModules()
                progress.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView, url: String?) {
                logE("onPageFinished => $url")
                // 注入模块
                bridge.injectModules()
                progress.visibility = View.GONE
            }

        }
    }
}
``` 




## Gradle

``` groovy
repositories { 
    maven { url "https://gitee.com/ezy/repo/raw/android_public/"}
} 
dependencies {
    implementation "me.reezy.jetpack:jsbridge:0.4.0" 
}
```
 



## LICENSE

The Component is open-sourced software licensed under the [Apache license](LICENSE).
