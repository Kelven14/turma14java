package bancos;

public class ContaPoupanca extends Conta {
	private int dataAniversarioConta;

	public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
		super(numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}

	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}


	public void correcaoPoupanca(int dataAtual) {

		if (dataAtual == this.dataAniversarioConta) {
			super.credito((super.getSaldo() * 0.005));
			System.out.println("Seu saldo foi incrementado em 0.5%.");
		}
	}
	
	

}
