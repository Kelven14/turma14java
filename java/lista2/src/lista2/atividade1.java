package lista2;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double pesoTomate = 0.0, E = 0.0, M = 0.0;
		final int valorMulta = 4;
		final int valorMax = 50;

		System.out.println("Por favor informe o peso do tomate!");
		System.out.printf("Peso [kg]: ");
		pesoTomate = leia.nextDouble();
		System.out.println();

		if (pesoTomate <= valorMax) {
			System.out.println("Não há multa por excesso de peso!");
		} else {
			E += (pesoTomate - valorMax);
			M = E * valorMulta;
			System.out.printf("O peso ultapassou o limite! \nExcesso  %.2f kg\nValor da multa: R$ %.2f ", E, M);
			System.out.println();
		}

		leia.close();
	}
}
