package atividade_1;

public class Moto {
	
	private String marcaMoto;
	private String placa;
	private float quilometragem;
	private float valorMoto;
	
	public Moto(String marcaMoto, String placa, float quilometragem, float valorMoto) {
		super();
		this.marcaMoto = marcaMoto;
		this.placa = placa;
		this.quilometragem = quilometragem;
		this.valorMoto = valorMoto;
	}
	
	public Moto(String marcaMoto, String placa, float quilometragem) {
		super();
		this.marcaMoto = marcaMoto;
		this.placa = placa;
		this.quilometragem = quilometragem;
	}

	public String getMarcaMoto() {
		return marcaMoto;
	}

	public void setMarcaMoto(String marcaMoto) {
		this.marcaMoto = marcaMoto;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}

	public float getValorMoto() {
		return valorMoto;
	}

	public void setValorMoto(float valorMoto) {
		this.valorMoto = valorMoto;
	}
	
	public void mostraDadosMoto() {
		System.out.println("Marca da Moto; "+this.marcaMoto);
		System.out.println("Placa da Moto: "+this.placa);
		System.out.println("Quilometragem: "+this.quilometragem);
		System.out.println("Valor da Moto: "+this.valorMoto);
		
	}
	
	

}
