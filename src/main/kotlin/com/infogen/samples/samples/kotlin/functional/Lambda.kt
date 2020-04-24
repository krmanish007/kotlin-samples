package com.infogen.samples.samples.kotlin.functional

data class Employee(val name: String, val id: Int)

fun getEmployees(): List<Employee> {
    return listOf(
        Employee("Manish", 100),
        Employee("Shubhra", 200),
        Employee("Aaryan", 40),
        Employee("Shreya", 60)
    )
}

fun main(args: Array<String>) {
    val employees = getEmployees()
    val value = employees
        .filter {e -> e.id > 40}
        .map { e -> ""+ e.id + "," + e.name }

    println(value)
    println(value.last())
    println(employees.drop(1).take(2))

    val oddNumbers = generateSequence(1) { it+1 }
    print(oddNumbers.drop(3).take(5).map { it*it }.toList())

    val fibonacciSequence = generateSequence( 1 to 1 ) {it.second to it.first +it.second }.map { it.first }
    println(fibonacciSequence.take(15).toList())
}
