package lista1;

import java.util.Scanner;

public class exercicioProdutoEletronico {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ProdutoEletronico produto1 = new ProdutoEletronico("PS5", "Sony", 4200);
		ProdutoEletronico produto2 = new ProdutoEletronico("S20", "Sansung", 3499);
		ProdutoEletronico produto3 = new ProdutoEletronico("Iphone 12", "Apple");

		System.out.print("Qual o modelo do  produto: ");
		produto3.modelo=leia.next();
		
		System.out.print("Qual o valor do  produto: ");
		produto3.valor=leia.nextInt();
		
		
		produto1.mostrarInformacoes();
		linha();
		produto2.mostrarInformacoes();
		linha();
		produto3.mostrarInformacoes();
		
		leia.close();
	}
	
	public static void linha() {
		System.out.print("\n----------------------------------------------------------------\n");
	}

}
