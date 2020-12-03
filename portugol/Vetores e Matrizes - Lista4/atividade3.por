programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro tamLinha=4,tamColuna=6
		inteiro N1[tamLinha][tamColuna],N2[tamLinha][tamColuna] 
		inteiro M1[tamLinha][tamColuna],M2[tamLinha][tamColuna]
		
		escreva ("\n------------------------------------------------------\n")
		escreva("Matriz N1: \n")
		para (inteiro linha=0;linha<tamLinha; linha++){	
			escreva("|")
			para (inteiro coluna=0; coluna<tamColuna; coluna++){
				N1[linha][coluna]= Util.sorteia(3, 4)
				escreva(N1[linha][coluna]," ")
			}
			escreva("|\n")
		}
		
		escreva ("\n------------------------------------------------------\n")
		escreva("Matriz N2: \n")
		para (inteiro linha=0;linha<tamLinha; linha++){
			escreva("|")
			para (inteiro coluna=0; coluna<tamColuna; coluna++){
				N2[linha][coluna]= Util.sorteia(3, 4)
				escreva(N2[linha][coluna]," ")
			}
			escreva("|\n")
		}

		escreva ("\n------------------------------------------------------\n")
		escreva("Matriz M1: \n")
		para (inteiro linha=0;linha<tamLinha; linha++){
			escreva("|")
			para (inteiro coluna=0; coluna<tamColuna; coluna++){				
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna]," ")
			}
			escreva("|\n")
		}
		
		escreva ("\n------------------------------------------------------\n")
		escreva("MATRIZ M2: \n")
		para (inteiro linha=0;linha<tamLinha; linha++){
			escreva("|")
			para (inteiro coluna=0; coluna<tamColuna; coluna++){
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna]
				escreva(M2[linha][coluna]," ")		
			}
			escreva("|\n")
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */