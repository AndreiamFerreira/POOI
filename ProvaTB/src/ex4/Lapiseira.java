package ex4;

public class Lapiseira {
	private String Marca;
	private String Cor;
	private float Grafite;

	public Lapiseira(String marca, String cor, float grafite) {
		super();
		Marca = marca;
		Cor = cor;
		Grafite = grafite;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getGrafite() {
		return Grafite;
	}

	public void setGrafite(float grafite) {
		Grafite = grafite;
	}

	public String toString() {
		return Marca + " " + Cor + " " + Grafite + "";
	}
}
