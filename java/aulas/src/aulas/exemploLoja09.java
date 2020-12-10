package aulas;

import java.util.Scanner;

public class exemploLoja09 {

	
public static void main(String[] args) {
		
		// para - repetição tinha tamanho definido - for
		// enquanto - nao sabe onde para, e testar no inicio
		// faça enquanto - nao sabe onde para, mais roda pelo menos 1 vez, testar no final
		
		Scanner leia = new Scanner(System.in);
		//enquanto - while
		//System.out.println("Começa o programa S/N: ");
		char opcao;
		
		do
		{
			for (int x=1; x<=20; x++)
			{
				System.out.print("═");
			}
			System.out.println();
			System.out.println("SISTEMA DE CADASTRO");
			System.out.println();
			for (int x=1; x<=20; x++)
			{
				System.out.print("═");
			}
			System.out.println();
			System.out.println("Continuar S/N: ");
			opcao = leia.next().toUpperCase().charAt(0);
			while (true)
				
			{
				if (opcao != 'S' && opcao !='N')
				{
					System.out.println("Por favor digite S ou N tá bom. Tente de novo: ");
					opcao = leia.next().toUpperCase().charAt(0);
				} else
				{
					break;
				}
				
			}
		} while (opcao == 'S');
		
				
		System.out.println("FIM DO PROGRAMA");
		
		
	}
}