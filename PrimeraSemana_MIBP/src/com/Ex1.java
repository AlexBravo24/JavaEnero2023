package com;

import java.util.Scanner;

public class Ex1 {	
	
	//1.- Programa un algoritmo que realice la tabla de multiplicar del 12

	public static void main(String[] args) {
	
		int tabla;
		System.out.println("Qué tabla desea realizar");
		Scanner scanner = new Scanner(System.in);
		tabla = scanner.nextInt();
		
		int multi;
		
	for (multi = 1; multi <=10 ; multi++) {
		System.out.println(tabla + " X " + multi +         " = " + tabla * multi );
	}
			
		}

	}


