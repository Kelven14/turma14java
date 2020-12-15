package aulasPOO;



public class Produto {
	public String nomeProduto;
	public int qtdeEstoque;
	public double valorUnitario;

	public Produto(String nomeProduto, int qtdeEstoque, double valorUnitario) {
		this.nomeProduto = nomeProduto;
		this.qtdeEstoque = qtdeEstoque;
		this.valorUnitario = valorUnitario;
	}

	public double valorFinal(int quantidade) {
		return (this.valorUnitario * quantidade);
	}

}
