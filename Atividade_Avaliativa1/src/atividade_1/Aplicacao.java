package atividade_1;

public class Aplicacao {

	public static void main(String[] args) {
		
		Carro c = new Carro("Volkswagen", "BBX-2020", 32.0f);
		Caminhao ca = new Caminhao("Volvo", "BBY-2020", 40f);
		Moto m = new Moto("Yamaha", "BBZ-2020", 56f);
		
		c.mostraDadosCarro();
		ca.mostraDadosCaminhao();
		m.mostraDadosMoto();

	}

}
