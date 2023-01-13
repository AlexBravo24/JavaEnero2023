package com;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	int numero1;
	int numero2;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Escribe un número");
	numero1 = entrada.nextInt();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Escribe otro número");
	numero2 = entrada2.nextInt();

	if (numero1==numero2) {
		System.out.println(numero1 + " es igual que " +  numero2);
	}else if (numero1>numero2) {
		System.out.println(numero1 + " es mayor que "  + numero2);
	}else {
		System.out.println(numero2 + " es mayor que "  + numero1);
	}
		
	

	
}
}
