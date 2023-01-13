package com;

import java.util.Scanner;

public class Ejercicio1_Arrays {

	public static void main(String[] args) {
		
		int [] array = new int [10];
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Inserte número 1");
		array[0]  = entrada.nextInt();
		System.out.println("Inserte número 2");
		array[1]  = entrada.nextInt();
		System.out.println("Inserte número 3");
		array[2]  = entrada.nextInt();
		System.out.println("Inserte número 4");
		array[3]  = entrada.nextInt();
		System.out.println("Inserte número 5");
		array[4]  = entrada.nextInt();
		System.out.println("Inserte número 6");
		array[5]  = entrada.nextInt();
		System.out.println("Inserte número 7");
		array[6]  = entrada.nextInt();
		System.out.println("Inserte número 8");
		array[7]  = entrada.nextInt();
		System.out.println("Inserte número 9");
		array[8]  = entrada.nextInt();
		System.out.println("Inserte número 10");
		array[9]  = entrada.nextInt();
		
		for(int i:array) {
			System.out.println(i);
		}
		
		
		

	}

}
