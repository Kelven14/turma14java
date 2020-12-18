package loja;

public class Produto {
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;

	public Produto(String nomeProduto, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
	}

	public Produto(String nomeProduto, String codigo, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}
	
		public Produto(String nomeProduto,double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
	
	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
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

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}

	public void tiraEstoque(int saida) {
		if (testaEstoque(saida)) {
			this.qtdeProdutoEstoque -= saida;
		} else {
			System.out.println("Produto indispoível no momento");
		}
	}

	public void adicionaEstoque(int entrada) {
		this.qtdeProdutoEstoque += entrada;
	}

	public double venda(int qtdeVendida) {

		if (testaEstoque(qtdeVendida)) {
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUnitario;
		} else {
			System.out.println("Venda não autorizada");
			return 0;
		}

	}

	public boolean testaEstoque(int valor) {

		if (this.qtdeProdutoEstoque >= valor) {
			return true;
		} else if (valor == 0) {
			return false;
		} else if (this.qtdeProdutoEstoque <= 0) {
			return false;
		} else {
			return false;
		}

	}

}
