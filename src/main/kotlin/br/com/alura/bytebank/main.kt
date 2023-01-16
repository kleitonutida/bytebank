package br.com.alura.bytebank

fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    // Com as funções lambda e anônimas não é possível reaproveitar da mesma forma que utilizando classes ou referências

//    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

//    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (a: Int, b: Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    // Os parâmetros devem ser informados apenas ao invocar a chamada do método, pois ele faz o uso do lazy evaluation
    println(minhaFuncaoClasse(10, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}
