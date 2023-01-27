package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */
//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración 
//deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//23 x 95 = ???;

public class Ciclos2_AJLL {

	public static void main(String[] args) {
		
		int numero;
		int tope ;
		int i;
		
		System.out.println("Este es un programa que calcula la tabla del numero que desees, con el tope deseado por el usuario.");
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el numero al que desees sacar la tabla:");
		numero = entrada.nextInt();
		
		System.out.println("Introduce el tope al que desees llegar:");
		tope = entrada.nextInt();
		
		for(i = 1 ; i <= tope ; i++ ) {
			
			 System.out.println(numero + " * " + i + " = " + i * numero);
		}
		
		System.out.println("** FIN DE LA TABLA **");

	}

}
