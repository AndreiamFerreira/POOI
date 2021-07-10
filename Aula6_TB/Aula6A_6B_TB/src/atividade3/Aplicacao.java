package atividade3;

public class Aplicacao {

	public static void main(String[] args) {
		
		ProfessorDE pd = new ProfessorDE("Luciano", 2222, 30, 1000.00);
		pd.calculaSalario();
		
		ProfessorHorista ph = new ProfessorHorista("Ana", 3333, 30, 40, 50.00);
		ph.calculaSalario();
		
		}
	}

