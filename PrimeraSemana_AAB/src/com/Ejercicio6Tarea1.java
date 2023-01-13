package com;

import java.util.Scanner;

public class Ejercicio6Tarea1 {

	public static void main(String[] args) {
		
		String tipo;
		int tamaño;
		double precio;
		
		
		System.out.println("Especifique el tipo de uva (A/B): ");
		Scanner entrada1 = new Scanner(System.in);
		tipo = entrada1.next();
		
		System.out.println("Especifique el tamaño de la uva (1/2): ");
		Scanner entrada2 = new Scanner(System.in);
		tamaño = entrada2.nextInt();
		
		System.out.println("Digite el precio inicial: ");
		Scanner entrada3 = new Scanner(System.in);
		precio = entrada3.nextDouble();
		
		if ((tipo.equalsIgnoreCase("A") && (tamaño == 1))) {
			System.out.println("El precio final es: " + (precio + 0.20));
		} else if ((tipo.equalsIgnoreCase("A") && (tamaño == 2))) {
			System.out.println("El precio final es: " + (precio + 0.30));
		} else if ((tipo.equalsIgnoreCase("B") && (tamaño == 1))) {
			System.out.println("El precio final es: " + (precio - 0.30));
		} else if ((tipo.equalsIgnoreCase("B") && (tamaño == 2))) {
			System.out.println("El precio final es: " + (precio - 0.50));
		} else {
			System.out.println("Los campos digitados no coinciden");
		}

	}

}
