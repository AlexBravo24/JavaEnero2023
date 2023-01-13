package com;

import java.util.Scanner;

public class Condicionales2_EBA {

	public static void main(String[] args) {
		
		
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numero1 = leer.nextInt();
		
		if (numero1%2 == 0) {
			System.out.println("El numero es par");			
		}else {
			System.out.println("El numero es impar");
		}
	}

}
