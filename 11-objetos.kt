fun main(){
	
	val ferrari = Carro()
	ferrari.cor = "vermelho"
	println(ferrari.cor)
	ferrari.abrirPorta()

}

class Carro{
	var cor: String= " "
	
	fun abrirPorta(){
	    println("abrir porta")
	}
}