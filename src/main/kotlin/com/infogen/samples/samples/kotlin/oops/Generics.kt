package com.infogen.samples.samples.kotlin.oops

fun <T: Comparable<T>> max(param1: T, param2: T): T {
    return if (param1.compareTo(param2) > 1) param1 else param2
}

fun main(args: Array<String>) {
    val maxInt = max(10, 20)
    println(maxInt)

    val maxString = max("a", "b")
    println(maxString)
}
