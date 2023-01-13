package com;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		char letra;
		
//		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce una letra");
		letra = (char) System.in.read();
		
		if (Character.isUpperCase(letra)) {
			System.out.println("Es una letra mayúscula");
		} else {
			System.out.println("No es una letra mayúscula");
			
		}

	}

}
