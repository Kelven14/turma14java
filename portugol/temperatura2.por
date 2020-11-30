programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		caracter k='n'
		real temperaturaCelsius,temperaturaFahrenheit, temperaturaKelvin
		enquanto (k!='s'){
		
		escreva("Digite a temperatura em Fahrenheit (°F): ")
		leia (temperaturaFahrenheit)
	
		temperaturaCelsius = ((temperaturaFahrenheit-32)*5/9)
	
		
		escreva("A temperatura em Fahrenheit é " + Matematica.arredondar( temperaturaCelsius,2)+ "° C")
		escreva("\n")
		escreva("Deseja encerrar o programa(s-sim ou n-não):")
		leia(k)
		escreva("\n")
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