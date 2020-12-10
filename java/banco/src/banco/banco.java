package banco;

import java.util.Scanner;

public class banco {

	public static void main(String args[]) {

		String cliente[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				"Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão",
				"Laís Lima Santos", "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
				"Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almenara",
				"Vinicius Alves Miranda" };

		int opcaoMenuPrincipal;
		String[] codigoCliente = new String[39];
		Scanner leia = new Scanner(System.in);

		insereCodigo(codigoCliente);
		

		do {
			System.out.println("█	     BANCO DIGITAL G&4		 █");
			telaPrincipal();
			opcaoMenuPrincipal = leia.nextInt();

			if (opcaoMenuPrincipal == 1) {
				/// CHAMA FUNCAO POUPANÇA
			} else if (opcaoMenuPrincipal== 2) {
				/// CHAMA FUNCAO CORRENTE
			} else if (opcaoMenuPrincipal == 3) {
				/// CHAMA FUNCAO ESPECIAL
			} else if (opcaoMenuPrincipal == 4) {
				/// CHAMA FUNCAO EMPRESA
			} else if (opcaoMenuPrincipal== 5) {
				/// CHAMA FUNCAO UNIVERSITARIA
			} else if (opcaoMenuPrincipal== 6) {
				System.out.println("Saindo do App, muito obrigado por utilizar nossos serviços!");
			} else {
				while (opcaoMenuPrincipal!= 1 && opcaoMenuPrincipal != 2 && opcaoMenuPrincipal != 3 
						&& opcaoMenuPrincipal != 4 && opcaoMenuPrincipal != 5 && opcaoMenuPrincipal != 6)
				{
					System.out.println("Por favor digite uma oção válida. Tente novamente!!\n ");
					telaPrincipal();
					opcaoMenuPrincipal = leia.nextInt();
				}	
								
			}

		} while (opcaoMenuPrincipal != 6);

	}

	public static void pula() {
		System.out.print("\n");
	}

	public static void linha() {
		System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
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

		linha();
		System.out.println("█\t   SERVIÇOS DISPONÍVEIS		 █");
		linha();
		System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ MENU ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
		System.out.print("[1] - Conta Poupança\n");
		System.out.print("[2] - Conta Corrente\n");
		System.out.print("[3] - Conta Especial\n");
		System.out.print("[4] - Conta Empresa\n");
		System.out.print("[5] - Conta Universitária\n");
		System.out.print("[6] - Sair do banco\n");
		pula();
		System.out.print("Opção: ");
	}
	

}
