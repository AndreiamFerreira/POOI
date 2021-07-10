package atividade3;

public class ProfessorDE extends Professor{
	
	public ProfessorDE(String nome, int matricula, int idade, double salario) {
		super(nome, matricula, idade);
		this.salario = salario;
	}
	
	public void calculaSalario() {
				
		this.salario = this.salario * 2;
		System.out.println("Salário com adicional: " + this.getSalario());
	}
	

}


