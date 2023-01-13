package com;

import java.util.Scanner;

public class Condicionales13_EBA {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Introduce el monto de la donacion: ");
		double donacion = leer.nextDouble();
		
		if (donacion >= 10000 ) {
			double niños = (donacion*.20);
			double hospital = (donacion*.50);
			double ahorro = (donacion*.30);
			System.out.println("el total para los niños es "+ niños + " total para el hospital es: " + hospital + " y es total de invercion es: " + ahorro);
		}else {
			double niños = (donacion*.60);
			double hospital = (donacion*.25);
			double ahorro = (donacion*.15);
			System.out.println("el total para los niños es "+ niños + " total para el hospital es: " + hospital + " y es total de invercion es: " + ahorro);
		}
	

	}

}
