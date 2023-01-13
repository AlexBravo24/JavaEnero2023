package com;

public class Arrays4_AAB {

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3,4,5};
		int [] numeros2 = new int[5];
		int contador = 4;
		
		System.out.println("El arreglo inicial contiene: ");
		
		for (int i:numeros) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 4; i ++) {
			numeros2[i] = numeros[contador];
			contador--;
		}
		
		System.out.println("El arreglo final contiene: ");
		
		for (int i:numeros2) {
			System.out.println(i);
		}
	}

}
