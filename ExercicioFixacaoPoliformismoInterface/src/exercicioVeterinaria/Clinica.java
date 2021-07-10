package exercicioVeterinaria;

public class Clinica {
	public Animal proximo() {
	
	Animal a;
	double x = Math.random();
	
	
	if(x%2>0.5) {
		a = new Cachorro();
	}
	else
		a = new Gato();
	
	return a;
	
}

public void manter(Animal a) {
	a.toString();
}
}
