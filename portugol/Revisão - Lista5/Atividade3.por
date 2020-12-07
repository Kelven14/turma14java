programa
{
	/*
	 * Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos 
	 * seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
	 * A entrada de dados deve terminar quando for lido um número negativo.
	 */
	funcao inicio()
	{
		
		inteiro numero=1
		inteiro grupo1=0,grupo2=0,grupo3=0,grupo4=0
		
		

		linha()
		escreva("                 SISTEMA DE LEITURA DE NÚMEROS")
		linha()
		
		enquanto(numero>0)
		{
			escreva("Digite um número positivo: ")
			leia (numero)
			se(numero>=0 e numero<=25){
				grupo1++
			}
			senao se(numero>=26 e numero<=50){
				grupo2++
			}
			senao se(numero>=50 e numero<=75){
				grupo3++
			}
			senao se(numero>=76 e numero<=100){
				grupo4++
			}
					
		}
		linha()
		escreva("\nA quantidade de números entre 0 e 25 é: ", grupo1,"\nA quantidade de números entre 26 e 50 é: ", grupo2,
				"\nA quantidade de números entre 51 e 75 é: ", grupo3,"\nA quantidade de números entre 76 e 100 é: ", grupo4)				
									
	}

	funcao linha(){
		escreva("\n----------------------------------------------------------------\n")
	}
	funcao pula(){
		escreva("\n")
	}
	
	funcao linhaVariavel(inteiro limite)
	{	
		para(inteiro i=0;i<limite;i++){
			escreva("-")
		}
		escreva("\n")
	}
	
	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */