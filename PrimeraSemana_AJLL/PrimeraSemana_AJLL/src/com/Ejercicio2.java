package com;

import java.util.Scanner;
/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//Realiza un programa que pida un número por teclado y nos indique si es par o impar


public class Ejercicio2 {
	public static void main(String[] args) {
		
		int num1;
	
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce un numero:");
		num1 = entrada.nextInt();
		 if(num1%2==0) {
			 System.out.println("El numero es par");
		 }else {
			 System.out.println("El numero es impar");
		 }
	}

}
