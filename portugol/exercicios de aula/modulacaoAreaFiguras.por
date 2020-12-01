programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{		
		real raioCirculo=0.0
		real base=0.0,altura=0.0,area=0.0		 
		caracter tipo
		imprimirMenu()
		leia(tipo)
		
		escolha (tipo)
		{
		caso '0':		
		linha()
		altura=lerAltura(altura)
		base=lerBase(base)
			se(altura>0 e base>0){
				area=calculaAreaTriangulo(base,altura)
				pula()
				imprimirArea(area)
			}
			senao{
				imprimirMensagem()
			}
			
		pare
		caso '1':	
		linha()
		altura=lerAltura(altura)
		base=lerBase(base)
			se (altura>0 e base>0){
				area=calculaAreaRetangulo(base,altura)
				pula()
				imprimirArea(area)
			}
			senao{
				imprimirMensagem()
			}
			
		pare
		caso '2':
		linha()	
		raioCirculo=lerRaio(raioCirculo)
			se (raioCirculo>0){
				area=calculaAreaCirculo(raioCirculo)
				pula()
				imprimirArea(area)	
			}
			senao{
				imprimirMensagem()
			}
		pare
		caso contrario:
		escreva ("o valor não é igual a 0, 1 ou 2")
		}
	}//Fim da função inicio
	funcao linha(){
		escreva("---------------------------------------\n")
	}
	funcao pula(){
		escreva("\n")
	}
	funcao real lerAltura(real altura){
		escreva ("Digite o valor da altura: ")
		leia(altura)	
		retorne altura	
		
	}
	funcao real lerBase(real base){
		escreva ("Digite o valor da base: ")
		leia(base)	
		retorne base
		
	}
	funcao real lerRaio(real raioCirculo){
		escreva ("Digite o raio do Círculo: ")
		leia(raioCirculo)
		retorne raioCirculo
	}
	
	funcao  imprimirArea(real area){
		escreva( "A área é " +mat.arredondar(area,2))
	}
	funcao imprimirMenu(){
		escreva("Olá, escolha uma figura geométrica")
		escreva ("\n0-Triangulo\n1-Retangulo\n2-Circulo\n")	
	}
	funcao imprimirMensagem(){
		escreva(" Os valores digitados são inválidos, digite números maiores que 0")
	}
	
	funcao real calculaAreaRetangulo(real base, real altura){
			real area = altura * base
			retorne area 	
	}
	
	funcao real calculaAreaTriangulo(real base, real altura){
		real area = (base*altura)/2
		retorne area
	}
	
	funcao real calculaAreaCirculo(real raioCirculo){
		real area=mat.PI*(mat.potencia(raioCirculo,2))
		retorne area	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2091; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */