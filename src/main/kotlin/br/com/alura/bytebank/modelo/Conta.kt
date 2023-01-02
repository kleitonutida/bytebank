package br.com.alura.bytebank.modelo

abstract class Conta(
    val numero: Int
) {
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
    val titular: Cliente,
    numero: Int
) : ContaTransferivel(
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
    val titular: Cliente,
    numero: Int
) : ContaTransferivel(
    numero = numero
) {
    override fun saca(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
    }
}