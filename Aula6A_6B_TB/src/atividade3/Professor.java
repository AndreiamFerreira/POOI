package atividade3;

public abstract class Professor {
	
	protected String nome;
	protected int matricula;
	protected int idade;
	protected double salario;
	
	public Professor(String nome, int matricula, int idade) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract void calculaSalario();
	

}


