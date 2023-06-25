package br.com.alura.bytebank.conta

abstract class Conta(
    var titular: String,
    val numero: Int,
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

//    fun getSaldo(): Double {
//        return this.saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > this.saldo) {
//            this.saldo += valor
//        }
//    }
}
