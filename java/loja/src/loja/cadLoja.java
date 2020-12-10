package loja;

import java.util.Scanner;

public class cadLoja {
	public static void main(String[] args) {
		// VARIAVEIS
		int opcaoGenero = 0, opcaoMenu=0 ;
		String nome = null;

		// ABRE TECLADO
		Scanner leia = new Scanner(System.in);
		
		opcaoMenu=menuPrincipal(leia,opcaoMenu);
	
		limpaTela(40);
		analisaMenu(leia, opcaoMenu, nome, opcaoGenero);

		// FECHA TECLADO
		leia.close();
	}

	public static void linha(int tamanho) {
		for (int x = 0; x <= tamanho; x++) {
			System.out.print("-");
		}
	}

	public static int menuPrincipal(Scanner leia,int opcaoMenu) {
		linha(70);
		System.out.println("\nLoja Meury Modas.\nUm novo conceito de Moda Feminina.");
		linha(70);
		System.out.println("\n[1]-COMPRAR PRODUTOS\n[2]-GERENCIAR ESTOQUE\n[3]-SAIR");
		System.out.printf("Opção: ");
		opcaoMenu = leia.nextInt();
		return opcaoMenu;
	}

	public static void analisaMenu(Scanner leia, int opcaoMenu, String nome, int opcaoGenero) {

		if (opcaoMenu == 1) {
			System.out.printf("\nPor favor informe o seu nome: ");
			nome = leia.next();
			System.out.println("Informe como você se identifica: \n[1]Masculino\n[2]Feminino\n[3]Outros");
			System.out.printf("Opção: ");
			opcaoGenero = leia.nextInt();
			genero(nome, opcaoGenero);
		} else if (opcaoMenu == 2) {
			System.out.print("WIP");// Work in progress
		} else {
			System.out.print("Adoramos sua visita, volte sempre!");
		}

	}

	public static void genero(String nome, int opcao) {
		if (opcao == 1) {
			System.out.printf("\nSeja bem-vindo %s a loja!", nome);
		} else if (opcao == 2) {
			System.out.printf("\nSeja bem-vinda %s a loja!", nome);
		} else if (opcao == 3) {
			System.out.printf("\nSeja bem-vindx %s a loja!", nome);
		}

	}

	public static void limpaTela(int tamanho) {
		for (int x = 0; x <= tamanho; x++) {
			System.out.printf("\n");
		}
	}

}
