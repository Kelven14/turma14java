package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TesteEstoque {
	public static void main(String[] args) {
		int opcaoMenu;
		String nomeProduto, codigo;
		int quantidade;
		double precoUnitario;

		Scanner leia = new Scanner(System.in);

		List<Estoque> estoque = new ArrayList<>();

		do {

			inseriLinha(85, "▬");
			System.out.println("                        CONTROLE DE ESTOQUE");
			inseriLinha(85, "▬");
			System.out.println("\n\n1 - ADICIONAR PRODUTO NO ESTOQUE");
			System.out.println("2 - REMOVER DADO DO ESTOQUE");
			System.out.println("3 - ATUALIZAR DADO DO ESTOQUE");
			System.out.println("4 - MOSTRAR ESTOQUE");
			System.out.println("0 - SAIR");
			System.out.printf("escolha sua opcao: ");
			opcaoMenu = leia.nextInt();
			switch (opcaoMenu) {
			case 1: {

				System.out.print("Digite o nome do Produto: ");
				nomeProduto = leia.next();

				System.out.print("Digite o código do Produto: ");
				codigo = leia.next();

				System.out.print("Digite o preço unitário: R$");
				precoUnitario = leia.nextDouble();

				System.out.print("Digite a quantidade do item: ");
				quantidade = leia.nextInt();

				estoque.add(new Estoque(nomeProduto, codigo, precoUnitario, quantidade));

			}
				break;

			case 2: {

				boolean encontra=false;
				System.out.printf("Informe o código do produto que deseja remover: ");
				codigo = leia.next().toUpperCase();
				
				for(Estoque produto: estoque) {
					if(codigo.equals(produto.getCodigo())) {
						estoque.remove(produto);
						System.out.println("Produto removido do estoque");
						encontra=true;
						
					}
					
				}
				if(encontra==false) {
					System.out.println("Produto não encontrado, digite o código novamente!");
					
				}
			}
				break;

			case 3: {
				boolean encontra=false;
				System.out.printf("Informe o código do produto que deseja atualizar os dados: ");
				codigo = leia.next().toUpperCase();
				for(Estoque produto: estoque) {
					if(codigo.equals(produto.getCodigo())) {
						System.out.print("Digite o nome do Produto: ");
						produto.setNomeProduto(leia.next()); 

						System.out.print("Digite o preço unitário: R$");
						produto.setPrecoUnitario(leia.nextDouble());

						System.out.print("Digite a quantidade do item: ");
						produto.setQuantidade(leia.nextInt());
						
						encontra=true;
					}
				}
				if(encontra==false) {
					System.out.println("Produto não encontrado, digite o código novamente!");
					
				}

			}
				break;

			case 4: {
				System.out.println("                 LISTA DE PRODUTOS NO ESTOQUE");
				inseriLinha(85, "▬");
				System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				inseriLinha(85, "▬");
				for (Estoque produtos : estoque) {
					System.out.printf("%s\t\t%.2f\t\t  %d\t%s\n", produtos.getCodigo(), produtos.getPrecoUnitario(),
							produtos.getQuantidade(), produtos.getNomeProduto());
				}

			}
				break;

			case 0: {
				System.out.println("Saindo...");
				System.exit(0);
				
			}
				break;

			default:
				System.out.println("Opção inválida, tente novamente!");
			}

		} while (opcaoMenu != 0);

	}

	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
}
