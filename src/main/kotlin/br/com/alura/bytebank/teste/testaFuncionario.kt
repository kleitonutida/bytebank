package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaFuncionario() {
    val alex = Auxiliar(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 1500.0
    )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificações: ${calculadora.total}")
}