fun main(){
    println("Hello world!")

    //variables
    //val para declarar constantes (solo lectura)
    //var para variables
    val pi = 3.14
    var x = 34

    println(pi)
    x = 24
    x = x + 1
    x++
    x--
    x += 10
    x -= 2
    x *= 2
    x /= 5
    println(x)

    val name = "Frank"
    val lastName: String = "Lopez"
    val fullName = firstName + " " + lastName

    println(fullName)

    val age: Int = 39
    val height: Double = 1.68

    var start = 10

    //String Templates
    //$ para imprimir variables
    //${} para procesar antes de imprimir

    println("I'm $age years old")
    println("I'm $height de altura")
    println("Obtendre un ${ start + 10} estrellas")
}