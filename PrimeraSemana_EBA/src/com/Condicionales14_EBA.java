package com;

import java.util.Scanner;

public class Condicionales14_EBA {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 
	

		System.out.println("Ingresa el total de horas trabajadas: ");
		double horas = leer.nextDouble();
		
		if (horas <= 40) {
			System.out.println("El total de tu sueldo es " + (horas*16) );
		}else {
			double extras = horas - 40;
			System.out.println("El total de tu sueldo es " + ((40 * 16)+(extras * 20) ));
		} 

	}

}
