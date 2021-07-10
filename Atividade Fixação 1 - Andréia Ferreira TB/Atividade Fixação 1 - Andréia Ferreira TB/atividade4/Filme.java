package atividade4;

public class Filme {
	
	private String nomeFilme;
	private String diretor;
	private int anoEstreia;
	private String estudio;
	public Filme(String nomeFilme, String diretor, int anoEstreia, String estudio) {
		
		super();
		this.nomeFilme = nomeFilme;
		this.diretor = diretor;
		this.anoEstreia = anoEstreia;
		this.estudio = estudio;
	}
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getAnoEstreia() {
		return anoEstreia;
	}
	public void setAnoEstreia(int anoEstreia) {
		this.anoEstreia = anoEstreia;
	}
	public String getEstudio() {
		return estudio;
	}
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	
}
