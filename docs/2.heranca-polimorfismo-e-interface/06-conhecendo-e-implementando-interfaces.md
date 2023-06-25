# Conhecendo e implementando interfaces

Interface é uma estrutura que define um conjunto de métodos e propriedades que uma pode implementar. Uma interface
específica um contrato que a classe que a implementa deve cumprir, ou seja, quais métodos e propriedades ela deve
fornecer. As interfaces permitem a implementação de múltiplos contratos em uma única classe e fornecem um mecanismo
poderoso para alcançar a abstração e a herança múltipla.

Características das interfaces:

1. Métodos abstratos: As interfaces podem conter métodos abstratos, que são apenas declarações de métodos sem
   implementação. Uma classe que implementa um interface precisa fornecer uma implementação para todos os métodos
   abstratos definidos na interface.
2. Propriedades: As interfaces também podem definir propriedades, que são acessadas e manipuladas de forma semelhante às
   propriedades de uma classe. No entanto, as propriedades em interfaces não possuem campos de armazenamento e devem ser
   implementadas pelas classes que as implementam.
3. Implementação múltipla: Uma classe pode implementar várias interfaces, permitindo que ela adquira comportamentos e
   contratos de várias fontes diferentes.
4. Valores padrão: As interfaces podem fornecer valores padrão para os métodos, o que significa que uma classe que
   implementa a interface pode optar por não fornecer uma implementação específica para um determinado método. Isso
   permite que as classes implementadoras tenham flexibilidade em relação aos métodos que desejam implementar
   explicitamente.

Exemplo de criação e uso de uma interface:

```kotlin
// Interface Autenticavel
interface Autenticavel {
    fun autentica(senha: Int): Boolean
}

// Classe abstrata FuncionarioAdmin que implementa a interface Autenticavel, neste caso é obrigatório marcar que a
// função autentica será implementada através da palavra override
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
),
    Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
```

Exemplo de implementação separa de uma interface:

```kotlin
// Interface Autenticavel
interface Autenticavel {
    fun autentica(senha: Int): Boolean
}

// Classe Gerente que implementa a interface Autenticavel, neste caso não é obrigatório implementar a função autentica 
// já que ela está sendo implementada pela classe FuncionarioAdmin 
class Gerente(
   nome: String,
   cpf: String,
   salario: Double,
   senha: Int,
) : FuncionarioAdmin(
   nome = nome,
   cpf = cpf,
   salario = salario,
   senha = senha,
),
   Autenticavel {

   override val bonificacao: Double
      get() = salario
}

// Classe Cliente que implementa a interface Autenticavel, ela não pode herdar de FuncionarioAdmin, por isso que deve
// ser implementado a forma como que o cliente realizará a autenticação
class Cliente(
   val nome: String,
   val cpf: String,
   val senha: Int,
) : Autenticavel {
   override fun autentica(senha: Int): Boolean {
      if (this.senha == senha) {
         return true
      }
      return false
   }
}
```

Exemplo de interface com implementação padrão e múltiplas implementações de método:

```kotlin
// Interface Autenticavel com implementação padrão da forma de autenticação, essa função será refletida para todas
// classes que implementarem esta interface.
// Um dos pontos a se considerar, é que na interface o atributo é automaticamente público, caso seja necessário
// restringir o seu acesso, não será possível  
interface Autenticavel {

    val senha: Int

    fun autentica(senha: Int): Boolean {
        println("autentica interface")
        if (this.senha == senha) {
            return true
        }
        return false
    }
}

// Classe FuncionarioAdmin que implementa a função autentica
abstract class FuncionarioAdmin(
   nome: String,
   cpf: String,
   salario: Double,
   val senha: Int,
) : Funcionario(
   nome = nome,
   cpf = cpf,
   salario = salario,
) {
   open fun autentica(senha: Int): Boolean {
      if (this.senha == senha) {
         return true
      }
      return false
   }
}

// Classe gerente que herda de FuncionarioAdmin e implementa a interface Autenticavel. Neste é necessário especificar ]
// qual a implementação (FuncionarioAdmin ou Autenticavel) será utilizada da função autentica
class Gerente(
   nome: String,
   cpf: String,
   salario: Double,
   senha: Int,
) : FuncionarioAdmin(
   nome = nome,
   cpf = cpf,
   salario = salario,
   senha = senha,
),
   Autenticavel {

   override val bonificacao: Double
      get() = salario

   override fun autentica(senha: Int): Boolean {
      return super<Autenticavel>.autentica(senha)
   }
}
```
