package me.reezy.jetpack.jsbridge

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class JSBridgeMethod(val name: String = "", val mainThread: Boolean = false)