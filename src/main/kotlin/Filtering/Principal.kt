package Filtering

fun main() {

    /*  En Kotlin, "filtering" se refiere al proceso de seleccionar elementos específicos de una colección (como una
        lista o un conjunto) que cumplen con ciertos criterios. La función de filtrado en Kotlin generalmente se realiza
         mediante la función filter que está disponible en las colecciones.
     */

    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3) //[three, four]

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 101" to 101)
    val filteredmap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredmap) //{Key 101=101}

    val filteredIndex = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    println(filteredIndex)  //[two, four]

    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredNot) // [three, four]

    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "Hello World", "Alex", false)
    mixedList.filterIsInstance<Char>().forEach {
        println(it) // A B C
    }

    //Partition
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match) // [three, four] satisface la condicion
    println(rest) //[one, two] el resto de elementos
}