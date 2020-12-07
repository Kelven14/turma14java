programa
{
	funcao inicio()
	{
		
		const inteiro tamanho=5
		real pontuacao[tamanho],maiorNota=-1
		
		escreva ("\n------------------------------------------------------")
		escreva("\n      Digite as "+tamanho+" notas da atividade")	
		escreva ("\n------------------------------------------------------")
		
		para (inteiro x = 0; x < tamanho; x++){
			
			escreva("\nInsira "+(x+1)+"° nota: ")	
			leia(pontuacao[x])
			se ( pontuacao[x]>maiorNota){
				maiorNota=pontuacao[x]
			}
		}
		escreva("\nSequência das Notas: ")
		
		para (inteiro x = 0; x < tamanho; x++) {
			escreva(pontuacao[x]+", ")
		}
		escreva("\nA Maior Nota Digita foi: "+maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */