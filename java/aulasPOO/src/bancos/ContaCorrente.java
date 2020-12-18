package bancos;



public class ContaCorrente extends Conta {

	private int qtdTalao;
	private final int LIMITETALAO = 3;

	

	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	
	}
	
	public ContaCorrente(int numeroConta, String cpf) {
		super(numeroConta, cpf);
		this.qtdTalao=0;
	}

	public int getQtdTalao() {
		return qtdTalao;
	}

	public void setQtdTalao(int qtdTalao) {
		this.qtdTalao = qtdTalao;
	}


	public int talaoRestante() {
		return LIMITETALAO - this.qtdTalao;
	}
	
	public void emitirTalao() {
		this.qtdTalao++;
		System.out.println("Talão emitido sob o número nº 00" + this.qtdTalao);
	}

}
