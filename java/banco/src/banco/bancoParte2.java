package banco;

import java.util.Random;
import java.util.Scanner;

public class bancoParte2 {

	final static int quantidadeMovimentacao = 4;//QUANTIDADE DE MOVIMENTAÇÕES MAXIMAS

	public static void main(String args[]) {
		
		//DECLARAÇÃO DE VARIAVEIS

		String cliente[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa",
				  "Bárbara Liboni Guerra", "Beatriz Martins", "Beymar Jhoel Acapa Lima",
				  "Breno Nogueira Botelho Noccioli", "Daniel Augusto Gomes Ferreira Filho",
				  "Danilo Mendes Ferreira", "Danilo Pereira da Silva", "Davi Silva Vieira",
				  "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira",
				  "Ewerton Inacio Lima", "FERNANDA AGAPITO", "Fernanda Barbosa Ferraz",
				  "Francisco José Pires","Gabriel Enrique Cabral Silva"
				  ,"Gabriel Sérgio Nascimento Santos Gonçalves",
				  "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				  "Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles",
				  "HELOISA BEATRIZ DE OLIVEIRA COSTA", "Igor Mateus Queiroz Gato",
				  "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				  "José Jorge Hauck Júnior", "Juliana Santos André",
				  "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos",
				  "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
				  "Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves",
				  "Micaely da Silva Lima", "Rafaela Oliveira Silva",
				  "Tiago dos Santos Martins", "Verônica Navarro Almenara",
				  "Vinicius Alves Miranda" };
		
		char genero[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F',
				'M','F','M','M','M','M','M','F','F','M','F','M'};
		int [] conta= new int[40];
		int [] tipoConta= new int[40];	
		double [] saldoConta= new double[40];
		double [] movimento= new double[10];
		char[] tipoMovimento= new char[10];
		int opcaoMenuPrincipal;
		
		inicializaVetor(conta,tipoConta,saldoConta);
		//INICIALIZA TECLADO
		Scanner leia = new Scanner(System.in);

		// insereCodigo(codigoCliente);

		//LOOP DO MENU PRINCIPAL
		do {
			
			telaPrincipal();
			opcaoMenuPrincipal = leia.nextInt();

			if (opcaoMenuPrincipal == 1) {
				
			} else if (opcaoMenuPrincipal == 2) {
				/// CHAMA FUNCAO CORRENTE
			} else if (opcaoMenuPrincipal == 3) {
				contaEspecial(leia);
			} else if (opcaoMenuPrincipal == 4) {
				/// CHAMA FUNCAO EMPRESA
			} else if (opcaoMenuPrincipal == 5) {
				/// CHAMA FUNCAO UNIVERSITARIA
			} else if (opcaoMenuPrincipal == 6) {
				System.out.println("Saindo do App, muito obrigado por utilizar nossos serviços!");
				System.exit(0);
			} else {
				while (opcaoMenuPrincipal != 1 && opcaoMenuPrincipal != 2 && opcaoMenuPrincipal != 3
						&& opcaoMenuPrincipal != 4 && opcaoMenuPrincipal != 5 && opcaoMenuPrincipal != 6) {
					System.out.println("Por favor digite uma oção válida. Tente novamente!!\n ");
					telaPrincipal();
					opcaoMenuPrincipal = leia.nextInt();
				}

			}

		} while (opcaoMenuPrincipal != 6);

		leia.close();
	}

