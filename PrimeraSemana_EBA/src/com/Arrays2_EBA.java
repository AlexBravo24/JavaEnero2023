package com;

public class Arrays2_EBA {

	public static void main(String[] args) {
		
		
		int [] numeros = new int [100];
		int contador = 0;
		int inicio = 0;
		while (contador < 100) {
			numeros [contador] = inicio + 1;
			contador ++;
			inicio++;
		}
		int suma = 0;
		for (int i = 0; i < numeros.length; i++ ) {
			suma = suma +numeros[i];	
		}
		System.out.println("La suma es: " + suma + ". Y la media es: " + (suma/100));
	}

}
