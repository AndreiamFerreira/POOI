package atividade1;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int vetor[] = new int[10];
			
		System.out.println("Informe 10 n�meros");
		for(int i=0; i < vetor.length; i++){
            vetor[i] = leitura.nextInt();
        }
		
		leitura.close();
		
		int resultado2 = retornaPosicaoMaiorElemento(vetor);
		
		System.out.println("Ind�ce do maior elemento:  " + resultado2);

	}
	
	public static int retornaPosicaoMaiorElemento(int[] vetor) {
		int posicaoMaiorValor = 0;
		int maiorValor = 0; 
		
	      for (int i = 0; i < vetor.length; i++){
	         if (vetor[i] > maiorValor){ 
	        	 maiorValor = vetor[i]; 
	             	             
	      for(int indice = 0; indice < vetor.length; indice++){
	                if(maiorValor < vetor[indice]){
	                maiorValor = vetor[indice];
	                
	                posicaoMaiorValor = indice;
	                }
	      }  
	         } 
	}
		return posicaoMaiorValor;
	}
}


