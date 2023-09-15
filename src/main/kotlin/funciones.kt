fun main(){
    println("Hello")
    sayHello()
    sayHelloTo(name: "peter")
    sayHelloToFrom(name: "Bruce Wayne", city: "Gotham city")
    println("El doble de 25 es ${ duplicate(25)}")
    val result = divide(99, 15.0)
    println("El resultado de 99 / 15 es $result")
    print(fullName("John", "Snow"))

    welcomeToMexico()
    welcomeToMexico(name:"Spiderman")

    sayHelloToFrom(name: "Superman", city: "Metropolis")
    sayHelloToFrom(city: "Namekusei", name: "pikoro")

}

//funciones sin parametros y sin retorno functions without params and without return
fun sayHello(){
    println("hello!")
}

//functions without params and without return
fun sayHelloTo(name: String){
    println("Hello $name")
    println("welcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name: from $city")
}

//functions without params and without return
//we must specify the datatype
fun duplicate(num: int): int {
    return num * 2
}

fun divide(num1: int, num2: Double): Double {
    return num1 / num2
}

fun fullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

//Function with optional params
fun welcomeToMexico = (name: String = "Invitado"): unit{
    println("Welcome to Mexico $name")
}