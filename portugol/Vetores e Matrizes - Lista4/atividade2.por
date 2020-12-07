programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro 	N = 10
		inteiro resultado[N],ocorrencia=0
		inteiro maiorValor = 0
		real media,soma = 0.0
		
		para(inteiro x = 0; x < N; x++){
			resultado[x] = Util.sorteia(1, 6)
			soma+= resultado[x]
			se(resultado[x]>maiorValor){
				maiorValor = resultado[x]
			}
		}
		
		media = soma/N
		
		para(inteiro x=0;x<N;x++){
			se(resultado[x]==maiorValor){
				ocorrencia++
			}
		}

		escreva ("\n------------------------------------------------------")
		escreva("\n            Resultados obtidos           ")	
		escreva ("\n------------------------------------------------------\n")
		para(inteiro x = 0; x < N; x++){
			escreva ("A Jogada "+(x+1)+" teve a seguinte face: "+ resultado[x]+ "\n")
		}

		escreva("Média dos valores: ",media)
		escreva("\nA maior face obtida em "+ N +" jogadas foi a face "+maiorValor+ " com "+ocorrencia+" repetições.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */