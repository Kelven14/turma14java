package lista2;

public class TesteOperario {

	public static void main(String[] args) {

		Operario op1 = new Operario("LEONARDO", "RUA XV DE NOVEMBRO", "1122-3344", 2000, 15);

		linha(60);
		System.out.println("       INFORMA��ES DO OPER�RIO");
		linha(60);
		System.out.println(
				"Nome: " + op1.getNome() + "\tTelefone: " + op1.getTelefone() + "\tEndere�o: " + op1.getEndereco());
		System.out.println("\nValor produzido: R$" + op1.getValorProducao());
		System.out.printf("Porcentagem de comiss�o: %.2f ", op1.getComissao());
		System.out.println("% \t Valor correspondente: R$" + op1.valorComissao());
		System.out.println("Sal�rio Final: R$" + op1.salarioOperario());

	}

	public static void linha(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}
}
