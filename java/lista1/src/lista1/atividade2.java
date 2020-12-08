package lista1;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 

		// Declaração das variaveis
		int anosNascimento, mesesNascimento, diasNascimento;
		// Declaração de variaveis fixas
		final int diasDoMes = 30;
		final int diasDoAno = 365;

		// Solicita a idade da pessoa em anos,meses e dias

		System.out.println("Por favor informe sua idade em dias: ");
		diasNascimento = leia.nextInt();

		// Calculo da quantidade de anos,meses,dias
		anosNascimento = diasNascimento / diasDoAno;
		mesesNascimento = ((diasNascimento) % (diasDoAno)) / diasDoMes;
		diasNascimento = ((diasNascimento) % (diasDoAno)) % diasDoMes;

		// Informa a idade da pessoa em anos,meses e dias
		System.out.println("A sua idade é " + anosNascimento + " anos, " + mesesNascimento + " meses," + diasNascimento
				+ " dias.");

		leia.close(); // fecha o teclado

	}

}
