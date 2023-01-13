package com;

import java.util.Scanner;

public class ciclos11_AYMP {

	public static void main(String[] args) {
		int ancho, alto;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el ancho: ");
		ancho = entrada.nextInt();
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Introduce el alto: ");
		alto = entrada1.nextInt();                                // 
		
		for (int j=0;j<alto;j++) {
		for(int i=0;i<ancho;i++) {
			System.out.print("* ");
	     }System.out.println();
		}
		
	}
}
