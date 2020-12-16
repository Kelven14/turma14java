package aulasPOO;

import java.util.Scanner;

public class Loja {
	
	

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		Produto peca1 = new Produto("Vestido", 3, 100);
		Produto peca2 = new Produto("blusa", 1, 50);
		Produto peca3 = new Produto("Camisa", 2, 20);
		int opcao, quantidade;

		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camise - 20,00 - 20 em estoque

		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O]");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Qual produto você deseja comprar?  \n[1]-Vestido\n[2]-Blusa\n[3]-Camisa ");
		opcao = leia.nextInt();
		if (opcao == 1) {
			System.out.println(" Qual a quantidade deseja compra?");
			quantidade = leia.nextInt();
			System.out.println("O valor final da sua compra é R$ " + peca1.valorFinal(quantidade));
		} else if (opcao == 2) {
			System.out.println(" Qual a quantidade deseja compra?");
			quantidade = leia.nextInt();
			System.out.println("O valor final da sua compra é R$ " + peca2.valorFinal(quantidade));
		} else if (opcao == 3) {
			System.out.println(" Qual a quantidade deseja compra?");
			quantidade = leia.nextInt();
			System.out.println("O valor final da sua compra é R$ " + peca3.valorFinal(quantidade));
		} else {
			System.out.println("Opcão errada");
		}

		
		System.out.println("---------------------");
		Object[] vetor= {peca1,peca2,peca3};
		
		for(Object i : vetor) {
			((Produto) i).getInfo();
			System.out.println("---------------------");
		}
		
	}
	

}
