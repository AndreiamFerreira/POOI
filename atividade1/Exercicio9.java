package atividade1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int i; 
		int vetor1[] = new int[20];
		int vetor2[] = new int[20];
		String[] vetor3 = new String[] {"+", "-", "*", "/"};
		int vetorResultados[] = new int[20];
		
		System.out.println("Digite um valor para o primeiro vetor: ");
		for(i=0; i < vetor1.length; i++){
            
			vetor1[i] = leitura.nextInt();
        }
		
		System.out.println("Digite um valor para o segundo vetor: ");
		for(i=0; i < vetor2.length; i++){
			
            vetor2[i] = leitura.nextInt();
        }
		
		
		System.out.println("Digite uma operação: ");
		for ( i=0; i<20 ; i++ ) 
			
		{
			switch (vetor3[i])
			{
			case "+":
				vetorResultados[i] = vetor1[i] + vetor2[i];
				break;
			case "-":
				vetorResultados[i] = vetor1[i] - vetor2[i];
				break;
			case "*":
				vetorResultados[i] = vetor1[i] * vetor2[i];
				break;
			case "/":
				vetorResultados[i] = vetor1[i] / vetor2[i];
				break;
			}

			System.out.println("\n" + vetor1[i] + vetor3[i] + vetor2[i] + " = " + vetorResultados[i]); 
		}



	} 

	}
	
