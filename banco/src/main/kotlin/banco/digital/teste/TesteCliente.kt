package banco.digital.teste

import banco.digital.Cliente
import banco.digital.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da silva",
        cpf = "123.123.123",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}