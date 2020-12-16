package bancos;

public class ContaUniversitaria extends Conta{
	public double emprestimoEstudantil;


	public ContaUniversitaria(int numeroConta, String cpf, double emprestimoEstudantil) {
		super(numeroConta, cpf);
		this.emprestimoEstudantil = emprestimoEstudantil;
	}

	public double getEmprestimoEstudantil() {
		return emprestimoEstudantil;
	}

	public void setEmprestimoEstudantil(double emprestimoEstudantil) {
		this.emprestimoEstudantil = emprestimoEstudantil;
	}

	

}
