programa
{
	inclua biblioteca Matematica --> mat
	/*
	 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e 
	 * a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
	 * escolhida e efetuar o cálculo adequado. 
		
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%

	 */
	funcao inicio()
	{
		const real descontoAvista=0.2
		const real descontoAvistaCartao=0.15
		const real jurosParcelado=0.1
		real precoProduto=0.0, 
		inteiro opcao 
		inteiro painel
		real valorParcela=0.0

		linha()
		escreva("                 SISTEMA DE PAGAMENTO")
		linha()

		faca{
			escreva("Digite o preço do produto: R$ ")
			leia(precoProduto)
			linhaVariavel(64)
			
			escreva("Qual a forma de pagamento? \n1-À vista em dinheiro ou cheque\n2-À vista no cartão de crédito\n3-Parcelado em duas vezes\n4-Parcelado em três vezes\n")
			leia(opcao)
		
			se(opcao==1)
			{
				precoProduto= precoProduto*(1-descontoAvista)	
				imprimePreco( precoProduto)					
			}
			senao se(opcao==2)
			{
				precoProduto= precoProduto*(1-descontoAvistaCartao)	
		
				imprimePreco( precoProduto)	
			}
			senao se(opcao==3)
			{
				precoProduto= precoProduto	
				imprimePreco( precoProduto)		
			}
			senao se (opcao==4)
			{
				precoProduto= precoProduto*(1+jurosParcelado*3)
				valorParcela=precoProduto/3
				imprimePreco( precoProduto)	
				escreva("Valor final parcelado em 3 vezes: ")
				imprimeParcela(valorParcela)
			}
			senao{
				escreva("Opção inválida! Digite uma opção válida\n")
				
			}
			escreva("Deseja pagar mais algum produto? [1]-Sim ou [2]-Não\n")
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
	
	funcao  imprimePreco( real precoProduto)
	{
			linha()
			escreva("        Valor final do produto:R$ "+mat.arredondar(precoProduto, 2))
			linha()
	}

	funcao  imprimeParcela( real valorParcela)
	{
			
			escreva(" Valor das parcelas:R$ "+mat.arredondar(valorParcela, 2))
			linha()
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