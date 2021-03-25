package banco.digital.teste

import banco.digital.Banco

fun main(){
    val bancoDigital = Banco(nome = "BancoDigitalSkyBlue", numero = 12)
    println(bancoDigital.nome)
    println(bancoDigital.numero)

    val bancoDigital2 = bancoDigital.copy(nome = "BancoDigitalSkyRed")//copia o banco apenas com nome diferente mas o mesmo numero
    println(bancoDigital2.info())
}