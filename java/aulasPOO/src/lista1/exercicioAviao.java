package lista1;

import java.util.Scanner;

public class exercicioAviao {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Aviao aeronave1 = new Aviao("LATAM","Airbus-A320", 200);
		Aviao aeronave2 = new Aviao("GOL","Boeing-737", 215, "Fortaleza", "Kelven");

		System.out.println("Insira as informações a seguir: ");
		System.out.print("Destino: ");
		aeronave1.destino=leia.next();
		System.out.print("Nome do piloto: ");
		aeronave1.piloto=leia.next();
		linha();
		System.out.println("Informações completa do Voo 1");
		linha();
		aeronave1.mostraInformacoes();
		linha();
		System.out.print("Qual a velocidade da aeronave 2: ");
		aeronave2.velocidadeAtual=leia.nextInt();
		aeronave2.statusDecolar();
		
		
		
		leia.close();
	}
	public static void linha() {
		System.out.print("\n----------------------------------------------------------------\n");
	}
}
