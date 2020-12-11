package lista5;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		final double descontoAvista = 0.2;
		final double descontoAvistaCartao = 0.15;
		final double jurosParcelado = 0.1;
		double precoProduto = 0.0;
		int opcao;
		int painel;
		double valorParcela = 0.0;

		Scanner leia = new Scanner(System.in);

		linha();
		System.out.print("                 SISTEMA DE PAGAMENTO");
		linha();

		do {
			System.out.print("Digite o preço do produto: R$ ");
			precoProduto = leia.nextDouble();
			linhaVariavel(64);

			System.out.print(
					"Qual a forma de pagamento? \n1-À vista em dinheiro ou cheque\n2-À vista no cartão de crédito\n3-Parcelado em duas vezes\n4-Parcelado em três vezes\n");
			opcao = leia.nextInt();

			if (opcao == 1) {
				precoProduto = precoProduto * (1 - descontoAvista);
				imprimePreco(precoProduto);
			} else if (opcao == 2) {
				precoProduto = precoProduto * (1 - descontoAvistaCartao);

				imprimePreco(precoProduto);
			} else if (opcao == 3) {
				imprimePreco(precoProduto);
			} else if (opcao == 4) {
				precoProduto = precoProduto * (1 + jurosParcelado * 3);
				valorParcela = precoProduto / 3;
				imprimePreco(precoProduto);
				System.out.print("Valor final parcelado em 3 vezes: ");
				imprimeParcela(valorParcela);
			} else {
				System.out.print("Opção inválida! Digite uma opção válida\n");

			}
			System.out.print("Deseja pagar mais algum produto? [1]-Sim ou [2]-Não\n");
			painel = leia.nextInt();
			linha();
		} while (painel == 1);
		
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

	public static void imprimePreco(double precoProduto) {
		linha();
		System.out.printf("        Valor final do produto:R$ %.2f", precoProduto);
		linha();
	}

	public static void imprimeParcela(double valorParcela) {

		System.out.printf(" Valor das parcelas:R$ %.2f", valorParcela);
		linha();
	}

}
