programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{		

		real raioCirculo=0.0
		real base=0.0,altura=0.0,area=0.0		  
		caracter tipo
		escreva("Olá, escolha uma figura geométrica")
		escreva ("\n0-Triangulo\n1- Retangulo\n2- Circulo\n")
		leia(tipo)

		
		escolha (tipo)
		{
		caso '0':		
		escreva("---------------------------------------")
		escreva ("\nDigite o valor da altura do triangulo: ")
		leia(altura)	
		escreva ("Digite o valor da base do triangulo: ")
		leia(base)
		//Processamento de dados
		se (altura>0 e base>0)
			{
		 	area = (base*altura)/2
			escreva ("A área do triangulo é: ", mat.arredondar(area,2))
			}
		senao
		{
			escreva("Os valores precisam ser positivos")
		}
		pare

		caso '1':	
		escreva("---------------------------------------")
		escreva("\nDigite o valor da altura do retângulo: ")
		leia(altura)
		escreva("Digite o valor da base do retângulo: ")
		leia(base)

		se(base < 0 ou altura < 0){
			escreva("Valor inválido! Digite um valor maior que 0 para base e para altura")
		} senao {
			area = altura * base
			escreva("A área do retângulo é: " + mat.arredondar(area, 2))	
		}
		pare

		caso '2':
		escreva("---------------------------------------")		
		escreva ("\nDigite o raio do Círculo: ")
		leia(raioCirculo)
		
		se (raioCirculo>0.0){
			area=mat.PI*(mat.potencia(raioCirculo,2))
			escreva( "A área do circulo é " +mat.arredondar(area,2))		
		}
		senao{
			escreva(" Os valores digitados são inválidos, digite números maiores que 0")
		}
		pare
		caso contrario:
		escreva ("o valor não é igual a 0, 1 ou 2")
		}
	}//Fim da função inicio


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1611; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */