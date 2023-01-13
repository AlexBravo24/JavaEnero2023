package com;

import java.util.Scanner;

public class Ejercicio1_2_Arrays {

	public static void main(String[] args) {
		
		String [][] paises = new String [4][4];
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa un país");
		paises[0][0] = entrada.nextLine();
		System.out.println("Ingresa la primer ciudad de " + paises[0][0]);
		paises[0][1] = entrada.nextLine();
		System.out.println("Ingresa la segunda ciudad de " + paises[0][0]);
		paises[0][2] = entrada.nextLine();
		System.out.println("Ingresa la tercer ciudad de " + paises[0][0]);
		paises[0][3] = entrada.nextLine();
		
		System.out.println("Ahora, ingresa el segundo país");
		paises[1][0] = entrada.nextLine();
		System.out.println("Ingresa la primer ciudad de " + paises[1][0]);
		paises[1][1] = entrada.nextLine();
		System.out.println("Ingresa la segunda ciudad de " + paises[1][0]);
		paises[1][2] = entrada.nextLine();
		System.out.println("Ingresa la tercera ciudad de " + paises[1][0]);
		paises[1][3] = entrada.nextLine();
		
		System.out.println("Ahora, ingresa el tercer país");
		paises[2][0] = entrada.nextLine();
		System.out.println("Ingresa la primer ciudad de " + paises[2][0]);
		paises[2][1] = entrada.nextLine();
		System.out.println("Ingresa la segunda ciudad de " + paises[2][0]);
		paises[2][2] = entrada.nextLine();
		System.out.println("Ingresa la tercera ciudad de " + paises[2][0]);
		paises[2][3] = entrada.nextLine();
		
		System.out.println("Ahora, ingresa el cuarto país");
		paises[3][0] = entrada.nextLine();
		System.out.println("Ingresa la primer ciudad de " + paises[3][0]);
		paises[3][1] = entrada.nextLine();
		System.out.println("Ingresa la segunda ciudad de " + paises[3][0]);	
		paises[3][2] = entrada.nextLine();
		System.out.println("Ingresa la tercera ciudad de " + paises[3][0]);
		paises[3][3] = entrada.nextLine();
		
//		for (int i=0; i<4; i++) {
//			System.out.println();
//			for (int j=0; j<4; j++) {
//				System.out.print("País: " + paises[i][j] + " ");
//		 }
		
		System.out.print("País 1: " + paises[0][0]);
		System.out.print(" Ciudades: " + paises[0][1] + " ");
		System.out.print(paises[0][2] + " ");
		System.out.println(paises[0][3] + " ");
		
		System.out.print("País 2: " + paises[1][0]);
		System.out.print(" Ciudades: " + paises[1][1] + " ");
		System.out.print(paises[1][2] + " ");
		System.out.println(paises[1][3] + " ");
		
		System.out.print("País 3: " + paises[2][0]);
		System.out.print(" Ciudades: " + paises[2][1] + " ");
		System.out.print(paises[2][2] + " ");
		System.out.println(paises[2][3] + " ");
		
		System.out.print("País 4: " + paises[3][0]);
		System.out.print(" Ciudades: " + paises[3][1] + " ");
		System.out.print(paises[3][2] + " ");
		System.out.println(paises[3][3] + " ");
	
		
	
	}
}
