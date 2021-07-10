package exercicioVeterinaria;

public class Main {

	public static void main(String[] args) {
		Clinica c = new Clinica();
		Animal a;
		 for (int i = 0; i < 10; i++) {
			 a = c.proximo();
			 c.manter(a);
			 
				System.out.println(a.toString());
				
		
	}

	}
}
