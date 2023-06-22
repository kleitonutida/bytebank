package br.com.alura.bytebank.teste

import br.com.alura.bytebank.conta.ContaCorrente
import br.com.alura.bytebank.conta.ContaPoupanca

fun main() {
    testaCopiasEReferencias()
}

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

    var contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}
