package br.com.alura.bytebank.cliente

import br.com.alura.bytebank.sistema.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
