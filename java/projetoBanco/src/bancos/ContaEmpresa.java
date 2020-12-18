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
	

	public ContaEmpresa(int numeroConta, String cpf, double emprestimoEmpresa) {
		super(numeroConta, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void pediEmprestimo(double valor)
	{
		super.credito(valor);
		//this.emprestimoEmpresa = this.emprestimoEmpresa - valor;
		this.emprestimoEmpresa -= valor;

	}


	@Override
	public boolean testarSaldo(double valor) 
	{

		boolean teste;
		if (valor <= super.getSaldo()) 
		{
			teste = true;
		} 
		else if (valor <= (this.emprestimoEmpresa+super.getSaldo()))
		{
			// 100 saldo 1000 limite  valor pedido: 200 reais
			//1000 + (200)
			double valorCredito= valor - super.getSaldo();
			super.credito(valorCredito);
			this.emprestimoEmpresa = this.emprestimoEmpresa - valorCredito;
			teste = true;
		}
		else
		{
			teste = false;
		}

	return teste;
	}
	
	public void FazerEmprestimo (double valorEmprestimo)
	{
		if (valorEmprestimo <= this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa-=valorEmprestimo;
			this.saldo+=valorEmprestimo;
			System.out.printf("\nEmprestimo realizado com sucesso.\nSaldo atual: R$%.2f\nLimite de Emprestimo: R$%.2f\n",getSaldo(),getEmprestimoEmpresa());
		}
		else
		{
			System.out.println("\nSolicitação não aprovada. Fale com seu gerente.");
		}
	}
	
}
