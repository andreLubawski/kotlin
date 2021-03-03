fun main(){
	
		val pagamento = Pagamento()
		pagamento.status = StatusPagamento.EM_ANALISE
		when{

			pagamento.status == StatusPagamento.EM_ANALISE -> println("pagamento em análise!")
			pagamento.status == StatusPagamento.APROVADO -> println("pagamento aprovado!")
			pagamento.status == StatusPagamento.COMPLETO -> println("pagamento completo!")
			pagamento.status == StatusPagamento.CANCELADO -> println("pagamento cancelado!")
		}

}

class Pagamento(){
	var status: StatusPagamento = StatusPagamento.EM_ANALISE
}

enum class StatusPagamento{
	
	CANCELADO, EM_ANALISE, APROVADO, COMPLETO
}
