# Considerando herança em mais de uma classe

Considerando que haja a necessidade de se ter um comportamento específico para algumas e que outras classes não devem
ter este mesmo comportamento. Isso é possível ser feito utilizando a herança de uma classe em uma outra classe, que por
sua vez será herdado por outras classes que desejam ter um comportamento específico e que ao mesmo tempo sejam
considerados uma classe mais genérica.

```kotlin
// Funcionário que deverá ter todos os comportamentos de um funcionário
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    abstract val bonificacao: Double
}

// Funcionário administrador que deverá ter todos os comportamentos de um funcionário mais os comportamentos 
// específicos de um administrador
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
    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}

// Diretor que herda de FuncionarioAdmin para ter comportamentos de administrador e que por sua vez herda de 
// Funcionario para ter todos os comportamentos relacionados a um funcionário
class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double,
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha,
) {
    override val bonificacao: Double
        get() = salario + plr
}
```
