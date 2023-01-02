package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1234

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(fran, 1234)

    println("Nome do cliente: ${fran.nome}")
    println("CPF do cliente: ${fran.cpf}")

    val contaCorrente = ContaCorrente(titular = Cliente(nome = "Alex", cpf = "", senha = 1), numero = 1234)
    val contaPoupanca = ContaPoupanca(titular = Cliente(nome = "Alex", cpf = "", senha = 2), numero = 12345)

    println("Total de contas criadas: ${Conta.total}")
}
