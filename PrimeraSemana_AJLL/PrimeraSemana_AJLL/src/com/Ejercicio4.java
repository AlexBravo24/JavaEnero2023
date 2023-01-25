package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		String cadena;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce un caracter:");
		cadena = entrada.nextLine();
		
		if(cadena.length()!=1) {
			
			System.out.println("La cadena es mayor que un caracter");
			
		} else if((cadena.compareTo("A")>=0) && (cadena.compareTo("Z")<=0)) {
			
			System.out.println("La cadena es mayuscula");
			
		}else {
			System.out.println("La cadena es minuscula");
		}
	
	}
}
