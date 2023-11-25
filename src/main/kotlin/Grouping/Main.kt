package Grouping

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().uppercase() }) //{O=[one], T=[two, three], F=[four, five]}
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() })) //{o=[ONE], t=[TWO, THREE], f=[FOUR, FIVE]}
}