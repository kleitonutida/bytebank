package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco: Any = Endereco(logradouro = "Rua Vergueiro", bairro = "Vila Mariana")
    val novoEndereco = Endereco(numero = 10000, complemento = "Alura")

    println(endereco.equals(endereco))
    println(endereco.equals(novoEndereco))

    println(endereco.toString())
    println(novoEndereco.toString())

    println(endereco.hashCode())
    println(novoEndereco.hashCode())
}