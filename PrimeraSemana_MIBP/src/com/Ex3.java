package com;

import java.util.Scanner;

public class Ex3 {
//	Realiza un programa para determinar si un String es palíndromo.


	public static void main(String[] args) {
		
		String frase;
		System.out.println("Ingrese su frase");
		Scanner scanner = new Scanner(System.in);
		frase = scanner.nextLine();
		
		String frase2;
		System.out.println("Ingrese de nuevo la frase" );
		Scanner scanner2 = new Scanner(System.in);
		frase2 = scanner2.nextLine();
		
		for (int i = frase.length()-1; i >=0; i --) {
			
			frase2 = frase2 + frase.charAt(i);
			
		}
		 System.out.println("Reversa: " + frase2.replace("", ""));
		 
		
		
		
		

	}

}
