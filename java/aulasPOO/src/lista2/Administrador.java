package lista2;

public class Administrador extends Pessoa {
	private double ajudaDeCusto;

	public Administrador(double ajudaDeCusto) {
		super();
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Administrador(String nome, double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;

	}

	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;

	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
