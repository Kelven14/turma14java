package lista2;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		String C;
		int N,E=0;
		double salarioBase,salarioExcedente,salarioTotal;
		
		final double custoPorHora=10.00;
		final double custoHoraExtra=20.00; 
		final int limiteHoras=50;
		
		
			 System.out.printf("Insira o C�digo do funcion�rio: ");
			 C=leia.next();
			 System.out.printf("Insira o n�mero de horas trabalhadas : ");
			 N=leia.nextInt();

			if(N>limiteHoras){
				E+=(N-limiteHoras);
				salarioBase=N*custoPorHora;
				salarioExcedente=E*custoHoraExtra;
				salarioTotal=salarioBase+salarioExcedente;
				System.out.printf("\nDescri��o do S�lario!\nC�digo do trabalhador: %s\nSalario Base: R$ %.2f"
						+ "\nSalario excedente: R$ %.2f\nSalario Total: R$ %.2f",C ,salarioBase,salarioExcedente,salarioTotal);
				System.out.println("\n-----------------------------------------");
			}
			else{
				E=0;
				salarioBase=N*custoPorHora;
				salarioExcedente=E*custoHoraExtra;
				salarioTotal=salarioBase+salarioExcedente;
				System.out.printf("\nDescri��o do S�lario!\nC�digo do trabalhador: %s\nSalario Base: R$ %.2f"
						+ "\nSalario excedente: R$ %.2f\nSalario Total: R$ %.2f",C ,salarioBase,salarioExcedente,salarioTotal);
				System.out.println("\n-----------------------------------------");
			}
			System.out.println();
			
	
		
		leia.close();
	}

}
