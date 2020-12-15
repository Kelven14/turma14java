package bancos;
public class Conta {
	

    public int numeroConta;
    public double saldo;
    public String cpf;
	
    public Conta(String cpf) {
		super();
		this.cpf = cpf;
	}

	public Conta(int numeroConta, double saldo, String cpf) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public Conta(int numeroConta, String cpf) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}

	public Conta(int numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}

    
    

   
	
}
