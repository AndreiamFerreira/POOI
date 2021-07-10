package atividade_3;

public class Leitura {
		
	private String nome;
	private String sobrenome;
	
		
		public Leitura(String nome, String sobrenome) {
			
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
		
		
		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getSobrenome() {
			return sobrenome;
		}



		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		

		public void mostraMetodos() {
		
		//Mostra o número de caracteres do nome
		int tamanhoString = nome.length() + sobrenome.length();
		System.out.println("Número de caracteres: "+ tamanhoString);
	
		//Mostra o índice da última letra do primeiro nome					  
		System.out.println("índice da última letra do primeiro nome: "+nome.lastIndexOf(nome.charAt(nome.length() - 1)));
		
		//Mostra o nome inteiro em maiusculo
		System.out.println("Nome em maúsculo: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
		
		//Substitui o primeiro nome pela palavra "Teste"
		System.out.println("Substituindo o primeiro nome com 'Teste': "+ nome.replace(this.nome, "Teste") + " " + this.sobrenome);
		
		}
  	
}	



	
	
	
			
	


	
	
