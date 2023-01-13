package com;

import java.util.Scanner;

public class Condicionales1_EBA {

	public static void main(String[] args) {
		
		
		// EJERCICIO 1	
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		double numero1 = leer.nextDouble();		
		System.out.println("Introduce un numero: ");
		double numero2 = leer.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("El numero: " + numero1 + " es mayor");
			}
		else if(numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("El numero: " + numero2 + " es mayor");
		}

	}

}
