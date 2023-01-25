package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */

//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra 
//dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.


public class Ciclos4_AJLL {

	public static void main(String[] args) {
		
		String frase;
		String letra;
		int tamaño;
		int contador = 0;
		
		System.out.println("Programa que indica un caracter dentro de una frase.");
		

		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce la frase a ser verificada:");
		frase = entrada.nextLine();
		
		System.out.println("Introduce el caracter a verificar:");
		letra = entrada.nextLine();
		
		tamaño = frase.length();
		
		for( int i=0 ; i<tamaño ; i++ ) {
			if(frase.charAt(i) == letra.charAt(0)) {
				contador++;
			}
		}
		if(contador !=0 ) {
			
			System.out.println("El caracter " + letra + " fue encontrado: " + contador + " veces");
		}else {
			System.out.println("Caracter no encontrado");
		}
		
		

	}

}
