package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.SaldoInsuficienteException

abstract class ContaTransferivel(
    numero: Int
) : Conta(
    numero = numero
) {
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (valor <= this.saldo) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        throw SaldoInsuficienteException()
    }
}