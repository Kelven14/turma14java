package lista3;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Fiiiiiiiiiiiiii");
	}
	
	
	public void acao() {
		System.out.println("A pregui�a sobe em �rvores!");
	}

}
