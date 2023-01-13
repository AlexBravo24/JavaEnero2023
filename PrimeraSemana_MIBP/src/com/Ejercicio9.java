package com;

import java.util.Scanner;

public class Ejercicio9 {
//	9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
//	introducimos otro número nos da un error.


	public static void main(String[] args) {
		
		int dia;
		System.out.println("Ingrese el número del día de la semana que quiere obtener");
		Scanner scanner = new Scanner(System.in);
		dia = scanner.nextInt();
		
		
		switch (dia) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		
		default: 
			System.out.println("La semana solo tiene 7 días intenta ingresar un número del 1 al 7");
		}
		
	}

}
