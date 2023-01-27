package com;

import java.util.Scanner;

public class ejercicioOcho {

	public static void main(String[] args) {
		int cara;
		System.out.print("Ingrese el número de la cara del dado: ");
		Scanner entrada= new Scanner(System.in);
		cara= entrada.nextInt();
		if(cara == 1) {
			System.out.print("La cara opuesta es 6");
		}else if(cara == 2) {
			System.out.print("La cara opuesta es 5");
		}else if(cara == 3) {
			System.out.print("La cara opuesta es 4");
		}else if(cara == 4) {
			System.out.print("La cara opuesta es 3");
		}else if(cara == 5) {
			System.out.print("La cara opuesta es 2");
		}else if(cara == 6) {
			System.out.print("La cara opuesta es 1");
		}else {
			System.out.print("ERROR: número incorrecto");
		}

	}

}
