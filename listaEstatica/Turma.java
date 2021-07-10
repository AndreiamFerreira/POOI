package listaEstatica;

import java.util.Arrays;
import java.util.Scanner;
//Aluna: Andr�ia Martins Ferreira

public class Turma {
	static String[] alunos = new String[3];
	static int proximoIndice = 0;
	static Scanner leitura = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("\n-------------CLASSE DA LISTA EST�TICA (VETOR/ARRAY)------------\n");

		//M�TODOS
			vetorVazio();
			adicionaAluno();
			alteraAluno();
			removeAluno();
			buscaAluno();
			limpaVetor();
			System.out.println("\n----------------FIM DA EXECUS�O---------------");	
	}
		//VERIFICA SE O VETOR EST� VAZIO
		public static void vetorVazio() {
		System.out.println("A lista est� vazia?\n");
		if (proximoIndice == 0) {	//proximoindice = i 
			System.out.println("Turma vazia!\n");
		}
		else {
			System.out.println("Turma n�o est� vazia!\n");
		}
	}
		//ADICIONA ALUNOS
		public static void adicionaAluno() {
			//adicionando 3 alunos
			//j� que para fins de demonstra��o, defini a lista com tamanho 3
			//diferentemente da dinamica, utilizei loop for neste caso
		System.out.println("\n------------ADICIONANDO ALUNOS------------\n");
		System.out.println("Informe 3 alunos: ");
			for (int i = 0; i < alunos.length; i++) {
				alunos[i] = leitura.nextLine();
		}
		//ORDENA O VETOR
			Arrays.sort(alunos);	//comando que ordena em ordem alfabetica o vetor	
		//diferente da lista dinamica, optei por ordenar logo ap�s adicionar os alunos como
		//forma de organizar a lista
			
			//MENSAGEM DE �XITO
		System.out.println("Alunos adicionados com sucesso!\n");
		//mostra a lista atual para certificar que foram adicionados com sucesso
			for (int i = 0; i < alunos.length; i++) { 
				System.out.println(alunos[i]);				
		}
	}

		//ALTERA ALUNO
		public static void alteraAluno() {
		System.out.println("\n------------ALTERANDO ALUNO------------\n");
		System.out.println("Digite o ind�ce do aluno a ser alterado: \n");
		int index = leitura.nextInt();			//l� o index ("i") do usu�rio
		leitura.nextLine();						//limpa o buffer
		System.out.println("Digite a altera��o: \n");	//l� a string de altera��o
		String alteracao = leitura.nextLine();
		alunos[index] = alteracao;					//substitui o �ndice indicado pelo usu�rio
													//pela string digitada pelo mesmo
		
		//MENSAGEM DE �XITO
		System.out.println("Alunos alterados com sucesso!\n");
		//mostra a lista atual para certificar que foram alterados com sucesso
			for (int i = 0; i < alunos.length; i++) { 
				System.out.println(alunos[i]);				
		}
	}
			
		//REMOVE ALUNO
		public static void removeAluno() {
		System.out.println("\n------------REMOVENDO ALUNO------------\n");
		System.out.println("Digite o �ndice do aluno que deseja remover: \n");
		int indice = leitura.nextInt();		//l� o indice do usuario
		leitura.nextLine();					//limpa o buffer
		alunos[indice] = " "; //como em vetores nao � possivel diminuir o seu tamanho
							// para remover um aluno, o alterei para null
		//MENSAGEM DE �XITO
		System.out.println("Aluno removido com sucesso!\n");
		//mostra a lista atual para certificar que foi removido com sucesso
		for (int i = 0; i < alunos.length; i++) { 
			System.out.println(alunos[i]);				
		}
	}
		//BUSCA ALUNO
		public static void buscaAluno() {
		System.out.println("\n------------BUSCANDO UM ALUNO------------\n");
		System.out.println("Digite o que busca: ");
		String valor = leitura.nextLine();
		for (int i=0; i<alunos.length; i++){
			if (alunos[i] == valor){		//compara o valor do usuario com o valor do vetor
				System.out.println("Aluno encontrado: " + alunos[i]); //se encontrado, � impresso na tela
			}
		}
	}

		//LIMPA VETOR
		public static void limpaVetor() {
		System.out.println("\n------------EXCLUS�O GERAL------------\n");
	
			for (int i = 0; i < alunos.length; i++) {
			    alunos[i] = " ";		//assim como no metodo limpar
			    						//a exclusao geral � feita pela substitui��o
			    						//de todos os elementos por "    "
			}
			System.out.println("Turma apagada com sucesso! \n");
			for (int k = 0; k < alunos.length; k++) { 
				System.out.println(alunos[k]);	
				
			}
			leitura.close();	
		}		
	}



