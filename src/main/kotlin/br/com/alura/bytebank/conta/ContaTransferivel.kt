package br.com.alura.bytebank.conta

abstract class ContaTransferivel(
    titular: String,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
) {
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
