package com.infogen.samples.samples.kotlin.fundamental

import com.infogen.samples.EmployeeToBeCalledFromKotlin

fun main(args: Array<String>) {
    val employee = EmployeeToBeCalledFromKotlin(1, "Manish")
    println(employee.id)
    println(employee.name)

    employee.id=2
    println(employee.id)
}
