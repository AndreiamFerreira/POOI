package exercicioVeiculo;

public class Main {

	public static void main(String[] args) {
			Oficina o = new Oficina();
			Veiculo v;
			 for (int i = 0; i < 5; i++) {
				 v = o.proximo();
				 o.manter(v);
				 
				String texto = null;
				System.out.println(v.ajustar(texto));
				
				String textoLimpar = null;
				System.out.println(v.limpar(textoLimpar));
				
				String textoVerificar = null;;
				System.out.println(v.verificar(textoVerificar));
			 }
		}


	}


