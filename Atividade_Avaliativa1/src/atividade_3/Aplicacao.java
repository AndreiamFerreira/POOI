package atividade_3;

import java.util.Scanner;

public class Aplicacao {
	
public static void main(String[] args) {
	
	String nome;
	String sobrenome;
	
	Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome: ");
		nome = leitura.nextLine();
		
		System.out.println("Informe seu sobrenome: ");
		sobrenome = leitura.nextLine();
		
		Leitura le = new Leitura(nome, sobrenome);
		
		le.mostraMetodos();
}
}
