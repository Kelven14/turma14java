package loja;

import java.util.Scanner;

public class cadLoja {
	public static void main(String[] args) {
		int opcaoGenero,opcaoMenu;
		String nome,tipo;
		
		Scanner leia = new Scanner (System.in);
		
		
		linha(70);
		System.out.println("\nLoja Meury Modas.\nUm novo conceito de Moda feminina.");
		linha(70);
		System.out.println("\n[1]-COMPRAR PRODUTOS\n[2]-GERENCIAR ESTOQUE\n[3]-SAIR");
		opcaoMenu=leia.nextInt();
		
		if(opcaoMenu==1) {
			System.out.println("Por favor informe o seu nome: ");
			nome=leia.next();
			System.out.println("Informe como você se identifica: [1]Masculino\\n[2]Feminino\n[3]Outros");
			opcaoGenero=leia.nextInt();
			if()
		}
		else if(opcaoMenu==2) {
			System.out.print("WIP");// Work in progress
		}
		else {
			System.out.print("Adoramos sua visita, volte sempre!");
		}
				
		leia.close();
	}
	
	
	public static void linha(int tamanho) {
		for (int x=0; x<=tamanho;x++) {
			System.out.print("-");
		}
	}
	public static String genero(int opcao) {
		String tipo = null;
		
		if(opcao==1) {
		tipo="MASCULINO";
		}
		else if(opcao==2) {
		tipo="FEMININO";	
		}
		else if(opcao==3) {
		tipo="OUTROS";
		}
		
		return tipo;
	}
}
