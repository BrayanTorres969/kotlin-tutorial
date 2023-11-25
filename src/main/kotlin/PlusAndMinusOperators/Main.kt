package PlusAndMinusOperators

fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three", "four")

    println(plusList)  //[one, two, three, four, five]
    println(minusList) //[one, two]
}