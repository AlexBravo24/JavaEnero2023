package com;

import java.util.Scanner;

public class Ejercicio8_Ciclos {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Indica un número");
		num1 = entrada.nextInt();
		System.out.println("Indica otro número");
		num2 = entrada.nextInt();
		
		for (int i=num1;i<=num2;i++) {
			System.out.println(i);
		}
		
		

	}

}
