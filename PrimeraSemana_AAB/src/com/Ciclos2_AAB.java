package com;

import java.util.Scanner;

public class Ciclos2_AAB {

	public static void main(String[] args) {
		
		int iteracion;
		int tabla;
		
		System.out.println("Introduzca la tabla que desea calcular: ");
		Scanner entrada1 = new Scanner(System.in);
		tabla = entrada1.nextInt();
		
		System.out.println("Introduzca la iteracion la que desea llegar: ");
		Scanner entrada2 = new Scanner(System.in);
		iteracion = entrada2.nextInt();
		
		for (int i = 1; i <= iteracion; i++) {
			System.out.println(tabla + " x " + i + " = " + (i*tabla));
		}
		
	}

}
