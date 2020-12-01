programa
{
	
	funcao inicio()
	{
		inteiro nota=0
		caracter k='n',opcao
		cadeia nome
		const inteiro limiteNota=5
		
		enquanto (k!='s'){
			 
			 escreva("\nOlá. Qual é o seu nome? ")
			 leia(nome)
			 escreva("Selecione uma das opções: [M] Aluno, [F] Aluna e [X] Alunx: ")
			 leia(opcao)
			 escreva("Digite sua nota:")
			 leia(nota)

			 se (opcao == 'M' ou opcao =='m'){
				se(nota>=5){
					escreva("Parabéns "+nome+" Você foi aprovada!!")
				}
				senao{
					escreva("Infelizmente "+nome+" você foi Reprovado")
				}
			}
			
			senao se (opcao =='F' ou opcao == 'f') {
				se(nota>=5){
					escreva("Parabéns "+nome+" Você foi aprovada!!")
				}
				senao{
					escreva("Infelizmente "+nome+" você foi Reprovado")
				}
			}
			senao se (opcao =='X' ou opcao =='x'){
			se(nota>=5){
					escreva("Parabéns "+nome+" você foi aprovadx!!")
				}
				senao{
					escreva("Infelizmente "+nome+" você foi Reprovadox")
				}
			}
			senao {
				escreva("Opção errada!!!")	
			}
			escreva("\n")
			escreva("Deseja encerrar o programa(s-sim ou n-não):")
			leia(k)
			escreva("\n-----------------------------------------")
			escreva("\n") 
			
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */