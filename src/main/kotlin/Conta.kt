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