package ex5;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Jo�o", 35, 8999);
		
		System.out.println("Sal�rio do funcion�rio "+f.getNome()+
				": " +f.calculaSalario(160, 12));

	}

}
