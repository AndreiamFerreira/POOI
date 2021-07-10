package atividade3;

public class Lampada {
	
	private String estadoDaLampada;

	public Lampada() {
		
		super();
		this.estadoDaLampada = "apagada";
	}

	public String getEstadoDaLampada() {
		return estadoDaLampada;
	}

	public void setEstadoDaLampada(String estadoDaLampada) {
		this.estadoDaLampada = estadoDaLampada;
	}
	
	public void acende() {
		this.estadoDaLampada = "acesa";
	}
	
	public void apaga() {
		this.estadoDaLampada = "apagada";
	}
	
	public void imprimeEstado() {
		System.out.println("A lâmpada está: "+this.estadoDaLampada);
	}
	
	public static void main(String[] args) {
		Lampada l = new Lampada();
		l.acende();
		l.apaga();
		l.imprimeEstado();
	}
	

}
