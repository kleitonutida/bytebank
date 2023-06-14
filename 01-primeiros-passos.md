# Declaração de variáveis

A declaração de variáveis em Kotlin pode ser feita utilizando a palavra reservada `var` ou `val`.

Quando se utiliza o `var`, será criado uma variável que pode ter o seu valor modificado, ou seja, uma variável mutável.

```kotlin
var saldo = 0.0
saldo = 100.0
```

Já quando se utiliza o `val`, será criado uma constante que pode não pode ter o seu valor modificado após ser criada, ou
seja, ela é imutável.

```kotlin
val titular = "Alex"
val numeroConta = 1000
```

# Tipos de variáveis

No Kotlin, as variáveis são fortemente tipadas, ou seja, ao serem declaras elas irão possuir um tipo até o fim.

As variáveis quando declaradas, quando recebem um valor automaticamente o Kotlin irá por inferência determinar o tipo da
variável.

```kotlin
val titular: String = "Alex" // String
val numeroConta: Int = 1000 // Int
var saldo = 0.0 // Double
```

Não é possível atribuir um valor a uma variável que não seja compatível com tipo definido. A não ser que esteja
realizando alguma operação.

```kotlin
var saldo = 0.0 // Declaração da variável atribuindo o valor 0.0
saldo = 100 + 2.0 // Soma de 200 + 2.0
saldo += 200 // Operação de soma do valor 200 a própria variável, ou seja, igual a saldo = saldo + 200
```
