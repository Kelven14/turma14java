programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real pesoTomate=0.0,,E=0.0,M=0.0
		const inteiro valorMulta=4 
		const inteiro valorMax=50 
	
		escreva("Por favor informe o peso do tomate!")
		escreva("\nPeso [kg]: ")
		leia (pesoTomate)
		escreva("\n") 
		
		se (pesoTomate <= valorMax){
			escreva("Não há multa por excesso de peso!")
		}
		senao{
			E+=(pesoTomate-valorMax)
			M=E*valorMulta
			escreva("O peso ultapassou o limite! \nExcesso [kg]: "+ mat.arredondar(E,2) + "\nValor da multa: R$"+mat.arredondar(M,2))
			escreva("\n") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */