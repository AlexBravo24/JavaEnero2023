package com;

import java.util.Scanner;

public class ciclos12_AYMP {

	public static void main(String[] args) {
		int edad1,edad2, i=2, promedio=0; 
		int divisor =2,suma;
		
		System.out.print("Introduce la edad 1: ");
		Scanner entrada1 = new Scanner(System.in);
		edad1 = entrada1.nextInt();
		
		do {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce la edad "+i+" :");
		edad2 = entrada.nextInt();
		suma=edad1+edad2;
		promedio =suma/divisor;
		divisor++;
		i++;
		edad1=suma;
		}while(promedio<26);
	
		System.out.println("El promedio es: "+promedio);
		
	}

}
