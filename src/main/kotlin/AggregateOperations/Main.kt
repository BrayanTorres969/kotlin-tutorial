package AggregateOperations

fun main() {
    val numbers = listOf(6, 12, 14, 28, 8, 100)
    println("La suma es: ${numbers.sum()}") //La suma es: 168
    println("La cantidad de elementos es : ${numbers.count()}") //La cantidad de elementos es : 6
    println("El promedio es ${numbers.average()}") //El promedio es 28.0
    println("El máximo valor es: ${numbers.maxOrNull()}") //El máximo valor es: 100
    println("El mínimo valor es: ${numbers.minOrNull()}") //El mínimo valor es: 6
    println("El doble de la  suma es: ${numbers.sumOf { it * 2 }}") //El doble de la  suma es: 336
}