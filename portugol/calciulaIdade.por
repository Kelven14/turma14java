programa
{
	
	funcao inicio()
	{
		inteiro  idadePessoas,anosNascimento,mesesNascimento,diasNascimento //Declaração das variaveis
		// Declaração de variaveis fixas
		const inteiro diasDoMes=30 
		const inteiro diasDoAno=365
		//Solicita a idade da pessoa em anos,meses e dias
		escreva("Por favor informe sua idade!")
		escreva("\nAnos: ")
		leia (anosNascimento)
		escreva("Meses: ")
		leia (mesesNascimento)
		escreva("Dias: ")
		leia (diasNascimento)
		//Calculo da quantidade de dias
		diasNascimento+= (mesesNascimento*diasDoMes)+(anosNascimento*diasDoAno)

		//Informa a idade da pessoa em  dias
		escreva("A sua idade em dias é "+ diasNascimento)	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */