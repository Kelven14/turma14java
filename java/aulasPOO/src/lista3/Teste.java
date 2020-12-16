package lista3;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro dog =new Cachorro("Apolo", 5);
		Cavalo horse = new Cavalo("Zeus",8);
		Preguica preguica =new Preguica("Poseidon",10);
		
		
		linha(60);
		System.out.print("Animal: Cachorro\tNome: "+dog.getNome()+"\tIdade: "+dog.getIdade()+"\n");
		dog.acao();
		System.out.print("Som do Cachorro: ");
		dog.emitirSom();
		linha(60);
		System.out.print("Animal: Cavalo\tNome: "+ horse.getNome()+"\tIdade: "+horse.getIdade()+"\n");
		horse.acao();
		System.out.print("Som do  Cavalo: ");
		dog.emitirSom();
		linha(60);
		System.out.print("Animal: Preguiça\tNome: "+preguica.getNome()+"\tIdade: "+preguica.getIdade()+"\n");
		preguica.acao();
		System.out.print("Som da Preguiça: ");
		preguica.emitirSom();
		linha(60);
		

	}

	public static void linha(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}
