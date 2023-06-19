# Criando novas classes

Ao se construir um projeto onde se tenha uma complexidade grande e que utilize muitas classes, o ideal é que seja feita
a segregação de cada uma das funcionalidade em classes distintas e que determinadas classes sejam especializadas e que
possuam compartamentos específicos.

Exemplo ao se criar um classe funcionário.

```kotlin
class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    fun bonificacao(): Double {
        return salario * 0.1
    }
}
```

Mas, ao criar quando se tem um cargo mais específico com compartamento distinto, o ideal é que se crie uma classe para
isso.

```kotlin
class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int,
) {
    fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
```

Há outras estratégias que podem ser adotadas para minimizar a duplicidade de código e atributos que serão vistos mais a
frente.
