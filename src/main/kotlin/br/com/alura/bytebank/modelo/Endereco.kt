package br.com.alura.bytebank.modelo

class Endereco(
    val logradouro: String = "",
    val numero: Int = 0,
    val bairro: String = "",
    val cidade: String = "",
    val estado: String = "",
    val cep: String = "",
    val complemento: String? = null
){
    override fun toString(): String {
        return """Endereco(logradouro='$logradouro', 
                  |        numero=$numero, 
                  |        bairro='$bairro', 
                  |        cidade='$cidade', 
                  |        estado='$estado', 
                  |        cep='$cep', 
                  |        complemento='$complemento')""".trimMargin()
    }
}
