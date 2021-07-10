package ex_5;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		double soma = 0;
		double media = 0;
		
		LinkedList<Double> pilha = new LinkedList<Double>();
		
		pilha.push(2.6);
		pilha.push(6.1);
		pilha.push(9.0);
		pilha.push(7.3);
		pilha.push(9.2);
		
		soma = (pilha.get(0) + pilha.get(1) + pilha.get(2) + pilha.get(3) + pilha.get(4));					

		media = (soma/pilha.size());
		
		System.out.println("A média do vetor A é: " +media);

	}

}
