programa

{
	inclua biblioteca Matematica --> mat
	/*
		O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação
		sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso



	*/

	
	funcao inicio()
	{
	
		 
		
		inteiro painel
		real peso, altura,IMC
		

		linha()
		escreva("                 SISTEMA DE LEITURA DE PESO E ALTURA")
		linha()

		faca{
			escreva("Digite o seu peso: ")
			leia(peso)
			escreva("Digite a sua altura: ")
			leia(altura)
			
			IMC=peso/(mat.potencia(altura,2))
			linha()
			escreva("Seu IMC – Índice de Massa Corporal é igual: "+mat.arredondar(IMC, 2))
			pula()

		
			se(IMC<18.5)
			{
				escreva("Você está abaixo do peso")
				linha()			
			}
			senao se(IMC>=18.5 e IMC<25.0)
			{
				escreva("Você está com o peso normal")
				linha()
			}
			senao se(IMC>=25 e IMC<30.0)
			{
				escreva("Você está acima do peso")
				linha()
			}
			senao se (IMC>=30.0)
			{
				escreva("Você está obeso")
				linha()
			}
			senao{
				escreva("Opção inválida! Digite uma opção válida\n")
				linha()
				
			}
			escreva("Deseja fazer uma nova leitura? [1]-Sim ou [2]-Não\n")
			leia(painel)
			linha()
		}enquanto(painel==1)									
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