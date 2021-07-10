package atividade2;

public class Ventilador {
	
	private int numPas;
	private int tensao;
	private int numVelocidades;
	public Ventilador(int numPas, int tensao, int numVelocidades) {
		super();
		this.numPas = numPas;
		this.tensao = tensao;
		this.numVelocidades = numVelocidades;
	}
	public int getNumPas() {
		return numPas;
	}
	public void setNumPas(int numPas) {
		this.numPas = numPas;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	public int getNumVelocidades() {
		return numVelocidades;
	}
	public void setNumVelocidades(int numVelocidades) {
		this.numVelocidades = numVelocidades;
	}
	
	
}
