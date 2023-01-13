package com;

import java.util.Scanner;

public class Ciclos3_EBA {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String entrada = leer.nextLine();
		
		StringBuilder palabra1 = new StringBuilder(entrada);
		String palab = palabra1.reverse().toString().replace(" ", ""); 
		if (entrada.replace(" ", "").equals(palab)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("no es palindromo");
		}
		
		
		//solucion 
//		String original;
//		String reversa = "";
//		
//		Scanner entrada = new Scanner (System.in);
//		System.out.println("Ingresa una palabra o frase");
//		original = entrada.nextLine();
//		
//		
//		//iterar alrevez para armar la reversa
//		for (int i = original.length()-1;i >=0; i--) {
//			reversa = reversa + original.charAt(i); //7 extraemos los caracteres y los guardamos deacuerdo ala posicion en la que s eencuentran
//		}
//		System.out.println("Reversa: " + reversa.replace(" ", ""));
//		
//		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
//			System.out.println("Es palindromo");
//		}else {
//			System.out.println("No es palindromo");
//		}
		
		
	}

}
