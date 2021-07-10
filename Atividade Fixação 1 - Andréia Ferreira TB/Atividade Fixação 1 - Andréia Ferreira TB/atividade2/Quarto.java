package atividade2;

public class Quarto {
	
	private String tipoQuarto;
	private int numTomadas;
	private float  metrosQuadrados;
	private int numJanelas;
	
	public Quarto(String tipoQuarto, int numTomadas, float metrosQuadrados, int numJanelas) {
		super();
		this.tipoQuarto = tipoQuarto;
		this.numTomadas = numTomadas;
		this.metrosQuadrados = metrosQuadrados;
		this.numJanelas = numJanelas;
	}
	
	public String getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public int getNumTomadas() {
		return numTomadas;
	}
	public void setNumTomadas(int numTomadas) {
		this.numTomadas = numTomadas;
	}
	public float getMetrosQuadrados() {
		return metrosQuadrados;
	}
	public void setMetrosQuadrados(float metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}
	public int getNumJanelas() {
		return numJanelas;
	}
	public void setNumJanelas(int numJanelas) {
		this.numJanelas = numJanelas;
	}

	
}
