programa
{
	
	funcao inicio()
	{
		//VARIAVEIS
		cadeia dis[4] //TAMNHO DO VETOR 0-3
		inteiro notas[4]  //0-3
		inteiro numero
		


		
		dis[0]="PORTUGUÊS" //POSIÇÃO E CARREGAMENTO DO VETOR
		dis[1]="MATEMÁTICA"
		dis[2]="CIÊNCIAS"
		dis[3]="ARTES"
		para (inteiro x = 0; x < 4; x++){
			escreva(dis[x],"\n")
			escreva("Digite a sua nota (Entre 0 e 10): ")
			leia(notas[x])
		}
		escreva("\nBOLETIN")
		para (inteiro x = 0; x < 4; x++) {
			escreva("\n",dis[x], " - ",notas[x])
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
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */