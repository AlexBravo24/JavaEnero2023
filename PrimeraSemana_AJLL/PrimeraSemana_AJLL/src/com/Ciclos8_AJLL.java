package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */
//11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto

public class Ciclos8_AJLL {

	public static void main(String[] args) {
		
		int alto;
		int largo;
		
		System.out.println("Programa crea una cuadrilatero en la consola.");
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el alto:");
		alto = entrada.nextInt();
		
		System.out.println("Introduce el largo:");
		largo = entrada.nextInt();
		
		System.out.println("\n");
		
		for (int i = 0 ; i < alto; i++) {
			for(int x = 0 ; x < largo ; x++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		
	}

}
