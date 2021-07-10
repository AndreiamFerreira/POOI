package atividade2;

//super classe

public abstract class Animal {
	
	protected String nome; //atributos nao estao acessiveis diretamente nas subclasses com "private"
	protected String raca; //para acessar, usar o modificar de aceso "protected"
	
	public Animal(String nome, String raca) { //subclasse nao herda o construtor
		super();
		this.nome = nome;
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public abstract void respirar();
	
	public void fazerBarulho() {
		System.out.println("Animal fazendo barulho");
		
	}

}
