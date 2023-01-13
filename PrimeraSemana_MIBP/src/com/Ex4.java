package com;

import java.util.Scanner;

public class Ex4 {
//	4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra 
//	dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”

	public static void main(String[] args) {
		
		String frase;
		String caracter;
		int contador = 0;
		int tamaño;
		char letra = 'a';
		
		System.out.println("Ingrese la frase que desea analizar");
		Scanner scanner = new Scanner(System.in);
		frase = scanner.nextLine();
		
		
		System.out.println("Ingrese el caracter que desee encontrar");
		Scanner scanner2 = new Scanner(System.in);
		caracter = scanner2.nextLine();
	
		tamaño = frase.length();
		
	    char caracter2;
		caracter2 = caracter.charAt(0);

		for (int i = 0; i<= tamaño -1; i++) {
			
			letra = frase.charAt(i);
			
			if (letra == caracter2) {
				contador +=1;
				
				
			} 
			 
			
			
		}
			
		
		System.out.println("La letra\t" + letra +"\t está \t" + contador +"\t veces") ;
		

	}

}
