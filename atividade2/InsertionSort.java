package atividade2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int i, j, aux;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe 10 números");  //pede para a o usuário inserir números inteiros aleatórios
		for(i = 0; i < vetor.length; i++){ //inserção das inputs no vetor
            vetor[i] = leitura.nextInt();
            
            for(j = 1; j<vetor.length; j++) { //laço de repetição
            	aux = vetor[j]; //variavel auxiliar assume o valor de j
            	int k = j -1; //k verifica um elemento anterior ao j
            	while(k>=0 && aux <=vetor[k]) { //enquanto k for maior que 0 e maior que j
            		vetor[k + 1] = vetor[k]; //o vetor troca as posições
            		k = k -1;
            	}
            vetor[k+1] = aux;
		
	}
            System.out.println(Arrays.toString(vetor));
		}
	
            
           
            }

            
	}


	



