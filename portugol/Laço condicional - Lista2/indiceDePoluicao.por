programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva ("Digite o indice de poluição: ")
		leia(indicePoluicao)

		se (indicePoluicao>0.25 e indicePoluicao<0.4){
			escreva("ATENÇÃO!!!É necessaário paralizar as atividades do 1° GRUPO")
		}
		senao se(indicePoluicao>=0.4 e indicePoluicao<0.5){
			escreva("ATENÇÃO!!!É necessaário paralizar as atividades do 1° GRUPO e 2° GRUPO")
		}
		senao se(indicePoluicao>=0.5){
			escreva("ATENÇÃO!!!É necessaário paralizar as atividades de todos os grupos")
		}
		senao{
			escreva("Indíce de poluição dentro dos padrões aceitáveis")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */