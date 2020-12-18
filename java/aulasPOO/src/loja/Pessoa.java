package loja;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa{
	
	private String nome;
	private char genero;//  M - masculino, F-feminino e X-outros
	private int anoNascimento;
    
   
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int voltaIdade(int anoNascimento) {
		int idade=-1;
		Calendar ano = GregorianCalendar.getInstance();
		int anoAtual=ano.get(Calendar.YEAR);
		
		if(anoNascimento>0 && anoAtual >0) {
			 idade = anoAtual-anoNascimento;	
		}
		else {
			System.out.println("Ano inválido!");
		}
		return idade;
	}
  

 
}
