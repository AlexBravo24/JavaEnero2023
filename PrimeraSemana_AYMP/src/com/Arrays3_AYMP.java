package com;

import java.util.Scanner;

public class Arrays3_AYMP {

	public static void main(String[] args) {
		String frase;
		int largo;
		System.out.print("Ingrese una frase: ");
		Scanner entrada1= new Scanner(System.in);
		frase= entrada1.nextLine();
		
		largo=frase.length();
		System.out.println("longitud de la frase= "+largo);
		char [] arreglo = new char[largo];
		
		for(int i =0; i<largo; i++) {
			arreglo[i]=frase.charAt(i);
		}
		for (int i = 0; i<largo; i++) {
			System.out.println("Posición "+i+" : "+arreglo[i]);
		}

	}

}
