package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 11/01/2023
 */
//3. Realiza un programa para determinar si un String es palíndromo.


public class Ciclos3_AJLL {

	public static void main(String[] args) {
		
		String palindro;
	
		int tamaño;
		int contador = 0;
		
		System.out.println("Programa que indica si la palabra ingresada es un palindromo o no.");
		

		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce la frase a ser verificada:");
		palindro = entrada.nextLine();
		
		palindro=palindro.toLowerCase().replace(" ", "");
		
		tamaño = palindro.length();
		
		for(int i = 0 , x=tamaño-1 ; i<tamaño && x >= 0  ; i++ , x-- ) {
			
			 if(palindro.charAt(i) == palindro.charAt(x)) {
				 contador++;
			 }
		}
		 if(contador == tamaño)
		 {
			 System.out.println("La frase ingresada si es un palindromo");
		 }else {
			 System.out.println("La frase ingresada no es un palindromo");
		 }
		
	}

}
