package lista3;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		int numero;
		final int limite = 100;

		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite um número: ");
		numero = leia.nextInt();
		System.out.printf("Sequencia: " + numero);

		while (numero <= limite) {
			numero *= 3;
			System.out.printf(" " + numero + " ");

		}
		leia.close();

	}

}
