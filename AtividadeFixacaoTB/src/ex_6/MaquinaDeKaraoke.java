package ex_6;

import java.util.LinkedList;
import java.util.Scanner;

public class MaquinaDeKaraoke {
	public static void main(String[] args) {

	Scanner leitura = new Scanner(System.in);
	
	LinkedList<String> fila = new LinkedList<String>();
	
	fila.push("Yellow Submarine - The Beatles");
	fila.push("Burning - Maggie Rogers");
	fila.push("Shrike - Hozier");
	fila.push("Tiny Dancer - Elton John");
	fila.push("Disorder - Joy Division");
	  
	
	System.out.println("Escolha o que deseja fazer: \n");
	System.out.println("1 - Listar músicas da fila");
	System.out.println("2 - Executar música");
	
	  int op = leitura.nextInt();
	  switch (op) {
	     case 1:
	    	System.out.println(fila);
	    	main(args);
	    	 break;
	     case 2:
	    	System.out.println("Primeira música tocando!");
	 		System.out.println("\nPróxima música a tocar: ");
	 		fila.remove();
	 		System.out.println(fila.peek());
	 		main(args);
	       break;
	     default:
	       System.out.println("Opção inválida");
	       main(args);
	  }
	  leitura.close();
	}	
}


