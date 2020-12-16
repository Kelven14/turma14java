package lista2;

import java.util.Scanner;

public class TesteAdministrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite o nome da pessoa: ");
		String nome =leia.nextLine();
		System.out.printf("Digite o endereço: ");
		String endereco =leia.nextLine();
		System.out.printf("Digite o telefone: ");
		String telefone=leia.nextLine();
		System.out.printf("Digite o valor da ajuda de custo: ");
		double ajudaDeCusto=leia.nextDouble();
		
		
		Administrador adm1= new Administrador(nome,endereco,telefone,ajudaDeCusto);
		linha(60);
		System.out.println("      INFORMAÇÕES DOS ADMINISTRADOR");
		linha(60);
		System.out.println("Nome: "+adm1.getNome()+"\tTelefone: "+ adm1.getTelefone()+"\tEndereço: "+adm1.getEndereco());
		linha(60);
		System.out.println("Sua ajuda de custo é R$ "+adm1.getAjudaDeCusto());
		leia.close();

	}

	public static void linha(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}
