package Predicates

fun main() {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers.any { it.endsWith("e") }) //true
    println(numbers.none { it.endsWith("w") }) //true
    println(numbers.all { it.length > 1 }) //true
}