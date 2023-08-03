fun main(args: Array<String>) {
    val contaJoao = Conta(titular = "João", numero = 1001)
    val contaAna = Conta(titular = "Ana", numero = 2002)

    contaJoao.deposita(100.0)
    contaJoao.transfere(contaAna, 50.0)

    println(contaJoao.saldo)
    println(contaAna.saldo)
}

class Conta(
    var titular: String,
    val numero: Int = 1000
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }

    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)

            return true
        }

        return false
    }
}

