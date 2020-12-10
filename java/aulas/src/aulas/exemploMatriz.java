package aulas;
import java.util.Scanner;
public class exemploMatriz {
	public static void main(String[] args)
	{
		//lista de tarefas por dia, por hora em matriz
		Scanner leia = new Scanner(System.in);
		int dia, hora;
		char continua='S';
		
		String listaTarefas[][] = new String[24][31]; //começa em zero
		
		do
		{
			System.out.println("Digite o dia de cadastro[1-31]:");
			dia = leia.nextInt();
			dia = dia-1;
			System.out.println("Digite a hora da tarefa [0-23]:");
			hora = leia.nextInt();
			System.out.println("Digite a tarefa: ");
			leia.nextLine();
			listaTarefas[hora][dia] = leia.nextLine();
			System.out.println("Continua S/N: ");
			continua=leia.next().toUpperCase().charAt(0);
			if (continua=='N')
			{
				break;
			}
			
		} while (true);
		for (int coluna = 0; coluna<31; coluna++)
		 {
			for (int linha = 0; linha<24; linha++)
			{
				if(listaTarefas[linha][coluna]!=null) {
				System.out.printf("dia: %d hora: %d horas tarefa: %s\n", coluna+1, linha, listaTarefas[linha][coluna]);
				}
			}
		}
			
		
		System.out.println("Fim de agenda!!!");
		
		
	}
}