	public static void contaEspecial(Scanner leia) {
		int opcaoMenuEspecial = 0, numeroConta, contador;
		char opcao;
		double saldoConta = 0.0, valorDesejado;

		linha(45);
		System.out.printf("Digite o número da conta: ");
		numeroConta = leia.nextInt();
		System.out.printf("\nSeu saldo é de R$ %.2f ", saldoConta);
		System.out.println();
		linha(45);

		do {

			for (contador = 0; contador <= quantidadeMovimentacao; contador++) {
				pula();
				linha(45);
				System.out.println("█\t   CONTA ESPECIAL		    █");
				linha(45);

				if ((quantidadeMovimentacao - contador) > 0) {
					System.out.printf("\nVocê possui %d transações disponiveis", (quantidadeMovimentacao - contador));

					System.out.print("\nSelecione a opção desejada: ");
					System.out.print("\n(1) Consultar Saldo");
					System.out.print("\n(2) Realizar Depósito");
					System.out.print("\n(3) Realizar Saque");
					System.out.print("\n(4) Imprimir extrato");
					System.out.print("\n(5) SAIR: ");
					System.out.print("\nOpção: ");
					opcaoMenuEspecial = leia.nextInt();

					if (opcaoMenuEspecial == 1) {
						System.out.printf("Seu saldo é de R$ %.2f", saldoConta);
						System.out.println();
						contador--;
					} else if (opcaoMenuEspecial == 2) {
						if (contador < quantidadeMovimentacao) {
							System.out.print("\nInforme quanto gostaria de depositar:  R$ ");
							valorDesejado = leia.nextDouble();

							saldoConta = saldoConta + valorDesejado;

							System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta);
							pula();

						} else if ((contador - quantidadeMovimentacao) == 0) {
							System.out.println("Limite de operações no dia alcançadas.");
							opcaoMenuEspecial = 5;
						}

					} else if (opcaoMenuEspecial == 3) {
							//SAQUE
					} else if (opcaoMenuEspecial == 4) {
							  //EXTRATO
					} else if (opcaoMenuEspecial == 5) {
						System.out.println("Retornando para o menu principal");
						System.out.println();
					} else {
						while (opcaoMenuEspecial != 1 && opcaoMenuEspecial != 2 && opcaoMenuEspecial != 3
								&& opcaoMenuEspecial != 4 && opcaoMenuEspecial != 5) {
							linha(45);
							System.out.printf("Por favor digite uma oção válida. Tente novamente!!");
							System.out.print("\nSelecione a opção desejada: ");
							System.out.print("\n(1) Consultar Saldo");
							System.out.print("\n(2) Realizar Depósito");
							System.out.print("\n(3) Realizar Saque");
							System.out.print("\n(4) Imprimir extrato");
							System.out.print("\n(5) SAIR: ");
							System.out.print("\nOpção: ");
							opcaoMenuEspecial = leia.nextInt();
						}
					}
				} else {
					System.out.print("\nVocê não possui transações disponiveis, tente no dia seguinte\n");
					opcaoMenuEspecial = 5;
				}
			}
		} while (opcaoMenuEspecial != 5);

	}

	public static void pula() {
		System.out.print("\n");
	}

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("▬");
		}
		System.out.print("\n");
	}

	public static void insereCodigo(String[] codigoCliente) {
		for (int x = 0; x < 39; x++) {

			if (x < 9) {
				codigoCliente[x] = "G4-0" + (x + 1); // PARA NUMEROS MENORES QUE DEZ, ACRESCENTA UM ZERO NA FRENTE DO
														// NÚMERO
			} else {
				codigoCliente[x] = "G4-" + (x + 1);
			}
		}

	}

	public static void telaPrincipal() {
		linha(42);
		System.out.println("█	     BANCO DIGITAL G&4		 █");
		linha(42);
		System.out.println("█\t   SERVIÇOS DISPONÍVEIS		 █");
		linha(42);
		System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ MENU ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
		System.out.print("[1] - Conta Poupança\n");
		System.out.print("[2] - Conta Corrente\n");
		System.out.print("[3] - Conta Especial\n");
		System.out.print("[4] - Conta Empresa\n");
		System.out.print("[5] - Conta Universitária\n");
		System.out.print("[6] - Sair do banco\n");
		pula();
		System.out.print("Opção: ");
	}
	
	
	public static void inicializaVetor(int [] conta,int [] tipoConta,double [] saldoConta) {
		Random sorteia = new Random();
		
		for (int x = 0; x < 10; x++) {
			conta[x] = (x+1);
			tipoConta[x] =  sorteia.nextInt(5) + 1;
			saldoConta[x]=0.0;
		}
		
	
	}


	
}