package com;

import java.util.Scanner;

public class ArrayBidimensional1_AAB {

	public static void main(String[] args) {
		
		
		String[][] paises = new String[4][4];
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Escriba un país: ");
			Scanner entrada1 = new Scanner(System.in);
			paises[i][0] = entrada1.nextLine();
			
			for (int j = 1; j < 4; j++) {
			
				System.out.println("Escriba una ciudad: ");
				Scanner entrada2 = new Scanner(System.in);
				paises[i][j] = entrada2.nextLine();
			}
			
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("País: " + paises[i][0] + "	Ciudades: ");
			for (int j = 1; j < 4; j++) {
				System.out.print(paises[i][j] + "	");
			}
			System.out.println();
		}
	}

}
