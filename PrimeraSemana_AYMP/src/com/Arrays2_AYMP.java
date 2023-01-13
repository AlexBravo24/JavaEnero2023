package com;

import java.util.Scanner;

public class Arrays2_AYMP {

	public static void main(String[] args) {
		int [] numeros = new int[100];
		int contador=1;
		int suma=0;
		for(int i =0; i<100; i++) {
			numeros[i]=contador++;	
		}
		System.out.println("Los datos de su array son: ");
		for (int i = 0; i<100; i++) {
			System.out.println("Posición "+i+" : "+numeros[i]);
			suma+=numeros[i];
		}System.out.println("La suma total es: "+suma);
		System.out.println("La media es: "+(suma/100));
		

	}

}
