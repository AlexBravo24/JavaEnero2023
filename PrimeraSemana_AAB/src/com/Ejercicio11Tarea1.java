package com;

import java.util.Scanner;

public class Ejercicio11Tarea1 {
	
	public static void main(String[] args) {
		
		double peso;
		int ubi;
		
		System.out.println("Escriba el peso del paquete: ");
		Scanner entrada1 = new Scanner(System.in);
		peso = entrada1.nextDouble();
		
		System.out.println("Escriba la zona a la que va dirigido su paquete: \n 1 América del Norte\n 2 América Central\n 3 América del Sur\n 4 Europa\n 5 Asia");
		Scanner entrada2 = new Scanner(System.in);
		ubi = entrada1.nextInt();
		
		if (peso > 5) {
			System.out.println("El paquete excede el límite de peso.");
		} else if (ubi == 1) {
			System.out.printf("El costo es de: " + (peso * 24.00) + " Euros.");
		} else if (ubi == 2) {
			System.out.printf("El costo es de: " + (peso * 20.00) + " Euros.");
		} else if (ubi == 3) {
			System.out.printf("El costo es de: " + (peso * 21.00) + " Euros.");
		} else if (ubi == 4) {
			System.out.printf("El costo es de: " + (peso * 10.00) + " Euros.");
		} else if (ubi == 5) {
			System.out.printf("El costo es de: " + (peso * 18.00) + " Euros.");
		} else {
			System.out.println("No corresponde a ningún destino.");
		}
	}
}
