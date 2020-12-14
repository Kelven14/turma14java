package banco;

import java.util.Random;
import java.util.Scanner;

public class atividadeBancoFinal {

	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIAVEIS

		String cliente[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires", "Gabriel Enrique Cabral Silva",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos", "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
				"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almenara",
				"Vinicius Alves Miranda" };

		char genero[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M',
				'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
				'M' };
		int[] conta = new int[40];
		int[] tipoConta = new int[40];
		double[] saldoConta = new double[40];
		double[] movimento = new double[10];
		char[] tipoMovimento = new char[10];

		int opcaoMenuPrincipal;
		int encontra = 0;
		int escolha = 0, clienteLocalizado;
		int contador = 0;
		int quantidadeMovimentacao = 10;// QUANTIDADE DE MOVIMENTAÇÕES MAXIMAS
		char opcao = 'S';//
		char opcaoTipo;
		int movimentacaoDisponivel = 0;
		// VARIAVEIS VERONICA
		int[] talao = new int[40];
		int talaoCheque = 0;
		char opcaoTalao;
		// VARIAVEIS KELVEN
		double[] limite = new double[40];
		// VARIAVEIS JJ
		int diaUsuario = 0;
		int[] aniversario = new int[40];
		// VARIAVEIS BEYMAR
		char opcaoEmpresa; // opcao do menu empresa
		double emprestimo[] = new double[40];
		double saldoEmprestimo = 1000; // limite do meu emprestimo

		Scanner leia = new Scanner(System.in);

		inicializaVetor(conta, tipoConta, saldoConta, talao, limite, aniversario);

		System.out.print("DIGITE O NÚMERO DA CONTA: ");
		clienteLocalizado = leia.nextInt();

		for (int x = 0; x < 40; x++) {
			if (clienteLocalizado == conta[x]) {
				escolha = x; // fazer essa obs
				encontra = 1;
			}
		}

		if (encontra == 0) {
			System.out.print("Cliente não localizado.");
		} else {

			if (genero[escolha] == 'M') {
				System.out.println("SEJA BEM-VINDO AO G4 BANk SR. " + cliente[escolha] + ":)");
			} else if (genero[escolha] == 'F') {
				System.out.println("SEJA BEM-VINDA AO G4 BANk SRA. " + cliente[escolha] + ":)");
			}
		}

