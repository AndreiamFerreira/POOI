package atividade_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicacao {
	
		
	public static void main(String[] args) throws IOException {
	
	String nome;
	int idade;
	String endereco;
	float altura;
	float peso;
				
	BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Informe seu nome: ");
	nome = leitura.readLine();

	System.out.println("Informe sua idade: ");
	idade = Integer.parseInt(leitura.readLine());
	
	System.out.println("Informe seu endereço: ");
	endereco = leitura.readLine();
	
	System.out.println("Informe sua altura: ");
	altura = Float.parseFloat(leitura.readLine());
	
	System.out.println("Informe seu peso: ");
	peso = Float.parseFloat(leitura.readLine());
	
	Paciente pa = new Paciente(nome, idade, endereco, altura, peso);
	
	pa.mostraDados();
	pa.calculoIMC();
		
	}
	
	
	
}
	

	

