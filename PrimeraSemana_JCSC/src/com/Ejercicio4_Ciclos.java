package com;

import java.util.Scanner;

public class Ejercicio4_Ciclos {

	public static void main(String[] args) {
		
		String cadena;
		String letra;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe una oración");
		cadena = entrada.nextLine();
		System.out.println("Escribe una letra");
		letra = entrada.nextLine();
		
		 int posicion= 0;
		 int contador = 0;
	        posicion = cadena.indexOf(letra);
	        while (posicion != -1) { 
	            contador++;                                      
	            posicion = cadena.indexOf(letra, posicion + 1);
	        }
		if (contador==0) {
			System.out.println("Caracter no encontrado");
		}else {
				System.out.println("La letra existe " + contador + " veces en la oración");
		}
	
	        
	}
}