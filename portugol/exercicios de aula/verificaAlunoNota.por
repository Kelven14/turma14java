programa
{
	inclua biblioteca Texto
	funcao inicio()
	{
		
		caracter k='n'
		const inteiro limiteNota=5
		inteiro numero
		inteiro notas[4]		
		cadeia dis[]={"PORTUGUÊS","MATEMÁTICA","CIÊNCIAS","ARTES"} 
		cadeia situacao[4]
		cadeia nome = " "
		cadeia opcao
		cadeia genero = " "
		cadeia tratamento
		
		
		enquanto (k!='s'){
			
			escreva("\nOlá. Qual é o seu nome? ")
			leia(nome)
			escreva("Selecione uma das opções: [M] Aluno, [F] Aluna e [X] Alunx: ")
			leia(opcao)
			opcao=Texto.caixa_alta(opcao)
			se (opcao=="M"){
				genero="Aluno"
			}
			senao se (opcao=="F"){
				genero="Aluna"
			}
			senao se(opcao=="X"){
				genero="AlunX"
			}
			senao{
				genero="AlunX"
			}

			
			para (inteiro x = 0; x < 4; x++){
			escreva(dis[x],"\n")
			escreva("Digite a sua nota (Entre 0 e 10): ")
			leia(notas[x])
				se(notas[x]>=limiteNota){
					situacao[x]="Ap"
				}
				senao{
					situacao[x]="Rep"
				}
			}
			
			escreva("\n-----------------------------------------")
			escreva("\n           BOLETIN ESCOLAR                ")
			escreva("\n-----------------------------------------")
			escreva("\n"+ genero +": "+ nome)
			escreva("\n-----------------------------------------")
		
			para (inteiro x = 0; x < 4; x++) {
			tratamento=ajustaNome(situacao[x], genero)
			escreva("\n",dis[x], " - Nota: ",notas[x]+" - Situação: "+ tratamento)
			}
			escreva("\n-----------------------------------------")
		
		
			escreva("\n")
			escreva("Deseja encerrar o programa(s-sim ou n-não):")
			leia(k)
			escreva("\n-----------------------------------------")
			escreva("\n") 
	
		}
		
			
	}

	funcao cadeia ajustaNome( cadeia situacao, cadeia genero){
		se(genero=="Aluno" e situacao=="Ap"){
			retorne "APROVADO"
		}
		senao se (genero=="Aluno" e situacao=="Rep"){
			retorne "REPROVADO"
		}
		senao se(genero=="Aluna" e situacao=="Ap"){
			retorne "APROVADA"
		}
		senao se (genero=="Aluna" e situacao=="Rep"){
			retorne "REPROVADA"
		}

		senao se(genero=="AlunX" e situacao=="Ap"){
			retorne "APROVADX"
		}
		senao se (genero=="AlunX" e situacao=="Rep"){
			retorne "REPROVADX"
		}
		senao {
			retorne "ERRO"
		}
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */