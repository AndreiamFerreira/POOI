package atividade1;

import java.util.Scanner;

public class Exerc�cio8 {

	public static void main(String[] args) {
		
			Scanner leitura = new Scanner(System.in);
	        int primo=0;
	        int vetor[] = new int[10];
	        System.out.println("Informe 10 n�meros");
			for(int i=0; i < vetor.length; i++){
	            vetor[i] = leitura.nextInt();
	        }
	

	        for (int i=vetor[0]; i<=vetor.length; i++) {
	            for (int j=1; j<=i; j++) {
	                if (i % j == 0) {
	                    primo++;
	                }
	            }
	           
	            if (primo == 2) {
	                System.out.println("O n�mero " + i + " � primo!");
	            }
	            primo = 0;
	        }

	        leitura.close();
	    }
	}
