fun main(args: Array<String>) {
    val contaJoao = Conta()
    val contaAna = Conta()

    contaJoao.deposita(100.0)
    contaJoao.transfere(contaAna, 50.0)

    println(contaJoao.saldo)
    println(contaAna.saldo)
}

class Conta {
     var titular = "João"
     var numero = 0
     var saldo = 0.0
         set(valor) {
            field = valor
         }
         get

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if(saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(destino: Conta,valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)

            return true
        }

        return false
    }
}

