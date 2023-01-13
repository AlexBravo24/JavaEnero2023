package com;

import java.util.Scanner;

public class Ejercicio14Tarea1 {

	public static void main(String[] args) {
		
		int horas;
		
		System.out.println("Ingrese las horas trabajadas: ");
		Scanner escaner1 = new Scanner(System.in);
		horas = escaner1.nextInt();
		
		if (horas <= 40) {
			System.out.println("Su salario semanal es de: $" + (horas * 16));
		} else {
			System.out.println("Su salario semanal es de: $" + (((horas - 40)* 20)+640));
		}
		
	}

}
