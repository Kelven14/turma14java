package lista3;

public class atividade2 {
	public static void main(String[] args) {

		int soma = 0;

		for (int numero = 1; numero <= 500; numero++) {
			if ((numero % 2 != 0) && (numero % 3 == 0)) {
				soma += numero;
			}
		}
		System.out.printf("A soma dos números impares e múltiplos de 3 é igual a %d", soma);

	}

}
