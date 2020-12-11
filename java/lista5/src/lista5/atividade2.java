package lista5;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		int painel;
		double peso, altura, IMC;

		Scanner leia = new Scanner(System.in);

		linha();
		System.out.println("                 SISTEMA DE LEITURA DE PESO E ALTURA");
		linha();

		do {
			System.out.println("Digite o seu peso: ");
			peso = leia.nextDouble();
			System.out.println("Digite a sua altura: ");
			altura = leia.nextDouble();

			IMC = peso / Math.pow(altura, 2);
			linha();
			System.out.printf("Seu IMC – Índice de Massa Corporal é igual: %.2f", IMC);
			pula();

			if (IMC < 18.5) {
				System.out.println("Você está abaixo do peso");
				linha();
			} else if (IMC >= 18.5 && IMC < 25.0) {
				System.out.println("Você está com o peso normal");
				linha();
			} else if (IMC >= 25 && IMC < 30.0) {
				System.out.println("Você está acima do peso");
				linha();
			} else if (IMC >= 30.0) {
				System.out.println("Você está obeso");
				linha();
			} else {
				System.out.println("Opção inválida! Digite uma opção válida\n");
				linha();

			}
			System.out.println("Deseja fazer uma nova leitura? [1]-Sim ou [2]-Não\n");
			painel = leia.nextInt();
			linha();
		} while (painel == 1);
		
		leia.close();
	}

	public static void linha() {
		System.out.print("\n----------------------------------------------------------------\n");
	}

	public static void pula() {
		System.out.print("\n");
	}

	public static void linhaVariavel(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}
