package aulasPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) 
	{

		//instanciação completa de objeto
		Scanner leia = new Scanner(System.in);

		//usar uma interface
		List<Funcionario> lista = new ArrayList<>();
		System.out.print("Quantos funcionarios tu vai cadastrar ?");
		int qtde = leia.nextInt();
		for (int x=1; x<= qtde; x++) 
		{
			System.out.printf("FUNCIONARIO %d - DIGITE OS DADOS:\n",x);
			System.out.println("Funcionario terceiro[S/N]: ");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Horas mensais: ");
			int horas = leia.nextInt();
			System.out.println("Qual o valor hora: ");
			double valor = leia.nextDouble();
			if (op =='S') 
			{
				System.out.println("Digite o adicional terceiro: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome,horas,valor,adicional));
			}
			else 
			{
				lista.add(new Funcionario(nome,horas,valor));
			}

		}
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario func : lista) 
		{
			System.out.println(func.getNome()+" - horas:"+func.getHorasMensais()+ " - valor hora: "+func.getValorHora()+" salario: "+func.pagamentoSalario());
		}

	}

}