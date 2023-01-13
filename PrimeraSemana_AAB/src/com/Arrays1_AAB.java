package com;

import java.util.Scanner;

public class Arrays1_AAB {

	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Agregue un número al arreglo: ");
			Scanner entrada1 = new Scanner(System.in);
			numeros[i] = entrada1.nextInt();
		}
		
		for (int i:numeros) {
			System.out.println(i);
		}
	}

}
