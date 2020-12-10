package loja;

import java.util.Scanner;

public class cadastroLoja {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		char opcao = 0;
		int opcaoMenu = 0;

		do {
			opcaoMenu = menuPrincipal(leia, opcaoMenu);
			opcao=analisaMenu(leia, opcaoMenu, opcao);

		} while (opcao == 'S');

		System.out.println("FIM DO PROGRAMA");
	}

	public static void linha(int tamanho) {
		for (int x = 0; x <= tamanho; x++) {
			System.out.print("-");
		}
	}

	public static int menuPrincipal(Scanner leia, int opcaoMenu) {
		linha(70);
		System.out.println("\nLoja Meury Modas.\nUm novo conceito de Moda Feminina.");
		linha(70);
		System.out.println("\n[1]-COMPRAR PRODUTOS\n[2]-GERENCIAR ESTOQUE\n[3]-SAIR");
		System.out.printf("Opção: ");
		opcaoMenu = leia.nextInt();
		return opcaoMenu;
	}

	public static char analisaMenu(Scanner leia, int opcaoMenu, char opcao) {
		int opcaoGenero;
		String nome;

		if (opcaoMenu == 1) {
			System.out.printf("\nPor favor informe o seu nome: ");
			nome = leia.next();
			opcaoGenero = lerGenero(leia);
			trataGenero(nome, opcaoGenero);
			opcao = verifica(leia);
		} else if (opcaoMenu == 2) {
			System.out.print("WIP");// Work in progress
			opcao = verifica(leia);
		} else {
			System.out.print("Adoramos sua visita, volte sempre!");
			opcao = 'N';
		}
		return opcao;
	}

	public static char verifica(Scanner leia) {
		System.out.println();
		System.out.println("Deseja Continuar? [S]-Sim ou [N]-Não ");
		char opcao = leia.next().toUpperCase().charAt(0);

		while (opcao != 'S' && opcao != 'N')
		{
			System.out.println("Por favor digite [S] ou [N]. Tente novamente: ");
			opcao = leia.next().toUpperCase().charAt(0);
		}
		return opcao;
	}

	public static int lerGenero(Scanner leia) {
		System.out.println("Informe como você se identifica: \n[1]Masculino\n[2]Feminino\n[3]Outros");
		System.out.printf("Opção: ");
		int opcaoGenero = leia.nextInt();
		return opcaoGenero;
	}

	public static void trataGenero(String nome, int opcao) {
		if (opcao == 1) {
			System.out.printf("\nSeja bem-vindo %s a loja!", nome);
		} else if (opcao == 2) {
			System.out.printf("\nSeja bem-vinda %s a loja!", nome);
		} else if (opcao == 3) {
			System.out.printf("\nSeja bem-vindx %s a loja!", nome);
		}

	}

}
