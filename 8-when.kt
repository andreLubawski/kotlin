fun main(){

	when(true){
        true -> println("verdadeiro")
        false -> println("falso")
	}

	var opcao = 0
	when(opcao){
		0 -> println("0000")
		1 -> println("opção 1")
		2 -> println("opção 2")
		3 -> println("opção 3")
	else -> println("mensagem padrão aqui")
	}
}