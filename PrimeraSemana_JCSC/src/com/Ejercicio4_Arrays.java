package com;

public class Ejercicio4_Arrays {

	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5};
		int [] array2 = new int [5];
		String reversa;
		
		
		for (int i=(array1.length-1), j=0; i>=0; i--, j++) {
			array2[j] = array1[i];
			System.out.println(array2[j]);
		}
		
			
			

		
		

	}

}
