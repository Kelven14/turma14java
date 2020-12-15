package lista1;


public class Cliente {
	public String nomeCliente;
	public String genero;
	public String CPF;
	public char formaPagamento;

	public Cliente() {
		super();
	}

	public Cliente(String nomeCliente, String genero, String CPF) {
		this.nomeCliente = nomeCliente;
		this.genero=genero;
		this.CPF = CPF;
		
	}

	
	public void comprarProduto(char desejoComprar) {
		if (desejoComprar == 'S') {
			System.out.print("Informe a qauntidade que deseja comprar: ");
		} else if (desejoComprar == 'N') {
			System.out.println("Volte e selecione outro produto");
		} else {
			System.out.println("Opção inválida");
		}
		
	}


	public void pagarProduto(double valor) {
		if (this.formaPagamento == 'D') {
			
			System.out.println("Sua forma de pagamento é no dinheiro, ganhou 10% de desconto");
			System.out.println("Valor Final R$ "+ valor*0.9 );
			

		} else if (this.formaPagamento == 'C') {
			System.out.println("Sua forma de pagamento é no Cartão, ganhou 5% de desconto");
			System.out.println("Valor Final R$ "+ valor*0.95 );
		} else {
			System.out.println("Selecione uma forma de pagamento válida");

		}

	}

}
