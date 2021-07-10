package exercicioVeiculo;

public class Automovel implements Veiculo {

	@Override
	public String ajustar(String texto) {
		return "Ajustando automóvel";
	}

	@Override
	public String limpar(String textoLimpar) {
		return "Limpando automóvel";
	}

	@Override
	public String verificar(String textoVerificar) {
		return "Verificando automóvel";
	}

	
}
