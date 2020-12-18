package bancos;

public class ContaUniversitaria extends ContaEspecial {
	public double emprestimoUniversitario;

	public ContaUniversitaria(int numeroConta, double valorLimite, double emprestimoUniversitario) {
		super(numeroConta, valorLimite);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}

	
	
	public ContaUniversitaria(int numeroConta, String cpf, double valorLimite, double emprestimoUniversitario) {
		super(numeroConta, cpf, valorLimite);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}



	public double getemprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setemprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}

}
