package com.infogen.samples.samples.kotlin.fundamental

import kotlin.math.abs

fun comments() {
    //comments are same as java
    //nested comments are allowed, unlike java
    /*
        /*

         */
     */
    println("Hello World")
}

fun dataTypes() {
    //datatypes are same as java. There is no primitives

    //val -> value (immutable), threadsafe, easy to understand,
    //var -> variable

}

fun ifConditions() {
    //if statement is an expression
    //if condition return value, without return, so ternery doesn't exist
    val aInt = 9;
    val valueOfIf = if (aInt >= 9) "greater" else "less"
    val anotherValueOfIf = if (aInt >= 9) {
        println("it is greater")
        "greater"
    } else {
        println("it is lesser")
        "less"
    }
    println("value is $valueOfIf")
    println(anotherValueOfIf)
}
fun whenConditions() {
    //when used as switch case, but is not an expression
    //It is not limited to compare constants but can even evaluate
    val noOfBurgersBought = -1;
    when (noOfBurgersBought) {
        0 -> println("not hungry")
        in 1..3 -> println("hungry") //can take range
        //abs(noOfBurgersBought) -> println("valid input") //evaluate
        else -> {
            println("can you eat $noOfBurgersBought burgers?")
        }
    }

    //replace of multiple if else
    when {
        abs(noOfBurgersBought) == 0 -> println("none ordered")
        noOfBurgersBought > 0 -> println("valid order")
        noOfBurgersBought < 0 -> println("invalid order")
        else -> {
            println("not sure")
        }
    }

    //while and do-while is same as java
}

fun forLoop() {
    //for loop
    println("\nprint 1 to 10")
    for (item in 1..10) print("$item,")

    println("\nprint odds between 1 to 10")
    for (item in 1.rangeTo(10).step(2)) print("$item,")

    println("\nmaintain an index")
    for ((counter, item) in 1.rangeTo(10).step(2).withIndex()) print("$counter-$item,")

    println("\nprint all characters of Biscuit")
    for (char in "Biscuit") {
        print("$char,")
    }

    val array = arrayOf(10, 20, 30, 40, 50)
    println("\nprint all items of an array")

    for (item in array.indices) print("$item-${array[item]},")
    println()

    for ((counter, item) in array.iterator().withIndex()) print("$counter-$item,")
}
