package ComparableAndComparator

import kotlin.Comparator

fun main() {
    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { print("$it ") } //1 2 5 20 40 60 100

    val laptops = mutableListOf(
        Laptop("Dell", 2021, 8, 1000),
        Laptop("Acer", 2020, 4, 800),
        Laptop("Apple", 2022, 16, 1200)
    )

    ////laptops.sorted().forEach { println(it) }

    //println("\n")
    //laptops.sortedWith(ComparatorRam()).forEach { println(it) }

    println("\n")
    //laptops.sortedWith(ComparatorYear()).forEach { println(it) }

    //Usando lambdas
    val laptops2 = mutableListOf(
        Laptop("Dell", 2021, 8, 1000),
        Laptop("Acer", 2020, 4, 800),
        Laptop("Apple", 2022, 16, 1200)
    )

    laptops2.sortedWith(compareBy({ it.price })).forEach { println(it) }
    println()
    laptops2.sortedBy { it.ram }.forEach { println(it) }
    println()
    laptops2.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }

}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            return 1
        } else if (this.price < other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            return -1
        } else {
            return 0
        }
    }

}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        /*
        return if (laptop1.ram > laptop2.ram) {
            return 1
        } else if (laptop1.ram < laptop2.ram) {
            return -1
        } else {
            return 0
        }
         */
        return laptop1.ram.compareTo(laptop2.ram)
    }

}

class ComparatorYear : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return laptop1.year.compareTo(laptop2.year)
    }

}