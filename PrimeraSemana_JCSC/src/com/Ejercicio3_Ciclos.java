package com;

import java.util.Scanner;

public class Ejercicio3_Ciclos {

	public static void main(String[] args) {
	
		String original;
		String reversa = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe una palabra o frase");
		original = entrada.nextLine();		
				
		for (int i = original.length()-1; i>=0; i--) {
			reversa = reversa + original.charAt(i);
		}
		
			//System.out.println("Reversa: " + reversa.replace(" ", ""));
			
		if (original.replace(" ","").equalsIgnoreCase(reversa.replace(" ", ""))){
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}
			
		
		
		
	}

}
