# Reutilizando código com polimorfismo

O polimorfismo nos permite que objetos diferentes sejam tratados de maneira uniforme, ou seja, um objeto pode ser
referenciado por um tipo mais genérico.

Como benefícios do polimorfismo, temos:

1. Reutilização de código: O polimorfismo permite a criação de uma classe base que define comportamentos genéricos e que
   podem ser herdados por classes derivadas. Isso faz com que seja possível reutilizar o código, uma vez que classes
   derivadas podem herdar e estender a funcionalidade da classe base.
2. Flexibilidade e extensibilidade: O polimorfismo permite que se escreva código flexível e extensível, pois você pode
   tratar objetos de diferentes classes de forma uniforme, facilitando a adição de novas classes e comportamentos sem
   alterar o código existente.
3. Substituição de métodos: O polimorfismo permite a substituição de métodos em classes derivadas, o que permite que
   cada classe implemente comportamentos específicos de acordo com suas necessidades. Isso facilita a especialização das
   funcionalidades em classes derivadas.

Como desvantagens, temos:

1. Complexidade: O polimorfismo pode aumentar a complexidade do código, tornando-o mais difícil de entender e dar
   manutenção. Quando vários objetos de classes diferentes são tratados de forma uniforme, é necessário estender a
   hierarquia de classes e seus comportamentos específicos.
2. Desempenho: Em certos casos, o uso excessivo de polimorfismo pode afetar o desempenho do programa, já que a seleção
   do método adequado durante a execução é determinada em tempo de execução. Esse processo de resolução de métodos pode
   introduzir uma pequena sobrecarga em comparação com a chamada direta de métodos.

```kotlin
// Classe Conta
open class Conta(
    var titular: String,
    val numero: Int,
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

// Classe Conta Corrente que herda de Conta e que sobreescreve o comportamento da função saca
class ContaCorrente(
    titular: String,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saca(valorComTaxa)
    }
}

// Classe Conta Poupança que herda de Conta e possui os mesmos comportamentos
class ContaPoupanca(
    titular: String,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
)

```
