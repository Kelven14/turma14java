programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real raioCirculo,areaCirculo
		
		escreva ("Digite o raio do Círculo: ")
		leia(raioCirculo)
		
		se (raioCirculo>0.0){
			areaCirculo=mat.PI*(mat.potencia(raioCirculo,2))
			escreva( "A área do circulo é " +mat.arredondar(areaCirculo,2))		
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