programa
{

	
	funcao inicio()
	{
		const inteiro 	N = 3
		inteiro nota[N]
		cadeia alunos[]={"kelven","carlos","joao"}
		cadeia sexoAluno[]={"M","M","M"}
		cadeia matricula[N]
		cadeia nome
		

		
		para(inteiro i = 0; i < N; i++){
			se (N<10){
				matricula[i] = "G2-0"+(i+1)	
			}
			senao {
				matricula[i] = "G2-"+(i+1)
			}
		}


		
		escreva ("\n------------------------------------------------------")
		escreva("\n            Resultados obtidos           ")	
		escreva ("\n------------------------------------------------------\n")
		para(inteiro i = 0; i < N; i++)
		{
			escreva ("Matricula: "+matricula[i]+"-"+alunos[i]+ "\n")
		}


		escreva("Nome do aluno: ")
		leia (nome)
		para(inteiro i = 0; i < N; i++){
			se(nome==alunos[i] ){
				se ( sexoAluno[i]=="M"){
					escreva("\nO aluno escolhido foi : ", alunos[i])				
				}
				senao{
					escreva("\nA aluna escolhida foi : ", alunos[i])
				}
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 930; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */