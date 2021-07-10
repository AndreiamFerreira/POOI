package ex_4;

import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> listaStrings = new LinkedList<String>();
		
		listaStrings.add("A");
		listaStrings.add("B");
		listaStrings.add("C");
		listaStrings.add("D");
		
		
		System.out.println(listaStrings.get(0) + "-" + listaStrings.get(1) + "-" + listaStrings.get(2) + "-" + listaStrings.get(3));

	}

}

