package Questao4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class APP {
	public static void main(String[] args) {

		LinkedList<Lapiseira> lapiseiras = new LinkedList<Lapiseira>();

		String auxMarca, auxCor;
		Float auxGraf;

		int controle = 0;
		Scanner teclado = new Scanner(System.in);

		while (controle == 0) {
			teclado.nextLine();
			System.out.println("Digite uma marca:");
			auxMarca = teclado.nextLine();
			teclado.nextLine();

			System.out.println("Digite uma cor:");
			auxCor = teclado.nextLine();
			teclado.nextLine();

			System.out.println("Digite o tamanho de um grafite:");
			auxGraf = teclado.nextFloat();
			teclado.nextLine();

			Lapiseira l = new Lapiseira(auxMarca, auxCor, auxGraf);
			System.out.print(l.getMarca() + " ");
			System.out.print(l.getCor() + " ");
			System.out.print(l.getGrafite() + " ");

			lapiseiras.addLast(l);

			System.out.println("\nQuer cadastrar outra Lapiseira?");
			System.out.println("0-sim");
			System.out.println("1-não");

			controle = teclado.nextInt();

		}

		System.out.println("-------------------------");
		System.out.println("---------lista----------");

		for (int i = 0; i < lapiseiras.size(); i++) {
			System.out.println("Marca: " + lapiseiras.get(i).getMarca());
			System.out.println("Cor: " + lapiseiras.get(i).getCor());
			System.out.println("Grafite: " + lapiseiras.get(i).getGrafite());
			System.out.println("-------------------------");
		}
		
		teclado.close();

	}
}
