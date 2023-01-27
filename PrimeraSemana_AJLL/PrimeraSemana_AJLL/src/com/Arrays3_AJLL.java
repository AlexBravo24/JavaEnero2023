package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 12/01/2023
 */
//3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//caracteres.


public class Arrays3_AJLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		char [] nuevafrase = new char [n];
		String frase;
		
		System.out.println("Programa que pasa una frase ingresada a un array de caracteres");
		
		Scanner entrada = new Scanner(System.in); 
		System.out.print("Introduce la frase (no mayor a " + n + " caracteres):");
		frase = entrada.nextLine();
		
		
	
		for (int i = 0 ; i<frase.length() ; i++)
		{
			nuevafrase[i]=frase.charAt(i);
//			System.out.print(nuevafrase[i]);
		}
		System.out.println("El nuevo ARRAY queda como:");
		
		 for (char i:nuevafrase) 
		 {
			 System.out.print(i);
		 }
		
//		for ( int i = 0 ; i<frase.length() ; i++)
//		{
//			System.out.print(nuevafrase[i]);
//		}
//		
	}

}
