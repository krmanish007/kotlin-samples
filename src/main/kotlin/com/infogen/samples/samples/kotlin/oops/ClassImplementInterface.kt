package com.infogen.samples.samples.kotlin.oops

class ClassImplementInterface(override val aInt: Int, override var aString: String) :
    SimpleInterface {

    override fun overrideMe() {
        println(aInt)
    }
}

fun main(args: Array<String>) {
    val testClass = ClassImplementInterface(1, "abc")
    testClass.overrideMe()
    testClass.printMe()
}
