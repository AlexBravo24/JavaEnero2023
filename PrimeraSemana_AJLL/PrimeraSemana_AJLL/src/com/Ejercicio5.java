package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
//parámetros: edad, nota y sexo.
//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//* Otros casos -> NO ACEPTADA

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		int nota;
		int edad;
		String sexo;
		
		System.out.print("Programa de aceptacion \n **** \n *** \n ** \n * \n");
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce tu nota:");
		nota = entrada.nextInt();
		
		System.out.println("Introduce tu edad:");
		edad = entrada.nextInt();
		
		Scanner SEXUAL = new Scanner(System.in); 
		System.out.println("Introduce tu sexo (F, M):");
		sexo = SEXUAL.nextLine();
	
				
		if (nota == 5) {
			if(edad == 18) {
				if (sexo.compareTo("M")==0) {
					System.out.println("POSIBLE");
				}else if(sexo.compareTo("F")==0) {
					System.out.println("ACEPTADA");
				}
			} 
		} else {
			System.out.println("NO ACEPTADA");
		}

	}
}
