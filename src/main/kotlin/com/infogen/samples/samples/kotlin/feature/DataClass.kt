package com.infogen.samples.samples.kotlin.feature

//data adds several data features
data class DataClass constructor(var param1: Int, var param2: Int = 0) {

    //secondary constructor must call primary constructor
    constructor(param1: Int) : this(param1, 5)
}

class DataWithoutKeywordClass constructor(var param1: Int, var param2: Int = 0, var param3: Int = 0) {
    operator fun component1() = param1
    operator fun component2() = param2
    operator fun component3() = param3

    //secondary constructor must call primary constructor
    constructor(param1: Int) : this(param1, 5)
}

fun main(args: Array<String>) {
    val testClass = DataClass(1)

    val (p1, p2) = testClass;
    print("$p1, $p2")

    val testWithoutKeywordClass = DataWithoutKeywordClass(1)

    val (q1, q2, q3) = testWithoutKeywordClass;
    print("\n$q1, $q2, $q3")
}
