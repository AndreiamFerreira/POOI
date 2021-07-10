package ex5;

public class Funcionario extends Pessoa implements Salario{

	private int matricula;

	public Funcionario(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public double calculaSalario(int qntdHoras, double valorHoras) {
		
		return qntdHoras*valorHoras;
	}

}
