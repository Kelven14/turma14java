programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numero1,numero2,numero3,numero4,quadradoDoNumero1,quadradoDoNumero2,quadradoDoNumero3,quadradoDoNumero4
	
		escreva("Por favor informe quatro números inteiros!\n")
		escreva("Número 1: ")
		leia (numero1)
		escreva("Número 2: ")
		leia (numero2)
		escreva("Número 3: ")
		leia (numero3)
		escreva("Número 4: ")
		leia (numero4)
		escreva("\n") 

		quadradoDoNumero1= mat.potencia(numero1,2)
		quadradoDoNumero2= mat.potencia(numero2,2)
		quadradoDoNumero3= mat.potencia(numero3,2)
		quadradoDoNumero4= mat.potencia(numero4,2)
		
		se (quadradoDoNumero3 >=50){
			escreva("O quadrado do número "+numero3+" é igual a "+quadradoDoNumero3)
		}
		senao{
			escreva("O quadrado do número "+numero1+" é igual a "+quadradoDoNumero1)
			escreva("\nO quadrado do número "+numero2+" é igual a "+quadradoDoNumero2)
			escreva("\nO quadrado do número "+numero3+" é igual a "+quadradoDoNumero3)
			escreva("\nO quadrado do número "+numero4+" é igual a "+quadradoDoNumero4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */