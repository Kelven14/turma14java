package lista4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		final int N = 3;
		int M[][] = new int[N][N];
		int somaD = 0, somaT = 0;
		int TECLA = 0;
		int Painel = 1, k = 1;
		Scanner leia = new Scanner(System.in);

		for (int l = 0; l < N; l++) {
			for (int c = 0; c < N; c++) {
				System.out.print("Digite o elemento " + k + " da matriz M[" + l + "][" + c + "]: ");
				M[l][c] = leia.nextInt();
				k++;

				somaT = somaT + M[l][c];

				if (l == c) {
					somaD = somaD + M[l][c];
				}

			}
		}

		System.out.print("------------------------------------------------------\n");
		System.out.println("Matriz M: \n");
		for (int linha = 0; linha < N; linha++) {
			System.out.print("|");
			for (int coluna = 0; coluna < N; coluna++) {
				System.out.print(M[linha][coluna] + " ");
			}
			System.out.println("|\n");
		}

		while (Painel == 1) {
			System.out.print("\n------------------------------------------------------");
			System.out.print(
					"\nEscolha uma das opções para apresentar o resultado desejado: \n 1-Soma de todos os elementos da matriz \n 2-Soma dos termos da diagonal principal da matriz \n 3-Para sair\n");
			TECLA = leia.nextInt();

			if (TECLA == 1) {
				System.out.print("\n------------------------------------------------------\n");
				System.out.print("Soma de todos os elementos da matriz: " + somaT);

			}
			if (TECLA == 2) {
				System.out.print("\n------------------------------------------------------\n");
				System.out.print("Soma dos termos da diagonal principal da matriz: " + somaD);
			}

			if (TECLA == 3) {
				Painel = 0;
			}
		}
		leia.close();

	}

}
