fun main() {

        val coche = Coche(5)
        val motocicleta = Motocicleta(2)

        with(coche) {
            println("\nCoche\n=====")
            println("Capacidad: ${capacidad}")
            println("Material: ${material}")
            println("Eficiencia de combustible: ${eficienciaCombustible()} km/l")
        }

        with(motocicleta) {
            println("\nMotocicleta\n===========")
            println("Capacidad: ${capacidad}")
            println("Material: ${material}")
            println("Eficiencia de combustible: ${eficienciaCombustible()} km/l")
            println("¿Tiene espacio? ${tieneEspacio()}")
            obtenerEspacio()
            println("¿Tiene espacio? ${tieneEspacio()}")
            obtenerEspacio()
        }
    }

    abstract class Vehiculo(private var asientos: Int) {
        abstract val material: String
        abstract val capacidad: Int

        abstract fun eficienciaCombustible(): Double

        fun tieneEspacio(): Boolean {
            return asientos < capacidad
        }

        fun obtenerEspacio() {
            if (capacidad > asientos) {
                asientos++
                println("¡Conseguiste un asiento!")
            } else {
                println("Lo siento, estamos al máximo de capacidad y no quedan asientos.")
            }
        }
    }

    class Coche(asientos: Int) : Vehiculo(asientos) {
        override val material = "Acero"
        override val capacidad = 5

        override fun eficienciaCombustible(): Double {
            return 15.0
        }
    }

    class Motocicleta(asientos: Int) : Vehiculo(asientos) {
        override val material = "Aluminio"
        override val capacidad = 2

        override fun eficienciaCombustible(): Double {
            return 25.0
        }


}