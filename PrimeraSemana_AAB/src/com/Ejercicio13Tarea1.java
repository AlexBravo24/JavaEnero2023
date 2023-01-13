package com;

import java.util.Scanner;

public class Ejercicio13Tarea1 {

	public static void main(String[] args) {
		
		double donacion;
		
		System.out.println("Escriba la cantidad de dinero donada: ");
		Scanner entrada1 = new Scanner(System.in);
		donacion = entrada1.nextDouble();
		
		if (donacion >= 10000) {
			System.out.println("$" + (donacion * 0.3) + " será donado al centro de salud, $" + (donacion * 0.5) + " será donado al comedor de niños, $" + (donacion * 0.2) + " se invertirá en la bolsa");
		} else {
			System.out.println("$" + (donacion * 0.25) + " será donado al centro de salud, $" + (donacion * 0.6) + " será donado al comedor de niños, $" + (donacion * 0.15) + " se invertirá en la bolsa");
		}
		
	}

}
