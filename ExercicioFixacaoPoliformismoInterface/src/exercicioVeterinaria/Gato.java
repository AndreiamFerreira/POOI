package exercicioVeterinaria;

public class Gato implements Animal{

	@Override
	public String getBarulho() {
		return "MIAU";
	}

	@Override
	public String getEspecie() {
		return "Gato";
	}

	@Override
	public String getCa�a() {
		return "Gatos ca�am ratos";
	}

	@Override
	public String toString() {
		return "\nUm novo " + getEspecie() + " chegou! \n" + getBarulho() +"\nCuidado! " + getCa�a() + "\n"; 
	}


}
