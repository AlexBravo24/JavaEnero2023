package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */
//12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las 
//edades sea superior a 25

public class Ciclos12_AJLL {

	public static void main(String[] args) {
		
		
		int edad, contador = 0;
		double prom = 0;
		
		System.out.println("Programa al que se ingresan cierto numero de edades, se detiene hasta que el promedio de estas es mayor a 25.");
		do {
			contador++;
			Scanner entrada = new Scanner(System.in); 
			System.out.println("Introduce la edad "+ contador + " : ");
			edad = entrada.nextInt();
			prom = prom + edad;
			
		} while( prom/contador < 25);
		
		System.out.println("\nEl promedio es: " + prom/contador );
	}

}
