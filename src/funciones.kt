fun main (){
    println (birthdayGreeting(age = 24 ))
    println (birthdayGreeting(age = 35))
}
fun birthdayGreeting (name: String = "rover" , age: Int): String {
    val nameGreeting ="feliz cumpleaños, $name"
    val dateGreeting = "tienes ahora $age años"
    return "$nameGreeting\n$dateGreeting"
}