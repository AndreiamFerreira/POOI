package atividade2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int i, j, aux;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe 10 n�meros");  //pede para a o usu�rio inserir n�meros inteiros aleat�rios
		for(i = 0; i < vetor.length; i++){ //inser��o das inputs no vetor
            vetor[i] = leitura.nextInt();
            
            for(j = 1; j<vetor.length; j++) { //la�o de repeti��o
            	aux = vetor[j]; //variavel auxiliar assume o valor de j
            	int k = j -1; //k verifica um elemento anterior ao j
            	while(k>=0 && aux <=vetor[k]) { //enquanto k for maior que 0 e maior que j
            		vetor[k + 1] = vetor[k]; //o vetor troca as posi��es
            		k = k -1;
            	}
            vetor[k+1] = aux;
		
	}
            System.out.println(Arrays.toString(vetor));
		}
	
            
           
            }

            
	}


	



