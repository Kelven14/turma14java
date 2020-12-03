programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		const inteiro numeroHabitantes=3,limiteSalario=100
		real somaFilhos=0.0
		real mediaSalario=0.0,somaSalario=0.0,valorSalario,quantidadeFilhos=0.0,maiorSalario=0.0,quantidadeSalario100=0.0
		real mediaFilhos=0.0,porcentagem=0.0

		escreva ("\n------------------------------------------------------")
		escreva ("\n       PESQUISA REALIZADA PELA PREFEITURA             ")
		escreva ("\n------------------------------------------------------")
		
		para (inteiro contador=1;contador<=numeroHabitantes;contador++){
			escreva( "\n"+contador +"° habitante:\nDigite o seu salário: ")
			leia(valorSalario)
			escreva("Digite a quantidade de filhos: ")
			leia(quantidadeFilhos)

			se(valorSalario<=limiteSalario){
				quantidadeSalario100+=1
			}
			se(valorSalario>maiorSalario){
				maiorSalario=valorSalario
			}
			somaSalario+=valorSalario
			somaFilhos+=quantidadeFilhos	
		}
		porcentagem=(quantidadeSalario100/numeroHabitantes)*100
		mediaSalario=somaSalario/numeroHabitantes
		mediaFilhos=somaFilhos/numeroHabitantes
		
		
		escreva ("\n------------------------------------------------------")
		escreva ("\n                  DADOS DA PESQUISA                   ")
		escreva ("\n------------------------------------------------------")
		escreva ("\nMédia do salário da população: "+ mat.arredondar(mediaSalario, 2))
		escreva("\nMédia do número de filhos da população: "+ mat.arredondar(mediaFilhos, 2))
		escreva("\nMaior Salario: "+ maiorSalario)
		escreva("\nPorcentagem de pessoas com sárário até R$100,00: "+ mat.arredondar(porcentagem, 2)+"%")
		escreva ("\n")
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */