package ex2;

public class Main {
	public static void main(String[] args) {
	
	//instanciamento da classe e seus objetos
	Estudante e = new Estudante(45, "Carlos", 'M', false);
	
	//impress�o de um objeto
	System.out.println("---------IMPRESS�O DE UM OBJETO------------");
	System.out.println("Nome: " +e.getNome());
	
	System.out.println("\n\n-----IMPRESS�O DO M�TODO TO STRING-------");
	System.out.println(e);
	}
}
