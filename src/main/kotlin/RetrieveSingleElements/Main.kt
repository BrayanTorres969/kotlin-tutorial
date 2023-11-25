package RetrieveSingleElements

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.elementAt(3)) //four
    println(numbers.first()) //one
    println(numbers.last()) //five

    println("\n")
    println(numbers.first { it.length > 3 }) //three
    println(numbers.last { it.startsWith("f") }) //five
    println(numbers.random())
    println(numbers.isEmpty()) //false
}