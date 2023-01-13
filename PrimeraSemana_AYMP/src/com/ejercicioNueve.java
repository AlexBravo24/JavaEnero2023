package com;

import java.util.Scanner;

public class ejercicioNueve {

	public static void main(String[] args) {
		int dia;
		System.out.print("Ingrese el día de la semana del 1 al 7: ");
		Scanner entrada= new Scanner(System.in);
		dia= entrada.nextInt();
		
		switch (dia) { 
		case 1:
			System.out.print("Lunes");
			break;
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miercoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.print("Viernes");
			break;
		case 6:
			System.out.print("Sabado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		default:
			System.out.print("ERROR: intruduzca un número correcto del 1 al 7");
		}

	}

}
