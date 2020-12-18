package bancos;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("BANCO TESTE PARA USO");
		
		char op;
		double valor= 0.00;
		
		ContaEspecial processo1 = new ContaEspecial(1,1000); //declarar o objeto e usar o construtor
		
		System.out.println("Limite máximo  é R$"+processo1.getValorCadastroLimite());
		System.out.println("Saldo atual da conta é R$"+processo1.getSaldo());
		System.out.println("Desejar movimentar? S/N");
		op = leia.next().toUpperCase().charAt(0);
		
		
		while (op =='S') 
		{
			System.out.println("Movimento a credito ou debito? [C/D]:");
			op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor: ");
			valor = leia.nextDouble();
			if (op=='D') 
			{	processo1.testarSaldo(valor);
				processo1.debito(valor);
			} 
			else if (op=='C') 
			{
				processo1.credito(valor);
			}
			System.out.printf("Saldo atual: %.2f\n", processo1.saldo );
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
		}
		
		
		System.out.println("Fim do programa. Tks!!!");
		leia.close();

	}

}
