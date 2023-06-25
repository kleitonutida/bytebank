package br.com.alura.bytebank.teste

import br.com.alura.bytebank.conta.ContaCorrente
import br.com.alura.bytebank.conta.ContaPoupanca
import br.com.alura.bytebank.conta.ContaSalario

fun main() {
    testaContasDiferentes()
}

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000,
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001,
    )

    val contaSalario = ContaSalario(
        titular = "Gui",
        numero = 1002,
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")
    println("saldo após saque salário: ${contaSalario.saldo}")

    contaCorrente.transfere(destino = contaPoupanca, valor = 100.0)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(destino = contaCorrente, valor = 100.0)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")

    contaCorrente.transfere(destino = contaSalario, valor = 100.0)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(destino = contaSalario, valor = 100.0)

    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

//    contaSalario.transfere(200.0, contaCorrente)
//    contaSalario.transfere(200.0, contaPoupanca)
}
