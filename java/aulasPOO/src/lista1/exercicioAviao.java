package lista1;

import java.util.Scanner;

public class exercicioAviao {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Aviao aeronave1 = new Aviao("Airbus", "A320", 200);
		Aviao aeronave2 = new Aviao("Boeing", "737", 215, "Fortaleza", "Kelven");

		
		
		
		leia.close();
	}

}
