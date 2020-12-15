package lista1;

import java.util.Scanner;

public class exercicioCliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente("Kelven", "Masculino", "111.222.333-4");
		char desejoComprar;
		int quantidade;
		double valorDePagamento;
		final double preco = 20;

		System.out.println("Dados do Cliente: \nNome: " + cliente1.nomeCliente + "\tGênero: " + cliente1.genero
				+ "\tCPF: " + cliente1.CPF + ".");

		System.out.println("\nOlá " + cliente1.nomeCliente + ", deseja comprar este produto? [S]-Sim ou [N]-Não");
		System.out.print("Opção: ");
		desejoComprar = leia.next().toUpperCase().charAt(0);

		while (desejoComprar != 'S' && desejoComprar != 'N') {
			System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
			System.out.print("\nOpção: ");
			desejoComprar = leia.next().toUpperCase().charAt(0);
		}

		cliente1.comprarProduto(desejoComprar);

		if (desejoComprar == 'S') {
			quantidade = leia.nextInt();
			valorDePagamento = preco * quantidade;
			System.out.println("Qual a forma de pagamento? [D]-Dinheiro ou [C]-Cartão");
			cliente1.formaPagamento = leia.next().toUpperCase().charAt(0);
			cliente1.pagarProduto(valorDePagamento);
		}

		leia.close();
	}

}
