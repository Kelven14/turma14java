package aulas;

import java.util.Scanner;

public class analisaFaixaDeIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
				
				//variaveis
				String nome;
				int anoNascimento,idade;
				
				System.out.print("Digite o nome:");
				nome = leia.next();
				System.out.println();
				
				System.out.print("Digite o ano de nascimento:");
				anoNascimento = leia.nextInt();
				System.out.println();
				
				idade=calculaIdade(anoNascimento);
				System.out.println("Nome: "+ nome );
				
				analisaIdade(idade);
				
				
				leia.close();

	}
	
	public static int calculaIdade(int anoNascimento) {
		return (2020-anoNascimento);
	}
	public static void analisaIdade(int idade) {
		if(idade<18) {
			System.out.printf("Oi, você tem %d",idade);
			System.out.printf(" anos e é considerado infanto-juvenil.");
		}
		else if(idade>=18 && idade<=60) {
			System.out.printf("Oi, você tem %d", idade);
			System.out.printf(" anos e é considerado adulto.");
		}
		else {
			System.out.printf("Oi, você tem %d", idade);
			System.out.printf(" anos e é considerado idoso.");
		}
	}

}