package exercicio3;

public class Estoque {
	
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int quantidade;
	




	public Estoque(String nomeProduto, String codigo, double precoUnitario, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.quantidade=quantidade;
	}

	
	
	public String getNomeProduto() {
		return nomeProduto;
	}



	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public double getPrecoUnitario() {
		return precoUnitario;
	}



	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public void tiraEstoque(int saida) {
		if (testaEstoque(saida)) {
			this.quantidade-= saida;
		} else {
			System.out.println("Produto indispoível no momento");
		}
	}

	public void adicionaEstoque(int entrada) {
		this.quantidade+= entrada;
	}
	
	public boolean testaEstoque(int valor) {

		if (this.quantidade>= valor) {
			return true;
		} else if (valor == 0) {
			return false;
		} else if (this.quantidade<= 0) {
			return false;
		} else {
			return false;
		}

	}
	
	
	


}
