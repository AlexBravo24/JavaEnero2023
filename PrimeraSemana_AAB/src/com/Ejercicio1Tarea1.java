package com;

import java.util.Scanner;

public class Ejercicio1Tarea1 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.println("Digite dos numeros enteros: ");
		
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextInt();
		System.out.println("Digitaste: " + a);
		
		Scanner entrada2 = new Scanner(System.in);
		b = entrada2.nextInt();
		System.out.println("Digitaste: " + b);
		
		if (a > b) {
			System.out.println(a + " es mayor");
		} else if (b > a) {
			System.out.println(b + " es mayor");
		} else {
			System.out.println("Son iguales");
		}

	}

}
