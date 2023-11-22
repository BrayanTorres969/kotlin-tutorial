package StringRepresentation

fun main() {
    val numbersString = listOf("one", "two", "three", "four")
    println(numbersString) //[one, two, three, four]
    println(numbersString.joinToString()) //one, two, three, four

    val listString = StringBuffer("The list of numbers: ")
    println(numbersString.joinTo(listString)) //The list of numbers: one, two, three, four

    println(
        numbersString.joinToString(
            separator = " | ",
            prefix = "start: ",
            postfix = ": end"
        )
    ) //start: one | two | three | four: end

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 11, truncated = "<...>")) //1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, <...>

    println(numbersString.joinToString { "Element ${it.uppercase()}" }) //Element ONE, Element TWO, Element THREE, Element FOUR
}