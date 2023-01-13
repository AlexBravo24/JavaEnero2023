package com;

import java.util.Scanner;

public class Ciclos4_AAB {
	
	public static void main(String[] args) {
		
		String palabra;
		String letra;
		int contador = 0;
		int letras;
		
		System.out.println("Escriba una palabra: ");
		Scanner entrada1 = new Scanner(System.in);
		palabra = entrada1.nextLine();
		palabra = palabra.toLowerCase();
		letras = palabra.length();
		
		System.out.println("Escriba una letra: ");
		Scanner entrada2 = new Scanner(System.in);
		letra = entrada2.next();
		
		for (int i = 0; i < letras; i++) {
			if (palabra.charAt(i) == letra.charAt(0)) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("Caracter no encontrado");
		}else {
			System.out.println("El caracter se encontró: " + contador + " veces.");
		}
	}
}
