package com;

import java.util.Scanner;

public class Ejercicio10 {
//	10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
//	mes correspondiente.

	public static void main(String[] args) {
		int mes;
		System.out.println("Ingrese el número del mes del cuál queiras saber el número con los que cuenta");
		Scanner scanner = new Scanner(System.in);
		mes = scanner.nextInt();
		
		
		
		
		switch (mes)
		{
		
		case 1:
			System.out.println("Enero tiene 31 días");
			break;
		case 2:
			System.out.println("Febrero tiene 28 días");
			break;
		case 3:
			System.out.println("Marzo tiene 31 días");
			break;
		case 4:
			System.out.println("Abril tiene 30 días");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días");
			break;
		case 6:
			System.out.println("Junio tiene 30 días");
			break;
		case 7:
			System.out.println("Julio tiene 31 días");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días");
			break;
		default: 
			System.out.println("La base de Datos de virus ha sido actualizada");
		}
		

	}

}
