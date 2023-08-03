class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    var plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun auntetica(senha: Int): Boolean {
        return this.senha == senha
    }
}