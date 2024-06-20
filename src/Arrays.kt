fun main (args: Array<String>){
    val weekDays = arrayOf("Lunes","martes","miercoles","jueves","viernes","sabado","domingo")
    for ((p,v) in weekDays.withIndex()){
        println("La posición $p contiene el valor $v" )
    }
    for (weekDays in weekDays){
        println(weekDays)
    }
}
