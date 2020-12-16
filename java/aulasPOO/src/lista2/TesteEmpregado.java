package lista2;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("João",123,2500,10);

		linha(60);
		System.out.println("       INFORMAÇÕES DO EMPREGADO");
		linha(60);
		System.out.println("Nome: "+empregado1.getNome()+"\tCódigo: "+ empregado1.getCodigoSetor()+"\tSalário Bruto: R$"+empregado1.getSalarioBase());
		System.out.printf("Porcentagem de imposto: %.2f ",empregado1.getImposto());
		System.out.println("% \t Valor correspondente: R$"+ empregado1.valorImposto());
		System.out.println("Salário Líquido: R$"+empregado1.salarioEmpregado());
		
		
	}
	
	public static void linha(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

}	
