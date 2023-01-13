package com;

import java.util.Scanner;

public class Ejercicio8Tarea1 {

	public static void main(String[] args) {
		
		int dado;
		
		System.out.println("Escriba el resultado de lanzar el dado (en número): ");
		Scanner entrada1 = new Scanner(System.in);
		dado = entrada1.nextInt();
		
		if (dado == 1) {
			System.out.println("El lado contrario es Seis");
		} else if (dado == 2) {
			System.out.println("El lado contrario es Cinco");
		} else if (dado == 3) {
			System.out.println("El lado contrario es Cuatro");
		}else if (dado == 4) {
			System.out.println("El lado contrario es Tres");
		}else if (dado == 5) {
			System.out.println("El lado contrario es Dos");
		}else if (dado == 6) {
			System.out.println("El lado contrario es Uno");
		} else {
			System.out.println("ERROR: Número incorrecto");
		}

	}

}
