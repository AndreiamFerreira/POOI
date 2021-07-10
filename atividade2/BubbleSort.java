package atividade2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	
		
		//bubble sort ordena os numeros inteiros em ordem crescente
		
		int vetor[] = new int[10];
		int aux;	//variavel auxiliar
		boolean trocado;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe 10 n�meros");  //pede para a o usu�rio inserir n�meros inteiros aleat�rios
		for(int i=0; i < vetor.length; i++){ //inser��o das inputs no vetor
            vetor[i] = leitura.nextInt();
        }
		
        for (int i = 0; i < vetor.length; i++) { //ciclo que garante que a ordena��o durar� no tamanho do vetor 
            trocado = true; //variavel que garante que o programa n�o precise fazer verifica��es inuteis ap�s a ordena��o completa
        	for (int j = 0; j < (vetor.length - 1); j++) { //define a vari�vel "j" para a verifica��o
                if (vetor[j] > vetor[j+1]) { 	//compara se o item na posi��o "j" � maior que o item na posi��o j+1
                	aux = vetor[j];  //variavel auxiliar assume o valor do item na posi��o j (verificado anteriormente)
                    vetor[j] = vetor[j + 1]; //o item na posi��o j assume o valor do pr�ximo item (o seu maior)
                    vetor[j + 1] = aux; //a variavel auxiliar assume o valor do item MAIOR, fazendo a ivners�o
               trocado = false; // variavel que "avisa" que ainda � preciso fazer mais ordena��es, retomando o ciclo
                }			// trocado = false pois ainda � necess�rio fazer altera��es
            }
        if(trocado) { //verifica��o da variavel booleana trocado, assumindo true
        	break; //como tudo j� foi trocado e ordenado, comando break "quebra" o ciclo do for
        }
        }
        
        for (int i = 0; i <vetor.length; i++) {
        	System.out.println("Vetor ordenado: " + vetor[i]+ ""); // imprime o vetor de forma ordenada
        }
        }
    }

		
