package aulasPOO;

public class Cliente {
	
	public String nome;
    public char genero;
    public int anoNascimento;

    public Cliente() {
    } 

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public Cliente(String nome, char genero, int anoNascimento) {
        this.nome = nome;
        this.genero = genero;
        this.anoNascimento = anoNascimento;
    }

}
