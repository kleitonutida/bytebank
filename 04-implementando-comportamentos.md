# Implementando comportamentos

Ao trabalhar com as classes, a boa prática de orientação a objetos é que qualquer comportamento que ajuste o estado da
classe (modifique os atributos), deve ser implementado pela própria classe. Sendo que qualquer alteração em algum
comportamento seja realizado de maneira centralizada.

No seguinte exemplo, a classe tem dois comportamentos que afetam o saldo da conta. Em um caso o saldo somado e em outro
caso o saldo será subtraído, sendo que ele não pode maior que o saldo restante.

```kotlin
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
```

# Retorno de uma função

O retorno de uma função, por padrão é do tipo `Unit`, neste caso não precisa ser informado. Caso seja necessário
informar o tipo de retorno, é necessário utilizar o `:` e informar qual o tipo de retorno desejado.

```kotlin
fun transfere(valor: Double, destino: Conta): Boolean {
    if (this.saldo >= valor) {
        this.saldo -= valor
        destino.saldo += valor
        return true
    }
    return false
}
```

# Encapsulamento

Na orientação utilizamos o encapsulamento para restringir a manipulação direta dos atributos. Isso faz com que apenas a
classe seja capaz de modificar o valor e somos capaz também de adicionar trechos de código antes ou após inicialização
do atributo.

```kotlin

```

# Modificadores de acesso

Os modificadores de acesso ou modificadores de visibilidade são responsáveis por tratar o acesso a um determinado
atributo de uma classe. Com ele conseguimos restingir o acesso a um determinado atributo ou classe. 

```kotlin

```
