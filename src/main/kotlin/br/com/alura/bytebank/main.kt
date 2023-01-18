package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val testaFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testaRecebeString)
    1.let {
        it
    }

    teste(1, {})
}

fun testaRecebeString(valor: String) {

}

// High order function
fun teste(teste: Int, bloco: () -> Unit) {

}