package ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		double vetorNotas[] = new double[3];
		double soma = 0;
		double media = 0;
		int frequencia;

		System.out.println("Informe a frequência do aluno: ");
		frequencia = leitura.nextInt();

		System.out.println("Informe as 3 notas: ");
		for (int i = 0; i < vetorNotas.length; i++) {
			vetorNotas[i] = leitura.nextDouble(); // adiciona a nota no vetor
			soma += vetorNotas[i]; // adiciona no contador
		}

		leitura.close();
		media = (soma / 3); // média final do aluno

		Notas n = new Notas(null, vetorNotas, media, soma, frequencia);
		n.confere();


	}

}
