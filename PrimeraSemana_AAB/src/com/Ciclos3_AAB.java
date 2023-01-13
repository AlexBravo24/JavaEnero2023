package com;

import java.util.Scanner;

public class Ciclos3_AAB {

	public static void main(String[] args) {
		
		String palabra;
		int letras;
		int letrasr;
		
		System.out.println("Escriba una palabra: ");
		Scanner entrada1 = new Scanner(System.in);
		palabra = entrada1.nextLine();
		palabra = palabra.toLowerCase().replace(" ","");
		
		letras = palabra.length() - 1;
		letrasr = letras;
		
		for (int i = 0; i <= letras; i++) {
			
			if (palabra.charAt(i) == palabra.charAt(letrasr)) {
				letrasr--;
			} else {
				System.out.println("No es palindromo");
				i = letras + 1;
			}
			if (i == letras) {
				System.out.println("Si es palindromo");
			}
			
		}

	}

}
