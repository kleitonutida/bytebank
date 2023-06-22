package br.com.alura.bytebank.conta

class ContaPoupanca(
    titular: String,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
) {
    override fun saca(valor: Double) {
        if (this.saldo >= 0) {
            this.saldo -= valor
        }
    }
}
