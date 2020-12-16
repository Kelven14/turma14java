package lista3;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	
	
	@Override
	public void emitirSom() {
		System.out.println("auauauauaau");
	}
	
	
	public void acao() {
		System.out.println("O cachorro corre!");
	}
	
	
	

}
