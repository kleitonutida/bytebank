package br.com.alura.bytebank.teste

fun main() {
    val teste = Teste()
    teste(10)
    val testeFuncao: () -> Unit = Teste()
    testeFuncao()
}

class Teste : () -> Unit {

    operator fun invoke(valor: Int){
        println(valor)
    }

    override fun invoke() {
        println("executa invoke do Teste")
    }
}