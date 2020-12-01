programa
{
	
	funcao inicio()
	{
		real alturaRetangulo,baseRetangulo,areaRetangulo
	
		escreva ("Digite a medida da base do retangulo: ")
		leia(baseRetangulo)
		escreva ("Digite a medida da altura do retangulo: ")
		leia(alturaRetangulo)
		
		se (alturaRetangulo>0.0 e baseRetangulo>0.0){
			areaRetangulo=(alturaRetangulo*baseRetangulo)
			escreva( "A área do Retângulo é "+areaRetangulo)			
		}
		senao{
			escreva(" Os valores digitados são inválidos, digite números maiores que 0")
		}
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */