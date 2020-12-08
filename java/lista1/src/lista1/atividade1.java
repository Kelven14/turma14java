package lista1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 

		// Declaração das variaveis
		int anosNascimento, mesesNascimento, diasNascimento;
		// Declaração de variaveis fixas
		final int diasDoMes = 30;
		final int diasDoAno = 365;

		// Solicita a idade da pessoa em anos,meses e dias

		System.out.println("Por favor informe sua idade!");
		System.out.println("\nAnos: ");
		anosNascimento = leia.nextInt();
		System.out.println("Meses: ");
		mesesNascimento = leia.nextInt();
		System.out.println("Dias: ");
		diasNascimento = leia.nextInt();

		// Calculo da quantidade de dias
		diasNascimento += (mesesNascimento * diasDoMes) + (anosNascimento * diasDoAno);

		// Informa a idade da pessoa em dias
		System.out.println("A sua idade em dias é " + diasNascimento);

		leia.close(); // fecha o teclado

	}

}
