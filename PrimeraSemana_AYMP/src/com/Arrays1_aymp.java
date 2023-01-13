package com;

import java.util.Scanner;

public class Arrays1_aymp {

	public static void main(String[] args) {
		int [] numeros = new int[10];
		
		for(int i =0; i<10; i++) {
			System.out.println("Ingresa el valor "+i+" de tu arreglo: ");
			Scanner entrada= new Scanner(System.in);
			numeros[i]=entrada.nextInt();	
		}
		System.out.println("El arreglo ingresado es: ");
		for (int i = 0; i<10; i++) {
			System.out.println("Posición "+i+" : "+numeros[i]);
		}
		
		

	}

}
