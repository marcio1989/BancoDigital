package banco.digital.teste

import banco.digital.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{//companio object método estatico via classe
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}