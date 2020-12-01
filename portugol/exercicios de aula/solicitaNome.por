programa
{
	
	funcao inicio()
	{
		
		inteiro anoNascimento, idade
		const inteiro anoAtual = 2020
		cadeia nomePessoa
		
		escreva("Digite o nome da pessoa: ")
		leia (nomePessoa)
		escreva("Digite o ano de Nascimento: ")
		leia (anoNascimento)
		
		idade = anoAtual - anoNascimento
		escreva("Oi " + nomePessoa + ". Estamos na Generation, Sua idade é "+ idade + " anos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */