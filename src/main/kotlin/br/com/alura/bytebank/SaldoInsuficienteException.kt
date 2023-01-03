package br.com.alura.bytebank

class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)