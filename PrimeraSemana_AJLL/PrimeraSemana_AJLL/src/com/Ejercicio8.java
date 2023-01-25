package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */
//8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
//obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
//“ERROR: número incorrecto”



public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		int dado;
		String opuesto;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el numero de la cara del dado que acaba de caer:");
		dado = entrada.nextInt();
		
		switch (dado) {
		case 1:
			opuesto ="SEIS";
			System.out.println("La cara opuesta del dado es " + opuesto );
			break;
		case 2:
			opuesto ="CINCO";
			System.out.println("La cara opuesta del dado es " + opuesto );
			break;
		case 3:
			opuesto ="CUATRO";
			System.out.println("La cara opuesta del dado es " + opuesto );
			break;
		case 4:
			opuesto ="TRES";
			System.out.println("La cara opuesta del dado es " + opuesto );
			break;
		case 5:
			opuesto ="DOS";
			System.out.println("La cara opuesta del dado es " + opuesto );
			break;
		case 6:
			opuesto ="UNO";
			System.out.println("La cara opuesta del dado es " + opuesto );
			break;
		default:
			System.out.println("ERROR: numero incorecto");
			break;
		}
			
	}

}
