package com;

import java.util.Scanner;

public class Arrays2_AAB {

	public static void main(String[] args) {

		int [] numeros = new int [100];
		double promedio = 0;
		double suma = 0;
		
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
			suma = numeros[i] + suma;
		}
		promedio = suma/100;
		System.out.println("La suma de los números es: " + suma);
		System.out.println("El promedio de los números es: " + promedio);
	}

}
