package com;

import java.util.Scanner;

public class Condicionales7_EBA {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in); 
		 
		int autobus = 4000;
		System.out.println("introduce el total de alumnos por viaje: ");
		int alumnos = leer.nextInt();
		if (alumnos >= 100) {
			System.out.println(" El costo por alumno es de: 65 euros");
		}
		else if(alumnos < 100 && alumnos >= 50){
			System.out.println(" El costo por alumno es de: 70 euros");
		}
		else if(alumnos < 50 && alumnos >= 30){
			System.out.println(" El costo por alumno es de: 95 euros");
		}else {
			System.out.println(" El costo por alumno es de: " + (autobus/ alumnos));
		}

	}

}
