package com;

import java.util.Scanner;

public class Ciclos12_EBA {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int edad = 0;
		int contador = 0;
		int promedio = 0;
		
		
		while(promedio < 25) {
			System.out.println("Introduce tu edad: ");
			edad = (edad + input.nextInt());
			contador++;
			promedio = edad/contador;
			System.out.println("el promedio es: " + promedio);
		}

	}

}
