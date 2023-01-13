package com;

import java.util.Scanner;

public class Condicionales3_EBA {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Introduce un numero: ");
		double numero1 = leer.nextDouble();
		
		System.out.println("Introduce un numero: ");
		int numero2 = leer.nextInt();
		double resta = numero1/numero2;
		if (numero2 != 0) {
			System.out.println("El resultado de la esta ess: " + resta);
		}else {
			System.out.println("Error no se puede dividir por cero");
		}

	}

}
