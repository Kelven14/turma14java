package loja;

import java.util.Scanner;

public class cadastroLoja {

	public static void main(String[] args) {
		int opcaoGenero;
		String nome;
		
		String codigos[] = new String[10];
		String produtos[] = { "Vestido Jeans", "Shorts Jeans", "Calça Jeans", "Calça Xadrez", "Jaqueta Jeans",
				"Conjunto de moletom", "Vertido longo girassol", "Conjunto Kimono", "Macacão", "Croped" };
		double precoUnitarios[] = { 80, 30, 100, 40, 90, 70, 70, 40, 80, 20 };
		int estoque[] = new int[10];
		int carrinho[] = new int[10];
		
		char opcao = 0;
		int opcaoMenu = 0;

		Scanner leia = new Scanner(System.in);

		inicializaVetor(estoque, codigos,carrinho);

		do {
			opcaoMenu = menuPrincipal(leia, opcaoMenu);

			if (opcaoMenu == 1) {
				System.out.printf("\nPor favor informe o seu nome: ");
				nome = leia.next();
				opcaoGenero = lerGenero(leia);
				trataGenero(nome, opcaoGenero);
				imprimeListaProdutos(estoque, codigos, precoUnitarios, produtos);
				iniciaCarrinho(estoque, codigos, precoUnitarios, produtos, carrinho, leia);
				opcao = verifica(leia);
				
			} else if (opcaoMenu == 2) {
				System.out.print("WIP");// Work in progress
				opcao = verifica(leia);
			} else {
				System.out.print("Adoramos sua visita, volte sempre!");
				opcao = 'N';
			}

		} while (opcao == 'S');

		System.out.println("FIM DO PROGRAMA");
	}

	public static void linha(int tamanho) {
		for (int x = 0; x <= tamanho; x++) {
			System.out.print("-");
		}
	}

	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}

	public static int menuPrincipal(Scanner leia, int opcaoMenu) {
		inseriLinha(80, "▬");
		System.out.println("                                Loja Meury Modas.");
		System.out.println("                        Um novo conceito de Moda Feminina.");
		inseriLinha(80, "▬");
		System.out.println("\n[1]-COMPRAR PRODUTOS\n[2]-GERENCIAR ESTOQUE\n[3]-SAIR");
		System.out.printf("Opção: ");
		opcaoMenu = leia.nextInt();
		return opcaoMenu;
	}

	public static char verifica(Scanner leia) {
		System.out.println();
		System.out.println("Deseja Continuar? [S]-Sim ou [N]-Não ");
		char opcao = leia.next().toUpperCase().charAt(0);

		while (opcao != 'S' && opcao != 'N') {
			System.out.println("Por favor digite [S] ou [N]. Tente novamente: ");
			opcao = leia.next().toUpperCase().charAt(0);
		}
		return opcao;
	}

	public static int lerGenero(Scanner leia) {
		System.out.println("Informe como você se identifica: [1]Masculino, [2]Feminino ou [3]Outros");
		System.out.printf("Opção: ");
		int opcaoGenero = leia.nextInt();
		return opcaoGenero;
	}

	public static void trataGenero(String nome, int opcao) {
		if (opcao == 1) {
			System.out.printf("\nSeja bem-vindo %s !\n", nome);
		} else if (opcao == 2) {
			System.out.printf("\nSeja bem-vinda %s !\n", nome);
		} else if (opcao == 3) {
			System.out.printf("\nSeja bem-vindx %s !\n", nome);
		}

	}

	public static void inicializaVetor(int[] estoque, String[] codigos,int[] carrinho) {
		for (int x = 0; x < 10; x++) {
			estoque[x] = 10;
			carrinho[x] = 0;
			codigos[x] = (x < 9) ? "MM-0" + (x + 1) : "MM-" + (x + 1);
		}
	}

	public static void imprimeListaProdutos(int[] estoque, String[] codigos, double[] precoUnitarios,
			String[] produtos) {
		inseriLinha(80, "▬");
		System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
		inseriLinha(80, "▬");
		for (int x = 0; x < 10; x++) {
			System.out.printf("%s\t\t%.2f\t\t  %d\t%s\n", codigos[x], precoUnitarios[x], estoque[x], produtos[x]);

		}
		inseriLinha(80, "▬");
	}

	public static void iniciaCarrinho(int[] estoque, String[] codigos, double[] precoUnitarios, String[] produtos,
			int[] carrinho, Scanner leia) {

		int salvaIndice = 0, quantidadeProdutos, somaTotal;
		String escolha;

		System.out.print("\nSelecione um produto pelo código: ");
		escolha = leia.next().toUpperCase();
		;

		for (int x = 0; x < 10; x++) {
			if (codigos[x].equals(escolha)) {
				salvaIndice = x;
				// System.out.println("Escolhdo foi "+salvaIndice);
			}

		}
		System.out.println("Produto escolhido: " + produtos[salvaIndice]);
		System.out.print("Quantos itens você deseja levar? ");
		quantidadeProdutos = leia.nextInt();
		
	}
}
