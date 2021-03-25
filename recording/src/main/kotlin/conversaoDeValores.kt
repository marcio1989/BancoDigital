import java.lang.Exception
import java.lang.NumberFormatException

fun main(){
    try {
        println("kdfd".toInt())
    }catch (e: NumberFormatException){
        println("Esse valor não é número!")
    }
    catch (e: Exception){
        println("Algo deu errado!")
    }finally {
        println("qfh5h32")
        println("QFA5H32")
    }

}