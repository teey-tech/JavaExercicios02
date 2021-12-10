package br.com.generation.condicionais;

import java.util.Scanner;

public class IdadePessoa02 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		
		System.out.println("Informe o Número a sua Idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		}
		else if(idade >= 15 && idade <=17) {
			System.out.println("Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Adulto");	
		}
		
		entrada.close();

	}

}
