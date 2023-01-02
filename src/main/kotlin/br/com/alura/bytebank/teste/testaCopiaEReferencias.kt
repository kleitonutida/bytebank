package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY = 11
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    var contaJoao = ContaCorrente(
        Cliente(
            nome = "João",
            cpf = "111.111.111-11",
            senha = 1234
        ), numero = 1002
    )
    contaJoao.titular.nome = "João"

    var contaMaria = ContaPoupanca(
        Cliente(
            nome = "Maria",
            cpf = "222.222.222-22",
            senha = 1234
        ), numero = 1003
    )
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("Titular conta João: ${contaJoao.titular.nome}")
    println("Titular conta Maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}