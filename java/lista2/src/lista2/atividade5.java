package lista2;

import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double indicePoluicao;

		System.out.printf("Digite o indice de polui��o: ");
		indicePoluicao = leia.nextDouble();

		if (indicePoluicao > 0.25 && indicePoluicao < 0.4) {
			System.out.println("ATEN��O!!!� necessa�rio paralizar as atividades do 1� GRUPO");
		} else if (indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
			System.out.println("ATEN��O!!!� necessa�rio paralizar as atividades do 1� GRUPO e 2� GRUPO");
		} else if (indicePoluicao >= 0.5) {
			System.out.println("ATEN��O! � necessa�rio paralizar as atividades de todos os grupos");
		} else {
			System.out.println("Ind�ce de polui��o dentro dos padr�es aceit�veis");
		}

		leia.close();
	}

}
