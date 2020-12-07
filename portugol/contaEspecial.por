programa
{
		/*    Conta Especial:
		 *    NUMERO CONTA
			 SALDO
			 VALOR LIMITE
                CPF
       		- DEBITO E CREDITO POR DIA (DEBITO =SAI DINHEIRO // CREDITO=ENTRA DINHEIRO)
			- SE SALDO MENOR QUE ZERO PARA O MOVIMENTO SOLICITAR USAR DO LIMITE E MOSTRA QUANTO SOBROU DO LIMITE
	
		*/
	funcao inicio()
	{	
		//Definição das Variaveis
		const inteiro numeroConta = 2020
		const cadeia numeroCPF = "000.111.222-4"
		const real limite = 1000.00 //Reais 
		
		inteiro N=10
		inteiro movimentacao=[N]
		real saldoConta = 0.0//Reais
		inteiro opcao

		
			escreva ("\n------------------------------------------------------\n")
			escreva("         Seja Bem vindo ao seu Banco Digital G&4")
			escreva ("\n------------------------------------------------------\n")
			escreva("Selecione uma das seguintes operações:\n1-Consultar o saldo\n2-Creditar em conta\n3-Debitar em conta\n")
			leia(opcao)

			
			se (opcao==1){
				escreva("Saldo da Conta Escpecial: R$ "+saldoConta)
			}
			se (opcao==2){
				
			}
			se(opcao==3){
				caracter decisao
				se(saldoConta==0.0){
					escreva("Infelizmento não é possivel debitar na conta, pois não há saldo em conta.\n")
					escreva("Deseja fazer um operação de Credito ? [s]-Sim ou [N]-Não\n")
					leia(decisao)
					se( decisao=='S' ou decisao=='S'){
						para (inteiro i=0; i<N;i++){
						
						}
					}
						
						
					
					
					
					
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
 * @POSICAO-CURSOR = 774; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */