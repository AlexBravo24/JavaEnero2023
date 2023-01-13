package com;

import java.util.Scanner;

public class Ex2 {
//	//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración 
//	deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//	23 x 95 = ???

	public static void main(String[] args) {
		
		int Num1;
		System.out.println("Ingrese el número que desee multiplicar");
		Scanner scanner =  new Scanner(System.in);
		Num1 = scanner.nextInt();
		
		int Num2;
		System.out.println("Ingrese las veces que desee multiplicarlo");
		Scanner scanner2 = new Scanner(System.in);
		Num2 = scanner2.nextInt();
		
		int mul;
		
		for (mul=1;mul<=Num2; mul++) {
			
			System.out.println(+Num1+"*" +mul+ "=" + mul*Num1 );
		}
		
		

	}

}
