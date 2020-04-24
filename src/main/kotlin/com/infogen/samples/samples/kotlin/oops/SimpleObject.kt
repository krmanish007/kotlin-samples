package com.infogen.samples.samples.kotlin.oops
/*
Operator overload
DSL
 */
object SimpleObject {
    val aInt = 5
    var aString = "Abc"

    fun printMe() {
        println("$aInt,$aString")
    }
}

fun main(args: Array<String>) {
    val testObject = SimpleObject
    SimpleObject.printMe()
    SimpleObject.aString = "new"
    SimpleObject.printMe()
}
