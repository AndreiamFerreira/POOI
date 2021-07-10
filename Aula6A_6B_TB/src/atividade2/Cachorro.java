package atividade2;

public class Cachorro extends Animal {

	public Cachorro(String nome, String raca) {
		super(nome, raca);
		
	}

	public void cacarGato(){
		System.out.println("Cachorro caçando gato");
	}


	public void respirar() {
	
		System.out.println("Cachorro respirando");
	}
	
	
}
