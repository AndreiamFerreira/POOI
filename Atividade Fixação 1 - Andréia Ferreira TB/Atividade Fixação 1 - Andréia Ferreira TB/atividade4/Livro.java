package atividade4;

public class Livro {

	private String nomeLivro;
	private String autor;
	private int numPaginas;
	private String editora;
	public Livro(String nomeLivro, String autor, int numPaginas, String editora) {
		
		super();
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.editora = editora;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}

