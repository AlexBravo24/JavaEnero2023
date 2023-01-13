package com;

import java.util.Scanner;

public class ciclos4_AYMP {

	public static void main(String[] args) {
		String frase, frase2;
		char caracter;
		int longitud, contador=0;
		
		System.out.print("Ingrese una frase");
		Scanner entrada1= new Scanner(System.in);
		frase= entrada1.next();
		System.out.print("Ingrese el caracter a encontrar");
		Scanner entrada2= new Scanner(System.in);
		caracter= entrada2.next().charAt(0);
		
		longitud = frase.length();
		//frase2 =frase.equalsIgnoreCase(frase);
		for(int i=0; i<longitud; i++) {
			if(frase.charAt(i) == caracter) {
				contador++;
			}
		   }System.out.print("Se repite "+contador+ "veces");
		

	}

}
