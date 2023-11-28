package BinarySearch

fun main() {
    val numbers = (1..35).toList()
    val numbers2 = mutableListOf(10, 16, 25, 56, 78, 86, 125, 215, 480, 800, 802, 803);

    println(binarySearch(27, numbers))
    println()
    println(searchElement(215, numbers2));


}

private fun binarySearch(target: Int, list: List<Int>): Int {
    var high = list.size - 1
    var low = 0;
    var i = 0


    while (low <= high) {
        i++
        println("Busqueda  $i")
        val mid = (high + low) / 2
        val comp = list[mid].compareTo(target)
        if (comp < 0) {
            low = mid + 1
        } else if (comp > 0) {
            high = mid - 1
        } else {
            return list[mid]
        }

    }
    return -1
}

//private fun searchElement(target: Int, numbers: MutableList<Int>): Int = numbers[numbers.binarySearch(target)];

private fun searchElement(target: Int, numbers: MutableList<Int>): Int {
    val index = numbers.binarySearch(target)
    return if (index >= 0) index else -1 //retorna el indice
}