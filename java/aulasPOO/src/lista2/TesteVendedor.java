package lista2;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite o nome da pessoa: ");
		String nome =leia.nextLine();
		System.out.printf("Digite o endereço: ");
		String endereco =leia.nextLine();
		System.out.printf("Digite o telefone: ");
		String telefone=leia.nextLine();
		System.out.printf("Digite o valor correspodente as vendas: ");
		double valorVendas=leia.nextDouble();
		System.out.printf("Digite a porcentagem da comissão: ");
		double comissao=leia.nextDouble();
		
		Vendedor vendedor1=new Vendedor ( nome,endereco,telefone,valorVendas,comissao);
		
		linha(60);
		System.out.println("       INFORMAÇÕES DO VENDEDOR");
		linha(60);
		System.out.println(
				"Nome: " + vendedor1.getNome() + "\tTelefone: " + vendedor1.getTelefone() + "\tEndereço: " + vendedor1.getEndereco());
		System.out.println("\nValor de vendas: R$" + vendedor1.getValorVendas());
		System.out.printf("Porcentagem de comissão: %.2f ", vendedor1.getComissao());
		System.out.println("% \t Valor correspondente: R$" + vendedor1.valorComissao());
		System.out.println("Salário Final: R$" + vendedor1.salarioVendedor());

		
		
		leia.close();
	}
	
	public static void linha(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}
