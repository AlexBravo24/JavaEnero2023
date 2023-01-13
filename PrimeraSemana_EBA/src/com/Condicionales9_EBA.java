package com;

import java.util.Scanner;

public class Condicionales9_EBA {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introdice un numero entre 1 y 7");
		int numero = leer.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("martes");
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
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("Error");
			break;
		}

	}

}
