package lista3;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {

		final int numeroHabitantes = 3, limiteSalario = 100;
		double somaFilhos = 0.0;
		double mediaSalario = 0.0, somaSalario = 0.0, valorSalario, quantidadeFilhos = 0.0, maiorSalario = 0.0,
				quantidadeSalario100 = 0.0;
		double mediaFilhos = 0.0, porcentagem = 0.0;

		Scanner leia = new Scanner(System.in);

		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n       PESQUISA REALIZADA PELA PREFEITURA             ");
		System.out.printf("\n------------------------------------------------------");

		for (int contador = 1; contador <= numeroHabitantes; contador++) {
			System.out.printf("\n" + contador + "° habitante:\nDigite o seu salário: ");
			valorSalario = leia.nextDouble();
			System.out.printf("Digite a quantidade de filhos: ");
			quantidadeFilhos = leia.nextDouble();

			if (valorSalario <= limiteSalario) {
				quantidadeSalario100 += 1;
			}
			if (valorSalario > maiorSalario) {
				maiorSalario = valorSalario;
			}
			somaSalario += valorSalario;
			somaFilhos += quantidadeFilhos;
		}
		porcentagem = (quantidadeSalario100 / numeroHabitantes) * 100;
		mediaSalario = somaSalario / numeroHabitantes;
		mediaFilhos = somaFilhos / numeroHabitantes;

		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\n                  DADOS DA PESQUISA                   ");
		System.out.printf("\n------------------------------------------------------");
		System.out.printf("\nMédia do salário da população: %.2f", mediaSalario);
		System.out.printf("\nMédia do número de filhos da população: %.2f ", mediaFilhos);
		System.out.printf("\nMaior Salario: %.2f ", maiorSalario);
		System.out.printf("\nPorcentagem de pessoas com sárário até R$100,00: %.2f ", porcentagem);
		System.out.println("%\n");

		leia.close();
	}

}