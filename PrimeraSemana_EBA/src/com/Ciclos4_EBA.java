package com;

import java.util.Scanner;

public class Ciclos4_EBA {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String palabra="";
		String caracter ="";
		int contador=0;

		// Leer la entrada de datos 
		System.out.println("Ingresa el texto ");
		palabra = leer.nextLine();
		System.out.println("¿que caracter deseas contar? ");
		caracter = leer.nextLine();
		
		// recorrer la palabra 
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)== caracter.charAt(0) ){
				contador ++;
			}
		}

		if (contador != 0) {
			System.out.println("El caracter "+caracter.charAt(0)+ " se repite " + contador + " veces");
		}else{
			System.out.println("El caracter no se encuentra en este texto");
		}
		
		
	}

}
