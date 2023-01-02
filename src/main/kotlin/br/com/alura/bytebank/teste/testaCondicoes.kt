package br.com.alura.bytebank.teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Saldo é positivo")
    } else if (saldo == 0.0) {
        println("Saldo é neutro")
    } else {
        println("Saldo é negativo")
    }

    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("Saldo é neutro")
        else -> println("Saldo é negativo")
    }
}