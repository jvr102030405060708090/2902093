 // se refiere principalmente a cómo se manejan los valores que pueden ser nulos 

var nombre: String? = null

val longitud: Int? = nombre?.length

val longitudOValorPredeterminado = nombre?.length ?: -1
nombre?.let {
    println("El nombre no es nulo: $it")
}
