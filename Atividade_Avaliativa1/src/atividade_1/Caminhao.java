package atividade_1;

public class Caminhao {
	
	private String marcaCaminhao;
	private String placa;
	private float quilometragem;
	private float valorCaminhao;
	public Caminhao(String marcaCaminhao, String placa, float quilometragem, float valorCaminhao) {
		super();
		this.marcaCaminhao = marcaCaminhao;
		this.placa = placa;
		this.quilometragem = quilometragem;
		this.valorCaminhao = valorCaminhao;
	}
	public Caminhao(String marcaCaminhao, String placa, float quilometragem) {
		super();
		this.marcaCaminhao = marcaCaminhao;
		this.placa = placa;
		this.quilometragem = quilometragem;
	}
	public String getMarcaCaminhao() {
		return marcaCaminhao;
	}
	public void setMarcaCaminhao(String marcaCaminhao) {
		this.marcaCaminhao = marcaCaminhao;
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
	public float getValorCaminhao() {
		return valorCaminhao;
	}
	public void setValorCaminhao(float valorCaminhao) {
		this.valorCaminhao = valorCaminhao;
	}
	
	public void mostraDadosCaminhao() {
		System.out.println("Marca do Caminhão; "+this.marcaCaminhao);
		System.out.println("Placa do Caminhão: "+this.placa);
		System.out.println("Quilometragem: "+this.quilometragem);
		System.out.println("Valor do Caminhão: "+this.valorCaminhao);
		
	}

}
