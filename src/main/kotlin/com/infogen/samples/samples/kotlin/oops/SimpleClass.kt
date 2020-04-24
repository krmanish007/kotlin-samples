package com.infogen.samples.samples.kotlin.oops

//by default, kotlin creates val
class SimpleClass constructor(var param1: Int, var param2: Int = 0) {
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
    val testClass = SimpleClass(1)
    println(testClass)
}
