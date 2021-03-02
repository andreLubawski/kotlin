fun main(){
	
	val ferrari = Carro("vermelho", 1.50)
	ferrari.detalhesFerrari()

}

class Carro{

	var cor: String= " "
	var altura: Double

	constructor(cor:String, altura: Double){
		this.cor = cor
		this.altura=altura
	}
	

	fun detalhesFerrari(){
		println("Cor: $cor, Altura: $altura")
	}

	fun abrirPorta(){
	    println("abrir porta")
	}
}