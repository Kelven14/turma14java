programa
{
	
	funcao inicio()
	{
		//variaveis
		cadeia nomeTime1, nomeTime2, nomeTime3, nomeTime4
		inteiro pontosTime1=0, pontosTime2=0, pontosTime3=0, pontosTime4=0
		caracter tipo
		nomeTime1 = "CORITHIANS"
		nomeTime2 = "PALMEIRAS"
		nomeTime3 = "SANTOS"
		nomeTime4 = "SPFC"		
		linha()
		pula()
		escreva("CONTROLE DE RODADAS")
		pula()
		para (inteiro rodada = 1; rodada<=4; rodada++)
		{
			escreva("RODADA ",rodada)
			//time 1
			pula()
			escreva(nomeTime1, " G-ganhou, P-perdeu ou E-empatou?:")
			leia(tipo)
			pontosTime1 = pontosTime1 + retornaPontos(tipo)
			
			//time 2
			pula()
			escreva(nomeTime2, " G-ganhou, P-perdeu ou E-empatou?:")
			leia(tipo)
			pontosTime2 = pontosTime2 + retornaPontos(tipo)
			
			// time 3
			pula()
			escreva(nomeTime3, " G-ganhou, P-perdeu ou E-empatou?:")
			leia(tipo)
			// pontosTime1 = pontosTime1 + retornaPontos(tipo)
			se (tipo == 'G' ou tipo =='g')
			{
				pontosTime3 = pontosTime3 + 3	
			}
			senao se (tipo == 'E' ou tipo =='e')
			{
				pontosTime3 = pontosTime3 + 1		
			} senao se (tipo == 'P' ou tipo =='p')
			{
				pontosTime3 = pontosTime3 + 0	
			}
			// time 4
			pula()
			escreva(nomeTime4, " G-ganhou, P-perdeu ou E-empatou?:")
			leia(tipo)
			// pontosTime1 = pontosTime1 + retornaPontos(tipo)
			se (tipo == 'G' ou tipo =='g')
			{
				pontosTime4 = pontosTime4 + 3	
			}
			senao se (tipo == 'E' ou tipo =='e')
			{
				pontosTime4 = pontosTime4 + 1		
			} senao se (tipo == 'P' ou tipo =='p')
			{
				pontosTime4 = pontosTime4 + 0	
			}
			
		}
		pula()
		linha()
		pula()
		escreva("TOTAL DAS RODADAS")
		pula()
		linha()
		escreva("\n",nomeTime1," - ", pontosTime1)
		escreva("\n",nomeTime2," - ", pontosTime2)
		escreva("\n",nomeTime3," - ", pontosTime3)
		escreva("\n",nomeTime4," - ", pontosTime4)
		
	}
	funcao pula(){
		escreva("\n")
	}
	funcao linha(){
		escreva("════════════════════════════════════════════")
	}
	funcao inteiro retornaPontos(caracter tipo)
	{
		inteiro pontoAtual = 0
		se (tipo == 'G' ou tipo =='g'){
			pontoAtual = 3
		}
		senao se (tipo == 'E' ou tipo =='e')
		{
			pontoAtual = 1	
		}
		senao se (tipo == 'P' ou tipo =='p')
		{
			pontoAtual = 0
		} senao
		{
			pontoAtual = 0
		}
		retorne pontoAtual
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */