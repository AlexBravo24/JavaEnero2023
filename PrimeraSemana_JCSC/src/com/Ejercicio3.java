package com;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	
	int numero1;
	int numero2;
	int numero3;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Escribe un número");
	numero1 = entrada.nextInt();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Escribe otro número");
	numero2 = entrada2.nextInt();
	
	if (numero1==0 || numero2==0) {
		System.out.println("Error, no se puede dividir entre 0");
	}
	numero3 = (numero1/numero2);
	
	if (numero1>=1 && numero2>=1) {
		System.out.println("El resultado de la división es " + numero3);
	}
}
}
