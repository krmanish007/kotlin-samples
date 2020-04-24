package com.infogen.samples.samples.kotlin.functional

fun closureMaker(): () -> Unit {
    var num =0;
    return {println(num++)}
}

fun main(args: Array<String>) {
    val closureMaker1 = closureMaker()
    val closureMaker2 = closureMaker()
    closureMaker1()
    closureMaker1()
    closureMaker2()
    closureMaker2()
    closureMaker2()
    closureMaker1()
}
