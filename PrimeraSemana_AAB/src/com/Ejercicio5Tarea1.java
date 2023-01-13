package com;

import java.util.Scanner;

public class Ejercicio5Tarea1 {

	public static void main(String[] args) {
		
		int nota;
		int edad;
		String sexo;
		
		
		System.out.println("Digite su nota: ");
		Scanner entrada1 = new Scanner(System.in);
		nota = entrada1.nextInt();
		
		System.out.println("Digite su edad: ");
		Scanner entrada2 = new Scanner(System.in);
		edad = entrada2.nextInt();
		
		System.out.println("Digite su sexo (F/M): ");
		Scanner entrada3 = new Scanner(System.in);
		sexo = entrada3.next();
		
		if ((nota >= 5) && (edad >= 18) && (sexo.equalsIgnoreCase("M"))) {
			System.out.println("Posible");
		} else if ((nota >= 5) && (edad >= 18) && (sexo.equalsIgnoreCase("F"))) {
			System.out.println("Aceptada");
		} else {
			System.out.println("No aceptada");
		}
	}

}
