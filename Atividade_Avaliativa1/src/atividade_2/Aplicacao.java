package atividade_2;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
					
		Scanner leitura1 = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num1 = leitura1.nextInt();

		System.out.println("Informe outro número: ");
		num2 = leitura1.nextInt(); 
		
		Leitura le = new  Leitura(num1, num2);
		
		le.mostraBinario();
		
		}
	
	
	

}


