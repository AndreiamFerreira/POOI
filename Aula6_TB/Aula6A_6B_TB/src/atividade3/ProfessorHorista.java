package atividade3;

public class ProfessorHorista extends Professor {
	
	private double totalHoras;
	private double salarioHora;
	private double salario;
	
		public ProfessorHorista(String nome, int matricula, int idade, double totalHoras, double salarioHora) {
		super(nome, matricula, idade);
	
		}

		public double getTotalHoras() {
			return totalHoras;
		}

		public void setTotalHoras(double totalHoras) {
			this.totalHoras = totalHoras;
		}

		public double getSalarioHora() {
			return salarioHora;
		}

		public void setSalarioHora(double salarioHora) {
			this.salarioHora = salarioHora;
		}
		
		public void calculaSalario() {
		
			this.salario = this.salarioHora * this.totalHoras;
			System.out.println("O salário é: " + salario);
			
		}
}



