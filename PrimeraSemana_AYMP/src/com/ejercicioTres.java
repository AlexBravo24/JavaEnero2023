package com;

import java.util.Scanner;

public class ejercicioTres {

	public static void main(String[] args) {
		float numero1, numero2;
		Scanner uno = new Scanner(System.in);
		System.out.print("Ingrese el dividendo: ");
		numero1 = uno.nextFloat();
		Scanner dos = new Scanner(System.in);
		System.out.print("Ingrese el divisor: ");
		numero2 = dos.nextFloat();
		if(numero2 == 0) {
			System.out.print("ERROR, su divisor es cero ");
		}else {
			float division = numero1 / numero2;
			System.out.printf("Resultado= %.2f",division);
		}
		
	}

}
