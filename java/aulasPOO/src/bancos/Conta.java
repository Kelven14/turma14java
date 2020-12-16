package bancos;
public abstract class Conta {
	

    protected int numeroConta;
    protected double saldo;
    protected String cpf;
	
    
    public Conta(String cpf) {
		super();
		this.cpf = cpf;
	}
	public Conta(int numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}
	public Conta(int numeroConta, String cpf) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}

	public Conta(int numeroConta, double saldo, String cpf) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	


	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

    
    

   
	
}
