package atividade1;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int vetor[] = new int[10];
			
		System.out.println("Informe 10 números");
		for(int i=0; i < vetor.length; i++){
            vetor[i] = leitura.nextInt();
        }
		
		leitura.close();
		
		boolean resultado1 = temElementosDistintos(vetor);
		
		System.out.println("Há elementos distintos no vetor?: "+ resultado1);

	}
	
	public static boolean temElementosDistintos(int[] vetor) { 
	
		boolean difere = false;
		
		for(int i=0; i < vetor.length; i++){
			if(vetor[1] != vetor[0]){
				difere = true;
			}
			else {
				difere = false;
			}
			
		}
		return difere;
	}
}
		
	



