package com;

import java.util.Scanner;

public class Ejercicio7 {
	// El director de una escuela está organizando un viaje de estudios, y requiere determinar
//	cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
//	La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de
//	65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos
//	de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
//	Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
//	pagar cada alumno por el viaje.

	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
		int numA;
		
		System.out.println("Ingrese el número de alumnos");
		numA = scanner.nextInt();
		
		if (numA >= 100) {
			System.out.println("El costo del viaje es de" +  numA*65  + " " +"e individualmente se debe pagar $65" ); 
		}  else if (numA >= 50 && numA<100) {
			System.out.println("El costo del viaje es de " + numA*70 + " " +"e individualmente se debe pagar $70 ");
		}
		   else if (numA >= 30 && numA<50 ) {
			   System.out.println("El costo del viaje es de"   +  numA*95  + " "+ "e individualmente se debe pagar $95");
			  
		   }
		   else 
			   System.out.println("El costo del alquiler del autobús es de $4000");

	}

}
