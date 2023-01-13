package com;

import java.util.Scanner;

public class ejercicioCuatro {

	public static void main(String[] args) {
		char ca;
		System.out.print("Ingrese un caracter: ");
		Scanner entrada= new Scanner(System.in);
		ca = entrada.next().charAt(0);
		char char1=Character.toUpperCase(ca);
	
		if(ca == char1) {
			System.out.print("Es una letra MAYUSCULA");
		}else {
			System.out.print("Es una letra MINUSCULA");
		}
		
		

	}

}
