programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro  idadePessoas,anosNascimento,mesesNascimento,diasNascimento //Declaração das variaveis
		// Declaração de variaveis fixas
		const inteiro diasDoMes=30 
		const inteiro diasDoAno=365
	
		escreva("Por favor informe sua idade em dias: ")//Solicita a idade da pessoa em dias para o usuário
		leia (diasNascimento)// guardar na variavel diasNascimento o valor digitado
		
		//Calculo da quantidade de anos,meses,dias
		anosNascimento = diasNascimento / diasDoAno
		mesesNascimento =((diasNascimento) % (diasDoAno))/ diasDoMes
		diasNascimento  = ((diasNascimento) % (diasDoAno)) % diasDoMes
		
		//Informa a idade da pessoa em anos,meses e dias
		escreva("A sua idade é "+ anosNascimento + " anos, "+ mesesNascimento+" meses,"+ diasNascimento+" dias.")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 696; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */