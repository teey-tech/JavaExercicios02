package br.com.generation.condicionais;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2,n3, maior;
		
		
		System.out.println("Informe o Número 1");
		n1 = entrada.nextInt();
		
		
		System.out.println("Informe o Número 2");
		n2 = entrada.nextInt();
		
		System.out.println("Informe o Número 3");
		n3 = entrada.nextInt();
	
	
		if(n1 <= n2) {
			if (n2 <= n3) {
				System.out.println("Ordem: "+n1+"-"+n2+"-"+n3);
			}
			else if(n1 <= n3) {
				System.out.println("Ordem: "+n1+"-"+n3+"-"+n2);	
			}
			else {
				System.out.println("Ordem: "+n3+"-"+n1+"-"+n2);
			}
		}else if(n2 <= n3) {
			if(n1 <= n3) {
				System.out.println("Ordem: "+n2+"-"+n1+"-"+n3);
			}else {
				System.out.println("Ordem: "+n2+"-"+n3+"-"+n1);
			}
		}else {
			System.out.println("Ordem: "+n3+"-"+n2+"-"+n1);
		}
		
		
		entrada.close();

	}

}
