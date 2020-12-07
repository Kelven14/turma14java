programa
{
	//BIBLIOTECAS
	inclua biblioteca Matematica
	inclua biblioteca Util
	inclua biblioteca Texto
	inclua biblioteca Calendario 
	
	funcao inicio()
	{
		// DEClARAÇÃO DE VARIAVEIS
		cadeia cliente[39] = { "Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
						"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
						"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
						"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
						"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
						"Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso",
						"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
						"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
						"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
						"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
						"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
						"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
						"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda" }

		//caracter sexoCliente[39] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
		//'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}

		inteiro talaoCheque=0, opcao, contador=0, limiteTalao=3, l, c, indice, encontra=0, opcao1=1, opcao2,opcaoValida=1,opcaoPrograma=1, dataAniversarioConta
		
		const inteiro j = 10
		const inteiro i = 31
		const inteiro DATA_ANIVERSARIO = 05
		
		real movimentoDia[i][j], saldoConta=0.0, limite=2000.0
		caracter opcaoTalao, continuar
		cadeia clientes= "  ", codigoCliente [39]
		
		//CHAMA FUNCAO LOGIN
		login()
		//PREENCHE CODIGO DOS CLIENTES
		para (inteiro x=0; x < 39; x++)
		{
			se(x < 9){
				codigoCliente[x] = "G4-0"+(x+1) // PARA NUMEROS MENORES QUE DEZ, ACRESCENTA UM ZERO NA FRENTE DO NÚMERO	
			}
			senao{
				codigoCliente[x] = "G4-"+(x+1)	
			}
		}

		//VALIDADOR DE CÓDIGO
		faca{
			escreva("\tDigite o número do seu Código.\n  Exemplo: G4-XX, onde XX varia de 01 a 39" )
			linha()
			escreva("Código: ")
			leia(clientes)
			clientes=Texto.caixa_alta(clientes) // TRNSFORMA TUDO PARA CAIXA ALTA
			para(inteiro x = 0; x < 39; x++){
				se(clientes == codigoCliente[x]){//VERIFICA SE O CÓDIGO CORRESPONDE ALGUM CLIENTE CADASTRADO
					linha()
					loading()//FUNCAO LOADING, MOSTRA NA TELA "lOADING"
					Util.aguarde(500) //AGUARDA 500 MILISEG.
					limpa()
					escreva("\n     Seja Bem vindo Sr.(a) ", cliente[x])
					encontra=1
					opcaoValida=2	
				}
			}
			se(encontra==0)
			{
				linha()
				escreva("Cliente não encontrado, digite um código válido!\n")
				escreva("Deseja inserir um novo código? [1] Sim ou [2] Não\n")
				escreva("\nOpção: ")
				leia(opcaoValida)
				limpa()

			}
		}enquanto(opcaoValida==1)

		
		// LAÇO QUE ZERA AS POSIÇÕES DA MATRIZ
		para(l = 0; l < i; l++){
			para(c = 0; c < j; c++){
			movimentoDia[l][c] = 0.0
			}
		}
		//lOOP DE CONTROLE, SÓ ENTRA  NO MENU SE TIVER UM CODIGO DE CLIENTE VÁLIDO
		enquanto(encontra==1){
			Calendario.minuto_atual()
			Calendario.segundo_atual()
		
			// LOOP DIA - MATRIZ - 10X31
			para(l = 0; l < i; l++){
				//MOSTRA DIA E HORA ATUAL
				inteiro horaAtual=Calendario.hora_atual(falso)
				escreva ("\n|-----------------------------------------------|\n")
				escreva("    \t    Estamos no dia ", l+1," do mês ", Calendario.mes_atual() )
				pula()	
				escreva("\t\tHora atual: ",(Calendario.hora_atual(falso)-1),":",Calendario.minuto_atual(),":",Calendario.segundo_atual())    )
				escreva ("\n|-----------------------------------------------|\n")
				contador = 0

			// LOOP PRINCIPAL DO BANCO - CONTAS
				faca{
					menuPrincipal()// CHAMA FUNCAO MENU PRINCIPAL
					leia(opcao)
					limpa()
					loading()
					limpa()
					escolha (opcao){

					//CONTA POUPANÇA - JJ
					caso 1:
						faca{
							pula()
							escreva("|-----------------------------------------------------|\n")
							escreva("|                     CONTA POUPANÇA                  |\n")
							escreva("|-----------------------------------------------------|\n")
							escreva("\nSelecione a opção desejada: ")
							escreva("\n(1) Consultar Saldo")
							escreva("\n(2) Realizar Depósito")
							escreva("\n(3) Realizar Saque")
							escreva("\n(4) Informe o aniversário da conta [dd]")
							escreva("\n(5) Imprimir extrato")
							escreva("\n(6) SAIR: ")
							escreva("\nOpção: ")
							leia(opcao)
							limpa()

							escolha (opcao){
							caso 1: 
								escreva("Seu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
								Util.aguarde(500)
								pula()
							pare
							caso 2:
								escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de depositar:  R$ ")
									leia(movimentoDia[l][contador])

									saldoConta = saldoConta + movimentoDia[l][contador]

									escreva("Seu novo saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
									pula()
									contador++
								}
								senao{
									escreva("Limite de operações no dia alcançadas.\n")
								}		

							pare
							caso 3:
								escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de sacar: R$ ")
									leia(movimentoDia[l][contador])

									se(movimentoDia[l][contador] <= saldoConta){
										saldoConta = saldoConta - movimentoDia[l][contador]
										escreva("Você sacou a quantia de R$ ", movimentoDia[l][contador])
										escreva("\nSeu novo saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
										pula()
										contador++
									}
									senao{
										escreva("Saldo insuficiente. Selecione nova opção.")
										pula()
									}
								}

							pare
							caso 4:

								escreva("Informe o dia do aniversário da sua conta: ")
								leia(dataAniversarioConta)

								se(dataAniversarioConta == DATA_ANIVERSARIO){
									saldoConta = saldoConta * 1.005
									escreva("Seu saldo é de R$ ", Matematica.arredondar(saldoConta, 2))
									pula()
								}

								senao{
									escreva("Hoje não é o aniversário da sua conta.\n")
								}

							pare
							caso 5:
								escreva("**** EXTRATO DA CONTA ****")
								pula()
								para(c = 0; c < 10; c++){
									se(movimentoDia[l][c] != 0){
										escreva("\nMovimentação: ", movimentoDia[l][c])
									}
								}

								escreva("\nSeu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
								pula()

							pare

							caso 6:
								escreva("Você optou por sair. Obrigado por utilizar nossos serviços!\n")
							pare
							caso contrario:
								escreva("Opção inválida. Selecione nova opção.\n")
							pare
							}
						}enquanto(opcao != 6)
					pare

					// CONTA CORRENTE - VERONICA
					caso 2:
						faca{
							pula()
							escreva("|-----------------------------------------------------|\n")
							escreva("|                     CONTA CORRENTE                  |\n")
							escreva("|-----------------------------------------------------|\n")
							escreva("\nSelecione a opção desejada: ")
							escreva("\n(1) Consultar Saldo")
							escreva("\n(2) Realizar Depósito")
							escreva("\n(3) Realizar Saque")
							escreva("\n(4) Emitir novo talão de cheque")
							escreva("\n(5) Imprimir extrato")
							escreva("\n(6) SAIR: ")
							escreva("\nOpção: ")
							leia(opcao)
							limpa()

							escolha (opcao){
							caso 1:
								escreva("Seu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
								Util.aguarde(500)
								pula()
							pare
							caso 2:
								escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de depositar:  R$ ")
									leia(movimentoDia[l][contador])

									saldoConta = saldoConta + movimentoDia[l][contador]

									escreva("Seu novo saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
									pula()
									contador++
								}
								senao{
									escreva("Limite de operações no dia alcançadas.\n")
								}		

							pare
							caso 3:
								escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de sacar:  R$ ")
									leia(movimentoDia[l][contador])

									se(movimentoDia[l][contador] <= saldoConta){
										saldoConta = saldoConta - movimentoDia[l][contador]
										escreva("Você sacou a quantia de R$ ", movimentoDia[l][contador])
										escreva("\nSeu novo saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))

										contador++
									}
									senao{
										escreva("Saldo insuficiente. Selecione nova opção.")
									}
								}

							pare
							caso 4:

								se(talaoCheque < limiteTalao){
									escreva("Você tem ", limiteTalao-talaoCheque, " talão(ões) de cheque disponível(is).")
									escreva("\nVocê realmente deseja emitir um novo talão de cheque? (S)Sim - (N)Não: ")
									leia(opcaoTalao)

									se(opcaoTalao == 'S' ou opcaoTalao == 's'){
										talaoCheque++

										escreva("Talão emitido sob o número ", talaoCheque)
										pula()
									}
									senao{
										escreva("Talão não emitido\n")
									}
								}
								senao{
									escreva("O limite de talões de cheque por dia foi atingido.\n")
								}

							pare
							caso 5:
								escreva("**** EXTRATO DA CONTA ****")
								pula()

								para(c = 0; c < 10; c++){
									se(movimentoDia[l][c] != 0){
										escreva("\nMovimentação: ", movimentoDia[l][c])
									}
								}

								escreva("\nSeu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))

							pare

							caso 6:
								escreva("Você optou por sair. Obrigado por utilizar nossos serviços!\n")
							pare
							caso contrario:
								escreva("Opção inválida. Selecione nova opção.\n")
							pare
							}
						}enquanto(opcao != 6)
					pare

					//CONTA ESPECIAL - KELVEN
					caso 3:
					faca{
						pula()
						escreva("|-----------------------------------------------------|\n")
						escreva("|                     CONTA ESPECIAL                  |\n")
						escreva("|-----------------------------------------------------|\n")
						escreva("\n(1) Consultar Saldo")
						escreva("\n(2) Realizar Depósito")
						escreva("\n(3) Realizar Saque")
						escreva("\n(4) Imprimir extrato")
						escreva("\n(5) SAIR: ")
						escreva("\nOpção: ")
						leia(opcao)
						limpa()

						escolha (opcao){
							caso 1:
								escreva("Seu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
								Util.aguarde(500)
								pula()
							pare
							caso 2:
								escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de depositar:  R$ ")
									leia(movimentoDia[l][contador])

									se(saldoConta <0 )
									{
										limite = limite - saldoConta
										saldoConta += movimentoDia[l][contador]
									}
									senao
									{
										saldoConta+=movimentoDia[l][contador]
									}

									escreva("Seu novo saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
									pula()
									contador++
								}
								senao{
									escreva("Limite de operações no dia alcançadas.")
									pula()
								}		

							pare
							caso 3:
								escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de sacar: R$ ")
									leia(movimentoDia[l][contador])
									se(movimentoDia[l][contador]>saldoConta ou saldoConta==0)
									{
										escreva("Saldo insuficiente!!! Você possui R$ "+ limite+" de limite disponivel\n")
										escreva("Deseja utilizar o limite? [1]SIM ou [2]NÃO: ")
										leia(opcao2)
										se(opcao2==1)
										{	se(saldoConta<0)
											{
												movimentoDia[l][contador]=-movimentoDia[l][contador]
												limite=limite+movimentoDia[l][contador]
												saldoConta=saldoConta+movimentoDia[l][contador]
											
												escreva("Saldo atual R$ 0.00\tLimite Atual R$ "+limite+"\n")
												escreva("Você utilizou  o valor de  R$ ",(2000.00-limite),"do limite")
												pula()
												contador++
											}
											senao
											{
												movimentoDia[l][contador]=-movimentoDia[l][contador]
												limite=limite+movimentoDia[l][contador]+saldoConta
												saldoConta=saldoConta+movimentoDia[l][contador]
												escreva("Saldo atual R$ 0.00\tLimite Atual R$ "+limite+"\n")
												escreva("Você utilizou  o valor de  R$ ",(2000.00-limite),"do limite")
												pula()
												contador++
											}

										}
										senao se (opcao2==2)
										{
											escreva("Por favor, faça um depósito\n")
										}
										senao
										{
										 	escreva("Opção inválido, Digite novamente!\n")
										}
									}
									senao
									{
										movimentoDia[l][contador]=-movimentoDia[l][contador]
										saldoConta+=movimentoDia[l][contador]
										escreva("Seu novo saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
										pula()
										contador++
									}

								}
							pare

							caso 4:
								escreva("**** EXTRATO DA CONTA ****")

								para(c = 0; c < 10; c++){
									se(movimentoDia[l][c] != 0){
										escreva("\nMovimentação: ", movimentoDia[l][c])
										
									}
								}

								escreva("\nSeu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))

							pare

							caso 5:
								escreva("Você optou por sair. Obrigado por utilizar nossos serviços!\n")
							pare

							caso contrario:
								escreva("Opção inválida. Selecione nova opção.\n")
							pare
							}

					}enquanto(opcao != 5)

					pare

					//CONTA EMPRESA - BEYMAR
					caso 4:
					faca {
						pula()
						escreva("|-----------------------------------------------------|\n")	//
						escreva("|                     CONTA EMPRESA                   |\n")
						escreva("|-----------------------------------------------------|\n")
						escreva("\n(1) Consultar Saldo")
						escreva("\n(2) Realizar Depósito")
						escreva("\n(3) Realizar Saque")
						escreva("\n(4) Imprimir extrato")
						escreva("\n(5) Solicitar empréstimo")
						escreva("\n(6) SAIR")
						escreva("\nOpção: ")
						leia(opcao)
						limpa()

						escolha(opcao) {
							caso 1:
								//Exibi saldo atual da conta
								escreva("\nSeu saldo atual é de: R$ ",  Matematica.arredondar(saldoConta, 2))
								Util.aguarde(500)
								pula()
							pare

							caso 2:
								//Movimentação dos dias
								escreva("\nOperações restantes no dia: ", 10-contador,"\n")
									se(contador < 10) {
										escreva("\nInforme quanto gostaria de depositar:  R$ ")
										leia(movimentoDia[l][contador])
										//Atribuição do $ a ser repositado na conta	
										saldoConta = saldoConta + movimentoDia[l][contador]
										//Exibição do saldo após depósito
										escreva("\nSeu novo saldo é de: R$ ",  Matematica.arredondar(saldoConta, 2))
										pula()
										contador++
									} senao {
										escreva("Limite de operações no dia alcançadas.\n")
									}		
							pare

							caso 3:
								//Movimentação dos dias
								escreva("\nOperações restantes no dia: ", 10-contador,"\n")
									se(contador < 10) {
										escreva("\nInforme quanto gostaria de sacar:  R$ ")
										leia(movimentoDia[l][contador])
										//movimentoDia[l][contador] = movimentoDia[l][contador] * (-1) devolve dif negativa
										limpa()
										//Se o saque for menos do que o saldo
										se(movimentoDia[l][contador] <= saldoConta) {
											//Saque retirado do saldo
											saldoConta = saldoConta - movimentoDia[l][contador]
											escreva("Você sacou a quantia de: R$ ", movimentoDia[l][contador])
											escreva("\nSeu novo saldo é de: R$",  Matematica.arredondar(saldoConta, 2),"\n")
											contador++
										} senao {
											escreva("Saldo insuficiente. Selecione nova opção.\n")
										}
									} senao {
										escreva("Limite de operações no dia alcançadas.\n")
									}
							pare

							caso 4:
								escreva("**** EXTRATO DA CONTA ****")

								para(c = 0; c < 10; c++){
									se(movimentoDia[l][c] != 0){
										escreva("\nMovimentação: ", movimentoDia[l][c])
									}
								}

								escreva("\nSeu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
								Util.aguarde(500)
								pula()
							pare

							caso 5:
								limpa()
									se(contador < 10){
										escreva("Quanto deseja solicitar de empréstimo?  R$ ")
										leia(movimentoDia[l][contador])

										se(movimentoDia[l][contador] < limite){
											escreva("Empréstimo aprovado.\n")
											saldoConta = saldoConta + movimentoDia[l][contador]
											escreva("Seu novo saldo com empréstimo empresarial concedido é de R$ ",  Matematica.arredondar(saldoConta, 2),"\n")
										}
										senao{
											escreva("Empréstimo negado.\n")
										}
									contador++
									}
							pare

							caso 6:
								escreva("Você optou por sair. Obrigado por utilizar nossos serviços!\n")
							pare	

							caso contrario:
								escreva("Opção inválida. Selecione nova opção.\n")
							pare								

						}//Final do escolha Conta Empresa

					} enquanto(opcao != 6)

					pare

					//CONTA UNIVERSITÁRIA - GIDEÃO
					caso 5:
					faca{	
						pula()
						escreva("|-----------------------------------------------------|\n")
						escreva("|                 CONTA UNIVERSITÁRIA                 |\n")
						escreva("|-----------------------------------------------------|\n")
						escreva("\n(1) Consultar Saldo")
						escreva("\n(2) Realizar Depósito")
						escreva("\n(3) Realizar Saque")
						escreva("\n(4) Imprimir extrato")
						escreva("\n(5) Solicitar empréstimo")
						escreva("\n(6) SAIR: ")
						escreva("\nOpção: ")
						leia(opcao)
						limpa()

						escolha (opcao){

	                       	caso 1:
	                         escreva("Seu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2), "\n\n") 
	                         Util.aguarde(500)
						pula()	
	                         pare

	                         caso 2:
	                             escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de depositar:  R$ ")
									leia(movimentoDia[l][contador])

									saldoConta = saldoConta + movimentoDia[l][contador]

									escreva("Seu novo saldo de R$ ",  Matematica.arredondar(saldoConta, 2), "\n")
									contador++
								}
								senao
	                                    {
										escreva("Saldo insuficiente. Selecione nova opcao")

								   }
	                         pare
	                         caso 3:
                                   escreva("Operações restantes no dia: ", 10-contador)

								se(contador < 10){
									escreva("\nInforme quanto gostaria de sacar:  R$ ")
									leia(movimentoDia[l][contador])

								se(movimentoDia[l][contador] <= saldoConta){
									saldoConta = saldoConta - movimentoDia[l][contador]
									escreva("Você sacou a quantia de R$ ", movimentoDia[l][contador])
									escreva("\nE seu novo saldo de R$ ",  Matematica.arredondar(saldoConta, 2), "\n")

									contador++
								}
								senao{
									escreva("Saldo insuficiente. Selecione nova opcao")
								}
							   }
                               pare

                               caso 4:
	                               escreva("**** EXTRATO DA CONTA ****")

									para(c = 0; c < 10; c++){
										se(movimentoDia[l][c] != 0){
											escreva("\nMovimentação: ", movimentoDia[l][c])
										}
									}

									escreva("\nSeu saldo é de R$ ",  Matematica.arredondar(saldoConta, 2))
									pula()
                               pare

	                          caso 5:
							se(contador < 10){
								escreva("Quanto deseja solicitar de empréstimo?  R$ ")
								leia(movimentoDia[l][contador])

								se(movimentoDia[l][contador] < limite){
									escreva("Empréstimo aprovado.\n")
									saldoConta = saldoConta + movimentoDia[l][contador]
									escreva("Seu novo saldo com o auxilio estudantil de R$ ",  Matematica.arredondar(saldoConta, 2),"\n")
								}
								senao{
									escreva("Empréstimo negado.\n")
								}

							contador++
							}
	                           pare

	                           caso 6:
							escreva("Você optou por sair. Obrigado por utilizar nossos serviços, volte sempre!!!!\n")

						  pare

                                caso contrario:
						  	escreva("Operação inválida. Selecione nova opçao.\n")
                                pare

						}

					}enquanto(opcao != 6)

					pare
					}
					// FINAL DO ESCOLHA CASO

				}enquanto (opcao == 0)

				escreva("\nFim do dia ", l+1, ". Deseja continuar? (S) SIM ou (N) NÃO: ")
				leia(continuar)
				se(continuar == 'N' ou continuar == 'n'){
					l = l + i
				}
				para(c = 0; c < j; c++){
					para(l = 0; l < i; l++){
						escreva(movimentoDia[l][c], "  ")
					}
				escreva("\n")
				}
			}
		}
	}
	
	funcao pula (){
		escreva("\n")
	}
	funcao linha(){
		escreva("\n------------------------------------------------\n")
	}

	funcao login (){
		escreva ("\n|-----------------------------------------------|")
		escreva( "\n|    SEJA BEM-VINDO AO SEU BANCO DIGITAL G&4    |")
		escreva ("\n|-----------------------------------------------|")
		pula()
		pula()
		escreva("||||||||||||||||||||| LOGIN |||||||||||||||||||||")
		pula()
		pula()
	}
	funcao menuPrincipal(){
		escreva ("\n|-----------------------------------------------|\n")
		escreva("|              SERVIÇOS DISPONÍVEIS             |")
		escreva ("\n|-----------------------------------------------|\n")
		escreva("|-------------------- M E N U ------------------|")
		escreva("\n[1] - Conta Poupança\n")
		escreva("[2] - Conta Corrente\n")
		escreva("[3] - Conta Especial\n")
		escreva("[4] - Conta Empresa\n")
		escreva("[5] - Conta Universitária\n")
		escreva("[0] - Sair do Banco\n")
		escreva("\nOpção: ")
	}

	funcao loading(){
		escreva("Loading")
		para (inteiro x=0;x<5;x++){
			escreva(".")
			Util.aguarde(500)
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 19864; 
 * @DOBRAMENTO-CODIGO = [41, 83];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */