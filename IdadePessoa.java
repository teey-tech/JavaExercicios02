package br.com.generation.condicionais;

import java.util.Scanner;

public class IdadePessoa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		
		System.out.println("Categoria de idade:");
		System.out.println("\n1: Entre 10 a 14 anos ");
		System.out.println("\n2: Entre 15 a 17 anos ");
		System.out.println("\n3: Entre 18 a 25 anos ");
		System.out.println("\nEscolha sua categoria: ");
		
		n = entrada.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Você está na categoria Infantil");
			break;
		case 2:
			System.out.println("Você está na categoria Juvenil");
			break;
		case 3:
			System.out.println("Você está na categoria Adulto");
			break;								
		}
	entrada.close();
	}

}
