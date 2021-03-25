package banco.digital

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "$nome - $numero"
}
