package br.com.alura.bytebank.teste

fun testDataClass() {
    val pessoa = Pessoa(nome = "Alex", idade = 30)
    val pessoa2 = Pessoa(nome = "Alex", idade = 30)

    println(pessoa.equals(pessoa2))

    val documento = Documento(rg = "11.111.111-1", cpf = "222.222.222-22")
    val documento2 = documento.copy(rg = "33.333.333-3")

    println(documento.equals(documento2))

    println(documento)
    println(documento2)

    val (rg, cpf) = documento
    println(rg)
    println(cpf)
}

class Pessoa(val nome: String, val idade: Int) {

    fun fala() {
        println("Emite som")
    }
}

data class Documento(val rg: String, val cpf: String)

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}