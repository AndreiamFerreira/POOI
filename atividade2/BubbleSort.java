package atividade2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	
		
		//bubble sort ordena os numeros inteiros em ordem crescente
		
		int vetor[] = new int[10];
		int aux;	//variavel auxiliar
		boolean trocado;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe 10 números");  //pede para a o usuário inserir números inteiros aleatórios
		for(int i=0; i < vetor.length; i++){ //inserção das inputs no vetor
            vetor[i] = leitura.nextInt();
        }
		
        for (int i = 0; i < vetor.length; i++) { //ciclo que garante que a ordenação durará no tamanho do vetor 
            trocado = true; //variavel que garante que o programa não precise fazer verificações inuteis após a ordenação completa
        	for (int j = 0; j < (vetor.length - 1); j++) { //define a variável "j" para a verificação
                if (vetor[j] > vetor[j+1]) { 	//compara se o item na posição "j" é maior que o item na posição j+1
                	aux = vetor[j];  //variavel auxiliar assume o valor do item na posição j (verificado anteriormente)
                    vetor[j] = vetor[j + 1]; //o item na posição j assume o valor do próximo item (o seu maior)
                    vetor[j + 1] = aux; //a variavel auxiliar assume o valor do item MAIOR, fazendo a ivnersão
               trocado = false; // variavel que "avisa" que ainda é preciso fazer mais ordenações, retomando o ciclo
                }			// trocado = false pois ainda é necessário fazer alterações
            }
        if(trocado) { //verificação da variavel booleana trocado, assumindo true
        	break; //como tudo já foi trocado e ordenado, comando break "quebra" o ciclo do for
        }
        }
        
        for (int i = 0; i <vetor.length; i++) {
        	System.out.println("Vetor ordenado: " + vetor[i]+ ""); // imprime o vetor de forma ordenada
        }
        }
    }

		
