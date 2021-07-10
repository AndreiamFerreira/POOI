package atividade2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int aux;	//variavel auxiliar que mostra o MENOR numero
		int troca;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe 10 n�meros");  //pede para a o usu�rio inserir n�meros inteiros aleat�rios
		for(int i=0; i < vetor.length; i++){ //inser��o das inputs no vetor
            vetor[i] = leitura.nextInt();
        }
		
		for(int i = 0; i < vetor.length - 1; i++) { //percorre o vetor para verifica��o
			aux = i; //considera que o menor valor � o pr�prio valor inicial
			for(int j = 0; j < vetor.length; j++) { //percore novamente o vetor para procurar pelo menor valor em rela��o ao elemento "i"
				if(vetor[j] < vetor[i]); //compara os elementos
				aux = j; //a variavel auxiliar de menor valor passa a assumir o valor do elemento "j"
			}
			
			if(i != aux) { //verifica se o elemento i � DIFERENTE do menor valor atual
				troca = vetor[i]; //se for diferente, h� a troca de valores
				vetor[i] = vetor[aux]; //a posi��o i recebe o menor valor
				vetor[aux] = troca; //"troca" recebe o menor valor 
	        	System.out.println("Vetor ordenado: " + vetor[i]); // imprime o vetor de forma ordenada

			}
			
		}
		

        }
	}


