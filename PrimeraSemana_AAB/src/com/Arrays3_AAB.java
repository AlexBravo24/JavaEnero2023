package com;

import java.util.Scanner;

public class Arrays3_AAB {

	public static void main(String[] args) {
		
		String str;
		char[] frase = new char[100];
		
		System.out.println("Escriba alguna frase: ");
		Scanner entrada1 = new Scanner(System.in);
		str = entrada1.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			frase[i] = str.charAt(i);
//			System.out.println(frase[i]);
		}
		System.out.println("El nuevo arreglo resulta en: ");
		
		for (char i:frase) {
			System.out.print(i);
		}
	}

}
