package atividade4;

public class Album {
	
	private String nomeAlbum;
	private String artista;
	private int anoLancamento;
	private String produtora;
	public Album(String nomeAlbum, String artista, int anoLancamento, String produtora) {
		
		super();
		this.nomeAlbum = nomeAlbum;
		this.artista = artista;
		this.anoLancamento = anoLancamento;
		this.produtora = produtora;
	}
	
	public String getNomeAlbum() {
		return nomeAlbum;
	}
	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
		
	
}