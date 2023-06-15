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

# FOR

O operador `for` é utilizado para executar uma repetição em uma determinada coleção a um determinado número de vezes.

Este operador pode ser utilizado com alguns operadores como o range (`..`), o downTo e o step.

- `Range`: O operador range é representado pelos `..` e é utilizado para executar um determinado número vezes em um
  determinado intervalo, sendo que o incremento/decremento pode ser variável utilizando o operador `step`, por padrão o
  operador o incremento/decremento é de 1.
- `DownTo`: O `downTo` ao contrário do range é utilizado para executar a repetição em ordem decrescente ou ordem
  inversa. Ele também pode ser combinado com o `step`.
- `Step`: O `step` é utilizado para incrementar ou decrementar um valor variável dentro de um intervalo. Ele pode ser
  utilizado tanto com o operador `range` quanto com o operador `downTo`.

Dentro do laço for, também pode ser utilizado as palavras `break` e `continue` para para a execução ou para o valor seguinte
dentro da estrutura de repetição, respectivamente.

```kotlin
for (i in 1..5) {
    if (i == 4) break

    val titular: String = "Alex $i"
    val numeroConta: Int = 1000 + i
    var saldo = i + 10.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()
}

for (i in 5 downTo 1 step 2) {
    val titular: String = "Alex $i"
    val numeroConta: Int = 1000 + i
    var saldo = i + 10.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()
}
```

# WHILE

Da mesma forma que o `for`, o `while` é uma estrutura de repetição utilizada para executar uma determinada quantidade de
vezes uma intrução. A diferença é que ele necessita de uma condição inicial e que o controle de incremento ou decremento
seja feito manualmente.

As palavras `break` e `continue` funcionam no `while` do mesmo jeito que no `for`.

```kotlin
var i = 0

while (i < 5) {
    val titular: String = "Alex $i"
    val numeroConta: Int = 1000 + i
    var saldo = i + 10.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()

    i++
}
```
