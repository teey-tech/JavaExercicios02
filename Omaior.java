package br.com.generation.condicionais;

import java.util.Scanner;

public class Omaior {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o Primeiro N�mero 1");
		a=entrada.nextInt();
		
		System.out.println("Digite o Primeiro N�mero 2");
		b=entrada.nextInt();
		
		System.out.println("Digite o Primeiro N�mero 3");
		c=entrada.nextInt();
		
		if(a>b && a>c) {
			System.out.println("o maior � o Numero 1: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("o maior � o Numero 2: "+b);
		}
		else {
			System.out.println("o maior � o Numero 3: "+c);
		}
		
		
		entrada.close();
	}
}
