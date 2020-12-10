package aulas;

public class listaAlunos {

	public static void main(String[] args) {
		
		String nomes[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa",
				  "Bárbara Liboni Guerra", "Beatriz Martins", "Beymar Jhoel Acapa Lima",
				  "Breno Nogueira Botelho Noccioli", "Daniel Augusto Gomes Ferreira Filho",
				  "Danilo Mendes Ferreira", "Danilo Pereira da Silva", "Davi Silva Vieira",
				  "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira",
				  "Ewerton Inacio Lima", "FERNANDA AGAPITO", "Fernanda Barbosa Ferraz",
				  "Francisco José Pires","Gabriel Enrique Cabral Silva"
				  ,"Gabriel Sérgio Nascimento Santos Gonçalves",
				  "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				  "Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles",
				  "HELOISA BEATRIZ DE OLIVEIRA COSTA", "Igor Mateus Queiroz Gato",
				  "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				  "José Jorge Hauck Júnior", "Juliana Santos André",
				  "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos",
				  "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
				  "Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves",
				  "Micaely da Silva Lima", "Rafaela Oliveira Silva",
				  "Tiago dos Santos Martins", "Verônica Navarro Almenara",
				  "Vinicius Alves Miranda" };
		
		char genero[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F',
				'M','F','M','M','M','M','M','F','F','M','F','M'};
		int matricula[] = new int[40];
		
		double notas[]=new double[40];
		
		linha(80);
		System.out.println("                \tLista de alunos da Turma 14");
		linha(80);
		System.out.printf("Aluno(a)\tMatricula\tSexo\tNota\tNome\n");
		linha(80);
		for (int i=0; i<40; i++)
		{
			
			notas[i]=Math.random()*10;
			
			if (genero[i]=='M')
			{
				System.out.printf("Aluno  \t\t%d \t\t%c \t%.2f \t%s\n",i+1401,genero[i],notas[i],nomes[i]);
			}
			else if (genero[i]=='F')
			{
				System.out.printf("Aluna  \t\t%d \t\t%c \t%.2f \t%s\n",i+1401,genero[i],notas[i],nomes[i]);
			}
		
		}

	}
	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("▬");
		}
		System.out.print("\n");
	}
	
	
	/*
	inseriLinha(80, "▬");
	//FUNÇÂO PARA GERAR LINHA COM SIMBOLO
		public static void inseriLinha(int tamanho, String simbolo) {
			for (int i = 0; i < tamanho; i++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}*/

}
