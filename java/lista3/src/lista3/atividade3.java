package lista3;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {

		double media = 0.0, numerosLido = 0, soma = 0;
		int numero = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("------------------------- INFORMA��ES DO SISTEMA ---------------------------");
		System.out.printf("\nDigite valoes positivos.Se quiser finalizar digite um numero negativo!!");
		System.out.printf("\n-----------------------------------------------------------------------");

		while (numero >= 0) {
			System.out.printf("\nInsira o valor desejado: ");
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;
				numerosLido += 1;
			}

		}
		media = (soma / numerosLido);

		System.out.printf("\n------------------------- INFORMA��ES FINAIS---------------------------");
		System.out.printf("\nQuantidade de n�meros digitados: %.2f", numerosLido);
		System.out.printf("\nA soma desses n�meros �: %.2f", soma);
		System.out.printf("\nA m�dia desses n�meros �: %.2f", media);

		leia.close();
	}

}
