fun main(){
	
	val cachorro = Cachorro()
	val passaro = Passaro()	
	passaro.voando()
	cachorro.dormir()
}

open class Animal{
	open fun dormir(){
	println("dormir")
	}
}

class Cachorro: Animal(){
	
		override fun dormir(){
	super.dormir()
	println("como um cachorro")
	}
	
}

class Passaro{
	fun voando(){
	println("O pássaro está voando")
	}

}