fun main() {
    val frase = "Kotlin é uma linguagem"
    val caracteristica = " show!"

    println("Kotlin é uma linguagem $caracteristica")

    val str = """marcio ricardo de oliveira muniz
        |magno roberto de oliveira muniz
        |joão paulo albuquerque moura
        |suzana albuquerque moura
        |marcia regina de oliveira muniz
        |meriele roberta de oliveira muniz
    """.trimMargin()
    println(str)

    val valor = 10
    val stre = if (valor == 10) "sim" else "nao"

    val str1 = "Marcio Ricardo"
    for (c in str1){
        print("$c ")
    }
}