# Conhecendo a orientação a objetos

A orientação a objetos é um paradigma de programação que organiza o código em torno de objetos, que são instâncias de
classes. Os objetos são entidades que possuem características (atributos) e comportamentos (métodos). A ideia da
orientação a objetos é modelar o mundo real em termos de objetos, permitindo a representação e manipulação de conceitos
e entidades complexas de forma mais intuitiva e estruturada.

As principais características da orientação a objetos são:

1. Encapsulamento
2. Herança
3. Polimorfismo
4. Abstração
5. Associação

## Classe

As classes são utilizadas para criar representar um conjunto de informações especializadas que podem ser
reaproveitadas. As classes são objetos que podem ser instanciadas mais de uma vez, criando assim objetos diferentes.

```kotlin
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}
```

## Cópia e Referência

Quando se está trabalhando com os "`tipos primitivos`" ao realizar a criação de uma nova variável com a referência de
uma outra variável, será criado uma nova instância daquela variável, ou seja, o que for alterado em uma variável não
afetará a outra variável.

```kotlin
var numeroX = 10
var numeroY = numeroX
numeroY++
println(numeroX)
println(numeroY)
```

Já quando se está trabalhando com Objetos, ao instanciar uma variável, ela terá uma referência, mas se a próxima
variável receber a variável anterior, será feito um apontamento para a referência da variável anterior. Neste caso, tudo
o que for alterado em uma variável afetará a outra a não ser que uma delas receba uma nova instância.

```kotlin
var contaJoao = Conta()
contaJoao.titular = "João"
var contaMaria = contaJoao
contaMaria.titular = "Maria"

println("titular conta joao: ${contaJoao.titular}")
println("titular conta maria: ${contaMaria.titular}")
```
