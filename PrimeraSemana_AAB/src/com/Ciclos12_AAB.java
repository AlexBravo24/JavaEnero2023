package com;

import java.util.Scanner;

public class Ciclos12_AAB {

	public static void main(String[] args) {
		
		double promedio = 0;
		int contador = 0;
		int edad = 0;
		
		while (promedio < 25) {
			System.out.println("Escriba la edad a promediar: ");
			Scanner entrada1 = new Scanner(System.in);
			edad = entrada1.nextInt();
			
			promedio = (promedio + edad) / 2;
			contador++;
		}
		System.out.println("La edad promedio es de: " + promedio + " años");
		System.out.println("Se registraron un total de: " + contador + " edades");
	}

}
