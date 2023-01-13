package com;

import java.util.Scanner;

public class Ciclos11_EBA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el alto");
		int alto = entrada.nextInt();
		System.out.println("Introduce el ancho");
		int ancho = entrada.nextInt();
		
		for(int i = 0; i < alto; i++) {
			for (int j = 1; j < 2; j++) {
				System.out.println("");	
			}
			for(int k=0; k<ancho; k++){
                System.out.print("*");
            }
		}

	}
}
