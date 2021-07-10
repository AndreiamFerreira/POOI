package atividade2;

public class Cavalo extends Animal {
	
	private boolean ferradura;

	public Cavalo(String nome, String raça, boolean ferradura) {
		super(nome, raça);
		this.ferradura = ferradura;
	}

	public boolean isFerradura() {
		return ferradura;
	}

	public void setFerradura(boolean ferradura) {
		this.ferradura = ferradura;
	}

	
	public void respirar() {
		System.out.println("Cavalo está respirando");
		
	}
	
}
