package lista4;

import java.util.Random;

public class atividade2 {

	public static void main(String[] args) {
		final int N = 10;
		int resultado[] = new int[N];
		int maiorValor = 0, ocorrencia = 0;
		double media, soma = 0.0;
	
		Random sorteia = new Random();

		for (int x = 0; x < N; x++) {
			resultado[x] = sorteia.nextInt(6) + 1;
			soma += resultado[x];
			if (resultado[x] > maiorValor) {
				maiorValor = resultado[x];
			}
		}

		media = soma / N;

		for (int x = 0; x < N; x++) {
			if (resultado[x] == maiorValor) {
				ocorrencia++;
			}
		}

		System.out.println("\n------------------------------------------------------");
		System.out.println("\n            Resultados obtidos           ");
		System.out.println("\n------------------------------------------------------\n");
		for (int x = 0; x < N; x++) {
			System.out.println("A Jogada " + (x + 1) + " teve a seguinte face: " + resultado[x] + "\n");
		}

		System.out.println("Média dos valores: "+ media);
		System.out.println("\nA maior face obtida em " + N + " jogadas foi a face " + maiorValor + " com " + ocorrencia
				+ " repetições.");

	}

}
