programa
{
	
	funcao inicio()
	{
		//VARIAVEIS
		cadeia times[4] //TAMNHO DO VETOR 0-3
		inteiro pontos[4]  //0-3
		inteiro numero
		times[0]="CORINTHIANS" //POSIÇÃO E CARREGAMENTO DO VETOR
		times[1]="PALMEIRAS"
		times[2]="SANTOS"
		times[3]="SPFC"
		para (inteiro x = 0; x < 4; x++){
			escreva(times[x],"\n")
			escreva("Digite 3, 1 ou 0:")
			leia(pontos[x])
		}
		escreva("\nRODADA PONTOS")
		para (inteiro x = 0; x < 4; x++) {
			escreva("\n",times[x], " - ",pontos[x])
		}
		/*
		escreva(times[0],"\n")
		escreva(times[1],"\n")
		escreva(times[2],"\n")
		escreva(times[3],"\n")
		*/
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */