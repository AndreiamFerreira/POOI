package ex2;

public class Main {
	public static void main(String[] args) {
	
	//instanciamento da classe e seus objetos
	Estudante e = new Estudante(45, "Carlos", 'M', false);
	
	//impressão de um objeto
	System.out.println("---------IMPRESSÃO DE UM OBJETO------------");
	System.out.println("Nome: " +e.getNome());
	
	System.out.println("\n\n-----IMPRESSÃO DO MÉTODO TO STRING-------");
	System.out.println(e);
	}
}
