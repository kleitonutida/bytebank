package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: Exception) {
        e.printStackTrace()
        println("ClassCastException foi capturada.")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}
