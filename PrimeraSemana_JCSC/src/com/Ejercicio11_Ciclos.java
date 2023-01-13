package com;

import java.util.Scanner;

public class Ejercicio11_Ciclos {

	public static void main(String[] args) {
		
		int ancho;
		int largo;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el ancho");
		ancho = entrada.nextInt();
		System.out.println("Ingresa el largo");
		largo = entrada.nextInt();
		
		for (int i = 1; i <= largo; i++) {
			for (int o = 1; o <= ancho; o++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
		
		
		

	}

}
