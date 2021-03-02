/*
o tipo da variável é identificado através do valor atribuido

String

Double (16 números após o ponto)

Float (7 números após o ponto)
caso eu queira que o valor seja reconhecido como float, devo
colocar um f minúsculo após o valor, caso contrário o valor
é definido como Double

Long
Long permite maior armazenamento de valores inteiros, se comparado ao Int

Boolean
*/

fun main(){

	val nome = "André"
	val Nome: String = "André Lubawski"
	println(nome)
	println(Nome)

	val idade = 23
	val Idade: Int = 23
	println(idade)
	println(Idade)

	val dinheiro = 50.00f
	println(dinheiro)

}