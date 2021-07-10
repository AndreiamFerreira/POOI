package listaEstatica;

import java.util.Arrays;
import java.util.Scanner;
//Aluna: Andréia Martins Ferreira

public class Turma {
	static String[] alunos = new String[3];
	static int proximoIndice = 0;
	static Scanner leitura = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("\n-------------CLASSE DA LISTA ESTÁTICA (VETOR/ARRAY)------------\n");

		//MÉTODOS
			vetorVazio();
			adicionaAluno();
			alteraAluno();
			removeAluno();
			buscaAluno();
			limpaVetor();
			System.out.println("\n----------------FIM DA EXECUSÃO---------------");	
	}
		//VERIFICA SE O VETOR ESTÁ VAZIO
		public static void vetorVazio() {
		System.out.println("A lista está vazia?\n");
		if (proximoIndice == 0) {	//proximoindice = i 
			System.out.println("Turma vazia!\n");
		}
		else {
			System.out.println("Turma não está vazia!\n");
		}
	}
		//ADICIONA ALUNOS
		public static void adicionaAluno() {
			//adicionando 3 alunos
			//já que para fins de demonstração, defini a lista com tamanho 3
			//diferentemente da dinamica, utilizei loop for neste caso
		System.out.println("\n------------ADICIONANDO ALUNOS------------\n");
		System.out.println("Informe 3 alunos: ");
			for (int i = 0; i < alunos.length; i++) {
				alunos[i] = leitura.nextLine();
		}
		//ORDENA O VETOR
			Arrays.sort(alunos);	//comando que ordena em ordem alfabetica o vetor	
		//diferente da lista dinamica, optei por ordenar logo após adicionar os alunos como
		//forma de organizar a lista
			
			//MENSAGEM DE ÊXITO
		System.out.println("Alunos adicionados com sucesso!\n");
		//mostra a lista atual para certificar que foram adicionados com sucesso
			for (int i = 0; i < alunos.length; i++) { 
				System.out.println(alunos[i]);				
		}
	}

		//ALTERA ALUNO
		public static void alteraAluno() {
		System.out.println("\n------------ALTERANDO ALUNO------------\n");
		System.out.println("Digite o indíce do aluno a ser alterado: \n");
		int index = leitura.nextInt();			//lê o index ("i") do usuário
		leitura.nextLine();						//limpa o buffer
		System.out.println("Digite a alteração: \n");	//lê a string de alteração
		String alteracao = leitura.nextLine();
		alunos[index] = alteracao;					//substitui o índice indicado pelo usuário
													//pela string digitada pelo mesmo
		
		//MENSAGEM DE ÊXITO
		System.out.println("Alunos alterados com sucesso!\n");
		//mostra a lista atual para certificar que foram alterados com sucesso
			for (int i = 0; i < alunos.length; i++) { 
				System.out.println(alunos[i]);				
		}
	}
			
		//REMOVE ALUNO
		public static void removeAluno() {
		System.out.println("\n------------REMOVENDO ALUNO------------\n");
		System.out.println("Digite o índice do aluno que deseja remover: \n");
		int indice = leitura.nextInt();		//lê o indice do usuario
		leitura.nextLine();					//limpa o buffer
		alunos[indice] = " "; //como em vetores nao é possivel diminuir o seu tamanho
							// para remover um aluno, o alterei para null
		//MENSAGEM DE ÊXITO
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
				System.out.println("Aluno encontrado: " + alunos[i]); //se encontrado, é impresso na tela
			}
		}
	}

		//LIMPA VETOR
		public static void limpaVetor() {
		System.out.println("\n------------EXCLUSÃO GERAL------------\n");
	
			for (int i = 0; i < alunos.length; i++) {
			    alunos[i] = " ";		//assim como no metodo limpar
			    						//a exclusao geral é feita pela substituição
			    						//de todos os elementos por "    "
			}
			System.out.println("Turma apagada com sucesso! \n");
			for (int k = 0; k < alunos.length; k++) { 
				System.out.println(alunos[k]);	
				
			}
			leitura.close();	
		}		
	}



