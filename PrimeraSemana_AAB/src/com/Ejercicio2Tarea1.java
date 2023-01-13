package com;

import java.util.Scanner;

public class Ejercicio2Tarea1 {

	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Digite un numero entero: ");
		
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextInt();
		System.out.println("Digitaste: " + a);

		
		if (a%2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	}

}
