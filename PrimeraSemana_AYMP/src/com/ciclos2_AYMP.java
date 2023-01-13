package com;

import java.util.Scanner;

public class ciclos2_AYMP {

	public static void main(String[] args) {
		int multi, veces;
		System.out.print("Ingrese el número a multiplicar ");
		Scanner entrada1= new Scanner(System.in);
		multi= entrada1.nextInt();
		System.out.print("Ingrese el número de veces que desea multiplicarlo: ");
		Scanner entrada2= new Scanner(System.in);
		veces= entrada2.nextInt();
		
		for(int i=1; i<=veces; i++) {
			
			int multiplicacion;
			multiplicacion=multi*i;
			System.out.println(multiplicacion);
		}

	}

}
