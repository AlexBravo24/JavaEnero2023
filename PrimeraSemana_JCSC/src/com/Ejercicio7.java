package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int alumnos;
				
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Cuántos alumnos viajarán?");
		alumnos = entrada.nextInt();
		
		if (alumnos>=100) {
			System.out.println("El pago a la compañía de autobuses es de " + alumnos*65 + " euros.");
			System.out.println("Cada alumno deberá pagar 65 euros.");
		}else if (alumnos>=50 && alumnos<=99) {
			System.out.println("El pago a la compañía de autobuses es de " + alumnos*70 + " euros.");
			System.out.println("Cada alumno deberá pagar 70 euros.");
		}else if (alumnos>=30  && alumnos<=49) {
			System.out.println("El pago a la compañía de autobuses es de " + alumnos*95 + " euros.");
			System.out.println("Cada alumno deberá pagar 95 euros.");
		}else if  (alumnos<30) {
			System.out.println("El pago a la compañía de autobuses es de 4000 euros.");
			System.out.println("Cada alumno deberá pagar " + 4000/alumnos + " euros.");
		}

	}

}
