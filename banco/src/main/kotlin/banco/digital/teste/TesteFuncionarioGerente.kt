package banco.digital.teste

import banco.digital.Analista
import banco.digital.Funcionario
import banco.digital.Gerente

fun main(){
    val maria = Gerente(
        nome = "Maria do Carmo",
        cpf = "123456789",
        salario = 5000.0,
        senha = "senha123",
    )
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}
