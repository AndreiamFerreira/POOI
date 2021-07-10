package listaDinamica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Aluna: Andréia Martins Ferreira

public class Turma {
	static Scanner leitura = new Scanner(System.in);
	static List<String> lista = new ArrayList<>();
	static String aluno;
	static String alteracao;
	
	public static void main(String[] args) {

		System.out.println("\n-------------CLASSE DA LISTA DINÂMICA (ARRAYLIST)------------\n");
		//MÉTODOS
			turmaVazia();
			adicionaAluno();
			alteraAluno();
			removeAluno();
			buscaAluno();
			listaOrdenada();
			limpaLista();
			System.out.println("\n----------------FIM DA EXECUSÃO---------------");
	}
	
	//VERIFICA SE A LISTA ESTÁ VAZIA
	public static void turmaVazia() {
	System.out.println("A turma está vazia?");
		
		if(lista.isEmpty() == true) {				//caso isEmpty seja verdadeiro, a lista está vazia
			System.out.println("A turma ainda está vazia"); 	
			}
			else 									//is empy falso = turma não está vazia
			System.out.println("A turma não está vazia");	
	}
	
	//ADICIONA ALUNOS	
	public static void adicionaAluno() {
		
		//optei por adicionar 3 alunos, individualmente, sem loop
		//cada aluno adicionado, aumenta o tamanho da lista
		
		System.out.println("\n-----------ADICIONANDO ALUNOS----------\n");
		//adicionando o primeiro aluno
		System.out.println("\nAdicione um aluno: ");
		lista.add(new String(aluno = leitura.nextLine()));
		
		//adicionando um segundo aluno na lista
		System.out.println("\nAdicione o segundo aluno: ");
		lista.add(new String(aluno = leitura.nextLine()));
		
		//adicionando um terceiro aluno na lista
		System.out.println("\nAdicione o terceiro aluno: ");
		lista.add(new String(aluno = leitura.nextLine()));
		
	}
	
		//ALTERA/EDITA CADASTRO DO ALUNO
		public static void alteraAluno() {
		System.out.println("\n-----------ALTERANDO CADASTRO----------\n");
		System.out.println("Digite o nome do aluno a ser alterado: \n"); 
		String nome = leitura.nextLine(); 				//primeiro indice do metodo set
		System.out.println("Reescreva-o, com a alteração: \n");
		alteracao = leitura.nextLine();					 //elemento do metodo set
		lista.set(lista.indexOf(nome), alteracao); 		//indexOf busca o índice do nome do aluno digitado
		
		//mensagem de êxito
		System.out.println("Aluno alterado com sucesso! \nTurma atualizada: \n");
		//mostra a nova lista para comprovar que a alteração foi feita
				for(int i = 0; i < lista.size(); i++) {
					System.out.println(lista.get(i));
					}
		}
			
		//REMOVE UM ALUNO DA LISTA
		public static void removeAluno() {		
		System.out.println("\n-----------REMOVENDO ALUNO----------\n");
		System.out.println("Escreva o nome do aluno a ser removido da turma: ");
		aluno = leitura.nextLine();
		lista.remove(lista.indexOf(aluno));	//indexOf permite que o usuario nao tenha que se preocupar
											//com o índice
		System.out.println("Aluno removido com sucesso! \nTurma atualizada: \n");
		//mostra a nova lista para comprovar que a alteração foi feita
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			}
		}
		
		//BUSCA UM ALUNO DA LISTA
		public static void buscaAluno() {
		System.out.println("\n-----------BUSCANDO ALUNO----------\n");
		System.out.println("Digite o nome do aluno");
		String nome = leitura.nextLine();
		System.out.println(lista.get(lista.indexOf(nome)));		//mostra o resultado da busca
		}
		
		//ORDENA A LISTA
		public static void listaOrdenada() {
		Collections.sort(lista);		//comando que organiza em ordem alfabética a lista
		
		//Lista a lista ordenanda
		System.out.println("Lista final ordenada: \n");
		for(int i = 0; i < lista.size(); i++) {		//mostra a "nova" lista
			System.out.println(lista.get(i));		//ordenação é permanente
		}
		}
		
		//LIMPA/EXCLUI A LISTA
		public static void limpaLista() {
		System.out.println("\n------------EXCLUSÃO GERAL------------\n");			
			lista.clear();							//exclui toda a lista
			System.out.println("Turma apagada com sucesso! \n");
		}
	}


