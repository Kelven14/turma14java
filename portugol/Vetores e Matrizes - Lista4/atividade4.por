programa
{
	funcao inicio()
	{
		const inteiro N=3
		inteiro M [N] [N]
		inteiro somaD=0,somaP=0,somaT=0
		inteiro TECLA=0
		inteiro Painel=1,k=1

		para ( inteiro l=0 ; l<N ; l++ ){
    			para ( inteiro c=0 ;c<N ; c++ ){
      			escreva("Digite os elemento "+k+"da matriz M["+l+"]["+c+"]: ")
			      leia(M [l] [c])
			      k++
			      
			      somaT = somaT + M [l] [c]
			
			      se(l==c){
			        somaD = somaD + M [l] [c]
			      }
			
			      se(M [l] [c] %2 ==0){
			        somaP=somaP + M [l] [c]
			      }
			} 
		}
		limpa()
		escreva ("------------------------------------------------------\n")
		escreva("Matriz M: \n")
		para (inteiro linha=0;linha<N; linha++){	
			escreva("|")
			para (inteiro coluna=0; coluna<N; coluna++){
				escreva(M[linha][coluna]," ")
			}
			escreva("|\n")
		}

		enquanto (Painel==1){
 			escreva ("\n------------------------------------------------------")
			escreva("\nEscolha uma das opções para apresentar o resultado desejado: \n 1-Soma de todos os elementos da matriz \n 2-Soma dos termos da diagonal principal da matriz \n 3-Soma dos termos pares da matriz\n 4-Para sair\n");
			leia(TECLA);
 
			se(TECLA==1){
				escreva ("\n------------------------------------------------------\n")
				escreva("Soma de todos os elementos da matriz: ", somaT);
				
			}
			se(TECLA==2){
				escreva ("\n------------------------------------------------------\n")
				escreva("Soma dos termos da diagonal principal da matriz: ", somaD);
			}
			se(TECLA==3){
				escreva ("\n------------------------------------------------------\n")
				escreva("Soma dos termos pares da matriz: ",somaP);
			}
			se(TECLA==4){
			Painel=0;
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */