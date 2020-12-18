package bancos;

public abstract class Conta {

	protected int numeroConta;
	protected double saldo;
	protected String cpf;

	public Conta() {
		
	}
	
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

	public void debito(double valorDebito) {
		if (testarSaldo(valorDebito)) {
			this.saldo = this.saldo - valorDebito;
			System.out.printf("Valor R$ %.2f Debitado!\n", valorDebito);
			System.out.println("Saldo atual da conta é R$"+this.saldo);
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

	public void credito(double valorCredito) {
		this.saldo = this.saldo + valorCredito;
		System.out.printf("Valor R$ %.2f creditado!\n", valorCredito);

	}

	public void pixDebito(double valorDebitoPix) {
		this.saldo = this.saldo - valorDebitoPix;
	}

	public void pixCredito(double valorCreditoPix) {
		this.saldo = this.saldo - valorCreditoPix;
	}
	
	
	public boolean testarSaldo(double valor) {
		
		boolean teste;
		if(valor<=this.saldo) {
			teste=true;
		}
		else {
			teste=false;
			
		}
		return teste;
		
	}

}
