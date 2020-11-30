programa
{
	
	funcao inicio()
	{
		//Declaração de variaveis
		inteiro numero
		// Solicita numero e faz leitura do numero
		escreva ("Digite um número inteiro : ")
		leia (numero) 

		
		
		se (numero==0){
			escreva("Voce digitou o zero!!\n" ) 
		}
			
		senao se (numero < 0){
			se(numero % 2 == 0){
				escreva("O número digitado é par e negativo\n" ) // Onúmero 
			}
			senao  {
				escreva("O número digitado é ímpar e negativo\n" ) 
			}		
		}
			
		senao se (numero > 0){
			se(numero % 2 == 0){
				escreva("O número digitado é par e positivo\n" ) // Onúmero 
			}
			senao  {
				escreva("O número digitado é ímpar e positivo\n"  ) 
			}	
		}
			
		senao{
			escreva("O número digitado inválido\n" ) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */