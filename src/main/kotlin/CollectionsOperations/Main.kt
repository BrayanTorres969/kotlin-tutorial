package CollectionsOperations

fun main() {
    //Transformations son funciones con las que puedes cambiar una colección en específico por ejemplo map
    //=========== Mapping =======================
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it == 3) it * 100 else it * 10 })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })

    //Utilizando en map
    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 4" to 4)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    //=========== Zipping =======================
    //estas funciones nos permite crear par de elementos que comparten la misma posición en ambas colecciones
    val colors = listOf("red", "blue", "green")
    val animals = listOf("fox", "bear", "wolf")
    println(colors.zip(animals)) //[(red, fox), (blue, bear), (green, wolf)]
    //println(colors zip animals)
    println(colors.zip(animals) { color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color " })
    //[The Fox is red , The Bear is blue , The Wolf is green ]

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs) //[(one, 1), (two, 2), (three, 3), (four, 4)]
    println(numberPairs.unzip()) //([one, two, three, four], [1, 2, 3, 4])

    //=========== Association =======================
    //permite crear un mapa donde las claves son los elementos originales de la colección y los valores son el resultado de
    //aplicar una función a cada elemento
    val numbers2 = listOf("one", "two", "three", "four")
    println(numbers2.associateWith { it.length }) //{one=3, two=3, three=5, four=4}
    println(numbers2.associateBy { it.first().uppercase() }) //{O=one, T=three, F=four}
    //Aplicando transformaciones en la clave y valor
    println(
        numbers2.associateBy(
            keySelector = { it.first().uppercase() },
            valueTransform = { it.length })
    ) //{O=3, T=5, F=4}

    //=========== Flatten =======================
    val numbersSets = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    //println(numbersSets[2][2]) //9
    for (numbers in numberSets) {
        for (number in numbers) {
            print("$number ")
        }
        println()
    }

    val numbersFlatten = numberSets.flatten()

    println(numbersFlatten)

}