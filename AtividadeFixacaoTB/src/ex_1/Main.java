package ex_1;

public class Main {

	public static void main(String[] args) {
						
		double[] vetorA = new double[5];
		double soma = 0;
		double media = 0;
								
		vetorA[0] = 2.6;
		vetorA[1] = 6.1;
		vetorA[2] = 9.0;
		vetorA[3] = 7.3;
		vetorA[4] = 9.2;
				
		soma = (vetorA[0] + vetorA[1] + vetorA[2] + vetorA[3] + vetorA[4]);					
				
		media = (soma/vetorA.length);
											
		System.out.println("A média do vetor A é: " +media);
				
		}
				
}




