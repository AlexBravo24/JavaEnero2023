package com;

public class ArrayBidimensional_JCSC {

	public static void main(String[] args) {
		
		/*
		 * Array Bidimensional, Se pasa de una idea de una lista
		 * a tener más elementos en estructuras de dos dimensiones o más.
		 * Gráficamente o en salida de datos, se asemeja a una tabla
		 */
		
		
		//Declarar un array de 2 dimensiones
		
//		int [][] matriz = new int [3][3]; //Array bidimensional declarado 
//		
//		//Introducción de valores
//		
//		matriz [0][0] = 1;
//		matriz [0][1] = 2;
//		matriz [0][2] = 3;
//		
//		matriz [1][0] = 4;
//		matriz [1][1] = 5;
//		matriz [1][2] = 6;
//		
//		matriz [2][0] = 7;
//		matriz [2][1] = 8;
//		matriz [2][2] = 9;
//		
//		
//		for (int i=0; i<3; i++) {
//			System.out.println();
//			for (int j=0; j<3; j++) {
//				System.out.print(matriz[i][j] + " ");
//			}
//		}
		
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}}; //Array bidimensional con longitud y valores en posición
		
		for (int i=0; i<3; i++) {
			System.out.println();
			for (int j=0; j<3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}		
		
		
		
		

	}

}
