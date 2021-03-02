fun main(){
	
//###################operadores aritméticos###############

	var n1 = 20
	var n2 = 10

	var soma = n1 + n2
	var subtracao = n1 - n2
	var multiplicacao = n1 * n2
	var divisao = n1 / n2
	var restoDaDivisao = n1 % n2

	println(soma)
	println(subtracao)
	println(divisao)
	println(multiplicacao)
	println(restoDaDivisao)

	println(soma++) // var ainda vale 30
	println(soma--) // var ainda vale 31
	println(soma) // var vale30

	println(++soma) // var já vale 31
	println(--soma) // var já vale 30

//#####################operadores relacionais#################

	println(n1>n2)//true
	println(n1<n2)//false
	println(n1==n2)//false
	println(n1!=n2)//true
	println(n1>=n2)//true
	println(n1<=n2)//false

//####################operadores lógicos##############3
if(n1==n1 && n2<n1){
	println("verdadeiro")
}else{
	println("falso")
}

if(n1==n1 || n2>n1){
	println("verdadeiro")
}else{
	println("falso")
}
}