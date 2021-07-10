package listaDinamica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Aluna: Andr�ia Martins Ferreira

public class Turma {
	static Scanner leitura = new Scanner(System.in);
	static List<String> lista = new ArrayList<>();
	static String aluno;
	static String alteracao;
	
	public static void main(String[] args) {

		System.out.println("\n-------------CLASSE DA LISTA DIN�MICA (ARRAYLIST)------------\n");
		//M�TODOS
			turmaVazia();
			adicionaAluno();
			alteraAluno();
			removeAluno();
			buscaAluno();
			listaOrdenada();
			limpaLista();
			System.out.println("\n----------------FIM DA EXECUS�O---------------");
	}
	
	//VERIFICA SE A LISTA EST� VAZIA
	public static void turmaVazia() {
	System.out.println("A turma est� vazia?");
		
		if(lista.isEmpty() == true) {				//caso isEmpty seja verdadeiro, a lista est� vazia
			System.out.println("A turma ainda est� vazia"); 	
			}
			else 									//is empy falso = turma n�o est� vazia
			System.out.println("A turma n�o est� vazia");	
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
		System.out.println("Reescreva-o, com a altera��o: \n");
		alteracao = leitura.nextLine();					 //elemento do metodo set
		lista.set(lista.indexOf(nome), alteracao); 		//indexOf busca o �ndice do nome do aluno digitado
		
		//mensagem de �xito
		System.out.println("Aluno alterado com sucesso! \nTurma atualizada: \n");
		//mostra a nova lista para comprovar que a altera��o foi feita
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
											//com o �ndice
		System.out.println("Aluno removido com sucesso! \nTurma atualizada: \n");
		//mostra a nova lista para comprovar que a altera��o foi feita
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
		Collections.sort(lista);		//comando que organiza em ordem alfab�tica a lista
		
		//Lista a lista ordenanda
		System.out.println("Lista final ordenada: \n");
		for(int i = 0; i < lista.size(); i++) {		//mostra a "nova" lista
			System.out.println(lista.get(i));		//ordena��o � permanente
		}
		}
		
		//LIMPA/EXCLUI A LISTA
		public static void limpaLista() {
		System.out.println("\n------------EXCLUS�O GERAL------------\n");			
			lista.clear();							//exclui toda a lista
			System.out.println("Turma apagada com sucesso! \n");
		}
	}


