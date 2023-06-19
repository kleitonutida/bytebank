package br.com.alura.bytebank

fun main() {
    testaCopiasEReferencias()
}

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

    var contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}
