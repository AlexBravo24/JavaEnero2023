package com;

import java.util.Scanner;

public class Ejercicio10_Ciclos {

	public static void main(String[] args) {
		
		int numero;
		int numero2;
		int sumpos = 0;
		int sumimp = 0;
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		String cont;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe un número");
		numero = entrada.nextInt();
		
		if (numero>0) {
			sumpos = numero;
			System.out.println("El número " + numero + " es positivo.");
		}else {
			System.out.println("El número " + numero + " es negativo.");
		}
		
		if (numero%2 == 0) {
			System.out.println("El número " + numero + " es par.");
		}else {
			sumimp = numero;
			System.out.println("El número " + numero + " es impar.");
		}
		
		System.out.println("La sumatoria de los números positivos es: " + sumpos);
		System.out.println("La sumatoria de los números impares es: " + sumimp);
		
		do {
			System.out.println("Escribe un número");
			numero2 = entrada.nextInt();
	
			
			if (numero2>0) {
			sum1 = sumpos+numero2;
				System.out.println("El número " + numero + " es positivo.");
			}else {
				sum1 = sumpos+0;
				System.out.println("El número " + numero + " es negativo.");
			}
			
			if (numero2%2 == 0) {
				sum2 = sumimp+0;
				System.out.println("El número " + numero + " es par.");
			}else {
				sum2 = sumimp+numero2;
				System.out.println("El número " + numero + " es impar.");
			}
			
			System.out.println("La sumatoria de los números positivos es: " + sum1);
			System.out.println("La sumatoria de los números impares es: " + sum2);
			
			if (numero2>0) {
				sum1 = sumpos+numero2;
				sumpos = sumpos+numero2;
			}else {
				sum1 = sumpos+0;
			}
			
			if (numero2%2 == 0) {
				sum2 = sumimp+0;
			}else {
				sum2 = sumimp+numero2;
				sumimp = sumimp+numero2;
			}
			
//			sumpos = sumpos+numero2;
//			sumimp = sumimp+numero2;

		
			i++;
		} while (i>0);
		}
		
			
		
		
		
		
	

}
