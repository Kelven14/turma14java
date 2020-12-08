package lista2;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Declaração de variaveis
		int numero;

		// Solicita numero e faz leitura do numero
		System.out.printf("Digite um número inteiro : ");
		numero = leia.nextInt();

		if (numero == 0) {
			System.out.println("Voce digitou o zero!!\n");
		}

		else if (numero < 0) {
			if (numero % 2 == 0) {
				System.out.println("O número digitado é par e negativo\n");
			} else {
				System.out.println("O número digitado é ímpar e negativo\n");
			}
		}

		else if (numero > 0) {
			if ((numero % 2) == 0) {
				System.out.println("O número digitado é par e positivo\n");
			} else {
				System.out.println("O número digitado é ímpar e positivo\n");
			}
		}

		else {
			System.out.println("O número digitado inválido\n");
		}

		leia.close();
	}

}
