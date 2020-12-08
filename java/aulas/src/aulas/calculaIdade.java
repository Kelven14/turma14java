package aulas;

import java.util.Scanner;

public class calculaIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); //instanciar = criar
		//variaveis
				String nome;
				int anoNascimento;
				
				System.out.print("DIGITE O NOME DO USUARIO:");
				nome = leia.next();
				System.out.println();
				System.out.print("Digite o ano de nascimento:");
				System.out.println();
				anoNascimento = leia.nextInt();
				System.out.println("Nome: "+nome );
				System.out.println("Idade: "+(2020-anoNascimento));
				
				
					
				leia.close(); //fecha o teclado
		
		
	}

}

