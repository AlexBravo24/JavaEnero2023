package com;

import java.util.Scanner;

public class Condicionales4_EBA {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 
		
		System.out.println("Introduce una cadena: ");
		String cadena = leer.next();
		
		if (cadena.equals(cadena.toLowerCase())){
			System.out.println("la cadena es minuscula: ");
		}else {
			System.out.println("La cadena es mayuscula: ");
		}

	}

}
