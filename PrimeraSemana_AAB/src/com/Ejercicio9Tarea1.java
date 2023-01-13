package com;

import java.util.Scanner;

public class Ejercicio9Tarea1 {

	public static void main(String[] args) {
		
		int dia;
		
		System.out.println("Escriba el día de la semana (en número): ");
		Scanner entrada1 = new Scanner(System.in);
		dia = entrada1.nextInt();
		
		if (dia == 1) {
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
		} else if (dia == 3) {
			 System.out.println("Miercoles");
		} else if (dia == 4) {
			System.out.println("Jueves");
		} else if (dia == 5) {
			 System.out.println("Viernes");
		} else if (dia == 6) {
			System.out.println("Sábado");
		} else if (dia == 7) {
			 System.out.println("Domingo");
		} else {
			System.out.println("Error");
		}

	}

}
