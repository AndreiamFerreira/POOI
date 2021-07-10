package ex4;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		LinkedList<Lapiseira> listaLapiseiras = new LinkedList<Lapiseira>();

		Scanner leitura = new Scanner(System.in);

		String marca;
		String cor;
		float grafite;
		char i = 's';

		do {
			System.out.println("Informe a marca da lapiseira:");
			marca = leitura.nextLine();

			System.out.println("\nInforme a cor da lapiseira:");
			cor = leitura.nextLine();

			System.out.println("\nInforme o número do grafite:");
			grafite = leitura.nextFloat();

			Lapiseira la = new Lapiseira(marca, cor, grafite);

			listaLapiseiras.add(la);

			System.out.println("\nDeseja continuar cadastrando lapiseiras?");
			System.out.println("S - SIM" + "" + "\nN - NÃO");

			i = leitura.next().charAt(0);
			leitura.nextLine();

		} while (i == 's' || i == 'S');
		leitura.close();

		for (int j = 0; j < listaLapiseiras.size(); j++) {
			System.out.println("\nLAPISEIRAS CADASTRADAS: \n");
			System.out.println("Marca: " + listaLapiseiras.get(j).getMarca() 
					+ "\nCor: " + listaLapiseiras.get(j).getCor()
					+ "\nGrafite: " + listaLapiseiras.get(j).getGrafite());
		}

	}
}
