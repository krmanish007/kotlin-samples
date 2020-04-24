package com.infogen.samples.samples.kotlin.fundamental

fun add(param1: Int, param2: Int): Int = param1 + param2
fun calculate(param1: Int = 0, param2: Int = 0, operation: String = "Add"): Int {
    return when (operation) {
        "Add" -> param1 + param2
        "Subtract" -> param1 - param2
        "Multiply" -> param1 * param2
        "Divide" -> param1.div(param2)
        else -> 0
    }
}

fun main(args: Array<String>) {
    //call function
    println("\nAdd 5, 10 = ${add(5, 10)}")
    println("Add 5, 10 = ${calculate(5, 10)}")
    println("Add 5, 10 = ${calculate(5, 10, "Add")}")

    //test method overloading
    println("Add defaults = ${calculate()}")
    println("Subtract default with 5 = ${calculate(
        operation = "Subtract",
        param1 = 5
    )}")
}

