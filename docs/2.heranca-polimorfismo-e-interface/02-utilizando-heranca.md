# Utilizando herança

## Herança

A herança é o processo de relacionar uma nova classe a uma classe existente, é utilizado quando existem membros em comum
entre as classes. Isso evita a réplica de código que existe em outra classe.

A herança permite que uma classe herde características (propriedades e métodos) de outra classe, possibilitando a
reutilização de código. A classe que herda é chamada de subclasse ou classe derivada, e a classe da qual ela herda é
chamada de superclasse ou classe base.

Um dos principais benefícios da herança é evitar a duplicação de código. Quando várias classes compartilham
características semelhantes, podemos colocar essas características comuns em uma classe base e fazer com que as outras
classes herdem essa base.

```kotlin
open class Funcionário(val nome: String, val salário: Double)

class Gerente(nome: String, salário: Double, val departamento: String) : Funcionário(nome, salário)

class Diretor(nome: String, salário: Double, val áreaResponsável: String) : Funcionário(nome, salário)
```

É possível sobrescrever um comportamento herdado da classe base na classe derivada. Isso permite que a classe derivada
forneça uma implementação personalizada para o comportamento, substituindo a implementação herdada da classe base.

```kotlin
open class Animal {
    open fun fazerBarulho() {
        println("O animal faz algum barulho.")
    }
}

class Cachorro : Animal() {
    override fun fazerBarulho() {
        println("O cachorro faz 'au au'!")
    }
}
```

Para sobrescrever um método da classe base, é necessário que a classe e o método a ser sobrescrito sejam declarados com
a palavra-chave `open`. Isso permite que sejam substituídos por classes derivadas.

Na classe derivava, declare o método que irá sobrescrever o método da classe base usando a palavra-chave `override`.
Isso indica que você está substituindo a implementação herdada.

Outro ponto da herança é a possibilidade de chamar o método da classe base dentro da implementação sobrescrita usando a
palavra-chave `super` seguida do nome do método.

```kotlin
class ClasseDerivada : ClasseBase() {
    override fun métodoASobrescrever() {
        super.métodoASobrescrever() // Chamando o método da classe base
        // Implementação adicional na classe derivada
    }
}
```

Um outro ponto a se considerar é que a visibilidade do método da classe derivada não pode ser mais restrita do que na
classe base. Por exemplo, se o método na classe base for declarado como `protected`, ele não pode ser sobrescrito
como `private` na classe derivada.
