package br.com.alura.bytebank.sistema

import br.com.alura.bytebank.funcionario.FuncionarioAdmin

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}
