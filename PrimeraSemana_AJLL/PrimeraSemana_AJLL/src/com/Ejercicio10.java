package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */
//10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
//mes correspondiente.
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Programa que devuelve el numero de dias que tiene el numero de mes del año 2023 que es ingresado:");
		mes = entrada.nextInt();
		
	switch (mes) {
		
		case 1:
			System.out.println("Enero tiene 31 dias ");
			break;
		case 2:
			System.out.println("Febrero tiene 28 dias");
			break;
		case 3:
			System.out.println("Marzo tiene 31 dias");
			break;
		case 4:
			System.out.println("Abril tiene 30 dias");
			break;
		case 5:
			System.out.println("Mayo tiene 31 dias");
			break;
		case 6:
			System.out.println("Junio tiene 30");
			break;
		case 7:
			System.out.println("Julio tiene 31 dias");
			break;
		case 8:
			System.out.println("Agosto tiene 31 dias");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 dias");
			break;
		case 10:
			System.out.println("Octubre tiene 31 dias");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 dias");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 dias");
			break;
		default:
			System.out.println("*** ERROR ***");
			break;
	}
		
	}

}
