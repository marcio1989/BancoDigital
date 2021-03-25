package banco.digital.teste

import banco.digital.Analista
import banco.digital.Funcionario
import banco.digital.Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Analista(nome = "João Pedro", cpf = "123456789", salario = 2000.0)
    println(joao.salario)
    ImprimeRelatorioFuncionario.imprime(joao)
}
