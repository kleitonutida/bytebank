# Implementando classes e membros abstratos

O uso do `abstract` em uma classe, faz com que ela não possa ser instanciada, mas que pode ser uma classe base para
outras classes. Isso permite a criação de hierarquias de classes e a definição de comportamentos básicos que devem ser
estendidos e implementados por classes derivadas.

Ao declarar uma função como `abstract`, está sendo exigido que as classes derivadas forneçam uma implementação para essa
função. Isso garante que determinados métodos sejam implementados por todas as classes que herdam da classe abstrata.

Assim como em qualquer classe herdada, existe a restrição de que uma classe só pode herdar de uma única classe abstrata.
E ao usar classes abstratas, há um certo grau de acoplamento entre a classe base abstrata e suas subclasses. Isso pode
tornar o código mais rígido e difícil de modificar, especialmente quando há uma mudança na estrutura da hierarquia de
classes.

Exemplo de classe abstrata com funções abstratas e funções implementadas.

```kotlin
// Classe abstrata Conta
abstract class Conta(
    var titular: String,
    val numero: Int,
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

// Classe ContaCorrente
class ContaCorrente(
    titular: String,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

```

No caso do `saldo`, foi utilizado o `protected` no `set`, isso porque este modificador permite que os membros de uma
classe sejam acessados por suas subclasses. Isso protege o acesso aos membros internos da classe, garantindo que somente
as subclasses possam manipulá-los.