		while (encontra == 1) {

			if (tipoConta[escolha] == 1) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\t TIPO:CONTA POUPANÇA");
				/// JJ SUA PARTE VAI AQUI !!
				linha(80);
				System.out.printf("DIA DO ANIVERSÁRIO DA SUA CONTA: %d", aniversario[escolha]);
				System.out.print("\nINFORME O DIA DE HOJE: ");
				diaUsuario = leia.nextInt();

			} else if (tipoConta[escolha] == 2) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA CORRENTE");
			} else if (tipoConta[escolha] == 3) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA ESPECIAL");
			} else {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA EMPRESARIAL");
			}

			do {
				System.out.print("\n----------------------------------------------------\n");
				System.out.print("█	     BANCO DIGITAL G&4		 █\n");
				System.out.print("-----------------------------------------------------\n");
				System.out.print("\n------------ MENU INICIAL --------------\n\n");
				System.out.print("[1] - MOVIMENTAÇÃO\n");
				System.out.print("[2] - SALDO\n");
				System.out.print("[3] - SAIR\n");
				System.out.print("\nOpção: ");
				opcaoMenuPrincipal = leia.nextInt();

				if (opcaoMenuPrincipal == 1) {
					System.out.println("DESEJA INICIAR UMA MOVIMENTAÇÃO:[S]-Sim ou [N]-Não ");
					System.out.print("\nOPÇÃO: ");
					opcao = leia.next().toUpperCase().charAt(0);
					while (opcao == 'S') {

						movimentacaoDisponivel = quantidadeMovimentacao - contador;

						if (movimentacaoDisponivel > 0) {

							System.out.printf("\nVocê possui %d transações disponiveis", movimentacaoDisponivel);
							System.out.println();
							System.out.printf("\nO que você deseja fazer: [D]-Débito, [C]-Crédito ou [S]-Sair");
							System.out.print("\nOpção: ");
							opcaoTipo = leia.next().toUpperCase().charAt(0);

							if (opcaoTipo == 'D') {
								System.out.print("\nInforme quanto gostaria debitar:  R$ ");
								movimento[contador] = leia.nextDouble();
								while (movimento[contador] < 0) {
									System.out.printf("\nValor inválido! Digite novamente: R$ ");
									movimento[contador] = leia.nextDouble();
								}

								if (tipoConta[escolha] == 1) { /// JJ - POUPANCA

									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}

									} else {

										System.out.printf("Saldo insuficiente. Operação não realizada!");
									}

								} else if (tipoConta[escolha] == 2) { // VERONICA - CORRENTE
									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									} else {
										/// PARTE INDIVIDUAL VERONICA
										System.out.printf("Saldo insuficiente.\n");

										if (talao[escolha] > 0) {
											System.out.printf("Você tem %d talão(ões) de cheque disponível(is).",
													talao[escolha]);
											System.out.println(
													"\nVocê realmente deseja emitir um novo talão de cheque? (S)Sim - (N)Não: ");
											opcaoTalao = leia.next().toUpperCase().charAt(0);

											if (opcaoTalao == 'S') {
												talaoCheque++;
												talao[escolha]--;
												contador++;
												System.out.printf("Talão emitido sob o nº %d", talaoCheque);
											} else {
												System.out.printf("Talão não emitido");
											}
										} else {
											System.out.printf("O limite de talões de cheque por dia foi atingido.");
										}

									}
								} else if (tipoConta[escolha] == 3) { // KELVEN - ESPECIAL
									if (movimento[contador] > saldoConta[escolha] || saldoConta[escolha] == 0) {

										// PARTE INDIVIDUAL KELVEN
										System.out.println("Saldo insuficiente.");
										System.out.printf(
												"Para concluir a solicitação de débito foi utilizado o seu limite de R$ %.2f\n",
												limite[escolha]);

										if (saldoConta[escolha] < 0) {
											limite[escolha] = limite[escolha] - movimento[contador];
											saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
											System.out.printf(
													"Saldo atual R$ 0.00\tLimite Atual R$ " + limite[escolha] + "\n");
											tipoMovimento[contador] = 'D';
											contador++;
										} else {

											limite[escolha] = limite[escolha] - movimento[contador]
													+ saldoConta[escolha];
											saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
											System.out.printf(
													"Saldo atual R$ 0.00\tLimite Atual R$ " + limite[escolha] + "\n");
											tipoMovimento[contador] = 'D';
											contador++;
										}

									} else {

										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;

									}
									System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
									System.out.print("\nOpção: ");
									opcao = leia.next().toUpperCase().charAt(0);

									while (opcao != 'S' && opcao != 'N') {
										System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);
									}
								} else { /// BEYMAR - ESPECIAL

									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									} else {
										System.out.printf("\nSaldo insuficiente. ");
										System.out.print("Deseja solicitar um empréstimo [S] ou [N]?");
										System.out.print("\nOpção: ");
										opcaoEmpresa = leia.next().toUpperCase().charAt(0);

										if (opcaoEmpresa == 'S') {

											System.out.println("\nSaldo atual do empréstimo : " + saldoEmprestimo); // emprestimo
																													// atual
											System.out.print("Digite o valor solicitado do empréstimo: ");
											emprestimo[escolha] = leia.nextDouble();
											// valor max do emprestimo
											if (emprestimo[escolha] <= saldoEmprestimo) {
												saldoEmprestimo = saldoEmprestimo - emprestimo[escolha];
												saldoConta[escolha] = saldoConta[escolha] + emprestimo[escolha];
												System.out.println("\nSaldo do empréstimo : " + saldoEmprestimo); // emprestimo
																													// atual
												System.out.printf("\nSeu novo saldo é de R$ %.2f", saldoConta[escolha]);
												contador++; // contador para os movimentos diminuirem
											} else {
												System.out.print("\nPedido maior que seu limite!\n");
											}

										} else if (opcaoEmpresa == 'N') {
											System.out.println("Saldo do empréstimo : " + saldoEmprestimo); // emprestimo
																											// atual
											System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										} else {
											while (opcao != 'S' && opcao != 'N') {
												System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
												System.out.print("\nOpção: ");
												opcao = leia.next().toUpperCase().charAt(0);
											}
										}
									}
								}

							} else if (opcaoTipo == 'C') {
								System.out.print("\nInforme quanto gostaria creditar:  R$ ");
								movimento[contador] = leia.nextDouble();
								while (movimento[contador] < 0) {
									System.out.printf("\nValor inválido! Digite novamente: R$ ");
									movimento[contador] = leia.nextDouble();
								}

								if (tipoConta[escolha] == 3) {
									if (saldoConta[escolha] < 0) {

										limite[escolha] = limite[escolha] - saldoConta[escolha];
										saldoConta[escolha] = saldoConta[escolha] + movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'C';
										contador++;
									} else {
										saldoConta[escolha] = saldoConta[escolha] + movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'C';
										contador++;
									}

								} else if (tipoConta[escolha] == 4) {

									saldoConta[escolha] = saldoConta[escolha] + movimento[contador];
									System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
									tipoMovimento[contador] = 'C';
									contador++;

									System.out.print("\nDeseja solicitar um empréstimo [S] ou [N]?");
									System.out.print("\nOpção: ");
									opcaoEmpresa = leia.next().toUpperCase().charAt(0);

									if (opcaoEmpresa == 'S') {

										System.out.println("\nSaldo atual do empréstimo : " + saldoEmprestimo); // emprestimo
																												// atual
										System.out.print("Digite o valor solicitado do empréstimo: ");
										emprestimo[escolha] = leia.nextDouble();
										// valor max do emprestimo
										if (emprestimo[escolha] <= saldoEmprestimo) {
											saldoEmprestimo = saldoEmprestimo - emprestimo[escolha];
											saldoConta[escolha] = saldoConta[escolha] + emprestimo[escolha];
											System.out.println("\nSaldo do empréstimo : " + saldoEmprestimo); // emprestimo
																												// atual
											System.out.printf("\nSeu novo saldo é de R$ %.2f", saldoConta[escolha]);
											contador++; // contador para os movimentos diminuirem
										} else {
											System.out.print("\nPedido maior que seu limite!\n");
										}

									} else if (opcaoEmpresa == 'N') {
										System.out.println("Saldo do empréstimo : " + saldoEmprestimo); // emprestimo
																										// atual
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
									} else {
										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									}

								}

								else {
									saldoConta[escolha] = saldoConta[escolha] + movimento[contador];
									System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
									tipoMovimento[contador] = 'C';
									contador++;
								}
								System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
								System.out.print("\nOpção: ");
								opcao = leia.next().toUpperCase().charAt(0);

								while (opcao != 'S' && opcao != 'N') {
									System.out.println("Por favor digite [S] ou [N]. Tente novamente!");
									System.out.print("\nOpção: ");
									opcao = leia.next().toUpperCase().charAt(0);
								}
							} else if (opcaoTipo == 'S') {
								System.out.printf("saindo...\n");
								opcao = 'N';
							} else {
								while (opcaoTipo != 'D' && opcaoTipo != 'C' && opcaoTipo != 'S') {
									System.out
											.printf("\nO que você deseja fazer: [D]-Débito , [C]-Crédito OU [S]-Sair");
									System.out.print("\nOpção: ");
									opcaoTipo = leia.next().toUpperCase().charAt(0);
								}
							}

						} else {
							System.out.print("\nVocê não possui transações disponiveis, tente no dia seguinte\n");
							opcao = 'N';
						}

					}
					if (diaUsuario == aniversario[escolha]) {
						saldoConta[escolha] = 1.005 * saldoConta[escolha];
						System.out.printf("SALDO ATUAL COM REAJUSTE: R$ %.2f\n", saldoConta[escolha]);
					}

				}

				else if (opcaoMenuPrincipal == 2) {
					if (tipoConta[escolha] == 3) {
						if (saldoConta[escolha] < 0) {
							linha(45);
							System.out.printf("\nSeu saldo é de R$ 0,00 e possui um limite de R$ %.2f  ",
									limite[escolha]);
							System.out.println();
							linha(45);

						} else {
							linha(45);
							System.out.printf("\nSeu saldo é de R$ %.2f e possui um limite de R$ %.2f  ",
									saldoConta[escolha], limite[escolha]);
							System.out.println();
							linha(45);
						}
					} else if (tipoConta[escolha] == 4) {

						linha(45);
						System.out.printf("\nSeu saldo é de R$ %.2f ", saldoConta[escolha]);
						System.out.println();
						linha(45);

						System.out.print("\nDeseja solicitar um empréstimo [S] ou [N]?");
						System.out.print("\nOpção: ");
						opcaoEmpresa = leia.next().toUpperCase().charAt(0);

						if (opcaoEmpresa == 'S') {

							System.out.println("\nSaldo atual do empréstimo : " + saldoEmprestimo); // emprestimo
																									// atual
							System.out.print("Digite o valor solicitado do empréstimo: ");
							emprestimo[escolha] = leia.nextDouble();
							// valor max do emprestimo
							if (emprestimo[escolha] <= saldoEmprestimo) {
								saldoEmprestimo = saldoEmprestimo - emprestimo[escolha];
								saldoConta[escolha] = saldoConta[escolha] + emprestimo[escolha];
								System.out.println("\nSaldo do empréstimo : " + saldoEmprestimo); // emprestimo
																									// atual
								System.out.printf("\nSeu novo saldo é de R$ %.2f", saldoConta[escolha]);
								contador++; // contador para os movimentos diminuirem
							} else {
								System.out.print("\nPedido maior que seu limite!\n");
							}

						} else if (opcaoEmpresa == 'N') {
							System.out.println("Saldo do empréstimo : " + saldoEmprestimo); // emprestimo
																							// atual
							System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
						}

					}

					else {
						linha(45);
						System.out.printf("\nSeu saldo é de R$ %.2f ", saldoConta[escolha]);
						System.out.println();
						linha(45);
					}

				}

				else if (opcaoMenuPrincipal == 3) {
					System.out.println("Saindo do App, muito obrigado por utilizar nossos serviços!");
					System.exit(0);
				} else {

					System.out.println("Por favor digite uma oção válida. Tente novamente!!\n ");

				}

			} while (opcaoMenuPrincipal != 3);

		}
		leia.close();

	}// FIM MAIN

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("▬");
		}
		System.out.print("\n");
	}

	public static void inicializaVetor(int[] conta, int[] tipoConta, double[] saldoConta, int[] talao, double[] limite,
			int[] aniversario) {

		Random sorteia = new Random();

		for (int x = 0; x < 40; x++) {
			conta[x] = (x + 1);
			// tipoConta[x] = 4;
			tipoConta[x] = sorteia.nextInt(4) + 1;
			saldoConta[x] = 0.0;
			talao[x] = 3;
			limite[x] = sorteia.nextInt(900) + 101;
			aniversario[x] = sorteia.nextInt(31) + 1;
		}

		/*
		 * TABELA DE CONTAS
		 * 
		 * [1] - Conta Poupança [2] - Conta Corrente [3] - Conta Especial [4] - Conta
		 * Empresa
		 */
	}

}// FIM DO PROGRAMA
