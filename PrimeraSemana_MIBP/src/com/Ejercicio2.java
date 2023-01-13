package com;

import java.util.Scanner;

public class Ejercicio2 {
	// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.

	public static void main(String[] args) {
		
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el número a analizar");
		num = in.nextInt();
		
		if (num %2 == 0) {
			System.out.println("Su número es par");
		} else {
			System.out.println("Su número es impar");
		}
		
		
		
		

	}

}
