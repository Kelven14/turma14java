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
			System.out.println("Avião parado na pista");
		} else if (this.velocidadeAtual >= 203 && this.velocidadeAtual <= 278) {
			System.out.println("Avião decolando");
		} else if (this.velocidadeAtual > 278) {
			System.out.println("Avião voando");
		}

	}
	
	
	public void acelerar(double quantidade) {
		this.velocidadeAtual+=quantidade;
	}

}
