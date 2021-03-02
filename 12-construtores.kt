fun main(){
	
	val ferrari = Carro("vermelho", 1.50)
	ferrari.detalhesFerrari()

}

class Carro(cor: String, altura: Double){

	var cor: String= " "
	var altura: Double
	
	init{
	    this.cor = cor
	    this.altura = altura
	}

	fun detalhesFerrari(){
		println("Cor: $cor, Altura: $altura")
	}

	fun abrirPorta(){
	    println("abrir porta")
	}
}