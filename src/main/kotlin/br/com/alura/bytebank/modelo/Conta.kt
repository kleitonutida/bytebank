package br.com.alura.bytebank.modelo

abstract class Conta(
        val titular: Cliente,
        val numero: Int
) : Autenticavel by titular {
    companion object Contador {
        var total: Int = 0
            private set
    }

    init {
        println("Criando Conta")
        total++
    }

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
//        if (valor > 0) {
//            this.saldo += valor
//        }
//    }
}

class ContaCorrente(
        titular: Cliente,
        numero: Int
) : ContaTransferivel(
        titular = titular,
        numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (valorComTaxa <= this.saldo) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
        titular: Cliente,
        numero: Int
) : ContaTransferivel(
        titular = titular,
        numero = numero
) {
    override fun saca(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
    }
}