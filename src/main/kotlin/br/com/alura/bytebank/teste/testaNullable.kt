package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "Prédio")
    var logradouro: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        var tamanhoComplemento =
            it.complemento?.length ?: throw IllegalArgumentException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    testeCastSafety(1)
    testeCastSafety("")
}

fun testeCastSafety(valor: Any) {
    var valorConvertido: Int? = valor as? Int
    println(valorConvertido)
}