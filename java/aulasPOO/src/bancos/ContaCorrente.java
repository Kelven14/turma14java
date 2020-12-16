package bancos;

public class ContaCorrente extends Conta{
	protected int numeroTalaoCheque;

	
	
	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}
	
	public ContaCorrente(int numeroConta, String cpf) {
		super(numeroConta, cpf);
		
	}

	public int getNumeroTalaoCheque() {
		return numeroTalaoCheque;
	}

	public void setNumeroTalaoCheque(int numeroTalaoCheque) {
		this.numeroTalaoCheque = numeroTalaoCheque;
	}

	
	

}
