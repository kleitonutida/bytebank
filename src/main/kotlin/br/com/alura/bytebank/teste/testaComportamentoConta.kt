package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentoConta() {
    val clienteJoao = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1000)
    val contaAlex = ContaCorrente(titular = clienteJoao, numero = 1000)
    contaAlex.deposita(valor = 200.0)

    val contaFran = ContaPoupanca(numero = 1001, titular = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 2000))
    contaFran.deposita(valor = 300.0)

    println("Titular: ${contaAlex.titular.nome}")
    println("Número Conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println()

    println("Titular: ${contaFran.titular.nome}")
    println("Número Conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
    println()

    println("Depositando na conta da ${contaAlex.titular.nome}")
    contaAlex.deposita(valor = 100.0)
    println("Saldo da conta do ${contaAlex.titular.nome} é: ${contaAlex.saldo}")
    println()

    println("Depositando na conta da ${contaFran.titular.nome}")
    contaFran.deposita(valor = 70.0)
    println("Saldo da conta da ${contaFran.titular.nome} é: ${contaFran.saldo}")
    println()

    println("Saque na conta do ${contaAlex.titular.nome}")
    contaAlex.saca(valor = 250.0)
    println("Saldo da conta do ${contaAlex.titular.nome} é: ${contaAlex.saldo}")
    println()

    println("Saque na conta da ${contaFran.titular.nome}")
    contaFran.saca(valor = 100.0)
    println("Saldo da conta da ${contaFran.titular.nome} é: ${contaFran.saldo}")
    println()

    println("Saque em excesso na conta do ${contaAlex.titular.nome}")
    contaAlex.saca(valor = 100.0)
    println("Saldo da conta do ${contaAlex.titular.nome} é: ${contaAlex.saldo}")
    println()

    println("Saque em excesso na conta da ${contaFran.titular.nome}")
    contaFran.saca(valor = 500.0)
    println("Saldo da conta da ${contaFran.titular.nome} é: ${contaFran.saldo}")
    println()

    println("Transferência da conta da ${contaFran.titular.nome} para o ${contaAlex.titular.nome}")
    if (contaFran.transfere(destino = contaAlex, valor = 100.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println("Saldo da conta do ${contaAlex.titular.nome} é: ${contaAlex.saldo}")
    println("Saldo da conta da ${contaFran.titular.nome} é: ${contaFran.saldo}")
}