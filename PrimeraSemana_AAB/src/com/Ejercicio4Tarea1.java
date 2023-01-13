package com;

import java.util.Scanner;

public class Ejercicio4Tarea1 {
	
	public static void main(String[] args) {
	
		String str;
		
		System.out.println("Escriba una letra: ");
		Scanner entrada1 = new Scanner(System.in);
		str = entrada1.next();
		System.out.println("Digitaste: " + str);
		
		
		if (str.length() != 1) {
			System.out.println("Escribiste más de una letra");
		}else if ((str.compareTo("A") >= 0) && (str.compareTo("Z") <= 0)) {
			System.out.println("La letra es mayúscula");
		} else {
			System.out.println("La letra es minúscula");
		}
		
	}
}
