package aulas;

import java.util.Scanner;

public class mostraIdade {

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
				System.out.println("Idade: "+ idade);
				
				leia.close();

	}
	
	public static int calculaIdade(int anoNascimento) {
		return (2020-anoNascimento);
	}

}
