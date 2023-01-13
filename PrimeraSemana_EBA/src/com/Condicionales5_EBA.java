package com;

import java.util.Scanner;

public class Condicionales5_EBA {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Introduce tu nota: ");
		int nota = leer.nextInt();		
		System.out.println("Introduce tu edad : ");
		int edad = leer.nextInt();		
		System.out.println("Introduce tu sexo (nota solo: M o F): ");
		char sexo = leer.next().charAt(0);
		
		if (nota==5 && edad==18 && sexo == 'M') {
			System.out.println("POSIBLE");
		}
		else if (nota == 5 && edad == 18 && sexo == 'F') {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}

	}

}
