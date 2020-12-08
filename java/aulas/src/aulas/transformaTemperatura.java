package aulas;

import java.util.Scanner;

public class transformaTemperatura {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int painel = 1, opcao;
		double temperaturaCelsius, temperaturaFahrenheit, temperaturaKelvin;

		while (painel == 1) {
			System.out.println(
					"\nEscolha uma opção de conversão de temperatura:\n[1]-Celsius para Fahrenheit\n[2]-Celsius para Kelvin\n"
							+ "[3]-Fahrenheit para Celsius\n[4]-Fahrenheit para Kelvin\n[5]-Kelvin para Celsius\n[6]-Kelvin para Fahrenheit\n[7]-Sair");

			System.out.println("Opção: ");
			opcao = leia.nextInt();

			if (opcao == 1) {
				System.out.println("Digite a temperatura em Celsius (°C): ");
				temperaturaCelsius = leia.nextDouble();
				temperaturaFahrenheit = ((temperaturaCelsius * 9) / 5) + 32;
				System.out.printf("A temperatura em Fahrenheit é %.2f ° F", temperaturaFahrenheit);
				
			} else if (opcao == 2) {
				System.out.println("Digite a temperatura em Celsius (°C): ");
				temperaturaCelsius = leia.nextDouble();
				temperaturaKelvin = temperaturaCelsius + 273;
				System.out.printf("A temperatura em kelvin é %.2f K" , temperaturaKelvin);
				
			} else if (opcao == 3) {
				System.out.println("Digite a temperatura em Fahrenheit (°F): ");
				temperaturaFahrenheit = leia.nextDouble();
				temperaturaCelsius = ((temperaturaFahrenheit - 32) * 5 / 9);
				System.out.printf("A temperatura em Fahrenheit é %.2f  C", temperaturaCelsius);
				
			} else if (opcao == 4) {
				System.out.println("Digite a temperatura em Fahrenheit (°F): ");
				temperaturaFahrenheit = leia.nextDouble();
				temperaturaKelvin=((temperaturaFahrenheit-32)*(5/9))+273.15;
				System.out.printf("A temperatura em kelvin é %.2f K" , temperaturaKelvin);
				
			} else if (opcao == 5) {
				System.out.println("Digite a temperatura em kelvin (K):");
				temperaturaKelvin=leia.nextDouble();
				temperaturaCelsius=temperaturaKelvin-273;
				System.out.printf("A temperatura em Fahrenheit é %.2f ° C", temperaturaCelsius);
				
			} else if (opcao == 6) {
				System.out.println("Digite a temperatura em kelvin (K):");
				temperaturaKelvin=leia.nextDouble();
				temperaturaFahrenheit=((temperaturaKelvin-273.15)*(9/5))+32;
				System.out.printf("A temperatura em Fahrenheit é %.2f ° F", temperaturaFahrenheit);
				
			}
			else if (opcao == 7) {
				System.out.println("Programa Finalizado");
				painel = 0;
			}

			else {
				System.out.println("Opção inválida, escolha uma opção válida!");
			}

			System.out.println();
		}
		leia.close();

	}
}
