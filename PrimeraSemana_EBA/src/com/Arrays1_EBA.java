package com;

import java.util.Scanner;

public class Arrays1_EBA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] numeros = new int [10]; 
		int inicio = 0;
		while (inicio < 10) {
			System.out.println("Introduce un numero: ");
			int numero = input.nextInt();
			numeros [inicio] = numero;
			inicio++;
		}
		for (int i = 0; i <numeros.length; i++ ) {			
			System.out.println(i + " "+ numeros[i]);
		}
		
	}		
}
