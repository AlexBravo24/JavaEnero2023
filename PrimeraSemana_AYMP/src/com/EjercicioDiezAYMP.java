package com;

import java.util.Scanner;

public class EjercicioDiezAYMP {

	public static void main(String[] args) {
		int mes;
		System.out.print("Ingrese el mes (del 1 al 12): ");
		Scanner entrada= new Scanner(System.in);
		mes= entrada.nextInt();
		
		switch (mes) { 
		case 1:
			System.out.print("enero tiene 31 días");
			break;
		case 2:
			System.out.print("febrero tiene 28 días");
			break;
		case 3:
			System.out.print("marzo tiene 31 días");
			break;
		case 4:
			System.out.print("abril tiene 30 días");
			break;
		case 5:
			System.out.print("mayo tiene 31 días");
			break;
		case 6:
			System.out.print("junio tiene 30 días");
			break;
		case 7:
			System.out.print("julio tiene 31 días");
			break;
		case 8:
			System.out.print("agosto tiene 31 días");
			break;
		case 9:
			System.out.print("septiembre tiene 30 días");
			break;
		case 10:
			System.out.print("octubre tiene 31 días");
			break;
		case 11:
			System.out.print("noviembre tiene 30 días");
			break;
		case 12:
			System.out.print("diciembre tiene 31 días");
			break;
		default:
			System.out.print("ERROR: intruduzca un número correcto del 1 al 12");
		}


	}

}
