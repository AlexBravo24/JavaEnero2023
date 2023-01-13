package com;

import java.util.Scanner;

public class Ejercicio7Tarea1 {

	public static void main(String[] args) {
		
		int niños;
		
		System.out.println("Digite el número de niños: ");
		Scanner entrada1 = new Scanner(System.in);
		niños = entrada1.nextInt();
		
		if (niños >= 100) {
			System.out.println("Se debe pagar: " + (niños * 65) + " euros y cada niño debe pagar 65 euros.");
		} else if ((niños >= 50) && (niños <= 99)) {
			System.out.println("Se debe pagar: " + (niños * 70) + " euros y cada niño debe pagar 70 euros.");
		} else if ((niños >= 30) && (niños <= 49)) {
			System.out.println("Se debe pagar: " + (niños * 95) + " euros y cada niño debe pagar 95 euros.");
		} else {
			System.out.println("Se debe pagar: 4000 euros y cada niño debe pagar " + (4000/niños) + " euros.");
		}

	}

}
