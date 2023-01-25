package com;

import java.util.Scanner;

/* 
 * ALEX JAIR LOZA LOPEZ
 * 10/01/2023
 */

//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
//segundo número es 0, debe mostrar un mensaje de error.

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el primer numero:");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2 = entrada.nextInt();
		
		double div=num1/num2;
		
		if(num2!=0) {
			System.out.printf("El resultado de la division entre el num1 y el num2 es: " + "%.2f",div);
		}else {
			System.out.println("ERROR");
		}
		
	}

}
