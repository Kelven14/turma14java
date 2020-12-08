package lista1;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A, B,C;
		double D,R,S;
		
		System.out.println("Informe o valor de A: ");
		A = leia.nextInt();
		System.out.println("Informe o valor de B: ");
		B = leia.nextInt();
		System.out.println("Informe o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R + S)/2;
		
		System.out.printf(" D é igual a %.2f",D,".");
		leia.close();
		
		
	}

}
