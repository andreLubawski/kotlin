fun main(){

	var nome: String? = null //sem a interrogação, a variável não assumirá valor nulo
	//nome = "André"
	println(nome)

	var nome2 = "André Lubawski"
	println(nome2.length)

	var nome3: String? = null
	println(nome3?.length)

	var nome4: String? = null
	nome4 = "abcde"
	println(nome4!!.length)

}