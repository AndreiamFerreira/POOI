package ex3;

public class Notas {

	Main m = new Main();

	private double vetorNotas[];
	private double media;
	private double soma;
	private double frequencia;

	public Notas(Main m, double[] vetorNotas, double media, double soma, double frequencia) {
		super();
		this.m = m;
		this.vetorNotas = vetorNotas;
		this.media = media;
		this.soma = soma;
		this.frequencia = frequencia;
	}

	public double[] getVetorNotas() {
		return vetorNotas;
	}

	public void setVetorNotas(double[] vetorNotas) {
		this.vetorNotas = vetorNotas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public void confere() {
		if (frequencia < 70 || media < 4) {
			System.out.println("Aluno REPROVADO! \n" + "Frequência: " + frequencia + "%\n" + "Média Final: " + media);
		} else if (media < 7 && media >= 4) {
			System.out.println("Aluno EM EXAME! " + "Média final: " + media);

		} else {
			System.out.println("Aluno APROVADO! " + "\nMédia Final: " + media);

		}
	}
}
