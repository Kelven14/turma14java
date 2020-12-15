package lista1;

public class ProdutoEletronico {
	public String nome;
	public String marca;
	public double valor;
	public String modelo;
	
	

	public ProdutoEletronico(String nome, String marca) {
		super();
		this.nome = nome;
		this.marca = marca;
	}

	public ProdutoEletronico(String nome, String marca, double valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		
	}

	public void mostrarInformacoes() {
		if(this.modelo!=null) {
			System.out.println("Nome: " + this.nome + "\nMarca: " + this.marca + "\nValor: R$" + this.valor+ "\nModelo: "+this.modelo);
		}
		else {
			System.out.println("Nome: " + this.nome + "\nMarca: " + this.marca + "\nValor: R$" + this.valor);	
		}
		
	}

}
