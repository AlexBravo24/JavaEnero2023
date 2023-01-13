package com;

import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner uno= new Scanner(System.in);
		System.out.print("Ingrese un primer número: ");
		numero1 = uno.nextInt();
		System.out.print("Ingrese un segundo número: ");
		Scanner dos= new Scanner(System.in);
		numero2 = dos.nextInt();
		
		if(numero1 > numero2) {
			System.out.print("El primer número que ingresó es el mayor");
		}else if(numero1 == numero2) {
			System.out.print("Los números que ingresó son iguales");
		}else {
			System.out.print("El segundo número ingresado es el mayor");
		}
	}

}
