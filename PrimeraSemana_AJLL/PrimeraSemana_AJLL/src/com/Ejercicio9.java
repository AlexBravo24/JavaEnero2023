package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */
//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
//introducimos otro número nos da un error.


public class Ejercicio9 {

	public static void main(String[] args) {
		
		int dia;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el dia actual de la semana:");
		dia = entrada.nextInt();
		
	switch (dia) {
		
		case 1:
			System.out.println("Corresponde a Lunes");
			break;
		case 2:
			System.out.println("Corresponde a Martes");
			break;
		case 3:
			System.out.println("Corresponde a Miercoles");
			break;
		case 4:
			System.out.println("Corresponde a Juebebes");
			break;
		case 5:
			System.out.println("Corresponde a beViernes");
			break;
		case 6:
			System.out.println("Corresponde a Sabadrink");
			break;
		case 7:
			System.out.println("Corresponde a Domingo de resurreccion");
			break;
		default:
			System.out.println("*** ERROR ***");
			break;
		
		}
		
	}

}
