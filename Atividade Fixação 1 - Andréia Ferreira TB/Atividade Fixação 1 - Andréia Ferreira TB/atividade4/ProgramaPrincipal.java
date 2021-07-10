package atividade4;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Livro l = new Livro("O Hobbit", "J.R.R Tolkien", 325, "Harper Collins");
		Album a = new Album("Leed Zeppelin II", "Leed Zeppelin", 1969, "Atlantic Records");
		Filme f = new Filme("O Raio Verde", "Eric Rohmer", 1986, "Canal Plus");
		
		System.out.println("Nome do Livro: "+l.getNomeLivro());
		System.out.println("Nome do Álbum: "+a.getNomeAlbum());
		System.out.println("Nome do Filme: "+f.getNomeFilme());
	}

}
