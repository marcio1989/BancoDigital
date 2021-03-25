package banco.digital

import java.math.BigDecimal

class Conta (//isso e um tipo de construtor primario. coloca ()antes das {}
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
){
    fun deposito(valor: BigDecimal){
    }
    fun saque(valor: BigDecimal){
    }
}
