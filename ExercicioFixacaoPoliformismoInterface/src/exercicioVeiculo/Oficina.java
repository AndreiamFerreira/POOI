package exercicioVeiculo;

public class Oficina {
	
	public Veiculo proximo() {
		Veiculo v;
		
		double x = Math.random();
		
		if(x%2>0.5) {
			v = new Automovel();
		}
		else
			v= new Bicicleta();
		
		return v;
		
		
	}
	
	public void manter(Veiculo v) {
		String texto = null;
		v.ajustar(texto); 
		
		String textoLimpar = null;
		v.limpar(textoLimpar); 
		
		String textoVerificar = null;
		v.verificar(textoVerificar);
	}
	
	
}
