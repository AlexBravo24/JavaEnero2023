package com;

import java.util.Scanner;

public class Ciclos2_EBA {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("introduce el numero que quiere multiplicar;");
		int numero1 = leer.nextInt();
		System.out.println("Introdoce el numero de veces que deseas multiplicar: ");
		int numero2 = leer.nextInt();
		
		for (int i = 1; i <= numero2; i++ ) {
			System.out.println(numero1 + " x " + i + " = " + numero1 * i);
		}
	}

}
