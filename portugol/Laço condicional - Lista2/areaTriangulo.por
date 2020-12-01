programa
{
	
	funcao inicio()
	{
		real alturaTriangulo,baseTriangulo,areaTriangulo=0.0

		escreva ("Digite a medida da base do triângulo: ")
		leia(baseTriangulo)
		escreva ("Digite a medida da altura do triângulo: ")
		leia(alturaTriangulo)
		se (alturaTriangulo>0.0 e baseTriangulo>0.0){
			areaTriangulo=(alturaTriangulo*baseTriangulo)/2
			escreva( "A área do triângulo é " +areaTriangulo)			
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
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */