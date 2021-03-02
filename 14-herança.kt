fun main(){
	
	val cachorro = Cachorro()
	cachorro.latir()
	cachorro.dormir()
	val passaro = Passaro()	
	passaro.voando()
}

open class Animal{
	fun dormir(){
	println("dormir")
	}
}

class Cachorro: Animal(){
	
	fun latir(){
	println("Cachorro está latindo")
	}
}

class Passaro{
	fun voando(){
	println("O pássaro está voando")
	}

}