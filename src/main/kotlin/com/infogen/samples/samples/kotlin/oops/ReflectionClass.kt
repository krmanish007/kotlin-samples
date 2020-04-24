package com.infogen.samples.samples.kotlin.oops

//by default, kotlin creates val
@Deprecated("this class is deprecated")
class ReflectionClass constructor(var param1: Int, var param2: Int = 0) {
    //primary constructor can't have any code, use init instead
    init {
        println("$param1, $param2")
    }

    //secondary constructor must call primary constructor
    constructor(param1: Int):this(param1, 1) {
        println("$param1")
    }
}

fun main(args: Array<String>) {
    val testClass = ReflectionClass(1)
    val className = testClass.javaClass.kotlin
    println(testClass)
    println(className)

    for (name in className.members) {
        print("${name.name},")
    }
}
