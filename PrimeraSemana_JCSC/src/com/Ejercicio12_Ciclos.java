package com;

import java.util.Scanner;

public class Ejercicio12_Ciclos {

	public static void main(String[] args) {
	
		int edad = 0;
		int suma = 0;
		int contador = 0;
		int media = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.println("Ingresa la edad");
			edad = entrada.nextInt();
			suma = suma + edad;
			contador = contador + 1;
			media = suma/contador;
			System.out.println("La media hasta ahora es: " + media);
		 if (media>=25) {
			break;
		} 
		}while (edad>0);
		if (media>=25) {
		System.out.println("La media es de 25 y el programa finalizó.");
		}
		
		
		
		
	}

}
