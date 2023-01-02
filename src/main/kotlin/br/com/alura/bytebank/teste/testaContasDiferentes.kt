package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1000,
            endereco = Endereco(logradouro = "Rua Vergueiro")
        ),
        numero = 1000
    )

    println("Titular")
    println("Nome do Titular: ${contaCorrente.titular.nome}")
    println("CPF do Titular: ${contaCorrente.titular.cpf}")
    println("Endereço do Titular: ${contaCorrente.titular.endereco.logradouro}")
    println()

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "222.222.222-22",
            senha = 2000
        ),
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Gui",
            cpf = "333.333.333-33",
            senha = 3000
        ),
        numero = 3000
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)
    contaSalario.deposita(valor = 1000.0)

    println("Saldo Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo Conta Salário: ${contaSalario.saldo}")
    println()

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)
    contaSalario.saca(valor = 50.0)

    println("Saldo após saque Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo após saque Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo após saque Conta Salário: ${contaSalario.saldo}")
    println()

    contaCorrente.transfere(valor = 100.0, contaPoupanca)

    println("Saldo Conta Corrente após transferir para Conta Poupança: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após receber transferência: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(valor = 200.0, contaCorrente)

    println("Saldo Conta Poupança após transferir para Conta Corrente: ${contaPoupanca.saldo}")
    println("Saldo Conta Corrente após receber transferência: ${contaCorrente.saldo}")
    println()

    contaCorrente.transfere(valor = 100.0, contaSalario)

    println("Saldo Conta Corrente após transferir para Conta Salário: ${contaCorrente.saldo}")
    println("Saldo Conta Salário após receber transferência: ${contaSalario.saldo}")
    println()

    contaPoupanca.transfere(valor = 200.0, contaSalario)

    println("Saldo Conta Poupança após transferir para Conta Salário: ${contaPoupanca.saldo}")
    println("Saldo Conta Salário após receber transferência: ${contaSalario.saldo}")
    println()

//    contaSalario.transfere(valor = 100.0, contaPoupanca)
//    contaSalario.transfere(valor = 200.0, contaCorrente)
}
