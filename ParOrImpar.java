package br.com.generation.condicionais;

import java.util.Scanner;

public class ParOrImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		
		
		System.out.println("Informe um3 Número: ");
		n1 = entrada.nextInt();
		
		
		if((n1 % 2 ) == 0) {
			System.out.println("Este numero é Par \n e sua raiz quadrada é de"+ Math.sqrt(n1));
		}else {
			System.out.println("Este numero é Impar \n e sua potencia quadrada é de"+ Math.pow(n1, 2));
		}
		entrada.close();
	}

}
