package exercicioVeterinaria;

public class Cachorro implements Animal{

	@Override
	public String getBarulho() {
		
		return "AUAU!";
	}

	@Override
	public String getEspecie() {
		return "cachorro";
	}

	@Override
	public String getCaça() {
		return "Cachorros caçam gatos";
	}

	@Override
	public String toString() {
		return "\nUm novo " + getEspecie() + " chegou! \n" + getBarulho() +"\nCuidado! " + getCaça() + "\n"; 

	}
	
	

}
