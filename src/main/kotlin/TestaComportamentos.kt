class TestaComportamentos {
    fun testeComportamentos() {
        val contaJoao = Conta(titular = "João", numero = 1001)
        val contaAna = Conta(titular = "Ana", numero = 2002)

        contaJoao.deposita(100.0)
        contaJoao.transfere(contaAna, 50.0)

        println(contaJoao.saldo)
        println(contaAna.saldo)
    }
}
// mktcd5620