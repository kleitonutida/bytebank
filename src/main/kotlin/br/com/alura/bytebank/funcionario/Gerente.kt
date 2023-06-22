package br.com.alura.bytebank.funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
) {
    override val bonificacao: Double
        get() = salario

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
