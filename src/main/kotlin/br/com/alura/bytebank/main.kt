package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

//    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".uppercase()
        }
        .let(::println)

    with(Endereco(logradouro = "Rua São Bento", numero = 123)) {
        "$logradouro, $numero".uppercase()
    }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))

    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}