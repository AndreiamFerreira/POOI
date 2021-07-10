package ex_3;

import java.util.Scanner;

public class PPrincipal {

	public static void main(String[] args) {
		
	
		int[][] matriz = new int[3][3];
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe os 9 elementos da matriz: ");
		
	     for(int i=0; i<matriz.length; i++){
	      for(int j=0; j<matriz.length; j++){
	            matriz[i][j] = leitura.nextInt();
	      }
	     }
	     leitura.close();
	     somaElementosLinha(matriz);
	     produtoColunas(matriz);
	     diagonalPrincipal(matriz);

	}
	
		public static void somaElementosLinha(int[][] matriz) {
			int somalinha1 =  (matriz[0][0] + matriz[0][1] + matriz[0][2]);
			int somalinha2 =  (matriz[1][0] + matriz[1][1] + matriz[1][2]);
			int somalinha3 =  (matriz[2][0] + matriz[2][1] + matriz[2][2]);
	
		System.out.println("\nSoma dos elementos da primeira linha: " +somalinha1+
				"\nSoma dos elementos da segunda linha: "+somalinha2+ 
				"\nSoma dos elementos da terceira linha: "+somalinha3);
	}
	
		public static void produtoColunas(int[][] matriz) {
			int produtocoluna1 = (matriz[0][0]*matriz[1][0]*matriz[2][0]);
			int produtocoluna2 = (matriz[0][1]*matriz[1][1]*matriz[2][1]);
			int produtocoluna3 = (matriz[0][2]*matriz[1][2]*matriz[2][2]);
		System.out.println("\nProduto dos elementos da primeira coluna: " +produtocoluna1+ 
				"\nProduto dos elementos da segunda coluna: "+produtocoluna2+ 
				"\nProduto dos elementos da terceira coluna: "+produtocoluna3);

	}
	
		public static void diagonalPrincipal(int[][] matriz) {
			for (int i = 0; i < matriz.length; i++)
				for (int j = 0; j < matriz.length; j++)
					if (i == j) {
						System.out.println("\nDiagonal principal: ");
						System.out.println("\n"+matriz[i][j]);
					}			
	}
}

