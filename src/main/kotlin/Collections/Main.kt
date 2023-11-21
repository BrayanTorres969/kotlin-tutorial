package Collections

fun main(args: Array<String>) {
    //Listas inmutables
    val names = listOf<String>("Name 1", "Name 2", "Name 3")

    //Listas mutables podemos agregar o eliminar elemnetos

    val names2 = mutableListOf("Name 1", "Name 2", "Name 3")

    names2.add("Name 4")
    names2.removeAt(0) //elimina el primer elemento
    names2.remove("Name 3")

    //names2.forEach { println(it) }

    //Set es una colección que almacena elementos unicos,es decir no acepta duplicados
    //Set inmutable
    val names3 = setOf<String>("Name 1", "Name 2", "Name 3", "Name 1")

    //names3.forEach { println(it) }
    //Set mutable
    //val names4 = mutableSetOf<String>("Name 1", "Name 2", "Name 3", "Name 1")
    val user1 = User("Name 1")
    val user2 = User("Name 2")
    val user3 = User("Name 3")
    val user4 = User("Name 4")
    val user5 = User("Name 5")
    val user6 = User("Alex")
    val user7 = User("Alex")

    val usuarios = mutableSetOf<User>(user1, user2, user3, user4, user5, user6, user7)
    /*nota:Para determinar si existen duplicados set utiliza la funcion "equals to" , cuando el tipo es solo String
    utiliza está función para determinar si hay strings duplicados, pero como nuestra clase User no tiene la
    función "equals to" no puede determinar correcamente si son iguales para cambiar eso agregarmos data a la clase
    ejemplo: data class User(val name: String)*/

    //usuarios.forEach { println(it.name) }

    //Mapas inmutables
    val usuarios2 = mapOf<Int, String>(1 to "Maria", 2 to "Pedro", 3 to "Juan", 4 to "Luis")
    //println(usuarios2[2]) // imprime Pedro

    val usuarios3 = mutableMapOf<Int, String>(1 to "Maria", 2 to "Pedro", 3 to "Juan", 4 to "Luis")
    usuarios3[5] = "Sara"
    usuarios3.remove(2)
    usuarios3.forEach { t, u -> println("$t and $u") }


}

//class User(val name: String)
data class User(val name: String)