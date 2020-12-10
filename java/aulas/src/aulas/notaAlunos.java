package aulas;
import java.util.Scanner;
public class notaAlunos
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		String alunos[] = {"Allen de Lima Vieira", "André de Brito Silva da Costa","Bárbara Liboni Guerra",	
				"Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva",
				"Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira",
				"Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso",
				"GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
				"HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama",
				"Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André",
				"Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros",
				"Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães",
				"Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva",
				"Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda", "Gabriel Enrique Cabral Silva"};
		
		char sexoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F',
				'F','M','F','M','F','M','M','M','M','M','F','F','M','F','M','M'};
		
		int matriculas[] = new int[40];
		double notas[] = new double[40];
		String aux;
		int matricula;
		int pesquisa=-1;
		char escolha;
		String situacao;
		
		for (int x=0; x<40; x++) {
				matriculas[x] = x+1;
		}
		//cabeçalho
		inseriLinha(60,"═");
		System.out.println("MAT\tTIPO\tNOME");
		inseriLinha(60,"═");
		for (int x=0; x<40; x++)
		{
			if (sexoAlunos[x]=='M') {
				aux = "Aluno";
			}
			else
			{
				aux = "Aluna";
			}
			System.out.printf("%d \t%s \t%s \n", matriculas[x],aux, alunos[x]);
		}
		do
		{
			inseriLinha(60,"=");
			System.out.print("Digite a matricula do aluno para incluir nota: ");
			matricula = leia.nextInt();
			for (int indice=0; indice<40; indice++) //varrer o vetor
			{
				if (matriculas[indice]==matricula) {
					pesquisa = indice;
				}
			}
			System.out.println("Foi escolhido:");
			System.out.printf("%d \t%s \n", matriculas[pesquisa],alunos[pesquisa]);
			System.out.print("Digite a nota: ");
			notas[pesquisa] = leia.nextDouble();
			System.out.println("Continua incluindo notas S/N:");
			escolha = leia.next().toUpperCase().charAt(0);
			if (escolha=='N')
			{
				break;
			}
		} while(true);
		
		//saida com notas
		inseriLinha(60,"═");
		System.out.println("MAT\tTIPO\tNOTA\tSITUACAO\tNOME");
		inseriLinha(60,"═");
		for (int x=0; x<40; x++)
		{
			if (sexoAlunos[x]=='M') {
				aux = "Aluno";
			}
			else
			{
				aux = "Aluna";
			}
			
			if (notas[x]<=5)
			{
				situacao = "Reprovado";
			} else {
				situacao = "Aprovado";
			}
				
			if (notas[x]!=0)
			{
				System.out.printf("%d \t%s \t%.2f \t%s \t%s \n", matriculas[x],aux, notas[x], situacao, alunos[x]);
			}
		}
		
	}
	
	//FUNÇÂO PARA GERAR LINHA COM SIMBOLO
	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
}