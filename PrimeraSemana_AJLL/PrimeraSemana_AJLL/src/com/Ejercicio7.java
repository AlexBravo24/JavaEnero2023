package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */
//7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
//debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
//cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de 
//alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
//pagar cada alumno por el viaje.


public class Ejercicio7 {
	public static void main(String[] args) {
		
		int alumnos;
		double c_u = 0;
		double c_t;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el numero de alumnos para el viaje de estudios:");
		alumnos = entrada.nextInt();
		
		if (alumnos>=100) {
			c_u = 65;
		} 
		else if(alumnos<=99 && alumnos>=50) {
			c_u = 70;
		}else if(alumnos <= 49 && alumnos >= 30) {
			c_u = 95;
		}else if (alumnos <=29 && alumnos > 0) {
			c_u = 4000/alumnos;
		}else {
			System.out.println("ERROR");
		}
		
		c_t = c_u * alumnos;
		
		System.out.printf("\nEl costo por alumno es: " + "%.2f",c_u);
		System.out.printf("\nEl pago total del viaje de estudios por " + alumnos +  " alumnos es: " + "%.2f",c_t);
	}
}
