package com;

import java.util.Scanner;
/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el primer numero:");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2 = entrada.nextInt();
		
		if(num1<num2) {
			System.out.println("El segundo numero es mayor.");
		}else if(num1>num2) {
			System.out.println("El primer numero es mayor.");
		}else {
			System.out.println("Los numeros son iguales.");
		}
	}

}
