package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {
	public static void main(String[] args) {
		char opcao = 0, genero;
		int opcaoMenu = 0, anoNascimento, quantidade;
		String nome, cpf, codigo;

		char opcaoCompra;
		int opcaoContinua;
		final double descontoAvista = 0.1;
		final double jurosAvistaCartao = 0.05;
		final double jurosParcelado = 0.1;
		double totalPagamento = 0;
		double valorParcela = 0.0;
		double desconto = 0.0;
		double acrescimo = 0.0;
		double imposto = 0.0;
		double totalFinal = 0.0;

		Scanner leia = new Scanner(System.in);

		List<Produto> listaProdutos = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();

		listaProdutos.add(new Produto("Vestido Jeans", "MM01", 85, 10));
		listaProdutos.add(new Produto("Shorts Jeans", "MM02", 30, 10));
		listaProdutos.add(new Produto("Calça Jeans", "MM03", 100, 10));
		listaProdutos.add(new Produto("Calça Xadrez", "MM04", 40, 10));
		listaProdutos.add(new Produto("Jaqueta Jeans", "MM05", 90, 10));
		listaProdutos.add(new Produto("Conjunto moletom", "MM06", 70, 10));
		listaProdutos.add(new Produto("Vestido girassol", "MM07", 70, 10));
		listaProdutos.add(new Produto("Conjunto Kimono", "MM08", 40, 10));
		listaProdutos.add(new Produto("Macacão preto", "MM09", 85, 10));
		listaProdutos.add(new Produto("Croped vermelho", "MM10", 20, 10));

		do {
			totalPagamento = 0.0;
			valorParcela = 0.0;
			desconto = 0.0;
			acrescimo = 0.0;
			imposto = 0.0;
			totalFinal = 0.0;

			inseriLinha(85, "▬");
			System.out.println("                                 Loja Meury Modas");
			System.out.println("                        Um novo conceito de Moda Feminina");
			inseriLinha(85, "▬");
			System.out.println("\n[1]-COMPRAR PRODUTOS\n[2]-GERENCIAR ESTOQUE\n[3]-SAIR");
			System.out.printf("Opção: ");
			opcaoMenu = leia.nextInt();

			if (opcaoMenu == 1) {
				carrinho.clear();
				System.out.print("\nPor favor informe o seu nome: ");
				nome = leia.next().toUpperCase();
				System.out.print("Informe como você se identifica: [M]Masculino, [F]Feminino ou [X]Outros");
				System.out.print("\nOpção: ");
				genero = leia.next().toUpperCase().charAt(0);

				while (genero != 'M' && genero != 'F' && genero != 'X') {
					System.out.printf("Opcão inválida, tente novamente!");
					System.out.println("Informe como você se identifica: [M]Masculino, [F]Feminino ou [X]Outros");
					System.out.printf("Opção: ");
					genero = leia.next().toUpperCase().charAt(0);
				}

				System.out.printf("Por favor informe o seu ano de Nascimento: ");
				anoNascimento = leia.nextInt();
				System.out.printf("Por favor informe o seu cpf: ");
				cpf = leia.next().toUpperCase();

				Cliente cliente = new Cliente(nome, genero, anoNascimento, cpf);

				trataGenero(cliente.getNome(), cliente.getGenero());

				do {
					imprimeListaProdutos(listaProdutos);

					System.out.printf("Informe o código do produto que deseja comprar: ");
					codigo = leia.next().toUpperCase();
					System.out.printf("Informe a quantidade que deseja comprar: ");
					quantidade = leia.nextInt();
					inseriLinha(85, "▬");

					boolean encontra = false;
					boolean passou = false;
					boolean teste = false;

					for (Produto produtos : listaProdutos) {

						if (codigo.equals(produtos.getCodigo())) {

							if (quantidade <= produtos.getQtdeProdutoEstoque()) {
								totalPagamento += produtos.venda(quantidade);

								for (Produto pod : carrinho) {
									if (codigo.equals(pod.getCodigo())) {
										teste = true;
										pod.adicionaEstoque(quantidade);
										encontra = true;
									}
								}
								if (teste == false) {

									carrinho.add(new Produto(produtos.getNomeProduto(), produtos.getCodigo(),
											produtos.getPrecoUnitario(), quantidade));
									encontra = true;
								}
							} else {
								passou = true;
								System.out.println("Quantidade indisponível");
							}
						}

					}
					if (encontra == false && passou == false) {
						System.out.println("cod ivalido");
					}

					System.out.println();
					System.out.println("Deseja continuar comprando? [S]-Sim ou [N]-Não ");
					opcaoCompra = leia.next().toUpperCase().charAt(0);

					while (opcaoCompra != 'S' && opcaoCompra != 'N') {
						System.out.println("Por favor digite [S] ou [N]. Tente novamente: ");
						opcaoCompra = leia.next().toUpperCase().charAt(0);
					}

					if (opcaoCompra == 'N') {
						do {
							System.out.println("                  Carrinho de Compras - Loja Meury Modas");
							inseriLinha(85, "▬");

							System.out.println("\nCODIGO\t\tPRODUTO\t\t\tR$(UN)\t\t\tQTDE\t  PARCIAL R$");
							inseriLinha(85, "▬");
							for (Produto produtos : carrinho) {

								System.out.printf("%s\t\t%s\t\t%.2f\t\t\t  %d\t   %.2f\n", produtos.getCodigo(),
										produtos.getNomeProduto(), produtos.getPrecoUnitario(),
										produtos.getQtdeProdutoEstoque(),
										(produtos.getPrecoUnitario() * produtos.getQtdeProdutoEstoque()));
							}
							inseriLinha(85, "▬");
							System.out.printf("             \t\t\t\t\t\tTOTAL DA COMPRA: R$ %.2f", totalPagamento);
							System.out.println(
									"\nSelecione uma das opções: \n[1]-Continuar Comprando\n[2]-Remover um produto do carrinho\n[3]-Finalizar a compra e emitir a nota fiscal");
							opcaoContinua = leia.nextInt();
							if (opcaoContinua == 1) {
								opcaoCompra = 'S';
							} else if (opcaoContinua == 2) {
								System.out.printf("Informe o código do produto que deseja remover: ");
								codigo = leia.next().toUpperCase();
								System.out.printf("Informe a quantidade que deseja remover: ");
								quantidade = leia.nextInt();

								encontra = false;
								passou = false;

								for (Produto produtos : carrinho) {

									if (codigo.equals(produtos.getCodigo())) {

										if (quantidade < produtos.getQtdeProdutoEstoque()) {
											totalPagamento -= produtos.venda(quantidade);
											System.out.printf("Foi removido  %d  produtos do tipo  %s", quantidade,
													produtos.getNomeProduto());
											pula();
											encontra = true;
											for (Produto prod : listaProdutos) {

												if (codigo.equals(prod.getCodigo())) {
													prod.adicionaEstoque(quantidade);

												}
											}

										} else if (quantidade == produtos.getQtdeProdutoEstoque()) {

											totalPagamento -= produtos.venda(quantidade);
											System.out.printf("Foi removido  %d  produtos do tipo  %s", quantidade,
													produtos.getNomeProduto());
											pula();
											encontra = true;
											int indice = carrinho.indexOf(produtos);
											System.out.printf("numero %d ", indice);
											carrinho.remove(indice);

											for (Produto prod : listaProdutos) {

												if (codigo.equals(prod.getCodigo())) {
													prod.adicionaEstoque(quantidade);

												}
											}
											break;

										} else {
											passou = true;

										}
									}

								}
								if (passou == true) {
									System.out.println("Quantidade indisponível");
								}
								if (encontra == false && passou == false) {
									System.out.println("Código iválido");
								}

							} else if (opcaoContinua == 3) {

								System.out.print(
										"Qual a forma de pagamento? \n1-À vista em dinheiro\n2-Cartão de Débito\n3-Cartão de Crédito(uma vez)\n4-Cartão de Crédito(Parcelado em até três vezes)\n");
								int formaPag = leia.nextInt();
								if (formaPag == 1) {
									desconto = totalPagamento * descontoAvista;

								} else if (formaPag == 2) {
									acrescimo = 0.0;

								} else if (formaPag == 3) {
									acrescimo = totalPagamento * jurosAvistaCartao;
								} else if (formaPag == 4) {
									acrescimo = totalPagamento * jurosParcelado;
									System.out.print("Quantas Parcelas?");
									int parcela = leia.nextInt();

									valorParcela = totalPagamento / parcela;

									System.out.printf("Valor total parcelado %d vezes é igual R$ %.2F ", parcela,
											valorParcela);
								} else {
									System.out.print("Opção inválida! Digite uma opção válida\n");

								}

								imposto = (totalPagamento + acrescimo - desconto) * 0.1;
								totalFinal = totalPagamento + acrescimo - desconto + imposto;
											                 	                 
								inseriLinha(85, "▬");
								System.out.println("            NOTA FISCAL             CÓDIGO DE BARRA   ");
								inseriLinha(85, "▬");	
								System.out.println("         __________________        _________________  ");
								System.out.println("         |                 |       |                | ");
								System.out.println("         |                 |       | █||█||█||█||█  | ");
								System.out.println("         |Loja Meury Modas |       | █||█||█||█||█  | ");
								System.out.println("         |                 |       | █||█||█||█||█  | ");
								System.out.println("         |_________________|       |________________| ");
								inseriLinha(85, "▬");
								System.out.printf("Nome: %s\tCPF: %S\tIdade: %d anos", cliente.getNome(),
										cliente.getCpf(), cliente.voltaIdade(cliente.getAnoNascimento()));
								System.out.println();
								inseriLinha(85, "▬");
								System.out.println();
								System.out.println("\nCODIGO\t\tPRODUTO\t\t\tR$(UN)\t\t\tQTDE\t  TOTAL R$");
								for (Produto produtos : carrinho) {

									System.out.printf("%s\t\t%s\t\t%.2f\t\t\t  %d\t   %.2f\n", produtos.getCodigo(),
											produtos.getNomeProduto(), produtos.getPrecoUnitario(),
											produtos.getQtdeProdutoEstoque(),
											(produtos.getPrecoUnitario() * produtos.getQtdeProdutoEstoque()));
								}
								inseriLinha(85, "▬");
								System.out.printf("             \t\t\t\t\t\t VALOR PARCIAL  : R$ %.2f\n",
										totalPagamento);
								System.out.printf("             \t\t\t\t\t\t    JUROS       : R$ %.2f\n", acrescimo);
								System.out.printf("             \t\t\t\t\t\t    DESCONTOS   : R$ %.2f\n", desconto);
								System.out.printf("             \t\t\t\t\t\t    IMPOSTO     : R$ %.2f\n", imposto);
								inseriLinha(85, "▬");
								System.out.printf("             \t\t\t\t\t\t  VALOR TOTAL   : R$ %.2f\n", totalFinal);
								break;
							}

						} while (opcaoContinua != 1);
					} // final if

				} while (opcaoCompra == 'S');
				opcao = verifica(leia);
			} else if (opcaoMenu == 2) {
				System.out.print("WIP");// Work in progress

			} else {
				System.out.print("Adoramos sua visita, volte sempre!");
				opcao = 'N';
			}

		} while (opcao == 'S');

		System.out.println("\nFIM DO PROGRAMA");

	}

	public static void linha(int tamanho) {
		for (int x = 0; x <= tamanho; x++) {
			System.out.print("-");
		}
	}

	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}

	public static void pula() {
		System.out.println();
	}

	public static int menuPrincipal(Scanner leia, int opcaoMenu) {
		inseriLinha(85, "▬");
		System.out.println("                                 Loja Meury Modas");
		System.out.println("                        Um novo conceito de Moda Feminina");
		inseriLinha(85, "▬");
		System.out.println("\n[1]-COMPRAR PRODUTOS\n[2]-GERENCIAR ESTOQUE\n[3]-SAIR");
		System.out.printf("Opção: ");
		opcaoMenu = leia.nextInt();
		return opcaoMenu;
	}

	public static void trataGenero(String nome, char opcao) {
		if (opcao == 'M') {
			System.out.printf("\nSeja bem-vindo %s a Loja Meury Modas!\n", nome);
		} else if (opcao == 'F') {
			System.out.printf("\nSeja bem-vinda %s a Loja Meury Modas!\n", nome);
		} else if (opcao == 'X') {
			System.out.printf("\nSeja bem-vindx %s a Loja Meury Modas !\n", nome);
		}

	}

	public static void imprimeListaProdutos(List<Produto> lista) {
		pula();
		inseriLinha(85, "▬");
		System.out.println("                Lista de Produtos - Loja Meury Modas");
		inseriLinha(85, "▬");
		System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
		inseriLinha(85, "▬");
		for (Produto produtos : lista) {
			System.out.printf("%s\t\t%.2f\t\t  %d\t%s\n", produtos.getCodigo(), produtos.getPrecoUnitario(),
					produtos.getQtdeProdutoEstoque(), produtos.getNomeProduto());
		}
		inseriLinha(85, "▬");
	}

	public static char verifica(Scanner leia) {
		System.out.println();
		System.out.println("Deseja Continuar ? [S]-Sim ou [N]-Não ");
		char opcao = leia.next().toUpperCase().charAt(0);

		while (opcao != 'S' && opcao != 'N') {
			System.out.println("Por favor digite [S] ou [N]. Tente novamente: ");
			opcao = leia.next().toUpperCase().charAt(0);
		}
		return opcao;
	}

}