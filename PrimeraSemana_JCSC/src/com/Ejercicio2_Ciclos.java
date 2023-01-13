package com;

import java.util.Scanner;

public class Ejercicio2_Ciclos {

	public static void main(String[] args) {
		
		int n;
		int n2;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Tabla del número:");
		n = entrada.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Hasta el número:");
		n2 = entrada2.nextInt();
		
		System.out.println("Tabla del " + n + " hasta el " + n2);
		
		for (int i = 1; i<=n2; i++) {
			System.out.println(n +  " x " +  i + " = " + n*i);
		}

	}

}
