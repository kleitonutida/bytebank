package br.com.alura.bytebank.teste

fun testaLacos() {
    for (i in 1 until 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

    var i = 0
    while (i < 5) {

        if (i == 2) {
            break
        }

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()

        i++
    }
}