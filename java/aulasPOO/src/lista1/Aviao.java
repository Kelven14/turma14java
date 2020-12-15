package lista1;

public class Aviao {
	public String companhia;
	public String modelo;
	public int capacidadePassageiros;
	public String destino;
	public String piloto;
	public double velocidadeAtual;

	public Aviao(String companhia, String modelo, int capacidadePassageiros) {
		super();
		this.companhia = companhia;
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public Aviao(String companhia, String modelo, int capacidadePassageiros, String destino, String piloto) {
		super();
		this.companhia = companhia;
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		this.destino = destino;
		this.piloto = piloto;
	}

	public void statusDecolar() {
		if (this.velocidadeAtual == 0) {
			System.out.println("Avi�o parado na pista");
		} else if (this.velocidadeAtual > 0 && this.velocidadeAtual < 203) {
			System.out.println("Avi�o preparando para decolar");
		} else if (this.velocidadeAtual >= 203 && this.velocidadeAtual <= 278) {
			System.out.println("Avi�o decolando");
		} else if (this.velocidadeAtual > 278) {
			System.out.println("Avi�o voando");
		}

	}

	public void mostraInformacoes() {
		System.out.println("Companhia: " + this.companhia + "\nModelo: " + this.modelo + "\nCapacidade de Passageiros: "
				+ this.capacidadePassageiros + "\nDestino: " + this.destino + "\nPiloto: " + this.piloto + ".");
	}

}
