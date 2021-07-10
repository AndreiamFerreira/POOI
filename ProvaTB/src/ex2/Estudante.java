package ex2;

public class Estudante {
	
		private int matricula;
		private String nome;
		private char sexo;
		private boolean bolsista;
		
		public Estudante(int mat, String no, char se, boolean bol) {
			super();
			this.matricula = mat;
			this.nome = no;
			this.sexo = se;
			this.bolsista = bol;
		}

		
		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public boolean isBolsista() {
			return bolsista;
		}

		public void setBolsista(boolean bolsista) {
			this.bolsista = bolsista;
		}

		@Override
		public String toString() {
			return "-----------Estudante-----------"
					+"\nMatricula: " + matricula + 
					"\nNome:" + nome + 
					"\nSexo: " + sexo + 
					"\nBolsista: " + bolsista;
		}
		

	
			

}
