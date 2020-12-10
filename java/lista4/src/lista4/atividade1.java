package lista4;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		final int tamanho = 5;
		double pontuacao[] = new double[tamanho];
		double maiorNota = -1;

		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n      Digite as %d notas da atividade", tamanho);
		System.out.printf("\n------------------------------------------------------");

		for (int x = 0; x < tamanho; x++) {

			System.out.printf("\nInsira " + (x + 1) + "° nota: ");
			pontuacao[x] = leia.nextDouble();
			if (pontuacao[x] > maiorNota) {
				maiorNota = pontuacao[x];
			}
		}
		System.out.printf("\nSequência das Notas: ");

		for (int x = 0; x < tamanho; x++) {
			System.out.println(pontuacao[x] + ", ");
		}
		System.out.println("\nA Maior Nota Digita foi: " + maiorNota);

		leia.close();
	}

}
