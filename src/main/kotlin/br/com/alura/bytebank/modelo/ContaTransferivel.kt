package br.com.alura.bytebank.modelo

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
        return false
    }
}