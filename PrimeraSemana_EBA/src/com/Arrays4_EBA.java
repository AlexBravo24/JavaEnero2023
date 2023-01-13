package com;

public class Arrays4_EBA {

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3,4,5};
		int [] numerosAlrevez = new int [5];
		int posicion = 4; 
		
		for (int i = 0; i < numeros.length ;i++ ) {
			numerosAlrevez [posicion] = numeros[i];
			posicion--;
			
		}
		for (int j = 0 ; j < numerosAlrevez.length; j++) {
			System.out.print(numerosAlrevez[j]);
		}

	}

}
