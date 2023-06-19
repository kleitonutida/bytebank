# Escrevendo código mais idiomático ao Kotlin

## Getters e Setters

Por padrão, os getters e setters de um atributo de uma classe não precisa ser definido. Ele já vem definido os valores
padrões para retornar o valor do atributo e para alterar o valor do atributo.

Mas essas propriedades podem ser modificadas conforme a necessidade, sendo possível sobreescrever o comportamento
padrão.

O comportamento padrão de um getter e setter é definido da seguinte forma, sendo que para acessar o valor em cada um
deve ser utilizado a palavra-chave `field`.

```kotlin
class Conta {
    var saldo = 0.0
        set(valor) {
            field = valor
        }
        get() {
            return field
        }
}
```

Caso não haja a necessidade de se alterar o comportamento, mas de restringir o seu acesso. Pode ser utilizado o
modificador de acesso especificamente para o getter ou setter.

```kotlin
class Conta {
    var saldo = 0.0
        private set
}

```

## Construtor

No Kotlin, existe duas formas de se declarar um construtor. O construtor primário que é informado diretamente na
declaração da classe e o construtor secundário que é informado no corpo da classe.

Exemplo de construtor primário.

```kotlin
class Conta(
    var titular: String,
    var numero: Int,
) {
    var saldo = 0.0
        private set
}
```

Exemplo de construtor secundário.

```kotlin
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }
}
```

## Labels (Argumentos Nomeados)

No Kotlin, é possível fazer o uso de *labels* para identificar um parâmetro durante a chamada de um método ou
construtor. Isso facilita que não é necessário enviar os parâmetros na ordem definida e fica mais legível a sua leitura.

Contanto, se na chamada for enviado uma única label, os demais parâmetros devem seguir o mesmo padrão.

```kotlin
val contaAlex = Conta(titular = "Alex", numero = 1000)
```
