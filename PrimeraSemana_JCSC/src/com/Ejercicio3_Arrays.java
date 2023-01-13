package com;

import java.util.Scanner;

public class Ejercicio3_Arrays {

	public static void main(String[] args) {
		
		char [] caracteres = new char [100];
		String fraseU;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce una frase");
		fraseU = entrada.nextLine();
		
		for (int i=0; i<fraseU.length(); i++) {
			caracteres [i] = fraseU.charAt(i);
			System.out.println(caracteres[i]);
		}

	}

}
