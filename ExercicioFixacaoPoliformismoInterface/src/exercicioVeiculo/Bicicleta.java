package exercicioVeiculo;

public class Bicicleta implements Veiculo {

	@Override
	public String ajustar(String texto) {
		return "Ajustando bicicleta!";
		
	}

	@Override
	public String limpar(String textoLimpar) {
		return "Limpando bicicleta";
	}

	@Override
	public String verificar(String textoVerificar) {
		return "Verificando bicicleta";
	}
}

	