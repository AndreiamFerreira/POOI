package atividade1;

public class Exerc�cio10 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
	

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                matriz[i][j] = (int)(Math.random()*100)+1; 
            }
        }
        System.out.println("Conte�do da matriz: \n");
       
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);
            }
        
	}
        
	}
}
