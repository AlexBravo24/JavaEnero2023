package com;

import java.util.Scanner;

public class Condicionales8_EBA {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introdice el numero: ");
		int numero = leer.nextInt();
		switch (numero) {
		case 1:
			System.out.println("seis");
			break;
		case 2:
			System.out.println("Cinco");
			break;
		case 3:
			System.out.println("Cuatro");
			break;
		case 4:
			System.out.println("Tres");
			break;
		case 5:
			System.out.println("Dos");
			break;
		case 6:
			System.out.println("Uno");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("Error: Numero incorrecto");
			break;
		}

	}

}
