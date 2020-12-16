package lista2;

import java.util.Scanner;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		Fornecedor fornecedor1 = new Fornecedor("Kelven",10000,5000);
		
		System.out.print("Informe o telefone do fornecedor: ");
		String telefone=leia.nextLine();
		fornecedor1.setTelefone(telefone);
		System.out.print("Informe o endereço do fornecedor: ");
		
		String endereco=leia.nextLine();
		fornecedor1.setEndereco(endereco);
		linha(60);
		System.out.println("      INFORMAÇÕES DOS FORNECEDOR");
		linha(60);
		System.out.println("Nome: "+fornecedor1.getNome()+"\tTelefone: "+ fornecedor1.getTelefone()+"\tEndereço: "+fornecedor1.getEndereco());
		System.out.println("O seu crédito é R$ "+fornecedor1.getValorCredito());
		System.out.println("A sua dívida é R$ "+fornecedor1.getValorDivida());
		
		System.out.println("Saldo do fornecedor: "+fornecedor1.obterSaldo());	
		
		leia.close();
		
		
	}
	
	public static void linha(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}
