package com;

import java.util.Scanner;

public class Ejercicio3 {
	
	//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
	//Si el segundo número es 0, debe mostrar un mensaje de error.


	public static void main(String[] args) {
		
		int num1;
		int num2;
		int resultado;
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Introduzca el primer valor");
		num1 = in1.nextInt();
		
		Scanner in2 = new Scanner(System.in);
		System.out.println("Introduzca el segundo valor");
		num2 = in2.nextInt();
		
		
		if (num2 != 0) {
			System.out.println("Su resultado es" +(double) num1/(double)num2);
		} else {
			
			System.out.println("No es posible hacer la operación");
		}
		
		

	}

}
