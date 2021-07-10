package atividade2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int aux;	//variavel auxiliar que mostra o MENOR numero
		int troca;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe 10 números");  //pede para a o usuário inserir números inteiros aleatórios
		for(int i=0; i < vetor.length; i++){ //inserção das inputs no vetor
            vetor[i] = leitura.nextInt();
        }
		
		for(int i = 0; i < vetor.length - 1; i++) { //percorre o vetor para verificação
			aux = i; //considera que o menor valor é o próprio valor inicial
			for(int j = 0; j < vetor.length; j++) { //percore novamente o vetor para procurar pelo menor valor em relação ao elemento "i"
				if(vetor[j] < vetor[i]); //compara os elementos
				aux = j; //a variavel auxiliar de menor valor passa a assumir o valor do elemento "j"
			}
			
			if(i != aux) { //verifica se o elemento i é DIFERENTE do menor valor atual
				troca = vetor[i]; //se for diferente, há a troca de valores
				vetor[i] = vetor[aux]; //a posição i recebe o menor valor
				vetor[aux] = troca; //"troca" recebe o menor valor 
	        	System.out.println("Vetor ordenado: " + vetor[i]); // imprime o vetor de forma ordenada

			}
			
		}
		

        }
	}


