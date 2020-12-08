package lista2;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double numero1,numero2,numero3,numero4,quadradoDoNumero1,quadradoDoNumero2,quadradoDoNumero3,quadradoDoNumero4;
		
		System.out.println("Por favor informe quatro números inteiros!\n");
		System.out.printf("Número 1: ");
		numero1=leia.nextDouble();
		System.out.printf("Número 2: ");
		numero2=leia.nextDouble();
		System.out.printf("Número 3: ");
		numero3=leia.nextDouble();
		System.out.printf("Número 4: ");
		numero4=leia.nextDouble();
		System.out.println();
	
		quadradoDoNumero1= Math.pow(numero1, 2);
		quadradoDoNumero2= Math.pow(numero2, 2);
		quadradoDoNumero3= Math.pow(numero3, 2);
		quadradoDoNumero4= Math.pow(numero4, 2);
		
		if (quadradoDoNumero3 >=50){
			System.out.println("O quadrado do número "+numero3+" é igual a "+quadradoDoNumero3);
		}
		else{
			System.out.println("O quadrado do número "+numero1+" é igual a "+quadradoDoNumero1);
			System.out.println("\nO quadrado do número "+numero2+" é igual a "+quadradoDoNumero2);
			System.out.println("\nO quadrado do número "+numero3+" é igual a "+quadradoDoNumero3);
			System.out.println("\nO quadrado do número "+numero4+" é igual a "+quadradoDoNumero4);
		}
		
		
		leia.close();
	}
}
