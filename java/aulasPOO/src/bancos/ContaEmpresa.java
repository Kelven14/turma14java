package bancos;

public class ContaEmpresa extends Conta{
	public double emprestimoEmpresa;

	
	
	
	public ContaEmpresa(int numeroConta) {
		super(numeroConta);
		
	}

	public ContaEmpresa(int numeroConta, double emprestimoEmpresa) {
		super(numeroConta);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	
	
}
