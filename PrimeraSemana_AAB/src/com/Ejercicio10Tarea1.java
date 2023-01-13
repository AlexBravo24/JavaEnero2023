package com;

import java.util.Scanner;

public class Ejercicio10Tarea1 {

	public static void main(String[] args) {
		
		int mes;
		
		System.out.println("Escriba el día de la semana (en número): ");
		Scanner entrada1 = new Scanner(System.in);
		mes = entrada1.nextInt();
		
		if (mes == 1) {
			System.out.println("Enero tiene 31 días.");
		} else if (mes == 2) {
			System.out.println("Febrero tiene 28 días.");
		} else if (mes == 3) {
			 System.out.println("Marzo tiene 31 días.");
		} else if (mes == 4) {
			System.out.println("Abril tiene 30 días.");
		} else if (mes == 5) {
			 System.out.println("Mayo tiene 31 días.");
		} else if (mes == 6) {
			System.out.println("Junio tiene 30 días.");
		} else if (mes == 7) {
			 System.out.println("Julio tiene 31 días.");
		} else if (mes == 8) {
			System.out.println("Agosto tiene 31 días.");
		} else if (mes == 9) {
			 System.out.println("Septiembre tiene 30 días.");
		} else if (mes == 10) {
			System.out.println("Octubre tiene 31 días.");
		} else if (mes == 11) {
			 System.out.println("Noviembre tiene 30 días.");
		} else if (mes == 12) {
			System.out.println("Diciembre tiene 31 días.");
		} else {
			System.out.println("Error: no corresponde a ningún mes.");
		}


	}

}
