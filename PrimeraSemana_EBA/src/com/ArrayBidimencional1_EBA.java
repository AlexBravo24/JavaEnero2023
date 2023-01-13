package com;

import java.util.Scanner;

public class ArrayBidimencional1_EBA {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String [][] paises = new String [4][4]; // Definimos la matriz 
		
		int contador1 = 0;
		int contador2 = 0;
		
		for (int i = contador1; i < 4 ; i++) {
			System.out.println("Introdice el ");
			for (int j = 0; j < 4; j++ ) {
				System.out.println( "matriz [" +i + "] ["+j+"]:");
				paises [i][j] = input.nextLine();
			}
			
		}
		
		System.out.println("La matriz es");
		
				
		for (int i = 0; i < 4 ; i++) {
			System.out.println("");
			for (int j = 0; j < 4; j++ ) {
				System.out.print( paises[i][j]);
				
			}
			
		}

	}

}
