programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro 	N = 10
		inteiro resultado[N],vetor[6] = {[0,0,0,0,0,0]}
		inteiro maiorValor = 0,soma = 0
		real media
		

		para(inteiro x = 0; x < N; x++){
			resultado[x] = Util.sorteia(1, 6)
			vetor[resultado[x]-1] += 1 
			soma+= resultado[x]
			se(resultado[x]>maiorValor){
				maiorValor = resultado[x]
			}
		}
		
		media = soma/N
		
		escreva ("\n------------------------------------------------------")
		escreva("\n            Resultados obtidos           ")	
		escreva ("\n------------------------------------------------------\n")
		para(inteiro x = 0; x < N; x++)
		{
			escreva ("A Jogada "+(x+1)+" teve a seguinte face: "+ resultado[x]+ "\n")
		}

		escreva("Média dos valores: ",media)
		escreva("\nA maior face obtida em "+ N +" jogadas foi a face "+maiorValor+" com "+vetor[maiorValor-1]+" repetições.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 887; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */