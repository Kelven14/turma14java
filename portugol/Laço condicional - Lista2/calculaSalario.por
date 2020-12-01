programa
{
	
	funcao inicio()
	{
		cadeia C
		inteiro N,E=0
		real salarioBase,salarioExcedente,salarioTotal
		caracter k='n'
		
		const real custoPorHora=10.00
		const real custoHoraExtra=20.00 
		const inteiro limiteHoras=50
		
		enquanto (k!='s'){
			 escreva("Insira o Código do funcionário: ")
			 leia(C)
			 escreva("Insira o número de horas trabalhadas : ")
			 leia(N)

			se(N>limiteHoras){
				E+=(N-limiteHoras)
				salarioBase=N*custoPorHora
				salarioExcedente=E*custoHoraExtra
				salarioTotal=salarioBase+salarioExcedente
				escreva("\nDescrição do Sálario!\nCódigo do trabalhador: " + C +"\nSalario Base: R$"+salarioBase+
									"\nSalario excedente: R$"+salarioExcedente+"\nSalario Total: R$"+salarioTotal)
				escreva("\n-----------------------------------------")
			}
			senao{
				E=0
				salarioBase=N*custoPorHora
				salarioExcedente=E*custoHoraExtra
				salarioTotal=salarioBase+salarioExcedente
				escreva("\nDescrição do Sálario!\nCódigo do trabalhador: " + C +"\nSalario Base: R$"+salarioBase+
								       "\nSalario excedente: R$"+salarioExcedente+"\nSalario Total: R$"+salarioTotal)
				escreva("\n-----------------------------------------")
			}
			escreva("\n")
			escreva("Deseja encerrar o programa(s-sim ou n-não):")
			leia(k)
			escreva("\n-----------------------------------------")
			escreva("\n") 
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 988; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */