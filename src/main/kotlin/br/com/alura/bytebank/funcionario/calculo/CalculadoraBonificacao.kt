package br.com.alura.bytebank.funcionario.calculo

import br.com.alura.bytebank.funcionario.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}
