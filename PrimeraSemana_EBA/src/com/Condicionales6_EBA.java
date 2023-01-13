package com;

import java.util.Scanner;

public class Condicionales6_EBA {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 

		System.out.println("Introduce precio inicial: ");
		double inicial = leer.nextDouble();
		System.out.println("Introduce el tipo (Nota solo A o B): ");
		char tipo = leer.next().charAt(0);
		System.out.println("Introduce el tamaño (Nota solo 1 o 2): ");
		int tamaño = leer.nextInt();
		
		if (tipo == 'A' && tamaño == 1) {
			System.out.println("el total por kilo es: " + (inicial + .20));
		}
		else if (tipo == 'A' && tamaño == 2) {
			System.out.println("el total por kilo es: " + (inicial + .30));
		}
		else if (tipo == 'B' && tamaño == 1) {
			System.out.println("el total por kilo es: " + (inicial - .30));
		}
		else {
			System.out.println("el total por kilo es: " + (inicial - .50));
		}

	}

}
