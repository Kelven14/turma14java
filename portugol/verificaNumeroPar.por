programa
{
	
	funcao inicio()
	{
		//Declaração de variaveis
		inteiro numero
		// Solicita numero e faz leitura do numero
		escreva ("Digite um número inteiro positivo: ")
		leia (numero) 
		
		se(numero>=0){
			se (numero==0){
				escreva("Voce digitou o zero!!" ) 
			}
			senao se(numero % 2 == 0){
				escreva("O número digitado é par" ) // Onúmero 
			}
			senao {
				escreva("O número digitado é ímpar" ) 
			}	
		}
	
		senao{
			escreva("O número digitado inválido" ) 
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */