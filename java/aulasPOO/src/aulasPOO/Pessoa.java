package aulasPOO;

public class Pessoa {
	
	public String nome;
    public char genero;
    public int anoNascimento;

    public Pessoa() {
    } 

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, char genero, int anoNascimento) {
        this.nome = nome;
        this.genero = genero;
        this.anoNascimento = anoNascimento;
    }

}
