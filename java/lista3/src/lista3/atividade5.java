package lista3;

public class atividade5 {

	public static void main(String[] args) {
		int numero = 233;
		System.out.printf("Sequência: ");

		do {
			System.out.printf(numero + ", ");
			if (numero >= 300 && numero <= 400) {
				numero += 3;
			} else {
				numero += 5;
			}
		} while (numero <= 456);

	}

}
