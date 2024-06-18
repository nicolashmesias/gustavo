fun main() {
println (condIf())
println (condWhen())
println (condWhenc())
}

fun condIf (){

        val trafficLightColor = "Black"
        val message =
            if (trafficLightColor == "Red")"Stop"
            else if (trafficLightColor == "Yellow") "Slow"
            else if (trafficLightColor == "Green") "Go"
            else "Invalid traffic-light color"
        println (message)

}
fun condWhen (){
        val trafficLightColor = "Amber"

        val message = when(trafficLightColor) {
            "Red" -> "Stop"
            "Yellow", "Amber" -> "Proceed with caution."
            "Green" -> "Go"
            else -> "Invalid traffic-light color"
        }
        println(message)
}
fun condWhenc(){

        val x: Any = 20
        when (x){
            2, 3, 5, 7 -> println ("x is a prime number between 1 and 10.")
            in 1..10 -> println("x is a number between 1 and 10 but not a prime number.")
            is Int -> println ("x is a integer number, but not between 1 and 10.")
            else -> println ("x isn´t a integer number.")
        }
}
