package lista2;

public class Vendedor extends Pessoa {

	private double valorVendas;
	private double comissao;
	
	

	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double salarioVendedor() {
		return (this.valorVendas + valorComissao());
	}

	public double valorComissao() {
		return this.valorVendas * (this.comissao / 100);

	}
}
