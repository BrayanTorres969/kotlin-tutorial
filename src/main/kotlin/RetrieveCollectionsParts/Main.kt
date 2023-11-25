package RetrieveCollectionsParts

fun main() {

    val numbersString = listOf("one", "two", "three", "four", "five", "six")
    println(numbersString.slice(1..3)) //[two, three, four]
    println(numbersString.slice(0..4 step 2)) //[one, three, five]
    println(numbersString.slice(setOf(3, 5, 0))) //[four, six, one]

    println("\n")
    println(numbersString.take(3)) // [one, two, three]
    println(numbersString.takeLast(3)) //[four, five, six]
    println(numbersString.drop(1)) //[two, three, four, five, six]
    println(numbersString.dropLast(5)) //[one]

    println("\n")
    println(numbersString.takeWhile { !it.startsWith("f") }) //[one, two, three] toma elementos de la lista hasta que
    // encuentra un elemento que no cumple esa condición.
    println(numbersString.takeLastWhile { it != "three" }) //[four, five, six]
    println(numbersString.dropWhile { it.length == 3 }) //three, four, five, six] eliminará elementos desde el principio de
    // la lista hasta que encuentre un elemento que no cumple con la condición especificada y la eliminación se detiene.
    println(numbersString.dropLastWhile { it.contains("i") }) //[one, two, three, four]

    println("\n")
    val numbers = (0..13).toList()
    println(numbers.chunked(3)) // [[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11], [12, 13]]
    println(numbers.chunked(3) { it.sum() }) //[3, 12, 21, 30, 25]

    println("\n")
    val numbersString2 = numbersString
    println(numbersString2.windowed(3)) //[[one, two, three], [two, three, four], [three, four, five], [four, five, six]]

}