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
	public String getCa�a() {
		return "Cachorros ca�am gatos";
	}

	@Override
	public String toString() {
		return "\nUm novo " + getEspecie() + " chegou! \n" + getBarulho() +"\nCuidado! " + getCa�a() + "\n"; 

	}
	
	

}
