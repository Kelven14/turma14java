package lista1;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		// Declara��o das variaveis
		int entradaSegundos, tempoSegundos, tempoMinutos, tempoHoras;

		// Declara��o de variaveis fixas
		final int conversaoHoras = 3600;
		final int conversaoMinutos = 60;

		System.out.println("Por favor informe  dura��o do evento em segundos: ");// Solicita a dura��o em segundos
		entradaSegundos = leia.nextInt();// guardar na variavel entradaSegundos o valor digitado

		// Calculo da quantidade em horas, minutos e segundos
		tempoHoras = (entradaSegundos) / (conversaoHoras);
		tempoMinutos = ((entradaSegundos % conversaoHoras) / conversaoMinutos);
		tempoSegundos = ((entradaSegundos % conversaoHoras) % conversaoMinutos);

		// Informa o tempo em horas, minutos e segundos
		System.out.println("A dura��o � de " + tempoHoras + " Horas, " + tempoMinutos + " minutos," + tempoSegundos
				+ " segundos.\n");

		leia.close(); // fecha o teclado
	}
}