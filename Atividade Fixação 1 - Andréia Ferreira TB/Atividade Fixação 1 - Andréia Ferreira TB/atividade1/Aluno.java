package atividade1;

public class Aluno {
		
		//atributos
		// private encapsula esses atributos na classe
		private String matricula;
		private String nome;
		private float nota;
		private String serie;
		
		//método construtor
		public  Aluno(String mat, String nom, float not, String ser)
		{
			
			this.matricula=mat;
			this.nome=nom;
			this.nota=not;
			this.serie=ser;
			
		}
		
		public void setMatricula(String m) {
			this.matricula=m; 
		}
		
		public String getMatricula() {
			return matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getNota() {
			return nota;
		}

		public void setNota(float nota) {
			this.nota = nota;
		}

		public String getSerie() {
			return serie;
		}

		public void setSerie(String serie) {
			this.serie = serie;
		}
		
		
		
	}

