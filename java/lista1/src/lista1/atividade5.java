package lista1;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota1,nota2,nota3,media;
		
		
		System.out.println("Informe o valor da nota 1: ");
		nota1 = leia.nextInt();
		System.out.println("Informe o valor da nota 2: ");
		nota2 = leia.nextInt();
		System.out.println("Informe o valor da nota 3: ");
		nota3 = leia.nextInt();
		
		media=(2*nota1+3*nota2+5*nota3)/10;
				
		System.out.printf(" A média final do aluno é %.2f",media,".");
		leia.close();
		
		
	}

}