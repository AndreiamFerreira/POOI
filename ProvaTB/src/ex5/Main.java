package ex5;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("João", 35, 8999);
		
		System.out.println("Salário do funcionário "+f.getNome()+
				": " +f.calculaSalario(160, 12));

	}

}
