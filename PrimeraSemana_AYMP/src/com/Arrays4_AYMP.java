package com;

public class Arrays4_AYMP {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int [] array2 = new int[5];
		int conta=0;
		int numero;
		for(int i =4; i>=0; i--) {
			numero=array[i];
			System.out.print(numero+ " ");
			array2[conta]=numero;	
		}
	}
}
