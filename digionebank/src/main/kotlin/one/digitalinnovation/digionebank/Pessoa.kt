package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "marcio"
    var cpf: String = "012.345.678-910"
}
fun main(){
    val marcio = Pessoa()//extanciando pessoa
    println(marcio.nome)
    println(marcio.cpf)
}