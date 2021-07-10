package atividade_1;

public class Carro {
	
	private String marcaCarro;
	private String placa;
	private float quilometragem;
	private float valorCarro;
	
	public Carro(String marcaCarro, String placa, float quilometragem, float valorCarro) {
		super();
		this.marcaCarro = marcaCarro;
		this.placa = placa;
		this.quilometragem = quilometragem;
		this.valorCarro = valorCarro;
	}
	
	public Carro(String marcaCarro, String placa, float quilometragem) {
		
		super();
		this.marcaCarro = marcaCarro;
		this.placa = placa;
		this.quilometragem = quilometragem;
		
			
	}
	
	public String getMarcaCarro() {
		return marcaCarro;
	}
	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
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
	public float getValorCarro() {
		return valorCarro;
	}
	public void setValorCarro(float valorCarro) {
		this.valorCarro = valorCarro;
	} 
	
		
	public void mostraDadosCarro() {
		System.out.println("Marca do Carro; "+this.marcaCarro);
		System.out.println("Placa do Carro: "+this.placa);
		System.out.println("Quilometragem: "+this.quilometragem);
		System.out.println("Valor do Carro: "+this.valorCarro);
		
	}
	

}
