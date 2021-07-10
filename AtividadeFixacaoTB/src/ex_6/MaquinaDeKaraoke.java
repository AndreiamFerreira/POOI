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
	System.out.println("1 - Listar m�sicas da fila");
	System.out.println("2 - Executar m�sica");
	
	  int op = leitura.nextInt();
	  switch (op) {
	     case 1:
	    	System.out.println(fila);
	    	main(args);
	    	 break;
	     case 2:
	    	System.out.println("Primeira m�sica tocando!");
	 		System.out.println("\nPr�xima m�sica a tocar: ");
	 		fila.remove();
	 		System.out.println(fila.peek());
	 		main(args);
	       break;
	     default:
	       System.out.println("Op��o inv�lida");
	       main(args);
	  }
	  leitura.close();
	}	
}


