package atividade1;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		//instanciar
		Aluno a1 = new Aluno("98239283", "Andreia", 9.0f, "7B");
		Aluno a2 = new Aluno("898923", "Luciano", 7.5f, "7A");

	//a1 objeto que funciona como variavel
		System.out.println("Matricula do aluno a1: "+a1.getMatricula());
		
	}
}
