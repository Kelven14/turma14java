package lista4;

import java.util.Random;

public class atividade3 {

	public static void main(String[] args) {
		final int tamLinha=4,tamColuna=6;
				int N1[][]=new int[tamLinha][tamColuna];
				int N2[][]=new int[tamLinha][tamColuna];
				int M1[][]=new int[tamLinha][tamColuna];
				int M2[][]=new int[tamLinha][tamColuna];
			
				Random sorteia = new Random();
				
				System.out.print("\n------------------------------------------------------\n");
				System.out.print("Matriz N1: \n");
				for (int linha=0;linha<tamLinha; linha++){	
					System.out.print("|");
					for (int coluna=0; coluna<tamColuna; coluna++){
						N1[linha][coluna]= sorteia.nextInt(10);
						System.out.printf("%d \t" ,N1[linha][coluna]);
					}
					System.out.print("|\n");
				}
				
				System.out.print("\n------------------------------------------------------\n");
				System.out.print("Matriz N2: \n");
				for (int linha=0;linha<tamLinha; linha++){	
					System.out.print("|");
					for (int coluna=0; coluna<tamColuna; coluna++){
						N2[linha][coluna]= sorteia.nextInt(10);
						System.out.printf("%d \t" ,N2[linha][coluna]);
					}
					System.out.print("|\n");
				}

				System.out.print("\n------------------------------------------------------\n");
				System.out.print("Matriz M1: \n");
				for (int linha=0;linha<tamLinha; linha++){	
					System.out.print("|");
					for (int coluna=0; coluna<tamColuna; coluna++){
						M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
						System.out.printf("%d \t" ,M1[linha][coluna]);
					}
					System.out.print("|\n");
				}

				
				System.out.print("\n------------------------------------------------------\n");
				System.out.print("Matriz M2: \n");
				for (int linha=0;linha<tamLinha; linha++){	
					System.out.print("|");
					for (int coluna=0; coluna<tamColuna; coluna++){
						M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
						System.out.printf("%d \t" ,M2[linha][coluna]);
					}
					System.out.print("|\n");
				}

		

	}

}
