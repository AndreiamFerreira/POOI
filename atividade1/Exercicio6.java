package atividade1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
			
		int resultado = fibonacci (n());
	
		
	}
	
	
	public static int fibonacci (int n){
		int tamanhoVetor = n();
		long[] numeros = new long[tamanhoVetor];
		numeros[0]=0;
		numeros[1]=1;

		System.out.print("0, 1");

		for(int i=2; i<numeros.length; i++)
		{
			numeros[i] = numeros[i-1] + numeros[i-2];  

			System.out.print(", " + numeros[i]);
		}

		System.out.println();
		return tamanhoVetor;
		}  

	private static int n()	{
	
	Scanner leitura = new Scanner(System.in);
	
	int n;

	System.out.println("Informe um número inteiro e positivo");

    return n = leitura.nextInt();
   
} 


}






