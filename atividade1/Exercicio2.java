package atividade1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int valor;
		int resultado;
		
		System.out.println("Informe 10 números");
		for(int i=0; i < vetor.length; i++){
            vetor[i] = leitura.nextInt();
        }
		
		System.out.println("Informe um valor: ");
		valor = leitura.nextInt();
		
		leitura.close();
		
		resultado = contaOcorrenciasValor(vetor, valor);
		
		System.out.println("O número de ocorrências é: "+ resultado);
		
		
	}
		
	public static int contaOcorrenciasValor(int[] vetor, int valor) {
		int count = 0;
		
		for(int i=0; i < vetor.length; i++){
			if(vetor[i] == valor){
				count++;  			
		}
	}
		return count;
		
	}
}