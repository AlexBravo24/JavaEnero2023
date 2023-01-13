package com;

import java.util.Scanner;

public class Condicionales10_EBA {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Introdice un numero entre 1 y 12");
		int numero = leer.nextInt();
		if (numero%2 == 1 && numero < 9 || numero == 8 || numero == 10 || numero == 12 ) {
			System.out.println("el total de dias es: 31");
		}
		else if (numero ==2) {
			System.out.println("el total de dias es: 28");
		}
		else if (numero%2 == 0 || numero == 9 || numero == 11 )  {
			System.out.println("el total de dias es: 30");
		}
		
		

	}

}
