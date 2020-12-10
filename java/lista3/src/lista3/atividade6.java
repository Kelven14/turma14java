package lista3;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {

		int numero, soma = 0, contador = 0;
		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite um número: ");
		numero = leia.nextInt();
		System.out.printf("Sequencia Gerada: ");

		do {
			contador++;
			soma = soma + contador;
			System.out.printf(contador + " ");

		} while (contador < numero);
		System.out.printf("\nA soma é igual %d ", soma);

		leia.close();
	}

}
