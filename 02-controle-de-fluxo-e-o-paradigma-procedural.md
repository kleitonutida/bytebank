# Estruturas de controle

No Kotlin, assim como em outras liguagens de programação, existem as estruturas de controle que são utilizadas para
realizar uma determinada tarefa dada uma determinada condição ou realizar uma determinada tarefa uma quantidade de vezes
informada.

## IF

O `if` é utilizado para executar uma determinada tarefa dada uma condição.

```kotlin
if (saldo > 0.0) { // Condição será executada se o valor for maior que zero
    println("conta é positiva")
} else if (saldo == 0.0) { // Condição será executada se o valor for igual a zero
    println("conta é neutra")
} else { // Condição será executada se o valor for maior for menor que zero
    println("conta é negativa")
}
```

# WHEN

O `when`, da mesma forma que o `if`, pode ser utilizado para executar uma determinada tarefa dada uma condição
informada, só que de uma forma declarada de uma forma mais sucinta (bem parecido com o switch-case de outras
linguagens).

No caso, a condição é definida antes do `->` e após ele é definido o que será executado. Caso a execução seja um
instrução simples, não é necessário colocar entre chaves.

```kotlin
when {
    saldo > 0.0 -> println("conta é positiva")
    saldo == 0.0 -> println("conta é neutra")
    else -> println("conta é negativa")
}
```