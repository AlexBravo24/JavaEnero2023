package com;

import java.util.Scanner;

//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.


public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce un número");
		num1 =  in.nextInt();
		
		Scanner in2 = new Scanner (System.in);
		System.out.println("Introduce el segundo número");
		num2 = in2.nextInt();
		
		if (num1 > num2){
	        System.out.println("El primer número" +num1 + "es mayor que el número dos," +num2);
	    }else if (num1 < num2){
	        System.out.println("El segundo número " +num2 + " es mayor que el primer número " +num1);
	    }else {
	        System.out.println("Ambos números son iguales" +num1);
			}
		
		

	}
}


