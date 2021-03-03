fun main(){
	
	var listaFilmes = listOf("f1","f2","f3") //imutável, tamanho fixo, serve apenas para leitura

	println(listaFilmes)

	var lista = arrayListOf("a","b","c")
	lista[2] = "d"
	lista.add("xy")
	println(lista)
	//lista.remove("nomeAqui")
	//lista.size mostra a quantidade de itens
	//.isEmpty() mostra se a lista está vazia
}