package com;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	int numero1;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Escribe un número");
	numero1 = entrada.nextInt();
	
	if (numero1 % 2 == 0) {
		System.out.println("El número es par");
	}else {
		System.out.println("El número es impar");
	}
}
}
