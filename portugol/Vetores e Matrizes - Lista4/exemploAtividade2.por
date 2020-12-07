programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro JOGADAS=10
		inteiro lancamento=0
		inteiro maior=0
		inteiro contarMaior=1
		para (inteiro x=1; x<=JOGADAS; x++)
		{
			lancamento = Util.sorteia(1,6)
			escreva("\nLancamento ",x," : ",lancamento)
			// 5 - 5
			se (maior <= lancamento)
			{
								
				se ( lancamento > maior)
				{
					contarMaior=0
				}
				contarMaior++
				maior = lancamento
			}
		}
		escreva("\nMaior valor lançado foi :", maior)
		escreva("\nQuantidade de vezes: ", contarMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */