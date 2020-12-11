package lista5;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		int numero=1;
		int grupo1=0,grupo2=0,grupo3=0,grupo4=0;
		
		Scanner leia = new Scanner(System.in);

		linha();
		System.out.println("                 SISTEMA DE LEITURA DE NÚMEROS");
		linha();
		
		while(numero>0)
		{
			System.out.println("Digite um número positivo: ");
			numero=leia.nextInt();
			if(numero>=0 && numero<=25){
				grupo1++;
			}
			else if(numero>=26 && numero<=50){
				grupo2++;
			}
			else if(numero>=50 && numero<=75){
				grupo3++;
			}
			else if(numero>=76 && numero<=100){
				grupo4++;
			}
					
		}
		linha();
		System.out.print("\nA quantidade de números entre 0 e 25 é: "+ grupo1+"\nA quantidade de números entre 26 e 50 é: "+grupo2+
				"\nA quantidade de números entre 51 e 75 é: "+ grupo3+"\nA quantidade de números entre 76 e 100 é: "+ grupo4);	
		
		leia.close();
		
	}
	
	public static void linha() {
		System.out.print("\n----------------------------------------------------------------\n");
	}

	public static void pula() {
		System.out.print("\n");
	}

	public static void linhaVariavel(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}
