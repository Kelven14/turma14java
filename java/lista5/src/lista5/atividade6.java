package lista5;
import java.util.Random;
public class atividade6
{
	public static void main(String[] args)
	{
		/*
		 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3
		 * elementos. Em seguida o programa deve fazer a multiplicação do vetor pelas
		   colunas da matriz.
		 */
		Random rand = new Random();
		int vetor[] = new int[3];
		int matriz[][] = new int [3][3];
		int mult;
		//só o vetor
		System.out.println("VETOR: ");
		for (int indice=0; indice<3;indice++)
		{
			vetor[indice]=rand.nextInt(9)+1;
			System.out.print(" | "+vetor[indice]+" | ");
		}
		
		//matriz
		System.out.println();
		System.out.println("MATRIZ: ");
		for (int linha=0;linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				matriz[linha][coluna]= rand.nextInt(9)+1;
				System.out.print(" | "+matriz[linha][coluna]+" | ");
			}
			System.out.println();
		}
		System.out.println("MATRIZ FINAL: ");
		for (int linha=0;linha<3; linha++)
		{
			for (int coluna=0; coluna<3; coluna++)
			{
				mult = vetor[linha]*matriz[linha][coluna];
				System.out.print(" | "+mult+" | ");
			}
			System.out.println();
		}
		
	}
}