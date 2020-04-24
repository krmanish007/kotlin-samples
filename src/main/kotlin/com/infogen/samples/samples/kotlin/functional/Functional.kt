package com.infogen.samples.samples.kotlin.functional

import org.funktionale.collections.destructured
import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose
import org.funktionale.currying.*
import org.funktionale.partials.partially1
import org.funktionale.partials.partially3
import org.funktionale.memoization.memoize

fun functional() {
    val (head, tail) = listOf(1,2,3).destructured()
    println("$head, $tail")

    val add5 = { i: Int -> i+5}
    val multiple2 = { i: Int -> i*2}

    val multAndAdd = add5 compose multiple2
    val multAndAddforward = add5 forwardCompose multiple2

    println(multAndAdd(10))
    println(multAndAddforward(10))

    val sum3Int = {x:Int, y:Int, z:Int -> x+y+z}
    val curried: (Int) -> (Int) -> (Int) -> Int = sum3Int.curried()
    println(curried(2)(4)(6))

    val preAndPostFix: (String, String, String) -> String = {prefix: String, x: String, postfix: String -> "$prefix$x$postfix"}
    val preAndBang: (String, String) -> String = preAndPostFix.partially3("Three")
    val hello: (String) -> String = preAndBang.partially1("One ")
    println(hello("Two "))
}

fun memo() {
    var fib: (Long) -> Long = {it}
    fib = {n:Long -> if (n<2) n else fib(n-1) + fib(n-2) }

    var memoize: (Long) -> Long = {it}
    memoize = {n:Long -> if (n<2) n else memoize(n-1) + memoize(n-2) }.memoize()

    //you will see that memoize takes very less time
    println(timeLapsed{fib(40)})
    println(timeLapsed{memoize(1000)})
}

fun timeLapsed(body: () -> Unit): Long {
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end-start
}

fun main(args: Array<String>) {
    functional()

    memo()
}
