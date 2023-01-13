package com;

import java.util.Scanner;

public class Arrays3_EBA {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce una frase:");
		String palabra = leer.nextLine();
		
		
		char [] frase = palabra.toCharArray();
		
		for (char i = 0; i < palabra.length(); i++ ) {
			System.out.print(frase[i]);
			
		}
		
		
	}
}
