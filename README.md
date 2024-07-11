
//una variable se define utilizando la palabra clave (var) para variables mutables o (val) para variables inmutables.

var miVariableMutable: String = "Hola, mundo!"
miVariableMutable = "¡Hola, Kotlin!"

val miVariableInmutable: Int = 42


//Deben ser propiedades de nivel superior o miembros de un objeto companion.
El tipo de dato de la constante debe ser primitivo (como Int, Double, String, etc.) o un tipo de dato que cumpla con ciertas condiciones para ser considerado constante.


const val PI = 3.14159


 // se refiere principalmente a cómo se manejan los valores que pueden ser nulos 

var nombre: String? = null

val longitud: Int? = nombre?.length

val longitudOValorPredeterminado = nombre?.length ?: -1
nombre?.let {
    println("El nombre no es nulo: $it")
}


//El manejo de valores nulos (null) es un aspecto crucial del lenguaje que ayuda a evitar errores comunes como las NullPointerException

var nombre: String? = null
