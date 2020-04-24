package com.infogen.samples.samples.kotlin.oops

interface SimpleInterface {
    //variable initialization not allowed in interface
    val aInt:Int
    var aString:String

    fun printMe() {
        println("${aInt},${aString}")
    }

    fun overrideMe()
}
