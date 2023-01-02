import javax.swing.text.Document

fun main() {
//    val endereco: Any = Endereco(logradouro = "Rua Vergueiro", bairro = "Vila Mariana")
//    val novoEndereco = Endereco(numero = 10000, complemento = "Alura")
//
//    println(endereco.equals(endereco))
//    println(endereco.equals(novoEndereco))
//
//    println(endereco.toString())
//    println(novoEndereco.toString())
//
//    println(endereco.hashCode())
//    println(novoEndereco.hashCode())

    val pessoa = Pessoa(nome="Alex", idade=30)
    val pessoa2 = Pessoa(nome="Alex", idade=30)

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