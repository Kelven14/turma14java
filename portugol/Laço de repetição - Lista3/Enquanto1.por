programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real ,media=0.0,numerosLido=0,soma=0
		inteiro numero=0
		
		escreva("------------------------- INFORMAÇÕES DO SISTEMA ---------------------------")
		escreva("\nDigite valoes positivos.Se quiser finalizar digite um numero negativo!!")
		escreva ("\n-----------------------------------------------------------------------")
		
		enquanto (numero >= 0){
			escreva("\nInsira o valor desejado: ")
			leia(numero)
			se(numero>0){
				soma += numero
				numerosLido += 1
				
			}
			
		}
		media = (soma/numerosLido)
		
		escreva("\n------------------------- INFORMAÇÕES FINAIS---------------------------")
		escreva("\nQuantidade de números digitados: ", numerosLido)
		escreva("\nA soma desses números é: ", soma)
		escreva("\nA média desses números é: ", mat.arredondar(media,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */