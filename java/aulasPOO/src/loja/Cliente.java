package loja;

public class Cliente extends Pessoa {

	private String cpf;

	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		corrigeCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void corrigeCpf(String cpf) {
		if (validaCpf(cpf)) {
			this.cpf = cpf;
		} else {
			System.out.println("O CPF inserido é inválido");
		}
	}

	public boolean validaCpf(String cpf) {
		boolean valor;
		if (cpf != null) {
			valor = true;
		} else {
			valor = false;
		}
		return valor;
	}

}
