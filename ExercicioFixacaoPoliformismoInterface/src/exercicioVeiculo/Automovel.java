package exercicioVeiculo;

public class Automovel implements Veiculo {

	@Override
	public String ajustar(String texto) {
		return "Ajustando autom�vel";
	}

	@Override
	public String limpar(String textoLimpar) {
		return "Limpando autom�vel";
	}

	@Override
	public String verificar(String textoVerificar) {
		return "Verificando autom�vel";
	}

	
}
