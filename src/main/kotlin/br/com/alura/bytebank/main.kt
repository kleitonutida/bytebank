package br.com.alura.bytebank

fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    // Com as funções lambda e anônimas não é possível reaproveitar da mesma forma que utilizando classes ou referências

    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como Lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como Anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste() {
    println("Executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
    }
}
