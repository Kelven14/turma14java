programa
{
	
	funcao inicio()
	{
		inteiro  entradaSegundos,tempoSegundos,tempoMinutos,tempoHoras//Declaração das variaveis
		// Declaração de variaveis fixas
		const inteiro conversaoHoras=3600
		const inteiro conversaoMinutos=60
		
		escreva("Por favor informe  duração do evento em segundos: ")//Solicita a duração em segundos
		leia (entradaSegundos)// guardar na variavel entradaSegundos o valor digitado
		
		//Calculo da quantidade em horas, minutos e segundos
		tempoHoras = (entradaSegundos) / (conversaoHoras)
		tempoMinutos =	(( entradaSegundos % conversaoHoras) / conversaoMinutos)
		tempoSegundos =(( entradaSegundos % conversaoHoras) % conversaoMinutos)
		
		//Informa o tempo em horas, minutos e segundos
		escreva("A duração é de "+ tempoHoras + " Horas, "+ tempoMinutos +" minutos,"+ tempoSegundos+" segundos.\n")	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */